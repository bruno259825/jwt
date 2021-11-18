package com.sintad.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.sintad.app.auth.JWTAuthorizationFilter;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@EnableWebSecurity
	@Configuration
	class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.cors().and().csrf().disable()
				.addFilterAfter(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class)
				.authorizeRequests()
				.antMatchers(HttpMethod.POST, "/api/usuarios").permitAll()
				.antMatchers(HttpMethod.POST, "/api/login").permitAll()
				.antMatchers(HttpMethod.POST, "/api/refrescar").permitAll();
		}
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurer() {
	                @Override
	                public void addCorsMappings(CorsRegistry registry) {
	                        registry.addMapping("/**")
	                                .allowedOrigins("http://localhost:4200")
	                                .allowedMethods("GET", "POST", "PUT", "DELETE")
	                                .maxAge(3600);
	                }

	        };
	}
	
}
