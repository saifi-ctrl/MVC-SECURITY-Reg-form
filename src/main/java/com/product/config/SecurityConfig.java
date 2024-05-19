
package com.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.product.custom.CustomUserService;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		/*
		 * auth.inMemoryAuthentication().withUser("saif").password("12345").roles(
		 * "NORMAL");
		 */
		
		auth.authenticationProvider(getAuthenticationProvider());
		
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/", "/add", "/save").permitAll().anyRequest().authenticated().and()
				.formLogin().loginPage("/loginUser").loginProcessingUrl("/login").defaultSuccessUrl("/getall").permitAll().and().csrf().disable();

	}
   @Bean
	public DaoAuthenticationProvider getAuthenticationProvider() {
		
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		
		provider.setPasswordEncoder(getBCryptPassword());
		provider.setUserDetailsService(getUserService());
		
		return provider;
		
		
		
	}

	@Bean
	public UserDetailsService getUserService() {

		return new CustomUserService();

	}

	@Bean
	public BCryptPasswordEncoder getBCryptPassword() {

		return new BCryptPasswordEncoder();

	}

}
