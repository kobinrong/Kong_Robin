import java.lang.Math.*;
public class APLab12_2User
{
	private String firstName;
	private String lastName;
	private String avatar;
	private int userID;
	
	public APLab12_2User()
	{
		firstName = "";
		lastName = "";
		avatar = "";
		userID = 0000000;
	}
	
	public APLab12_2User(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public APLab12_2User(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void getAvatar(String av)
	{
		avatar = av;
	}
	
	public String toString()
	{
		return "Customer Info... \nFirstName: " + firstName +
		"\nLast Name: " + lastName +
		"\nAvatar: " + avatar +
		"\nUser ID#: " + userID;
	}
	
	
}
