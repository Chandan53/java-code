public class array4 {
    // call by value
    public static void update(int a){
        a=100;
    }
    public static void main (String args[]){
        int a=90;
        update(a);
        System.out.println(a);

    }
    
}
