import java.io.*;
import java.util.*;
class STRING
{
	public static void main(String args[])
	{
			StringBuffer str=new StringBuffer();
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the string:");
			str.append(sc.nextLine());

			int count,i,j;
			
			char c;
      			HashMap<Character,Integer> hashMap = new HashMap<>();
			for(i=0;i<str.length();i++)    //counting the occurences of characters in a string
			{
				count=0;
				c=str.charAt(i);
				for(j=0;j<str.length();j++)
				{
					if(str.charAt(j)==c)
					{				
						count++;
							
					}
				}
				 hashMap.put(c, count);
			}
	
			 for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) 
			{
                            System.out.println(entry.getKey()+" = "+entry.getValue());
                    	}


			System.out.print("String:");
			for(i=0;i<str.length();i++)  //Capitalize the alternate characters of a string
			{
				c=str.charAt(i);
				if(i%2==0)
				{
					System.out.print(Character.toUpperCase(c));
				}
				else
				{
					System.out.print(Character.toLowerCase(c));
				}
			}
			System.out.println();	
	
	}
}
				
				
						
