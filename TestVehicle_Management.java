/*1:show all 2:add vehicle...3:edit color 4:edit price 5:remove */
package Tester;
import Code.Showroom;
import java.util.Scanner;
public class TestVehicle_Management
{

	public static void main(String[] args)
	{
		Showroom []Data=new Showroom[10];
		Scanner sc=new Scanner(System.in);
		int choice,index=0;
        do {
        	
        	System.out.println("Enter your choice :");
        	System.out.println("1:show all data");
        	System.out.println("2:add vehicle");
        	System.out.println("3:edit color");
        	System.out.println("4:edit price");
        	System.out.println("5:remove vehicle");
        	System.out.println("Any other choice to End");
        	choice=sc.nextInt();
        	switch(choice)
        	{
        	case 1:
        
        		for(int i=0;i<Data.length;i++) 
        		    {
        			if(Data[i]!=null) 
        				Data[i].Display();
        		    }
        		break;
        	case 2:
        		System.out.println("Enter Id,Name,Color,Price");
        		if(index<Data.length) {
        			Data[index++]= new Showroom(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
        		}
        		else
					System.out.println("Your Database is full...");
				
				System.out.println("Record Successfully entered");
				break;
        	case 3:
        		System.out.println("Enter the id to edit color:");
        		int n=sc.nextInt();
        		
        		for(int i=0;i<Data.length;i++) {
        		   if(Data[i].getId()==n){
        			System.out.println("Enter the color ");
        			String s=sc.next();
        			Data[i].setColor(s);
        			System.out.println("Colour changed");
                   break;        			
        		}
        		   
        		}
        		break;
        	case 4:
        		System.out.println("Enter the id to edit color:");
        		int m=sc.nextInt();
        		for(int i=0;i<Data.length;i++) {
        		   if(Data[i].getId()==m){
        			System.out.println("Enter the price ");
        			double j=sc.nextDouble();
        			Data[i].setPrice(j);
        			System.out.println("Price changed");
        			break;
        		   }}
        		break;
        	case 5:
        		System.out.println("Enter the id to remove record:");
        		int k=sc.nextInt();
        		for(int i=0;i<Data.length;i++) {
        			if(Data[i].getId()==k) {
        				Data[i]=null;
        				System.out.println("Data successfully removed");
        				break;
        			}
        		}
        		break;	
        	default :
        		System.out.println("Thank You!!!!");
        		break;
        	}
        	}while(choice<=5);
        
	}
}
	