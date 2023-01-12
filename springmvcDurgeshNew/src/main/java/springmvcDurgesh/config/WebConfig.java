package springmvcDurgesh.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "springmvcDurgesh")
@PropertySource("classpath:db.properties")
@EnableWebMvc
public class WebConfig {
	@Autowired
	Environment env;
	
	@Bean
	public InternalResourceViewResolver getView() {
		InternalResourceViewResolver ivr=new InternalResourceViewResolver();
		ivr.setPrefix("/WEB-INF/");
		ivr.setSuffix(".jsp");
		return ivr;
	}@Bean
	public SimpleMappingExceptionResolver getExc() {
		SimpleMappingExceptionResolver exc=new SimpleMappingExceptionResolver();
		exc.setDefaultErrorView("DefaultException");
		return exc;
		
	}
	@Bean
	public DataSource datasource() {
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setDriverClassName(env.getRequiredProperty("database.driver"));
		dmds.setUrl(env.getRequiredProperty("database.url"));
		dmds.setUsername(env.getRequiredProperty("database.user"));
		dmds.setPassword(env.getRequiredProperty("database.password"));
		return dmds;
	}
	@Bean
	public LocalSessionFactoryBean getFactory() {
		LocalSessionFactoryBean factory=new LocalSessionFactoryBean();
		factory.setDataSource(datasource());
		factory.setPackagesToScan("springmvcDurgesh.model");
		factory.setHibernateProperties(hibernateProperties());
		return factory;
	}

	private Properties hibernateProperties() {
		Properties properties=new Properties();
		 properties.put("hibernate.dialect", env.getRequiredProperty("hibernate.dialect"));
	        properties.put("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));
	        properties.put("hibernate.format_sql", env.getRequiredProperty("hibernate.format_sql"));
	        properties.put("hibernate.hbm2ddl.auto", env.getRequiredProperty("hibernate.hbm2ddl.auto"));
	       
		return properties;
	}
	
	
	

}
