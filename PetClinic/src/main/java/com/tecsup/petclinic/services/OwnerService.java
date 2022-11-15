package com.tecsup.petclinic.services;


import java.util.List;

import com.tecsup.petclinic.entities.Owner;

import com.tecsup.petclinic.exception.OwnerNotFoundException;

/**
 * 
 * @author renzo
 *
 */
public interface OwnerService {
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	Owner findById(long id) throws OwnerNotFoundException;
	
	/**
	 * 
	 * @param firstName
	 * @return
	 */
	List<Owner> findByFirstName(String firstName);
	
	/**
	 * 
	 * @return
	 */
	Iterable<Owner> findAll();

}
