package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");

	private Date moment;
	private OrderStatus status;
	

	private Client client;
	private List<OrderItem> ordemItem = new ArrayList<>();

	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrdemItem() {
		return ordemItem;
	}

	public void addItem(OrderItem item) {
		ordemItem.add(item);
	}

	public void removeItem(OrderItem item) {
		ordemItem.remove(item);
	}

	public double total() {
		int sum = 0;
		for (OrderItem items : ordemItem) {
			sum += items.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order Moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order Status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("OrderItems:\n");
		for (OrderItem items : ordemItem) {
			sb.append(items + "\n");
		}
		sb.append("Total Price: $");
		sb.append(String.format("%.2f", total()));

		return sb.toString();

	}

}
