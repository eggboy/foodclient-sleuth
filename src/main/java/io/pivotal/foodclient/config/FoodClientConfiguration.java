package io.pivotal.foodclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class FoodClientConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(WebSecurity http) throws Exception {
        http.ignoring().antMatchers("/**");
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
