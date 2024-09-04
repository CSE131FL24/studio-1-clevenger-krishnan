package studio1;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value for number 1: ");
		double s1 = in.nextDouble();
		System.out.print("Enter value for number 2: ");
		double s2 = in.nextDouble();
		double Average = (s1 + s2) / 2;
		System.out.println("Average is " + Average);
	}

}
