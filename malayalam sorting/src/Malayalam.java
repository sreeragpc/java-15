import java.util.Arrays;
import java.util.Scanner;

public class Malayalam {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println
		("enter number movie names you need to enter");
		int count=sc.nextInt();
		String str[]=new String[count];
		System.out.println("enter the name of movies");
		for(int i=0;i<count;i++){
			str[i]=sc.next();
			
		}
		Arrays.sort(str);
		System.out.println("sorted names of arrays");
		for (String string : str) {
			System.out.println(string);
		}

		
	}

}
