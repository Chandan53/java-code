public class array13 {
    public static void prefix(int arr[]){
        int max=Integer.MIN_VALUE;
        int curr=0;
        // create prefix array to save the sum of the array
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        System.out.println(prefix[0]);
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
             System.out.println( prefix[i]);
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end =j;

                curr= start == 0? prefix[end]:prefix[end]-prefix[start-1];

                
            }
            if( max<curr){
                max=curr;
            }
        }
        System.out.println("max "+ max);
    }
    public static void main(String args[]){
        int arr[]={1,2,3};
        prefix(arr);
    }
    
}
