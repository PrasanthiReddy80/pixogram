package evenodd.training.com;
import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		int n;
	System.out.println("enter a number=");	
	Scanner input=new Scanner(System.in);
	n= input.nextInt();
	if(n %2==0)
	System.out.println("even number");
	else
	System.out.println("odd number");	
	}

}
