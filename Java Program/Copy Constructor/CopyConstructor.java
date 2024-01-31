class CopyConstructor{
int temp=37;
CopyConstructor(){
temp=53;
}
CopyConstructor(CopyConstructor c){
System.out.println("Temperature at Morning: "+temp+" degrees");
System.out.println("Temperature at Afternoon: "+c.temp+" degrees");
}
public static void main(String[] args){
CopyConstructor c=new CopyConstructor();
c=new CopyConstructor(c);
}
}