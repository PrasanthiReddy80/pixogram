package swapping.training.cts;
import java.util.Scanner;
public class Swap {
public static void main (String[] args) {
	int n1=5,n2=6,temp;
	System.out.println("before swapping value1="+n1);
	System.out.println("befor swapping value2="+n2);
	temp=n1;
	n1=n2;
	n2=temp;
   System.out.println("after swapping value1="+n1);
   System.out.println("after swapping value2="+n2);
}

}
