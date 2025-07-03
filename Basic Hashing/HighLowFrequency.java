import java.util.*;

public class HighLowFrequency{
    public static void main(String[] args){
        int[] arr = {10,5,15,10,5,10};
        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int i=0;i<=arr.length-1;i++){
            if(hash.containsKey(arr[i])){
                hash.put(arr[i],hash.get(arr[i])+1);
            }else{
                hash.put(arr[i],1);
            }
        }

        int maxElement =0;
        int maxFrequency =0;

        int minElement =0;
        int minFrequency = arr.length-1;


        for(Map.Entry<Integer,Integer>map:hash.entrySet()){
        int key = map.getKey();
        int element = map.getValue();
       
        if(element > maxFrequency){
            maxElement = key;
            maxFrequency = element;
        }

        if(element < maxFrequency){
            minElement = key;
            minFrequency = element;
        }

        }

           System.out.println("The highest frequency element is: " + maxElement + " frequency is "+ maxFrequency);
        System.out.println("The lowest frequency element is: " + minElement + " frequency is "+minFrequency);

    }
}