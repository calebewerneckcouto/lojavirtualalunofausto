package Faustus.loja_virtual_mentoria.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class WebConfigSecurity {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeRequests(authorize -> authorize
                .requestMatchers(HttpMethod.GET, "/salvarAcesso").permitAll()
                .requestMatchers(HttpMethod.POST, "/salvarAcesso").permitAll()
                .anyRequest().authenticated()
            )
            .csrf().disable(); // Disable CSRF for demonstration; enable in production as needed.

        return http.build();
    }
}
