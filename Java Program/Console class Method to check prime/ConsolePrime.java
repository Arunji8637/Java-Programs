import java.io.*;
class ConsolePrime{
public static void main(String[] args){
Console myObj=System.console();
int count=0;
System.out.print("Enter Number: ");
int n=Integer.parseInt(myObj.readLine());
for(int i=1; i<=n; i++){
if(n%i==0){
count++;
}
}
if(count==2){
System.out.println("The Given Number is a Prime.");
}
else{
System.out.println("The Given Number is not a Prime.");
}
}
}