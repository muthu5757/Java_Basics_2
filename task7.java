import java.util.*;
public class task7{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int i=0;
		System.out.println("Enter the String : ");
		String text = in.nextLine();
		int len = text.length();
		char arr[] = text.toCharArray();
		String res="";
		char c;
		while(i<len)
		{
			if(i==0)
			{
				c = Character.toUpperCase(arr[i]);
				res+=c;
			}
			else if (arr[i]==' ' && arr[i+1]!=' ')
			{ 
				res+=arr[i];
				c = Character.toUpperCase(arr[i+1]);
				res+=c;
				++i;
			}
			else {
			res+=arr[i];
			}
			++i;
		}
		System.out.println("\n"+res);
	
}
}
