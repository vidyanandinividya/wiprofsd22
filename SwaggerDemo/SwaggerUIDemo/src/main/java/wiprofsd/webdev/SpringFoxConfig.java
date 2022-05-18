package wiprofsd.webdev;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@Configuration
@EnableSwagger2
public class SpringFoxConfig {
	@Bean
	public Docket productApis()
	{
		return new Docket(DocumentationType.SWAGGER_2).groupName("Demo-Api")
				.select().apis(RequestHandlerSelectors.basePackage("wiprofsd.webdev")).build();
	}
	
                   
    
}
