/*1:Add Customer(Extra work:customer with unique email is mst get added)
2:Display All Customers
3:Show Customer's name only.
4:Show customer (sort by custid)
5:Show customer(sort by firstName)
6:show customer(sort by Salary)
7:display customer having salary>5000
8:Display customers whose name contains ‘a’ and length greater than 5*/
package Tester;
import Code.*;
import java.util.*;
public class TestCust extends Cust {
    public TestCust(int custid, String firstname, String lastname, String email, double salary) {
		super(custid, firstname, lastname, email, salary);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<TestCust> CustList=new ArrayList<>();
		int choice;
		do {
			System.out.println("Enter your choice:");
			System.out.println("1:Add Customer");
			System.out.println("2:Display All Customers");
			System.out.println("3:Show Customer's name only.");
			System.out.println("4:Show customer (sort by custid)");
			System.out.println("5:Show customer(sort by firstName)");
			System.out.println("6:show customer(sort by Salary)");
			System.out.println("7:display customer having salary>5000");
			System.out.println("8:Display customers whose name contains ‘a’ and length greater than 5");
			System.out.println("9:Exiting Program...");
			choice=sc.nextInt();
			switch(choice) 
			{
			case 1:
				System.out.println("Enter Customerid,First Name,Last Name,Email,Salary");
				TestCust obj=new TestCust(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextDouble());
				CustList.add(obj);
				break;
			case 2:
				CustList.stream().forEach(c->System.out.println(c));
				break;
			case 3:
				CustList.stream().forEach(c->System.out.println(c.getFirstname()));
				break;
			case 4:
				Collections.sort(CustList);
				for(Cust customer:CustList) {
					System.out.println(customer);
				};
				
				break;
			case 5:
				CustList.stream().sorted(Cust.ByFirstName()).forEach(c->System.out.println(c));
				break;
			case 6:
				CustList.stream().sorted(Cust.BySalary()).forEach(c->System.out.println(c));
				break;
			case 7:
				CustList.stream().filter(c->c.getSalary()>5000).forEach(c->System.out.println(c));
				break;
			case 8:
				CustList.stream().filter(a -> a.getFirstname().contains("a") && a.getFirstname().length() == 5)
				.forEach(s -> System.out.println(s));
				break;
			case 9:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Enter valid choice !!!! ");
				break;
			
			}
		}while(choice!=8);

	}


}
