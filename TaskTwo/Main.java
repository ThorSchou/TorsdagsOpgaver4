import java.util.Scanner;

class Main{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please type your name");
		
		String name = scanner.nextLine();		
		System.out.println("Hello "+name+" please type your age");
		
		int age = Integer.parseInt(scanner.nextLine());
		System.out.println("You're "+age+" years old");
		
		int retirement = 67 - age;
		System.out.println("You have "+retirement+" years until retirement");
	}
	
}