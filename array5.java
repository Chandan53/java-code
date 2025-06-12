public class array5 {
    public static int linear(int rollno[], int key){
        for(int i=0;i<rollno.length;i++){
            if(rollno[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main (String args[]){
        int rollno[]={1,2,3,4,5,6,7,8,9};
        int key =9;
        int search=linear(rollno,key);
        System.out.println("index no "+ search);

    }
    
}
