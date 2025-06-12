public class array10 {
    public static void main(String args[]){
        int num[]={2,3,4,5,6};
        for( int i=0;i<num.length;i++){

            for(int j=i;j<num.length;j++){
                System.out.println("(" + num[i] + "  , " +num[j]+")");
            }
            
           
        }
    }
    
}
