const PROXY_CONFIG = {
  "/synergy2-ws/ws": {
    target: "http://localhost:8080",
    secure: false,
    changeOrigin: true,
  },
};
// eslint-disable-next-line no-undef
module.exports = PROXY_CONFIG;
