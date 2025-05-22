window.onload = async function () {
  const response = await fetch('../ws/swagger/openapi-urls');
  window.ui = SwaggerUIBundle({
    // SWAGGER-UI version: 5.9.0
    urls: await response.json(),
    dom_id: '#swagger-ui',
//    docExpansion: 'none',
    deepLinking: true,
    presets: [
      SwaggerUIBundle.presets.apis,
      SwaggerUIStandalonePreset
    ],
    plugins: [
      SwaggerUIBundle.plugins.DownloadUrl
    ],
    layout: "StandaloneLayout",
    operationsSorter: "alpha"
  });

  //</editor-fold>
};
