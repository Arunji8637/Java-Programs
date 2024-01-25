import java.util.*;
import java.io.*;
class Armstrong{
public static void main(String[] args){
int num,remainder,result=0,n=0;
Console myObj=System.console();
System.out.print("Enter Number:");
num=Integer.parseInt(myObj.readLine());
for(int i=num;i>0;i=i/10){
n++;
}
for(int i=num;i>0;i=i/10){
remainder=i%10;
result=result+(int)Math.pow(remainder,n);
}
if(num==result){
System.out.println("The given number is an Amrstrong Number.");
}
else{
System.out.println("The given number is not an Amrstrong Number.");
}
}
}