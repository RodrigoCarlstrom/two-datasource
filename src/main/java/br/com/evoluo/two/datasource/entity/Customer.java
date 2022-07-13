package br.com.evoluo.two.datasource.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.camunda.bpm.engine.delegate.DelegateExecution;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Customer implements Serializable {

	private static final long serialVersionUID = -5195532802153516405L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private Long age;

	public Customer(DelegateExecution execution) {
		this.id = (Long) execution.getVariable("id");
		this.name = (String) execution.getVariable("name");
		this.age = (Long) execution.getVariable("age");
	}

}
