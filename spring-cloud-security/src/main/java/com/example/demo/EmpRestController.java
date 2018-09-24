package com.example.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.util.ObjectUtils;

@RestController
@EnableOAuth2Sso
public class EmpRestController {

	Map<Integer, Employee> empMap = new HashMap<>();
	
	@RequestMapping(value="/emp", method=RequestMethod.GET)
	public Collection<Employee> getEmployees(){
		if (ObjectUtils.isEmpty(empMap)) {
			empMap.put(1, new Employee(1, "ram", 24, "ap"));
			empMap.put(3, new Employee(2, "sita", 21, "ap"));
			empMap.put(2, new Employee(3, "raju", 24, "ap"));
		}
		return empMap.values();
	}
}
