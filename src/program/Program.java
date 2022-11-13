package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Client;
import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		List<Client> clientList = new ArrayList<Client>();
		
		
		
		System.out.println("How many customers do you want to register?");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Registration client");
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Phone Number: ");
			long phoneNumber = sc.nextLong();
			sc.nextLine();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Birth Date: ");
			Date birthDate = sdf.parse(sc.next());
			sc.nextLine();
			System.out.println("Enter you Address");
			System.out.println("Street: ");
			String street = sc.nextLine();
			System.out.println("Country: ");
			String country = sc.nextLine();
			System.out.println("City: ");
			String city = sc.nextLine();
			System.out.println("State: ");
			String state = sc.nextLine();
			System.out.println("Date order: ");
			Date moment = sdf.parse(sc.next());
			System.out.println("Status: ");
			OrderStatus status = OrderStatus.valueOf(sc.next());
			sc.nextLine();
			
			Order order = new Order(status, moment);
			Address address = new Address(street, country, city, state);
			Client client = new Client(name, phoneNumber, email, birthDate, address, order);
			
			clientList.add(client);
			
		}
		System.out.println("---------------------------------------");
		clientList.forEach(customer -> {
			System.out.println(customer);
			System.out.println("---------------------------------------");
		});		
						
		sc.close();
		
	}

}
