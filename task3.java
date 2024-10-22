import java.util.*;
public class task3{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int i, j, a=0, count=0;
		System.out.println("Enter the String : ");
		String text = in.nextLine();
		int len = text.length();
		char arr[] = text.toCharArray();
		String res[] = new String[len];
		for(i=0;i<len;i++)
		{
			if(i==0){
				res[a]="";
			}
			if(arr[i]!=' ')
			{
				res[a]+=arr[i];
			}
			else if (arr[i]==' ' && arr[i+1]!=' ')
			{ 
			++a; res[a]=""; 
			}
			else continue;
		}
		System.out.println("\nThe Words are :");
		for(i=0;i<len;i++)
		{
			if(res[i]!=null)
			{
				System.out.println(res[i]);
				++count;
			}
		}
		System.out.println("\n The Count is "+count);
	
}
}
