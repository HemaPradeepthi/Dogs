package com.hemaPradeepthi.DMS.repository;


/*
 * 
 *@author Hema Pradeepthi Gurram  
 */

import org.springframework.data.repository.CrudRepository;

import com.hemaPradeepthi.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {

}

