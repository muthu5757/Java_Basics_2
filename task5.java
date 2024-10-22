import java.util.*;
public class task5{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int i, j;
		System.out.println("Enter the String 1 : ");
		String text1 = in.nextLine();
		System.out.println("Enter the String 2 : ");
		String text2 = in.nextLine();
		char arr1[] = text1.toCharArray();
		char arr2[] = text2.toCharArray();
		char temp;
		for(i=0;i<arr1.length;i++)
		{
			for(j=i+1;j<arr1.length;j++)
			{
				if(arr1[i] > arr1[j])
				{
				  temp = arr1[i];
				  arr1[i]=arr1[j];
				  arr1[j]=temp;
			}
		}
	}
	for(i=0;i<arr2.length;i++)
		{
			for(j=i+1;j<arr2.length;j++)
			{
				if(arr2[i] > arr2[j])
				{
				  temp = arr2[i];
				  arr2[i]=arr2[j];
				  arr2[j]=temp;
			}
		}
	}
	System.out.println(arr1);
	System.out.println(arr2);
	boolean result = Arrays.equals(arr1,arr2);
	if(result)
		System.out.println(text1+" and "+text2+" are anagrams");
	else
		System.out.println(text1+" and "+text2+" are not anagrams");
	}
}
