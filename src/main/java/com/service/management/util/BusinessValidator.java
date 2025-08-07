package com.service.management.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.service.management.entity.AuthenticationDetails;
import com.service.management.entity.Customer;
import com.service.management.entity.Garage;
import com.service.management.exception.CustomerNotFoundException;
import com.service.management.exception.GarageNotFoundException;
import com.service.management.exception.MemberAlreadyExistException;
import com.service.management.exception.MemberNotFoundException;
import com.service.management.repository.AuthenticationDetailsRepository;
import com.service.management.repository.CustomerRepository;
import com.service.management.repository.GarageRepository;
import com.service.management.repository.TechnicianRepository;

@Component
public class BusinessValidator {

	@Autowired
	private GarageRepository garageRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private TechnicianRepository garageTechnicianRepository;

	@Autowired
	private AuthenticationDetailsRepository authenticationDetailsRepository;

	/**
	 * Validates if the given garage ID exists.
	 *
	 * @param garageId the ID of the garage to validate
	 * @throws GarageNotFoundException if the garage does not exist
	 */

	public void validateUsername(String username) throws MemberAlreadyExistException {
		AuthenticationDetails authData = authenticationDetailsRepository.findByUserName(username);
		if (null != authData) {
			throw new MemberAlreadyExistException("Username already exist");
		}
	}

	public void validateTechnician(Integer technicianId) throws MemberNotFoundException {
		
		if (!garageTechnicianRepository.findById(technicianId).isPresent()) {
			throw new MemberNotFoundException("technician not exist");
		}
	}

	public Garage validateAndGetGarage(Integer garageId) throws GarageNotFoundException {
		return garageRepository.findById(garageId).orElseThrow(() -> new GarageNotFoundException("Garage not found"));
	}

	public Customer validateAndGetCustomer(Integer customerId) throws CustomerNotFoundException {
		return customerRepository.findById(customerId)
				.orElseThrow(() -> new CustomerNotFoundException("Customer not found"));
	}

}