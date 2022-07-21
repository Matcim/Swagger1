package co.develhope.esercizioSwagger1.configurations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class ConfigurationSpringDoc {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfo(" esercizio prova pagina swagger ",
                        " prova pagina swagger api descrizione ",
                        "1.0.0",
                        "https://en.wikipedia.org/wiki/MIT_License",
                        new Contact("matteo","matteocimino@delehope.co","matteo.cim.96@gmail.com"),
                        "MIT",
                        "https://en.wikipedia.org/wiki/MIT_License",
                        Collections.emptyList()
                )).tags(new Tag("primo controller","il mio primo controller"),
                        new Tag("secondo controller ","il mio secondo controller"))

                ;
    }
}
