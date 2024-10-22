import java.util.*;
public class task2{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int i, j, a=0, status, max=0, ind=0;
		System.out.println("Enter the String : ");
		String text = in.nextLine();
		int len = text.length();
		char arr[] = text.toCharArray();
		char chars[] = new char[len];
		String res= "";
		for(i=0;i<len;i++)
		{
			status=0;
			for (j=0;j<chars.length;j++)
			{
				if(arr[i]==chars[j])
				{
					status=1;
					break;
				}
			}
			if(status==0)
			{
				chars[a]=arr[i];
				res+=arr[i];
				a++;
			}
		}
	System.out.println("The Longest Substring is and its length is : "+res.length()+" "+res);
}
}
