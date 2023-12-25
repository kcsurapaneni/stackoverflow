package com.learn.security.config;

import org.springframework.context.annotation.*;
import org.springframework.security.config.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.config.annotation.web.configurers.*;
import org.springframework.security.web.*;

/**
 * @author Krishna Chaitanya
 */
@Configuration
@EnableWebSecurity(debug = true)
public class SecurityConfiguration {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .csrf(AbstractHttpConfigurer::disable)
                .cors(AbstractHttpConfigurer::disable)
                .httpBasic(Customizer.withDefaults())
                .authorizeHttpRequests(
                        httpRequests -> httpRequests
                                .requestMatchers("/error").permitAll()
                                .anyRequest().authenticated()
                )
        ;

        return http.build();
    }
}
