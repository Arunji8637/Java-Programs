import java.util.*;
class SumOfDigit{
public static void main(String args[]){
Scanner myObj=new Scanner(System.in);
System.out.print("Enter Number:");
int num=myObj.nextInt();
int digit,sum=0;
while(num>0){
digit=num%10;
sum=sum+digit;
num=num/10;
}
System.out.print(sum);
}
}