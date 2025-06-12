// binary search always lies in a shorted array
// it means the array should be in a increasing way
// or the array should be in a decreasing way
public class array8 {
    public static int binary(int number[],int key){
        int start=0;
        int end=number.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            if(number[mid]==key){
                return mid;

            }
            if(number[mid]<key){
                start=mid+1;
            }
            else {
                end=mid-1;
            }

          
        }
        return -1;

    }
    public static void main(String args[]){
        int number[]={2,4,6,8,10,12,14,16,18,20};
        int key =6;
        int index = binary(number,key);
        System.out.println( "key  = " + key + " present  at index " + index);
    }
    
}
