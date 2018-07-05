package com.karan.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.karan.boot.Employee;
import com.karan.boot.EmployeeDAO;

@RestController
@RequestMapping("/emp")
public class HomeController {

	@Autowired
	EmployeeDAO employeeDAO;
	
	//create a document in mongodb
	
	@RequestMapping(method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody Employee employee) {
		employeeDAO.save(employee);
	}
	
	//Read
		@RequestMapping(value = "{/id}")
		public void read(@PathVariable String id) {
			employeeDAO.findById(id);
		}
	
	//update
	@RequestMapping(method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void update(Employee employee) {
		employeeDAO.save(employee);
	}
	
	/*Delete
	@RequestMapping(value = "{/id}",method = RequestMethod.GET)
	public void delete(String id) {
		employeeDAO.delete(id);
	}*/
	
}
