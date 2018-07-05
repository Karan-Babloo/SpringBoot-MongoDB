package com.karan.boot;

import org.apache.catalina.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.karan.boot.Employee;

public interface EmployeeDAO extends MongoRepository<Employee, String> {
	
	
	public Employee FindOneByName();
	
}
