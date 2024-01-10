import java.util.*;
class MultiplicationTable{
public static void main(String args[]){
Scanner myObj=new Scanner(System.in);
System.out.print("Enter Value:");
int n=myObj.nextInt();
System.out.println("Using For Loop");
for(int i=1; i<=10; i++){
int result=n*i;
System.out.println(n+" * "+i+" = "+result);
}
System.out.println("Using While Loop");
int i=1;
while(i<=10){
int result=n*i;
System.out.println(n+" * "+i+" = "+result);
i++;
}
System.out.println("Using Do while Loop");
int j=1;
do{
int result=n*j;
System.out.println(n+" * "+j+" = "+result);
j++;
}while(j<=10);
}
}