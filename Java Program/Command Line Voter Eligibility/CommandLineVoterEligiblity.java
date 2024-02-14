class CommandLineVoterEligiblity{
public static void main(String[] args){
String name=args[0];
int age=Integer.parseInt(args[1]);
System.out.println(age>=18 ? name+" is Eligible to Vote." : name+" is not Eligible to Vote.");
}
} 