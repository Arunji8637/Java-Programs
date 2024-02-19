import java.util.*;
class ArrayTask{
public static void main(String[]  args){
int numbers[]={1,2,3,4,5};
System.out.println("Array Length is :"+numbers.length);
int sum=0,avg;
for(int i=0;i<numbers.length;i++){
sum=sum+numbers[i];
}
System.out.println("Sum of all Element is :"+sum);
avg=sum/numbers.length;
System.out.println("Average of all Element is :"+avg);
int min=numbers[0],max=numbers[0];
for(int i=1;i<numbers.length;i++){
if(min>numbers[i]){
min=numbers[i];
}
if(max<numbers[i]){
max=numbers[i];
}
}
System.out.println("Minimum is :"+min);
System.out.println("Maximum is :"+max);
int copyNumbers[]=Arrays.copyOf(numbers,numbers.length);
System.out.print("Elements of copy Numbers is :");
for(int i=0;i<numbers.length;i++){
System.out.print(numbers[i]+" ");
}
System.out.println();
for(int i=0,j=numbers.length-1;i<numbers.length/2;i++,j--){
int temp=numbers[i];
numbers[i]=numbers[j];
numbers[j]=temp;
}
System.out.print("Reveresed Array Element is :");
for(int i=0;i<numbers.length;i++){
System.out.print(numbers[i]+" ");
}
System.out.println();
int[] arr={5,2,8,3,2,9};
System.out.println("The Array Element before sorting: ");
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}
System.out.println();
Arrays.sort(arr);
System.out.println("The Array Element after sorting in Ascending order :");
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}
System.out.println();
int[] arr1={1,2,3},arr2={5,3,2};
int[] mergedArray=new int[arr1.length+arr2.length];
System.arraycopy(arr1,0,mergedArray,0,arr1.length);
System.arraycopy(arr2,0,mergedArray,arr1.length,arr2.length);
System.out.println("Elements of merged Array is :");
for(int i=0;i<mergedArray.length;i++){
System.out.print(mergedArray[i]+" ");
}
System.out.println();
int count=0;
for(int i=0;i<mergedArray.length;i++){
if(mergedArray[i]==3){
count++;
}
}
System.out.println("The occurance of 3 in mergedArray is "+count+" times");

}
}