import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class applicacao {

	public static void main(String[] args) {
		Order order = new Order(1080,new Date(),OrderStatus.DELIVERED);
		System.out.println(order);
		
		int x;
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		
		
	}

}
