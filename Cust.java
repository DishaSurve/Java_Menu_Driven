/*
1:Create class Customer: custid,firstname,lastname,email,salary.
Create CustomerManagementSystem as a tester application
Store customer details in the suitable ArrayList.
Provide Menu like
1:Add Customer(Extra work:customer with unique email is mst get added)
2:Display All Customers
3:Show Customer's name only.
4:Show customer (sort by custid)
5:Show customer(sort by firstName)
6:show customer(sort by Salary)
7:display customer having salary>5000
8:Display customers whose name contains ‘a’ and length greater than 5
*/
package Code;

import java.util.*;

public class Cust implements Comparable<Cust>{
	private int custid;
	private String firstname;
	private String lastname;
	private String email;
	private double salary;
	public List<Cust> CustList;
	public Cust(int custid,String firstname,String lastname,String email,double salary) {
		this.custid=custid;
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
		this.salary=salary;
	}
	public int getCustid() {
		return custid;
	}
	@Override
	public String toString() {
		return "Cust [custid=" + custid + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", salary=" + salary + ", CustList=" + CustList + "]";
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Cust o) {
		if(this.getCustid()>o.getCustid())
		    return 1;
		else if(this.getCustid()<o.getCustid())
			return -1;
		else
			return 0;
	}
   public static Comparator<Cust> ByFirstName(){
	return Comparator.comparing(c->c.getFirstname());      
   }
   public static Comparator<Cust> BySalary(){
	   return Comparator.comparing(c->c.getSalary());
   }

}
