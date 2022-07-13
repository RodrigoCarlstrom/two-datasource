package br.com.evoluo.two.datasource.process.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.evoluo.two.datasource.entity.Customer;
import br.com.evoluo.two.datasource.service.CustomerService;

@Component
public class SaveCustomerTask implements JavaDelegate {
	
	@Autowired
	private CustomerService service;

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		Customer customer = new Customer(execution);
		service.save(customer);
	}

}
