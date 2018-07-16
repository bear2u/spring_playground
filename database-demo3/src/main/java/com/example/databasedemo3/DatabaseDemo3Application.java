package com.example.databasedemo3;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class DatabaseDemo3Application {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemo3Application.class, args);
	}
//	
//    @Bean
//    public DataSource dataSource(){
//    	System.out.println("dataSource");
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/listavip");
//        dataSource.setUsername("root");
//        dataSource.setPassword("");
//        return dataSource;
//    }
}
