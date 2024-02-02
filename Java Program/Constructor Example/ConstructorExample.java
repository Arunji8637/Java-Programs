class ConstructorExample{
int id,age;
String name,doj;
ConstructorExample(int id){
this.id=id;
System.out.println("Employee Id: "+id);
}
ConstructorExample(String name,String doj,int age){
this.name=name;
this.doj=doj;
this.age=age;
System.out.println("Employee Name : "+name);
System.out.println("Age: "+age);
System.out.println("Date of Joining: "+doj);
}
public static void main(String args[]){
ConstructorExample myObj1=new ConstructorExample(1);
ConstructorExample myObj2=new ConstructorExample("Arun","1-2-2024",23);
}
}