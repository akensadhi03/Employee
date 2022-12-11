package com.rntbci.employee.management.Repository;


import com.rntbci.employee.management.entity.Address;
import com.rntbci.employee.management.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends CrudRepository<Address, String> {

	Optional<Address> findById(String addressId);


}
