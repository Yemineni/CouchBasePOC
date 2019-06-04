package com.wavelabs.couch.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wavelabs.couch.model.Person;
import com.wavelabs.couch.repository.CouchPracticeRepository;

@Service
public class PersonService {
	@Autowired
	CouchPracticeRepository repository;

	public Person savePersonData(Person person) {
		
		Person p=repository.save(person);
		
		return p;
	}

	public Iterable<Person> getAllPersonsData() {
		
		
		return repository.findAll();
	}

	public Optional<Person> getPersonData(int id) {
		System.out.println(repository.findById(id));
		return repository.findById(id);
	}

	public String deletePersonService(int pid) {
		
		 repository.deleteById(pid);
		 
		 return "Deleted";
	}

}
