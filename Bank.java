package Code;
import java.util.*;

public class Bank implements Comparable<Bank>{
                  private int acctno;
                  private String name;
                  private String email;
                  private double balance;
                  static int i;
                public Bank() {
                	
                }
				public Bank(int acctno, String name,String email, double balance) //constructor
				{
					this.acctno = acctno;
					this.name = name;
					this.email=email;
					this.balance = balance;
				}
				public int getAcctno() {
					return acctno;
				}
				public void setAcctno(int acctno) {
					this.acctno = acctno;
				}
				public String getName() {
					return name;
				}
				public void setName(String name) {
					this.name = name;
				}
				public double getBalance() {
					return balance;
				}
				public void setBalance(double balance) {
					this.balance = balance;
				}
				public static Map<Integer,Bank> insertRec(Map<Integer, Bank> bank,int id,String name,String email,double balance){
			    	   Bank obj=new Bank(id, name,email,balance);
			    	  // Map<Integer,Bank> bank=new HashMap<Integer,Bank>();
			    	   bank.put(i++, obj);
			    	   
					   return bank;
			    	   }
				public static boolean verifyEmail(String email) {
			    	   if(email.contains("@")&& email.endsWith(".com")) {
			    		   return true;
			    	   }
			    	   else;
					       return false;   
			       }

				@Override
				public String toString() {
					return "acctno=" + acctno + ", name=" + name + ", balance=" + balance ;
				}
				
				@Override
				public int compareTo(Bank o) {
					if(this.getAcctno()>o.getAcctno()) 
						return 1;
					else if(this.getAcctno()<o.getAcctno()) 
						return -1;
					
					else
						return 0;
					
				}
				                  
}
