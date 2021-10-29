import java.util.Scanner;

public class random {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Your task is to guess the number");
		for(int i = 10; i <= 30; i += 10)playLevel(i);
			System.out.println("You win!")
		scan.close();
	}
	private static void playLevel(int range){
		int number = (int)(Math.random() * i);
		while(true){
			System.out.println("Guess a number form 0 to " + range);
			int input_number = scan.nextInt();
			if(input_number == number){
				System.out.println("You guessed!");
				break;
			} else if (input_number > number){
				System.out.println("The target number is less");
			} else {
				System.out.println("The target number is greater");
			}
		}
	}
}
