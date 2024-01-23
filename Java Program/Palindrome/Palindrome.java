import java.io.*;
class Palindrome{
public static void main(String[] args){
Console myObj=System.console();
int r,sum=0;
System.out.print("Enter Number:");
int n=Integer.parseInt(myObj.readLine());
for(int i=n; i>0; i=i/10){
r=i%10;
sum=(sum*10)+r;
}
if(n==sum){
System.out.println("The Given Number is Palindrome.");
}
else{
System.out.println("The Given Number is not a Palindrome.");
}
}
}