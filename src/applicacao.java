
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;



public class applicacao {

	public static void main(String[] args) throws ParseException  {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("How that's awesome!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:04"),
				"Traveling to new  zealeand",
				"I'm going to visit this  wonderful country!",
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Good Night");
		Comment c4 = new Comment("May the force be with you");
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),
				"good night guys",
				"see you tomorrow",
				5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		
		
		sc.close();
	}

}
