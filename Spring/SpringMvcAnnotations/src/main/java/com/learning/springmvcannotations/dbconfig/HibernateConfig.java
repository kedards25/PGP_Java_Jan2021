package com.learning.springmvcannotations.dbconfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = "com.learning.springmvcannotations")
public class HibernateConfig {

	@Autowired
	@Bean("datasource")
	public DataSource getDataSource()
	{
		DriverManagerDataSource source=new DriverManagerDataSource();
		source.setDriverClassName("org.h2.Driver");
		source.setUrl("jdbc:h2:tcp://localhost/~/hibernate");
		source.setUsername("sa");
		source.setPassword("");
		return source;
	}
	
	private Properties getHibernateProperties() {
		Properties prop=new Properties();
		
		//hibernate properties
		prop.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		//default mode for hbm2ddl auto is create which drops and re-creates 
		//database every time we run our project
		//update states that create the record if not existing
		//or update if existing
		prop.setProperty("hibernate.hbm2ddl.auto", "update");
		prop.setProperty("hibernate.show_sql", "true");
		prop.setProperty("hibernate.format_sql", "true");

		System.out.println(prop);
		return prop;
	}
	
	@Autowired
	@Bean("session")	//session is referring to bean declared in method
	public LocalSessionFactoryBean getFactoryBean(DataSource datasource)
	{
		LocalSessionFactoryBean bean=new LocalSessionFactoryBean();
		bean.setDataSource(datasource);	//datasource object is referring to
										//SQL connection properties
		bean.setHibernateProperties(getHibernateProperties());
									//getHibernateProperties() will return 
									//hibernate configuration
		bean.setPackagesToScan("com.learning.springmvcannotations");
		
		System.out.println(bean);
		return bean;
	}
	

	@Autowired
	@Bean("transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory session)
	{
		HibernateTransactionManager transactionManager=	
				new HibernateTransactionManager(session);
		
		System.out.println(transactionManager);
		
		return transactionManager;
	}
}
