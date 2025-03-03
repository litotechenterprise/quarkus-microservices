package org.agoncal.quarkus.microservices.number;


import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;


@ApplicationPath("/")
@OpenAPIDefinition(
        info= @Info(
                title = "Number Microservice",
                description = "This Microservice generates book numbers",
                version = "1.0",
                contact = @Contact(name = "LitoTechEnterprise")
        )

)
public class NumberMicroservice extends Application {



}
