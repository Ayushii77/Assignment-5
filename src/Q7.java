import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	        while(true){
	            System.out.print("enter a String to be converted to a no : ");
	            String s=sc.next();
	            try {
	                int n = Integer.parseInt(s);
	                System.out.println(n);
	                break;
	            }
	            catch (NumberFormatException e){
	                System.out.println(e.getMessage());
	                System.out.println("enter a valid String");
	            }
	        }

	}

}
