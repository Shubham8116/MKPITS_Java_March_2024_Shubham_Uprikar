// Class to configure security for endpoints
package com.example.spring_security_demo.security;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class DemoSecurityConfig {

//For fetching username and password from database
    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource)
    {
        return new JdbcUserDetailsManager(dataSource); //userDetailsManager is implemented on JdbcUserDetailsManager that is why we are returning new of JdbcUserDetailsManager
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        http.authorizeHttpRequests((request)->request

                        .requestMatchers("/css/*", "/js/", "/images/").permitAll()//It will load static resources and will give permission
                .requestMatchers(HttpMethod.GET,"/manager").hasRole("MANAGER")
                .requestMatchers(HttpMethod.GET,"/employee").hasRole("EMPLOYEE")
                .requestMatchers(HttpMethod.GET,"/admin").hasRole("ADMIN")


                .anyRequest().authenticated()
        )
                .formLogin(form-> form.loginPage("/login").loginProcessingUrl("/authenticateUser").permitAll())// for custom login page
                .logout(logout->logout.permitAll())
                        .exceptionHandling(configurer->configurer.accessDeniedPage("/accessdenied"));//for custom access denied page


        http.formLogin(Customizer.withDefaults()); // Enable form login

        http.httpBasic(Customizer.withDefaults());
        //disable cross site request forgery
        http.csrf(csrf->csrf.disable());
                return http.build();
    }
}
