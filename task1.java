import java.util.*;
public class task1{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int i, j;
		System.out.println("Enter the String : ");
		String text = in.nextLine();
		int length = text.length();
		char arr[] = text.toCharArray();
		String res = "";
		for(i=length-1;i>=0;i--)
		{
			res+=arr[i];
		}
		System.out.println("The reversed String is : "+ res);
}
}
