package interfaceAbstractCoffeDemo;

import java.sql.Date;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concreate.NeroCustomerManager;
import Concreate.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("write to your name");
		customer.setLastName("write to your surname");
		customer.setDateOfBirth(new Date(0, 0, 0)); //int year int month, int day
		customer.setNationalityId("write to your identity number");
		
		
		
		//BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);
		
	
		
	
		

	}

}
