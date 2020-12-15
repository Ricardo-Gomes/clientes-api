package com.clientes.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@Configuration
@EnableResourceServer
public class ResourceServeConfig {

	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
								.antMatchers("/api/usuarios").permitAll()
								.antMatchers("/api/clientes/**", "/api/servicos-prestados/**").authenticated()
								.anyRequest().denyAll();
	}
}
