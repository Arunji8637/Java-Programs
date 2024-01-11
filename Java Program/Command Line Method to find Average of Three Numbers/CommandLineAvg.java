class CommandLineAvg{
public static void main(String args[]){
int n1=Integer.parseInt(args[0]);
int n2=Integer.parseInt(args[1]);
int n3=Integer.parseInt(args[2]);
double avg=(n1+n2+n3)/args.length;
System.out.println("Average of given Three Number is "+avg);
}
}