package firstlesson;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter coffee price:");
		int coffeCost = scan.nextInt();

		System.out.println("Please enter number of cups:");
		int cups = scan.nextInt();

		int totalSum;

		totalSum = coffeCost * cups;

		System.out.println("Total due: " + totalSum + " UAH");
	}
}
