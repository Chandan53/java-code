public class array3 {
    // step2 making a function
    public static void update(int marks[]){
        // step3 changing  in function
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+3;
        }
    }
    public static void main(String args[]){
        // step1 create array of marks
        int marks[]={77,67,57};

        // step4 calling a function(call by reference)
        update(marks);
        // print a upgraded value
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println();

    }
  
   
    
}
