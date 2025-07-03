import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountFrequencies{
    public static void main(String[] args){
        int[] arr = {10,5,15,10,5,10};
        HashMap<Integer,Integer> hashed = new HashMap<>();
         /* 
                we can use anyof the below LinkedHashMap will give the values in ordered manner
                HashMap<Integer,Integer> hashed = new LinkedHashMap<>();
        */
        for(int i=0;i<=arr.length-1;i++){
            if(hashed.containsKey(arr[i])){
                hashed.put(arr[i],hashed.get(arr[i])+1);
            }else{
                hashed.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> keySet : hashed.entrySet()){
            System.out.println(keySet.getKey() + " " + keySet.getValue());
        }
    }
}