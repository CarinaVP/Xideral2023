package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.ParticipanterDAO;
import com.luv2code.springdemo.entity.Customer;

@Service
public class ParticipanteServiceImpl implements ParticipanteService {

	// need to inject customer dao
	@Autowired
	private ParticipanterDAO participanterDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return participanterDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {

		participanterDAO.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		
		return participanterDAO.getCustomer(theId);
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		
		participanterDAO.deleteCustomer(theId);
	}
}





