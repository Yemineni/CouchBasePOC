package com.wavelabs.couch.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wavelabs.couch.Service.PersonService;
import com.wavelabs.couch.model.Person;

@RestController

public class PersonController {
	@Autowired
	PersonService personService;
	
	@PostMapping(value = "/savePerson")
	public Person personSave(@RequestBody Person person) {
				Person p=personService.savePersonData(person);
				return p;
	}
	
	@GetMapping(value="/getAllPersons")
	public Iterable<Person> getPersonsData(){
		
		return personService.getAllPersonsData();
	}
	
	@GetMapping(value="/getPerson/{pid}")
	public Optional<Person>  getPersonData(@PathVariable("pid") Integer pid){
		System.out.println("getperson");
		
		System.out.println(personService.getPersonData(pid));
		
		return personService.getPersonData(pid);
				
				
	}
	
	@DeleteMapping(value="/delete/{pid}")
	public String deletePerson(@PathVariable("pid") Integer pid) {
		
		return personService.deletePersonService(pid);
		
		
	}
	
	
	
	

}
