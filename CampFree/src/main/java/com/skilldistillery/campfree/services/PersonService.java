package com.skilldistillery.campfree.services;

import java.util.Set;

import com.skilldistillery.campfree.entities.Person;
import com.skilldistillery.campfree.entities.Picture;

public interface PersonService {
	Person findById(int id); // may change method name in future
	Person create(String username, Person person);
	Person update(String username, Person person, int id);
//	Boolean delete(int id);
	Person findByUsername(String username);
//	public Set<Picture> userIndex(String username);
	
	
}
