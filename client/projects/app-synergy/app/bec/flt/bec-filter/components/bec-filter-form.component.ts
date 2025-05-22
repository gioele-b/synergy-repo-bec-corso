import { CommonModule } from "@angular/common";
import {
  ChangeDetectionStrategy,
  ChangeDetectorRef,
  Component,
  EventEmitter,
  Input,
  OnInit,
  Output,
  ViewChild,
  ViewEncapsulation,
  booleanAttribute,
  input,
} from "@angular/core";
import {
  SEntityChange,
  SFieldValidation,
  SynergyFormDirective,
  SynergyFormsModule,
} from "@slib2/forms";
import { BooleanInput, arrayUtil } from "@slib2/util";
import { Observable, forkJoin, map } from "rxjs";
import { SValidation } from "@synergy/sys";
import { ISForm, SFormComposerMode } from "@synergy/sys";
import { SysFrmDsg } from "@synergy/sys";
import { AngBecFlt } from "../../api";
import { SynergyFormComposerElementConfigDirective } from "@synergy/sys";
import { SynergyComposerElementDirective } from "@synergy/sys";
import { SynergyFormComposerComponent } from "@synergy/sys";
import { SynergyQueryIniquiringConfigPipe } from "@synergy/sys";
import { SynergyGeneratedFieldsComponent } from "@synergy/sys";

@Component({
  selector: "bec-filter-form",
  imports: [
    SynergyFormsModule,
    SynergyComposerElementDirective,
    SynergyFormComposerComponent,
    SynergyFormComposerElementConfigDirective,
    SynergyQueryIniquiringConfigPipe,
    SynergyGeneratedFieldsComponent,
  ],
  template: `
    <synergy-form-composer
      sForm
      #entityForm="sForm"
      [entity]="entity"
      (sChange)="onEntityChange($event)"
      [readOnly]="readOnly()"
      [recUid]="entity?.uid"
      [noLayout]="noLayout"
      [design]="formDesign"
      [mode]="currentMode"
      [validations]="validations"
    >
      <synergy-string
        field="becFltCod"
        *sFormComposerElement="'becFltCod'; let config"
        [sFormComposerElementConfig]="config"
      ></synergy-string>
      <synergy-string
        field="becFltDsc"
        *sFormComposerElement="'becFltDsc'; let config"
        [sFormComposerElementConfig]="config"
      ></synergy-string>
      <synergy-inquiring
        field="qryDbmTblColUid"
        *sFormComposerElement="'qryDbmTblColUid'; let config"
        [sFormComposerElementConfig]="config"
        [config]="
          {
            queryName: 'stdAngQryColJoiTblCol',
            colUid: 'AngQryDbmTblCol.Uid',
            colCod: 'Col.DbmColNam',
            colDsc: 'Col.ColLngDsc',
          } | sQueryInqConfig
        "
      >
      </synergy-inquiring>
    </synergy-form-composer>
  `,
  encapsulation: ViewEncapsulation.Emulated,
  changeDetection: ChangeDetectionStrategy.OnPush,
})
export class BecFilterFormComponent implements OnInit, ISForm<AngBecFlt> {
  static readonly FORM_DESIGN_NAME = "becFilterForm";

  constructor(private cd: ChangeDetectorRef) {}

  @Input() mode: SFormComposerMode = "mainForm";
  @Input() entity: AngBecFlt;
  @Input() formDesign: SysFrmDsg;
  @Input() @BooleanInput() noLayout: boolean;
  readOnly = input(false, { transform: booleanAttribute });
  @Input() validations: SValidation[];

  @Output() entityChange = new EventEmitter<AngBecFlt>();

  protected currentMode: SFormComposerMode;

  @ViewChild("entityForm") entityForm: SynergyFormDirective<AngBecFlt>;

  ngOnInit() {
    this.currentMode = this.mode;
  }

  onEntityChange(event: SEntityChange<AngBecFlt>) {
    this.entityChange.next(event.newEntity);
  }

  public validate$(): Observable<SFieldValidation[]> {
    const validations$ = [this.entityForm.validate$()];
    return forkJoin(validations$).pipe(
      map((validationss) =>
        arrayUtil.flattify(validationss)?.filter((v) => !!v),
      ),
    );
  }

  expand() {
    this.currentMode = this.mode;
    this.cd.markForCheck();
  }

  collapse() {
    this.currentMode = "quickForm";
    this.cd.markForCheck();
  }
}
