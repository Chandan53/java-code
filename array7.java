import java.util.*;
public class array7 {
    public static int smallest(int number[]){
        int smallest= Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(smallest>number[i]){
                smallest=number[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int number[]={6,5,3,7,2,4,8,2,4,7};
        System.out.println("smallest no " + smallest(number));

    }
    
}
