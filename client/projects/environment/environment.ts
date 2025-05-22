import { Environment, SConfig } from "@synergy/sys";

export const environment: Environment = {
  production: false,
  animation: true,
  routerTracing: false,
  focusDebug: false,
  sConfig: new SConfig ({
    wsUrl: "/synergy2-ws/ws",
    remoteUrl: null,
    login: {
      enableAutocomplete: false,
      loginBackgroundImageUrl: "assets/sys/login/background.jpg"
    },
  })
};
