package package1;
import java.util.*;

public class Contain1 {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter your two Strings");
			String str1=sc.nextLine();
			String str2=sc.nextLine();
			//System.out.println(str1.contains(str2));
			if(str1.contains(str2))
			{
				System.out.println("Its contain same String");
			}
			else
			{
				System.out.println("There is no.such String");
			}

		}


		// TODO Auto-generated method stub

	}


