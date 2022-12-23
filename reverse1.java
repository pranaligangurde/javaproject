package package1;
import java.util.Scanner;
public class reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your two Strings");
		
		String str1=sc.nextLine();
		String str2=sc.nextLine();

		System.out.println(str1.contains(str2));
	     if (str1.contains(str2))
	     {
	    	 System.out.println("its contain same string");
	    	 
		}
	     else
	     {
	    	 System.out.println("There is no.such String");
	     }
	}

}
