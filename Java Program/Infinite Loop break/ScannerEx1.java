import java.util.*;
class ScannerEx1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String name="";
int age;
boolean isMarried;
ArrayList<String> name1=new ArrayList<>();
ArrayList<Integer> age1=new ArrayList<>();
ArrayList<Boolean> isMarried1=new ArrayList<>();
while(true){
System.out.print("Enter Name :");
name=sc.next();
sc.nextLine();
if(name.equalsIgnoreCase("exit")){
break;
}
System.out.print("Enter Age :");
age=sc.nextInt();
System.out.print("is Married? :");
isMarried=sc.nextBoolean();
name1.add(name);
age1.add(age);
isMarried1.add(isMarried);
}
for(int i=0;i<name1.size();i++){
System.out.println("Name :"+name1.get(i)+", Age :"+age1.get(i)+", isMarried? :"+isMarried1.get(i));
}
}
}