package Context.configuration;

import Context.service.BeanAnnotationcBusinessService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"Context.service"})
public class BeanConfiguration {

    @Bean
    public BeanAnnotationcBusinessService businessService(){
        return new BeanAnnotationcBusinessService();
    }
}
