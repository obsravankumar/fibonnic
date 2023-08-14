import java.util.Scanner;
public class task {
	
	public static void main(String args[]) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the radius of the Circle");
		int r=s.nextInt();
		float ar=(float)(Math.PI*r*r);
		System.out.println(ar);
	}


}
