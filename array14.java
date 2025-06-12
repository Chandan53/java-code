public class array14 {
    public static void kandanes(int arr[]){
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            curr=curr+arr[i];
            if(curr<0){
                curr=0;
            }
            System.out.println(curr);
            if(max<curr){
                max=curr;
            }
        }
        System.out.println("max value " + max);
    }
    public static void main(String args[]){
        int arr[]={-2,-3,-4,-1,2,3,5,6,7};
        kandanes(arr);
    }
    
}
