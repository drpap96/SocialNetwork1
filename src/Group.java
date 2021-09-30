import java.util.ArrayList;

public class Group extends General_Groups {
	
	private  ArrayList<User> members ;  
	
	
	public Group(String name, String description) {
		nameGroup=name;
		description=description;
		members = new ArrayList<>();
		}
	
	public void setName(String name) {
		name=name;
	}
	
	public void setDescription(String description) {
		description=description;
	}
	
	
	public boolean isMember(User u) {
		return members.contains(u);
	}
	
	.
	public void addMember(User u) {
		if (!isMember(u)) {
			members.add(u);
			System.out.println(u.getName() + " has been successfully enrolled in group " + nameGroup );
		}else {
			System.out.println("Sorry i can not enroll you");
		}
	}
	
	public void printMembers() {
		for (User u: members) {
			System.out.println(u);
		}
	}

}
