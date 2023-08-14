package task;

import java.util.Scanner;

public class positiv {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		if (n != 0) {
			if (n > 0) {
				System.out.println("+ve number");
			} else
				System.out.println("-ve number");
		} else {
			System.out.println("nutral number");
		}

	}

}
