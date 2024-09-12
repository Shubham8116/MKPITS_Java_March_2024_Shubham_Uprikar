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
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {
    @Bean
    //Using InMemoryUserDetailsManager we are saving username and password to authenticate users and authorize users based on roles.
    public InMemoryUserDetailsManager userDetailsManager()
    {
        UserDetails shubham= User.builder().username("shubham").password("{noop}12345").roles("Employee").build();
        UserDetails sanved=User.builder().username("sanved").password("{noop}789").roles("Employee","Manager").build();
        UserDetails pooja=User.builder().username("pooja").password("{noop}0000").roles("Employee","Manager","Admin").build();
        return new InMemoryUserDetailsManager(shubham,sanved,pooja);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        http.authorizeHttpRequests((request)->request

                        .requestMatchers("/css/*", "/js/", "/images/").permitAll()//It will load static resources and will give permission
                .requestMatchers(HttpMethod.GET,"/manager").hasRole("Manager")
                .requestMatchers(HttpMethod.GET,"/employee").hasRole("Employee")
                .requestMatchers(HttpMethod.GET,"/admin").hasRole("Admin")


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
