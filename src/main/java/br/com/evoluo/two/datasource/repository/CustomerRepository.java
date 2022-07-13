package br.com.evoluo.two.datasource.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.evoluo.two.datasource.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
