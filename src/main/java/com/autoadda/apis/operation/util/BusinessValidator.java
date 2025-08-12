package com.autoadda.apis.operation.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.autoadda.apis.operation.entity.AuthenticationDetails;
import com.autoadda.apis.operation.entity.Customer;
import com.autoadda.apis.operation.entity.Garage;
import com.autoadda.apis.operation.exception.CustomerNotFoundException;
import com.autoadda.apis.operation.exception.GarageNotFoundException;
import com.autoadda.apis.operation.exception.MemberAlreadyExistException;
import com.autoadda.apis.operation.exception.MemberNotFoundException;
import com.autoadda.apis.operation.repository.AuthenticationDetailsRepository;
import com.autoadda.apis.operation.repository.CustomerRepository;
import com.autoadda.apis.operation.repository.GarageRepository;
import com.autoadda.apis.operation.repository.TechnicianRepository;

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