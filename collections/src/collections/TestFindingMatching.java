package collections;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

import com.java.Customer;

public class TestFindingMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Customer> customers = new ArrayList<>();		
		
		customers.add(new Customer(101,"Hary",LocalDate.of(1985,6,12),"Hyderabad"));
		customers.add(new Customer(102,"Raj",LocalDate.of(1995,4,20),"Vizag"));
		customers.add(new Customer(103,"Rachel",LocalDate.of(1990,5,1),"Pune"));
		customers.add(new Customer(104,"Archana",LocalDate.of(1993,1,13),"Pune"));
		customers.add(new Customer(105,"Anil",LocalDate.of(1995,1,21),"Hyderabad"));
		customers.add(new Customer(106,"Jhon",LocalDate.of(1992,4,2),"Vizag"));
		customers.add(new Customer(107,"Steve",LocalDate.of(1986,3,21),"Mumbai"));
		customers.add(new Customer(108,"Ana",LocalDate.of(1991,4,12),"NewYork"));
	
//		if(customers.stream().anyMatch(c -> c.getCity().equals("Mumbai"))) {
//			System.out.println("There's a customer from Mumbai");
//		}
		
//		if(customers.stream().allMatch(c -> c.getDob().getYear() > 1980)) {
//			System.out.println("All customer's are born after 1980");
//		}

		//Optional<Customer> customer = customers.stream().filter(c -> c.getCity().equals("Vizag")).findFirst();

		Optional<Customer> customer = customers.stream().filter(c -> c.getCity().equals("Vizag")).findAny();
		
		System.out.println(customer.get());
	}

}