/*Upcasting: Child class object get assigned to the parent class */
package Tester;
import java.util.Scanner;
import Code.Book;
public class Book_Menu_Driven {
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		int choice,index=0;
		Book[] Lib =new Book[20];
		do {
			
			System.out.println("Enter your choice:");
			System.out.println("1:show all Books");
			System.out.println("2:Add new  Book ");
			System.out.println("3:Update Book");
			System.out.println("4:Delete Book");
			System.out.println("5:edit name");
			System.out.println("6:edit Author");
			System.out.println("7:edit Price");
			System.out.println("8:Get book details by bookid");
			System.out.println("9:Show All Books having price >450");
			System.out.println("10:Show All book names");
			choice=sc.nextInt();
			switch(choice) 
			{
			case 1:
				for (int i = 0; i < Lib.length; i++) {
					if (Lib[i]!= null) 
						Lib[i].Display();
				}
				break;
			case 2:
			    System.out.println("Enter Book id,name,author,price");
				if(index<Lib.length) 
				{
				Lib[index++]=new Book(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
				
				}
				else
					System.out.println("Your Library is full...");
				
				System.out.println("Record Successfully entered");
				break;
			case 3:
				System.out.println("Enter the book id of book to be updated");
				int u=sc.nextInt();
				for(int i=0;i<Lib.length;i++) 
				{
					if(Lib[i]!=null && Lib[i].getbookId()==u)
					{   
						System.out.println("Enter book id ");
						Lib[i].setbookId(sc.nextInt());
						System.out.println("Enter book name ");
						Lib[i].setname(sc.next());
						System.out.println("Enter author ");
						Lib[i].setauthor(sc.next());
						System.out.println("Enter price ");
						Lib[i].setprice(sc.nextDouble());
						System.out.println("Updated !!!");
						break;
					}
				}
				break;
				
			case 4:
				System.out.println("Enter the bookid of book to be deleted");
				int d=sc.nextInt();
				for(int i=0;i<Lib.length;i++) 
				{
					if(Lib[i].getbookId()==d)
					{   Lib[i]=null;
						System.out.println("Book Deleted !!!");
						break;
					}
				}
				break;
			case 5:
				System.out.println("Enter the bookid of the book to change name");
				int n=sc.nextInt();
				for(int i=0;i<Lib.length;i++) 
				{
					if(Lib[i].getbookId()==n)
					{
						System.out.println("Enter new name");
						Lib[i].setname(sc.next());
						System.out.println("Book name changed");
						break;
					}
				}
				break;
			case 6:
				System.out.println("Enter the bookid of the book to change author name");
				int id=sc.nextInt();
				for(int i=0;i<Lib.length;i++) 
				{
					if(Lib[i].getbookId()==id)
					{
						System.out.println("Enter new author name");
						Lib[i].setauthor(sc.next());
						System.out.println("Author changed");
						break;
					}
				}
				break;
			case 7:
				System.out.println("Enter the bookid of the book to change price");
				int p=sc.nextInt();
				for(int i=0;i<Lib.length;i++) 
				{
					if(Lib[i].getbookId()==p)
					{
						System.out.println("Enter new price");
						Lib[i].setprice(sc.nextDouble());
						System.out.println("Price changed");
						break;
					}
				}
				break;
			
			case 8:
				System.out.println("Enter the bookid of the book ");
				int a=sc.nextInt();
				for(int i=0;i<=Lib.length;i++) 
				{
					if(Lib[i].getbookId()==a)
					{
						Lib[i].Display();
						break;
					}
				}
				break;
			case 9:
				System.out.println("All Books having price > 450");
				for (int i = 0; i < Lib.length; i++) {
					if (Lib[i]!= null) {
						if(Lib[i].getprice()>450) 
						{
						Lib[i].Display();
						break;
						}
					}
				}
				break;
			case 10:
				System.out.println("All book names:");
				for (int i = 0; i < Lib.length; i++) 
				{
					if (Lib[i]!= null)
					{
						System.out.println(Lib[i].getname());
					}
				}
				break;
			default:
				System.out.println("Enter valid choice... Thank You!!!");
				break;
			}	
		}while(choice<=10);
		

	}

}

