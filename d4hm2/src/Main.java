import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Engin");
		customer.setLastName("Engin");
		customer.setBirthDate(LocalDate.of(1985, 1, 25));
		customer.setNationalityId("1122334455");
	
	
	BaseCustomerManager add=new NeroCustomerManager();
		add.Save(customer);
	
	
	}

}
