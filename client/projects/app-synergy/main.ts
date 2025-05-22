import { HTTP_INTERCEPTORS } from "@angular/common/http";
import { enableProdMode, importProvidersFrom } from "@angular/core";
import { bootstrapApplication } from "@angular/platform-browser";
import { StoreDevtoolsModule } from "@ngrx/store-devtools";
import { ISynergyConfig, SYNERGY_CONFIG } from "@slib2/util";
import {
  BlobErrorHttpInterceptor,
  createAppInit,
  HttpInterceptorService,
  SYNERGY_ENVIRONMENT,
  SynergyAppRouterModule,
  SynergyCoreModule,
  SynergyNotificationModule,
} from "@synergy/sys";
import { environment } from "../environment";
import { SynergyAppComponent } from "./app/synergy-app.component";
import { SYNERGY_MODULES } from "./synergy-modules";
import { provideRouter, withDebugTracing } from "@angular/router";

if (environment.production) {
  enableProdMode();
}

bootstrapApplication(SynergyAppComponent, {
  providers: [
    provideRouter(
      [],
      ...[environment.routerTracing ? withDebugTracing() : void 0].filter(
        (p) => !!p,
      ),
    ),
    {
      provide: SYNERGY_CONFIG,
      useValue: {
        production: environment.production,
        animation: true,
        focusDebug: environment.focusDebug,
      } as ISynergyConfig,
    },
    { provide: SYNERGY_ENVIRONMENT, useValue: environment },
    createAppInit(),
    {
      provide: HTTP_INTERCEPTORS,
      useClass: HttpInterceptorService,
      multi: true,
    },
    {
      provide: HTTP_INTERCEPTORS,
      useClass: BlobErrorHttpInterceptor,
      multi: true,
    },
    importProvidersFrom(
      SynergyAppRouterModule,
      SynergyCoreModule,
      environment.production ? [] : StoreDevtoolsModule.instrument(),
      SynergyNotificationModule,
      // Forse si può togliere
      // SynergyGlobalSearchModule,
      // EditorModule,
      ...SYNERGY_MODULES,
    ),
  ],
}).catch((err) => console.error(err));
