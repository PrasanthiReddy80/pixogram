package palindrom.training.cts;
import java.util.*;

public class palindrome1 {

	public static void main(String[] args) {
		int num=568,rem=0,reverse=0,n=num;
		Scanner scan=new Scanner(System.in);
		while(num!=0)
			{
	           rem=num%10;
	          reverse=reverse*10+rem;
	          num=num/10;
	           
			}
		     if(n==reverse) 
		         
	           System.out.println("it is a palindrome");
	           else
	           System.out.println("it is not a palindrome");	   
	}
}

