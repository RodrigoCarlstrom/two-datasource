package br.com.evoluo.two.datasource.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.evoluo.two.datasource.entity.Customer;
import br.com.evoluo.two.datasource.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;

	public void save(Customer customer) {
		repository.save(customer);
	}

}
