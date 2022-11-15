package com.tecsup.petclinic.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.exception.OwnerNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Test;

@SpringBootTest
public class OwnerServiceTest {

	private static final Logger logger = LoggerFactory.getLogger(OwnerServiceTest.class);
	
	@Autowired
   	private OwnerService ownerService;
	/*assertEquals
	 * 
	 */
	@Test
	public void testFindOwnerById() {

		long ID = 1;
		String NAME = "George";
		Owner owner = null;
		
		try {
			
			owner = ownerService.findById(ID);
			
		} catch (OwnerNotFoundException e) {
			fail(e.getMessage());
		}
		logger.info("" + owner);

		assertEquals(NAME, owner.getFirstName());
	}
	
	/**
	 * 
	 */
	@Test
	public void testFindOwnerByName() {

		String FIND_NAME = "George";
		int SIZE_EXPECTED = 1;

		List<Owner> owners = ownerService.findByFirstName(FIND_NAME);

		assertThat(owners.size(), is(SIZE_EXPECTED));
	}
	
}

	