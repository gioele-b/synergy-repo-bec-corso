import { Environment, SConfig } from "@synergy/sys";

export const environment: Environment = {
  sConfig: new SConfig (),
  production: true,
  animation: true,
  routerTracing: false,
  focusDebug: false
};
