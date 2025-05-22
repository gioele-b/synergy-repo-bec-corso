import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { ROUTES_INJECTOR_TOKEN } from "@synergy/sys";
import { becRoutes } from "./bec-routes";
// import { sysWikiUrls } from "./sys-wiki-urls";
// import { WIKI_URLS_INJECTOR_TOKEN } from "@synergy/sys";

@NgModule({
  providers: [
    // { provide: WIKI_URLS_INJECTOR_TOKEN, useValue: [], multi: true },
    { provide: ROUTES_INJECTOR_TOKEN, useValue: becRoutes, multi: true },
  ],
  imports: [CommonModule], // imports
})
export class BecModule {}
