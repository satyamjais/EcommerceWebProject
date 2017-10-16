package com.ecommerceProject.hiberConfig;
import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.hibernate.jpa.event.spi.jpa.ListenerFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.ecommerceProject.dao.*;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import com.EcommerceProjectBackEnd.Model.*;
@Configurable
@EnableTransactionManagement
@ComponentScan("com")
public class hiberConfig {
@Autowired
@Bean(name ="DataSource")
public DataSource getH2()
{
	System.out.println("Hibernate Initiated.....");
	DriverManagerDataSource dt= new DriverManagerDataSource();
	dt.setDriverClassName("org.h2.Driver");
	dt.setUsername("sa");
	dt.setUrl("jdbc:h2:~/dummy");
	dt.setPassword("");
	return dt;
}
private Properties getHiberProps()
{
	Properties p = new Properties();
	p.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	p.put("hibernate.show_sql", "true");
	p.put("hibernate.hbm2ddl.auto", "create");
	return p;
}

@Autowired
@Bean(name="transactionManager")
public HibernateTransactionManager getTransaction(SessionFactory sessionFactory)
{
	HibernateTransactionManager tm = new HibernateTransactionManager(sessionFactory);
	return tm;
}
}