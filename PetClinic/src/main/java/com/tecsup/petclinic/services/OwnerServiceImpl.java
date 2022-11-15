package com.tecsup.petclinic.services;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.petclinic.entities.Owner;

import com.tecsup.petclinic.exception.OwnerNotFoundException;

import com.tecsup.petclinic.repositories.OwnerRepository;

@Service
public class OwnerServiceImpl implements OwnerService{
	private static final Logger logger = LoggerFactory.getLogger(OwnerServiceImpl.class);

	@Autowired
	OwnerRepository ownerRepository;

	/**
	 * 
	 * @param id
	 * @return
	 */
	
	@Override
	public Owner findById(long id) throws OwnerNotFoundException {

		Optional<Owner> owner = ownerRepository.findById(id);

		if ( !owner.isPresent())
			throw new OwnerNotFoundException("Record not found...!");
			
		return owner.get();
	}
	
	/**
	 * 
	 * @param firstName
	 * @return
	 */
	@Override
	public List<Owner> findByFirstName(String firstName) {

		List<Owner> owners = ownerRepository.findByFirstName(firstName);

		owners.stream().forEach(owner -> logger.info("" + owner));

		return owners;
	}
	
	@Override
	public Iterable<Owner> findAll() {
		
		return ownerRepository.findAll();
	}

}
