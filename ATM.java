import java.util.Scanner;

/*
 * Create array
 * Create a scanner
 * Create ten accounts
 * loop
 * 	prompt user for ID
 * 	read the id
 * 	if valid
 * 		access account
 * 		loop
 * 			print the menu
 * 			prompt for the choice
 * 			if 1 get balance
 * 			if 2 withdraw
 * 			if 3 deposit
 * 			if 4 return
 * 		end loop
 * end loop
 */

public class A10dot7 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Account[] accounts = new Account[10];
		int id;
		for (id = 0; id < accounts.length; id++) {
			accounts[id] = new Account(id, 100.00);
		}
		do {
			System.out.print("Please enter your ID: ");
			id = input.nextInt();
			if(id >= 0 && id < accounts.length) {
				drawMenu(accounts[id]);
			} else {
				System.out.println("Ivalid account");
			}

		} while (true);
	}

	private static void drawMenu(Account account) {
		int choice;
		double amount;
		do {
			System.out.println("Main Menu");
			System.out.println("1: check balance");
			System.out.println("2: withdraw");
			System.out.println("3: deposit");
			System.out.println("4: exit");
			System.out.print("Enter a choice: ");
			choice = input.nextInt();

			switch(choice) {
				case 1: System.out.printf("The balance is $%.2f%n", account.getBalance());
						break;
				case 2: System.out.print("Please enter amount to withdraw: ");
						amount = input.nextDouble();
						account.withdraw(amount);
						break;
				case 3: System.out.print("Please enter amount to deposit: ");
						amount = input.nextDouble();
						account.deposit(amount);
						break;
				case 4: break;
				default: System.out.println("Invalid option");
			}
		} while (choice != 4);

	}

}
