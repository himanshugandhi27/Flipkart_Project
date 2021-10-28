
public class StringTestingClass 
{
public static void main(String a[])
{
	/* String str="himanshu";
	String rev="";
	
	int length=str.length();
	
	for(int i=length-1;i>=0;i--)
		
	{
		rev=rev+str.charAt(i);
		
		
	}
	
	System.out.println(rev); */
	
	String  s="abdghyujgdb";
	 
	  int length= s.length();
	  
	  char dup[]=s.toCharArray();
	  
	  for(int i=0;i<length;i++)
		  
	  {
		for(int j=i+1;j<length;j++)
		{
			if(dup[i]==dup[j])
			{
				System.out.println(dup[j]);
				break;
			}
		  
		  
		  
	  }
	  }
	
	
	
	
}
	
	
}
