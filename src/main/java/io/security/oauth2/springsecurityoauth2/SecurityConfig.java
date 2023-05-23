package io.security.oauth2.springsecurityoauth2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated();
		http.formLogin();
		
		// CustomSecurityConfigurer customSecurityConfigurer = new CustomSecurityConfigurer();
		// customSecurityConfigurer.setFlag(false);
		http.apply(new CustomSecurityConfigurer().setFlag(false));
		return http.build();
	}
}
