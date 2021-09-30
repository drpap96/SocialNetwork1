import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<User> all_users =new ArrayList<>();

		
		User u1 = new User("Makis", "iis1998@uom.edu.gr");
		User u2 = new User("Petros", "ics1924@uom.edu.gr"); 
		User u3 = new User("Maria", "iis2012@uom.edu.gr");
		User u4 = new User("Gianna", "iis19133@uom.edu.gr");
		User u5 = new User("Nikos", "dai1758@uom.edu.gr"); 
		User u6 = new User("Babis", "ics19104@uom.edu.gr");
		User u7 = new User("Stella", "dai1827@uom.edu.gr");
		User u8 = new User("Eleni", "ics2086@gmail.com");
		
		//Making 2 groups.
		Group g1 = new Group("WebGurus","A group for web passionates");
		ClosedGroup g2 = new ClosedGroup("ExamSolutions","Solutions to common exam questions");
		
	
		
		//all users to an arrayList.
		all_users.add(u1);
		all_users.add(u2);
		all_users.add(u3);
		all_users.add(u4);
		all_users.add(u5);
		all_users.add(u6);
		all_users.add(u7);
		all_users.add(u8);
		
		//Checking email.
		for(int i=0; i<all_users.size(); i++) {
			String x;
			boolean k;
			x= all_users.get(i).getEmail();
			k=all_users.get(i).checkingEmail(x);
			if(!k) {
				System.out.println("User " + all_users.get(i).getName() + " has not been created. Email format is not acceptable.");
				all_users.remove(i); //delete user from general user list  with invalid email address.
			}
		}
		//adding Friends !
		u1.friendList(u2);
		u1.friendList(u5);
		u5.friendList(u6);
		u3.friendList(u4);
		u3.friendList(u2);
		u4.friendList(u6);
		u3.friendList(u5);
		u1.friendList(u6);
		u5.friendList(u2);
		u7.friendList(u1);
		u7.friendList(u1); 
		
		
		/*System.out.println("*******************");
		System.out.println( "Common friends of " + u5.getName() + " and " + u4.getName());
		System.out.println("*******************");
		//System.out.println(u5.matualFriends(u4));
		//for(int i=0; i<u5.matualFriends(u4).size(); i++) {
			//System.out.println(u5.matualFriends(u4).get(i));
		//}
		*/
		
		
		//Print friends of User1 and User2.
		u1.printFriend();
		u3.printFriend();
		


		//members to groups
		g1.addMember(u4);
		g1.addMember(u3);
		g1.addMember(u2);
		
		 

	}

}
