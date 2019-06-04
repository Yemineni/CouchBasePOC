package com.wavelabs.couch.repository;

import java.util.Optional;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;


import com.wavelabs.couch.model.Person;
@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "person")
public interface CouchPracticeRepository extends CouchbaseRepository<Person, Integer> {


	
	

}
