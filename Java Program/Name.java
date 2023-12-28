class Name{
String course="Java";
static String section="B";
public static void main(String args[]){
String Name="Arun";
System.out.println(Name);
System.out.println(new Name().course);//one cannot access instance Variable into static variable without object.
System.out.println(section);
}
}