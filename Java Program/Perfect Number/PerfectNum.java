import java.io.*;
class PerfectNum{
public static void main(String[] args){
Console myObj=System.console();
System.out.print("Enter Number:");
int n=Integer.parseInt(myObj.readLine());
int sum=0;
for(int i=1;i<n;i++){
if(n%i==0){
sum+=i;
}
}
if(sum==n){
System.out.println("The given number is a Perfect Number.");
}
else{
System.out.println("The given number is not a Perfect Number.");
}
}
}