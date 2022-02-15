package prob2B;

import java.time.LocalDate;
import java.util.*;

import prob2B.Order;
import prob2B.OrderLine;


public class Main {

	public static void main(String[] args) {
		Order order1 = new Order(LocalDate.of(2022, 1, 8), 1, 4.00, 4);
		order1.addOrderLine(1, 4.50, 1);
		Order order2 = new Order(LocalDate.of(2022, 1, 9), 1, 6.00, 6);
		order2.addOrderLine(4, 6.50, 1);
		order2.addOrderLine(5, 7.50, 2);
		Order order3 = new Order(LocalDate.of(2022, 1, 10), 1, 8.00, 8);
		order3.addOrderLine(3, 8.50, 1);
		order3.addOrderLine(5, 9.00, 1);
		order3.addOrderLine(7, 10, 1);
		Order order4 = new Order(LocalDate.of(2022, 1, 11), 1, 10.00, 10);
		order4.addOrderLine(4, 10.00, 2);
		List<Order> orders = Arrays.asList(order1, order2, order3, order4);
		System.out.println(orders);

	}

}
