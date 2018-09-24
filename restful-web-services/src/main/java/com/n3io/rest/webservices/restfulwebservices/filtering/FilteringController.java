package com.n3io.rest.webservices.restfulwebservices.filtering;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

	
	@GetMapping("/filtering")
	public SomeBean retrieveSomeBean() {
		return new SomeBean("valu1", "value2", "value3");
	}
	
	@GetMapping("/filtering-dynamic")
	public MappingJacksonValue retrieveSomeBeanDynamic() {
		SomeBean someBean = new SomeBean("valu1", "value2", "value3");
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2");
		
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(someBean);
		mapping.setFilters(filters);
		
		return mapping;
		
		
 	}
}
