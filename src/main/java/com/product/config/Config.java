package com.product.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.product.entity.User;

@EnableWebMvc
@Configuration
@ComponentScan("com.product")

public class Config {

	@Bean
	public DriverManagerDataSource getdataSource() {
		System.out.println("dataSource");
		DriverManagerDataSource data = new DriverManagerDataSource();
		data.setUrl("jdbc:mysql://localhost:3306/springmvc");
		data.setDriverClassName("com.mysql.cj.jdbc.Driver");
		data.setUsername("root");
		data.setPassword("saifi@123");

		return data;
	}

	@Bean
	public InternalResourceViewResolver viewResoulver() {

		InternalResourceViewResolver vr = new InternalResourceViewResolver();

		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");

		return vr;

	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		System.out.println("LocalSessionFactoryBean");
		LocalSessionFactoryBean bean = new LocalSessionFactoryBean();

		bean.setAnnotatedClasses(User.class);
		bean.setDataSource(getdataSource());

		Properties hibernateProperties = new Properties();
		hibernateProperties.put("hibernate.hbm2ddl.auto", "update");
		hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		hibernateProperties.put("hibernate.show_sql", "true");
		hibernateProperties.put("hibernate.format_sql", "true");
		bean.setHibernateProperties(hibernateProperties);

		return bean;

	}

	@Bean
	public HibernateTransactionManager hibernateTransactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;
	}
}
