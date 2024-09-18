import java.util.Scanner;
public class Main{
	 
		/*
		 * MadLibs Program
		 * Author: Wolf
		 * Class: ICS3U
		 * Date: September. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Mad Libs!");
		String dayOfWeek = in.nextLine();
		System.out.println("What's your name?");
		String name = in.nextLine();
		System.out.println("Give me a number");
		int score = in.nextInt();
		System.out.println("Give me a decimal number");
		double decNumber = in.nextDouble();
		System.out.println("One day, "+name+ " wrote a Mad Lib in class!");
		System.out.println("Give me a sport");
		String sport = in.nextLine();
		System.out.println("Give me a place");
		String place = in.nextLine();
		//flush
		int num1 = in.nextInt();
		String person1 = in.nextLine();
		String person2 = in.nextLine();
		in.nextLine();
		System.out.println("On "+dayOfWeek+","+person1+" and "+person2+" were playing "+sport+" when a seagull crashed the game and scored 15 points");
		in.close();		


}

}