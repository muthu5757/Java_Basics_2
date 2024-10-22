import java.util.*;
public class task6{
	public static void main(String args[])
	{
	Scanner in = new Scanner(System.in);
		String text,output="";
		System.out.println("Enter the String :");
		text= in.nextLine();
		char inputArray[] = text.toCharArray();
		int length = text.length();
		for(int i=0;i<length;i++)
		{
			if(inputArray[i]!=' ')
			{
				output +=inputArray[i];
			}
		}
		System.out.println(output);
	}
}
