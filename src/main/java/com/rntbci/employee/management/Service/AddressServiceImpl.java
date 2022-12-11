package com.rntbci.employee.management.Service;


import com.rntbci.employee.management.Repository.AddressRepository;
import com.rntbci.employee.management.Repository.EmployeeRepository;
import com.rntbci.employee.management.entity.Address;
import com.rntbci.employee.management.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressRepository addressRepository;
	@Override
	public Address saveAddress(Address address) {
		return addressRepository.save(address);
	}
	@Override
	public List<Address> fetchAddressList() {
		return (List<Address>)
				addressRepository.findAll();
	}
	@Override
	public Address updateAddress(Address Address, String addressId) {
		Address depDB = addressRepository.findById(addressId).get();

	    if (Objects.nonNull(Address.getAddressName()) && !"".equalsIgnoreCase(Address.getAddressName())) {
	        depDB.setAddressName(Address.getAddressName());
	    }
	    return addressRepository.save(depDB);
	}
	@Override
	public void deletAddressById(String addressId) {
		addressRepository.deleteById(addressId);
	}
	@Override
	public Address getAddressById(String addressId) {
		return addressRepository.findById(addressId).get();
	}
}
