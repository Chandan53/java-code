public class array11 {
    public static void subarr (int num[]){
       
        for (int i=0;i<num.length;i++){
            int start=i;
            // System.out.println(start);

            for(int j=i;j<num.length;j++){
                int end=j;
                // System.out.println("j" + end);
                

                for(int k=start;k<=end;k++){
                    System.out.print( num[k]);

                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
         int num[]={2,4,6,8,10};
         subarr(num);

    }
    
}
