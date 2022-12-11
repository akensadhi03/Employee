package com.rntbci.employee.management.controller;


import com.rntbci.employee.management.Service.AddressService;
import com.rntbci.employee.management.Service.ManagerService;
import com.rntbci.employee.management.entity.Address;
import com.rntbci.employee.management.entity.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Address")
public class AddressController {
	@Autowired private AddressService addressService;
	
	// Save operation
    @PostMapping(value ="/add")
    public String saveAddress(@RequestBody Address address)
    {
        addressService.saveAddress(address);
        return "added Successfully";
    }
    
    // Read operation
    @GetMapping(value ="/addr")
    public List<Address> fetchAddressList()
    {
        return addressService.fetchAddressList();
    }
    
    @GetMapping(value ="/addr/{address_id}")
    public Address findAddressById(@PathVariable("address_id") String addressId)
    {
        return addressService.getAddressById(addressId);
    }
 
    // Update operation
    @PutMapping(value ="/addr/{address_id}")
    public Address updateAddress(@RequestBody Address address,@PathVariable("address_id") String addressId)
    {
        return addressService.updateAddress(
        		address, addressId);
    }
 
    // Delete operation
    @DeleteMapping(value ="/delete/{address_id}")
    public String deleteAddressById(@PathVariable("address_id") String addressId)
    {
    	 addressService.deletAddressById(addressId);
        return "Deleted Successfully";
    }
    
    @GetMapping(value ="/test")
    public String findAddressById()
    {
        return "test";
    }
    

}
