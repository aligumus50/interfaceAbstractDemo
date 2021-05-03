package Concreate;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	Exception e;
	CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

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
