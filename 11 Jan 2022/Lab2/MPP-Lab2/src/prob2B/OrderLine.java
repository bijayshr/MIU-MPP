package prob2B;

public class OrderLine {
	private int lineNum;
	private double price;
	private int quantity;
	private Order order;
	OrderLine(int lineNum, double price, int quantity, Order order) {
		this.lineNum = lineNum;
		this.price = price;
		this.quantity = quantity;
		this.order = order;
	}
	public String toString() {
		return "  Item in Line:[ line num = " + lineNum + "    price = " + price + "    quantity = "+ quantity + "]";
	}
}
