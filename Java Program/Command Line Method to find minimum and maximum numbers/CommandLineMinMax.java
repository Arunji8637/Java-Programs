class CommandLineMinMax{
public static void main(String args[]){
int min=Integer.parseInt(args[0]);
int max=Integer.parseInt(args[0]);
for(int i=1; i<args.length; i++){
int currentValue=Integer.parseInt(args[i]);
if(min>currentValue){
min=currentValue;
}
if(max<currentValue){
max=currentValue;
}
}
System.out.println("Minimum Number is "+min);
System.out.println("Maximum Number is "+max);
}
}