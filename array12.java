public class array12 {
    
    public static void main(String args[]){
        int arr[]={1,2,3};
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;

            for (int j=i;j<arr.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    System.out.println(" value --> "+arr[k]);
                    currsum += arr[k];

                }
                System.out.println("curr " +currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
               // System.out.println();
            }
        }
        System.out.print("max sum " +maxsum);

    }
    
}
