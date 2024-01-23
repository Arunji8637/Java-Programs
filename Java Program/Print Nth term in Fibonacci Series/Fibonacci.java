import java.io.*;
class Fibonacci{  
public static void main(String args[])  
{    
 long n1=0,n2=1,n3,i=2,count;
Console myObj=System.console();
System.out.println("Enter Input:");
count=Integer.parseInt(myObj.readLine());    
 System.out.print(n1+" "+n2);     
 do{    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3; 
i++;   
 } while(i<count); 
System.out.println();
System.out.print("The Number at given position is "+n3);  
System.out.println();
 } 
}