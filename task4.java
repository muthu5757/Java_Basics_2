import java.util.*;
public class task4{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int i, j, a=0, count=0, max=0, ind=0;
		System.out.println("Enter the String : ");
		String text = in.nextLine();
		int len = text.length();
		char arr[] = text.toCharArray();
		int occur[] = new int[len];
		for(i=0;i<len;i++)
		{
		count=1;
			for(j=i+1;j<len;j++){
				if((arr[i]==arr[j] || arr[i]==Character.toLowerCase(arr[j])) && arr[i]!='*')
				{
					++count;
					occur[i]=count;
					arr[j]='*';
				}
			}
		}
		i=0;
		for (int value : occur){
            if(value > max)
            { 
            max = value;
            ind = i;
        }
        i++;
        }
	System.out.println("The Character which is more frequent is '"+arr[ind]+"' in "+max+" times.");
}
}
