# Documentation Overview



It’s very important to document your REST APIs. There could be other developers that need to use your APIs or you may have customers that want to use your APIs to help speed up their development time.

Documentation is a good way to communicate to others how they can use your APIs. Documentation communicates the operations available, the format for requesting data and the format data will be returned in.

Typically, the initial creation of documentation is easy, but the on-going maintenance of keeping that documentation up to date is hard. Imagine having to manually update documentation every time your code changes! It's good to use tools that automatically inspect your code and update the documentation.

One of the most popular API documentation specifications is **OpenApi**, formerly known as the **Swagger Specification**. OpenAPI allows you to describe your API using JSON or YAML. Swagger is the name associated with some of the most well-known, and widely used tools for implementing the OpenAPI specification. Swagger helps you design, build, document and consume REST APIs. SpringFox is a Swagger integration for the Spring Framework.

- **Swagger Editor** – A browser-based editor where you can write OpenAPI specs.
- **Swagger UI** – A web application that renders OpenAPI specs as interactive API documentation.
- **Swagger Codegen** – A tool that generates server stubs and client libraries from an OpenAPI spec.

Dynamically generated documentation from a Swagger-compliant API is displayed in the Swagger UI, which consists of HTML, JavaScript, and CSS files. The documentation files are bundled by Swagger UI to display the API in a web browser.

Besides rendering documentation, Swagger UI allows other API developers or consumers to interact with the API’s resources without having any of their implementation logic in place.


Three potential users of SwaggerUI;
- External developers wanting to use your API
- Internal developers wanting to use your API
- Quality Assurance (QA) testers needing to validate your API


The configuration of Swagger mainly centers around the Docket bean.
````
@Configuration
@EnableSwagger2

public class SwaggerConfig {
   @Bean
   public Docket api() {
       return new Docket(DocumentationType.SWAGGER_2)
               .select()
               .apis(RequestHandlerSelectors.any())
               .paths(PathSelectors.any())
               .build();
   }
}
````

Swagger also provides some default values in its response that you can customize, such as “Api Documentation”, “Created by Contact Email”, “Apache 2.0”.
To change these values, you can use the **apiInfo(ApiInfo apiInfo)** method.


**@ApiResponses**annotation is used to customize error messages with Swagger