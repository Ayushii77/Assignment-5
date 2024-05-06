
public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [] arr=new int[5];
	        try{
	            System.out.println(arr[5]);
	        }
	        catch (ArrayIndexOutOfBoundsException e){
	            System.out.println(e.getMessage());
	        }

	}

}
