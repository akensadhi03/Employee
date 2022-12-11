package com.rntbci.employee.management.Service;

import com.rntbci.employee.management.entity.Address;
import com.rntbci.employee.management.entity.Employee;

import java.util.List;

public interface AddressService {
	// Save operation
	Address saveAddress(Address address);
	
	// Read operation
    List<Address> fetchAddressList();
 
    // Update operation
    Address updateAddress(Address Address, String addressId);
    
    // get by id operation
    Address getAddressById(String addressId);
 
    // Delete operation
	void deletAddressById(String addressId);
}


