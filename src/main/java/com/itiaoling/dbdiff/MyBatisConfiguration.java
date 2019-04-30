package com.itiaoling.dbdiff;

import java.io.IOException;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.itiaoling.dbdiff.aop.MultipleDataSource;

@Configuration
public class MyBatisConfiguration {

	@Bean(name = "sessionFactory")
	public SqlSessionFactoryBean testSessionFactory(@Qualifier("dataSource") MultipleDataSource dataSource)
			throws IOException {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		// 只加载一个绝对匹配Resource，且通过ResourceLoader.getResource进行加载
		org.springframework.core.io.Resource[] resources = resolver.getResources("/mybatis/*/*.xml");
		bean.setMapperLocations(resources);
		return bean;
	}

	@Bean
	public MapperScannerConfigurer testScanner() {
		MapperScannerConfigurer configurer = new MapperScannerConfigurer();
		configurer.setBasePackage("com.itiaoling.dbdiff.mappers");
		configurer.setSqlSessionFactoryBeanName("sessionFactory");
		return configurer;
	}

}
