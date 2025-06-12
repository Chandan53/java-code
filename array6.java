public class array6 {
    public static void linear(String name[], String key){
        boolean found =false;
        for( int i=0;i<name.length;i++){
            if(name[i]== key){
                System.out.println(" found at index "+ i);
             found =true;
            }
        }
        if(!found){
            System.out.println("not present in the array");
        }
        
    }
    public static void main(String args[]){
        String name[]={"radha","krishna","vishnu","ram","chandan","kundan","anu","minu"};
        String key ="hi";

        linear(name,key);
        

        
    }
    
}
