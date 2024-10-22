import java.util.*;
public class task8{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int i, j,count=0;
		System.out.println("Enter the String : ");
		String text = in.nextLine();
		int len = text.length();
		char arr[] = text.toCharArray();
		char ans = '0';
		for(i=0;i<len;i++)
		{
		count=1;
			for(j=i+1;j<len;j++){
				if((arr[i]==arr[j] || arr[i]==Character.toLowerCase(arr[j])) && arr[i]!='*')
				{
					++count;
					arr[j]='*';
				}
			}
			if(count==1 && arr[i]!='*')
			{
				ans=arr[i];
				break;
			}
		}
	System.out.println("The first non-repeated character in a given string is : "+ans);
}
}
