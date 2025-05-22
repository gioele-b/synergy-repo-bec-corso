import {
  AsyncPipe,
  NgClass,
  NgComponentOutlet,
  NgForOf,
  NgIf,
} from "@angular/common";
import {
  AfterViewInit,
  ChangeDetectionStrategy,
  Component,
  HostListener,
  OnDestroy,
  Type,
  ViewChild,
} from "@angular/core";
import { MatBadgeModule } from "@angular/material/badge";
import { MatSidenav } from "@angular/material/sidenav";
import { Router, RouterOutlet } from "@angular/router";
import {
  SynergyButtonComponent,
  SynergyIconDirective,
  SynergyShortcutService,
} from "@slib2/behaviours";
import {
  SynergyAppLayoutComponent,
  SynergyLayoutsModule,
} from "@slib2/layouts";
import {
  ConcatingEvent,
  MdiIcon,
  MenuItem,
  TakeUntilDestroy,
} from "@slib2/util";
import {
  IGlobalSearchAdvancedFilter,
  IGlobalSearchResult,
  SynergyAppService,
  SynergyAuthService,
  SynergyContextButtonComponent,
  SynergyGlobalSearchComponent,
  SynergyI18nService,
  SynergyNotificationModule,
  SynergyNotificationService,
  SynergySidenavInjectedService,
  SynergyUserInfoComponent,
  SysApp,
  SysMenuLinkHelpComponent,
} from "@synergy/sys";
import { Observable, of } from "rxjs";
import { filter, map, switchMap, take } from "rxjs/operators";
import packageJson from "../../../package.json";

@Component({
  selector: "synergy-app",
  templateUrl: "./synergy-app.component.html",
  styleUrls: ["./synergy-app.component.scss"],
  changeDetection: ChangeDetectionStrategy.OnPush,
  imports: [
    NgClass,
    SynergyLayoutsModule,
    AsyncPipe,
    RouterOutlet,
    SynergyGlobalSearchComponent,
    SynergyContextButtonComponent,
    SysMenuLinkHelpComponent,
    SynergyUserInfoComponent,
    SynergyButtonComponent,
    MatBadgeModule,
    SynergyNotificationModule,
    NgComponentOutlet,
    NgForOf,
    NgIf,
    SynergyIconDirective,
  ],
  standalone: true,
})
@TakeUntilDestroy
export class SynergyAppComponent implements AfterViewInit, OnDestroy {
  constructor(
    private appService: SynergyAppService,
    private i18n: SynergyI18nService,
    private shortcutService: SynergyShortcutService,
    private authService: SynergyAuthService,
    private router: Router,
    private sidenavService: SynergySidenavInjectedService,
    private notificationService: SynergyNotificationService,
  ) {}

  ver = packageJson.dependencies["@slib2/util"];
  @ViewChild("appOutlet") appOutlet: RouterOutlet;
  @ViewChild("notificationSidenav") notificationSidenav: MatSidenav;
  @ViewChild(SynergyAppLayoutComponent)
  appLayout: SynergyAppLayoutComponent<SysApp>;
  currentGlobalSearchResultComponent$: Observable<Type<IGlobalSearchResult>> =
    this.appService.getCurrentGlobalSearchResultComponent$();
  currentGlobalSearchAdvancedFilterComponent$: Observable<
    Type<IGlobalSearchAdvancedFilter>
  > = this.appService.getCurrentGlobalSearchAdvancedFilterComponent$();
  readonly injectedToolbarRightComponents$ =
    this.appService.getToolbarRightComponentList$();
  appTitle$ = this.appService.getAppTitle$();
  menuItems$ = this.appService.getConvertedAllMenuItems$(
    this.router.config[2].children.map((route) => route.path),
  );

  navigationLoading$ = this.appService.loading$();
  hasContextConfig$: Observable<boolean> = this.appService
    .getCurrentApp$()
    .pipe(
      map((app) =>
        app
          ? !!this.appService.contextConfigurationByAppCode[app.appCod]
          : false,
      ),
    );
  isSubstitute$ = this.authService.isSubstitute$();

  substituteName$ = this.isSubstitute$.pipe(
    switchMap((isSub) =>
      !isSub
        ? of(null)
        : this.authService.getUser$().pipe(
            filter((res) => !!res),
            take(1),
            map((res) =>
              res.resNam && res.resSur
                ? `${res.resNam} ${res.resSur}`
                : res.resDsc,
            ),
          ),
    ),
  );
  wksTyo = this.appService.getAllWorkspaceTypesByUid$();
  notificationCounter$ = this.notificationService.getNotificationCounter$();
  menuNavConfig: {
    label: string;
    icon: MdiIcon;
    code: string;
    emptyMessage: string;
  }[] = [
    {
      code: "menu",
      label: this.i18n.getLabel("menu"),
      icon: "mdi mdi-menu",
      emptyMessage: this.i18n.getLabel("nessunaVoceDiMenu"),
    },
    // {
    //   code: "favourite",
    //   label: this.i18n.getLabel ("preferiti"),
    //   icon: "mdi mdi-star-box-outline",
    //   emptyMessage: this.i18n.getLabel ("nessunPreferito")
    // },
    {
      code: "workspace",
      label: this.i18n.getLabel("workspaces"),
      icon: "mdi mdi-desktop-mac-dashboard",
      emptyMessage: this.i18n.getLabel("nessunWorkspace"),
    },
  ];
  sidenavComponent = this.appService.getCurrentMenuItem$().pipe(
    switchMap((menuItem) => {
      if (menuItem) {
        return of(
          this.sidenavService.getSidenavInjectionComponent(menuItem.url),
        );
      } // if
      return of(void 0);
    }),
  );

  ngAfterViewInit() {
    this.notificationService.reloadNotification();
    setTimeout(() => {
      if (this.appOutlet && !this.appOutlet.isActivated) {
        this.appLayout?.openPagesSidenav();
      } // if
    }, 200);
  } // aNgAfterViewInit

  @HostListener("window:keydown", ["$event"])
  onKeyDown(event: KeyboardEvent) {
    this.shortcutService.onKeyDown(event);
  }

  @HostListener("window:keyup", ["$event"])
  onKeyUp(event: KeyboardEvent) {
    this.shortcutService.onKeyUp(event);
  }

  @HostListener("window:blur", ["$event"])
  onWindowBlur(event: Event) {
    this.shortcutService.onWindowBlur(event);
  }

  ngOnDestroy() {}

  @ConcatingEvent()
  onToggleFavourite(menuItem: MenuItem) {
    return this.appService.toggleFavouriteMenuItem(menuItem);
  } // onToggleFavourite

  onBellClick(sidenav: MatSidenav) {
    if (!sidenav.opened) {
      this.notificationService.reloadNotification();
    } // if
    sidenav.toggle();
  } // onBellClick
}
