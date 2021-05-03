package Concreate;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}
	CustomerCheckService customerCheckService;
	@Override
	public void save(Customer customer) {
		
		if (customerCheckService.checkIfRealPerson(customer)) {

			System.out.println("saved to db: " + customer.getFirstName());
		}

		else {

			System.out.println("Böyle bir kiþi bulunamadý.");
		}
		
	}

}
