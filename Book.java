//Create Book class  (in code package) with data member bookId,name,author,price
//.Add both default and parameter constructor.Write getters and setters for all data 
//members.Write Display Method for displaying all data members.
package Code;
import java.util.Scanner;
public class Book {
             private int bookId;
             private String name;
             private String author;
             private double price;
             public Book() 
             {
            	 
              }
             public Book(int bookId,String name,String author,double price) {
            	 this.bookId=bookId;
            	 this.name=name;
            	 this.author=author;
            	 this.price=price;
             }
             public void Display() {
            	 System.out.println("Book Id:"+bookId+"\n"+
            			            "Name:"+name+"\n"+
            			            "Author:"+author+"\n"+
            			            "Price:"+price+"\n");
            	 
             }
             public void setbookId(int bookId) {
            	 this.bookId=bookId;
             }
             public int getbookId() {
            	 return bookId;
             }
             public void setname(String name) {
            	 this.name=name;
             }
             public String getname() {
            	 return name;
             }
             public void setauthor(String author) {
            	 this.author=author;
             }
             public String getauthor() {
            	 return author;
             }
             public void setprice(double price) {
            	 this.price=price;
             }
             public double getprice() {
            	 return price;
             }
             
            
}

