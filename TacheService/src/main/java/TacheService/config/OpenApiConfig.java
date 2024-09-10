//package TacheService.config;
//
//import io.swagger.v3.oas.annotations.OpenAPIDefinition;
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Info;
//import io.swagger.v3.oas.models.servers.Server;
//import org.springdoc.core.models.GroupedOpenApi;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//
//@OpenAPIDefinition()
//@Configuration
//public class OpenApiConfig {
////    @Bean
////    public GroupedOpenApi publicApi() {
////        return GroupedOpenApi.builder()
////                .group("springboot")
////                .pathsToMatch("/**")
////                .build();
////    }
//@Bean
//public OpenAPI userOpenAPI(
//        @Value("${openapi.service.title}") String serviceTitle,
//        @Value("${openapi.service.version}") String serviceVersion,
//        @Value("${openapi.service.url}") String url) {
//    return new OpenAPI()
//            .servers(List.of(new Server().url(url)))
//            .info(new Info().title(serviceTitle).version(serviceVersion));
//}
//}
