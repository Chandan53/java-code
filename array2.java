import java.util.Scanner;

public class array2 {
// array is a list of element which are of same datatype . and store in a contiguous memory location
    public static void main(String args[]){
// creating an array
       
         int marks[]={99,89,78};
// input in array
        Scanner sc=new Scanner(System.in);
      
// output
        System.out.println("phy " + marks[0]);
        System.out.println("chem " + marks[1]);
        System.out.println("math " + marks[2]);
// update
        marks[2]=87;
        System.out.println("update phy marks " + marks[2]);
// percentage 
        int percentage=(marks[0]+ marks[1]+ marks[2])/3;
        System.out.println( "percentage  "+percentage);
// to calculate the length of the array
        System.out.println(" length of an array " + marks.length);
// we can make changes in value
        marks[0]=marks[0]+1;
        System.out.println("phy "+ marks[0]);
        System.out.println("chem " + marks[1]);
        System.out.println("maths " + marks[2]);
    
    }   
    
}
