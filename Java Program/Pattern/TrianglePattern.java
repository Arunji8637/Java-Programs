import java.util.*;
class TrianglePattern{
public static void main(String args[]){
Scanner myObj=new Scanner(System.in);
System.out.print("Enter Height:");
int n=myObj.nextInt();
for(int i=1; i<=n; i++){
for(int j=1; j<=i; j++){
System.out.print("*");
}
System.out.println();
}
}
}