package prob2B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Order {
	private LocalDate orderDate; 
	private List<OrderLine> orderLines;
	public Order(LocalDate orderDate, int lineNum, double price, int quantity) {
		this.orderDate = orderDate;
		orderLines = new ArrayList<>();
		addOrderLine(lineNum, price, quantity);
		
	}
	public void addOrderLine(int lineNum, double price, int quantity){
		orderLines.add(new OrderLine(lineNum, price, quantity, this));
	}
	@Override
	public String toString() {
		String msg = "Order: \n";
		for(OrderLine o : orderLines) {
			msg += o.toString() + "\n";
		}
		return msg;
	}
}

