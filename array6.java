public class array6 {
    public static void linear(String name[], String key){
        // case 1 
        boolean found =false;
        // if found case2
        for( int i=0;i<name.length;i++){
            if(name[i]== key){
                System.out.println(" found at index "+ i);
             found =true;
            }
        }
        // if not found then case3
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
