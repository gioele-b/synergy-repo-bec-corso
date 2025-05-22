import { Component, ChangeDetectionStrategy } from "@angular/core";
import { RouterOutlet } from "@angular/router";
import { BecFilterService } from "./bec-filter.service";

@Component ({
  template: "<router-outlet></router-outlet>",
  changeDetection: ChangeDetectionStrategy.OnPush,
  providers: [BecFilterService],
  selector: "bec-filter",
  imports: [RouterOutlet]
})
export class BecFilterComponent {

} // BecFilterComponent
