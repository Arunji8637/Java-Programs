import java.io.*;
class ArithmeticMethods{
static int[] arr=new int[4];
void add(int a,int b){
int c=a+b;
arr[0]=c;
}
void sub(int a,int b){
int c=a-b;
arr[1]=c;
}
void mul(int a,int b){
int c=a*b;
arr[2]=c;
}
void div(int a,int b){
int c=a/b;
arr[3]=c;
}
public static void main(String[] args){
Console myObj=System.console();
System.out.print("Enter input1: ");
int n1=Integer.parseInt(myObj.readLine());
System.out.print("Enter input2: ");
int n2=Integer.parseInt(myObj.readLine());
ArithmeticMethods classObj=new ArithmeticMethods();
classObj.add(n1,n2);
classObj.sub(n1,n2);
classObj.mul(n1,n2);
classObj.div(n1,n2);
System.out.println("add:"+arr[0]);
System.out.println("sub:"+arr[1]);
System.out.println("mul:"+arr[2]);
System.out.println("div:"+arr[3]);
}
}