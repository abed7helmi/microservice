package org.id.gatewayservice.config;

import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import static org.springframework.web.reactive.function.server.RequestPredicates.path;

public class config {
   /* @Bean
    RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route(r->path("/customers/**").uri("http://localhost:8081/").id("r1"))
                .route(r->path("/products/**").uri("http://localhost:8082/").id("r2"))
                .build();
    }*/

       /* @Bean
    RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route(r->path("/customers/**").uri("lb://CUSTOMER-SERVICE").id("r1"))
                .route(r->path("/products/**").uri("http://INVENTORY-SERVICE").id("r2"))
                .build();
                //lb :spring utlise le load blancer
    }*/
    // tjrs static , puisque on est obligé de savoir le nom du service


    // dire a spring gateway si je recoit une requete , regarede le path de la url et tu trouve le nom du micro-service

}
