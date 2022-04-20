package com.utilizando.beans.utilizandoBeans;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class AppConfig {

	@Bean
	public Livro getLivro() {
		return new Livro();
	}
	
	// <bean id="livro" class="com.springbeans.Livro"/>
	@Bean
	public AutorLivro getAutorLivro() {
		return new Autor();
	}
}
