import java.util.InputMismatchException;
import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter a no. : ");
            int n=sc.nextInt();
            System.out.println("num is : "+n);
        }
        catch (InputMismatchException e){
            //prints null if exception occurred
            System.out.println(e.getMessage());
        }
    }
}