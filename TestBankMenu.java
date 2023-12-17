package Tester;

import Code.Bank;
import java.util.*;

public class TestBankMenu extends Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		Map<Integer, Bank> bmap = new HashMap<Integer, Bank>();
		do {
			System.out.println("Enter your choice:");
			System.out.println("1:Add Record.");
			System.out.println("2:Display all records");
			System.out.println("3:Sort by id");
			System.out.println("4:Sort by name");
			System.out.println("5:Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter id,name,email,balance");
				bmap = Bank.insertRec(bmap,sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
				break;
			case 2:
				Collection<Bank> allRec = bmap.values();
				for (Bank b:allRec) {
					System.out.println(b);
				}
				break;
			case 3:
				Collection<Bank> listId=new ArrayList<>(bmap.values());
				for(Bank b:listId) {
					System.out.println(b );
				}
				break;
			case 4:
				List<Bank> listByName=new ArrayList<>(bmap.values());
				Collections.sort(listByName,Comparator.comparing(b->b.getName()));
				for(Bank b:listByName) {
					System.out.println(b);
				}
				break;
			case 5:
				System.out.println("Exiting the program .....");
				break;
			}

		} while (choice != 5);

	}

}
