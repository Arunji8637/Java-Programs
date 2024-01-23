import java.io.*;
class Factorial{
public static void main(String[] args){
int factorial=1; 
Console myObj=System.console();
System.out.print("Enter the Input: ");
int n=Integer.parseInt(myObj.readLine());
for(int i=n; i>=1; i--){
factorial=factorial*i;
}
System.out.println("The Factorial of given Number is: "+factorial);
}
}
 