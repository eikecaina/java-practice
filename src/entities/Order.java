package entities;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import entities.enums.OrderStatus;

public class Order {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private OrderStatus status;
	private Date moment = new Date();
	private int orderId;
	private Random rand = new Random();
	
	
	
	public Order(OrderStatus status, Date moment) {
		this.status = status;
		this.moment = moment;
	}

	public Integer OrderId() {
		orderId = 25;
		int randomizer = rand.nextInt(orderId);

		return randomizer;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Order ID: " + OrderId() + "\n" + "Order Date: " 
				+ sdf.format(moment) 
				+ "\n" + status;
	}
	
}
