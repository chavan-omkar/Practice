import java.util.*;

public class Array{
    /*
    ******************** Find the Min Value *****************
    This program finds the min value from an given array
    */

   /*  
    public static void main(String[] args){
       int arr[] ={10, 20, 5, 30, 15, 25};
     int minValue = arr[0];
       for(int i =0;i < arr.length;i++){
        if(arr[i] < minValue){
            minValue = arr[i];
        }
       }
       System.out.println ("Minimum vlue from the given array is : " + minValue);
       }



       /*
    ******************** Find the Max Value *****************
    This program finds the Max value from an given array
    */

     /*
    public static void main(String[] args){
       int arr[] ={10, 20, 5, 30, 15, 25};
     int maxValue = arr[0];
       for(int i =1;i < arr.length;i++){
        if(arr[i] > maxValue){
            maxValue = arr[i];
        }
       }
       System.out.println ("Maximum vlue from the given array is : " + maxValue);
       }
        
        */


/* ******************** Find the 2nd Max Value *****************
    This program finds the 2nd Max value from an given array

 public static void main(String[] args){
  int[] numbers = {10,24,130,15,67,37};
  int largestValue = numbers[0];
  int secondLargestValue = -1;

  for(int i=1;i<numbers.length;i++){

    if(numbers[i] > largestValue){
      largestValue = numbers[i];
    }

    if(numbers[i] > secondLargestValue && numbers[i] < largestValue){
secondLargestValue = numbers[i];
    }
  }
  System.out.println("The 2nd largestValue from the array is : " + secondLargestValue);
 }
    }
    
*/    

/*
 ******************** Find if the array is sorted or not *****************
     This program finds if the array is sorted or not from an given array

    
      public static void main(String[]args){
        int[]arr = {3,5,6,3,4};
        isSortedArray(arr);
      }

      public static boolean isSortedArray(int[]arr){
        for(int i=1;i<arr.length;i++){
          if(arr[i]>=arr[i-1]){

          }else{
            System.out.print("The given array is not sorted");
          return false;
          }
        }
        System.out.print("The given array is sorted");
        return true;
      }

     */

    /* ******************** Remove duplicates from the Array  *****************
      This program removes duplicates from the given Array

     public static void main(String[] args){
      int[] arr = {1,1,2,2,2,3,3};

      int i=0;
      for(int j=1;j<arr.length;j++){
        if(arr[i] != arr[j]){
          i++;
          arr[i]=arr[j];
          
        }
      }
      i++;
      for(int k=0;k<i;k++){
      System.out.print(arr[k] + " ");
      }
     }


*/


    /*  ******************** Rotate the given array by 1 places to left in the given array itself *****************  */

/*
     here the time complexity is O(n) and space complexity is O(1)
    because we are not using any extra space apart from given array
    


public static void main(String[] args){
  int[] arr = {1,2,3,4,5,6,7};
  int lastValue = arr[0];
  for(int i=1;i<arr.length;i++){
    arr[i-1]= arr[i];
  }
  arr[arr.length-1]=lastValue;

for(int j=0;j<arr.length;j++){
  System.out.print(arr[j]+" ");
}

    }
    */


   /* 
    ******************** Rotatate the given array by k places to left in the given array itself *****************
*/

/*

1) This is brute force solution

public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number by which you want to rotate the array");
  int no = sc.nextInt();
  
 int[] arr = {1,2,3,4,5,6,7,8,9};



 if(no > arr.length )
    no = no % arr.length;
 if( no < 0){
    System.out.println("Invalid number entered");
    return;
  }
 int[] temp = new int[no] ;
  

  for(int i = 0;i<no;i++){
temp[i] = arr[i];
  }

  for(int k = no;k<=arr.length-1;k++){
    arr[k-no] = arr[k];
  }
int te = 0;
  for(int j=(arr.length)-no;j<arr.length;j++){
    // System.out.print(arr[j]);
    if(te > no)
    break;
    arr[j] = temp[te];
    // System.out.print(arr[j]);
    te= te + 1;
    // if(te > no){
    //   break;
    // }
  }

for(int m=0;m<=arr.length-1;m++){
  System.out.print(arr[m] + " ");
}

}

*/


public static void main(String[] args){
int[] arr = {1,2,3,4,5,6,7};
Scanner sc = new Scanner(System.in);
int n = sc.nextInt()-1;

for(int i = 0;i<=n;i++){
  arr[i]=arr[n-i];
  System.out.print(arr[i] + " ");
}

for(int j = n;j<=arr.length;j++){
  // arr[j] = arr[j]
  //  System.out.print(arr[i] + " ");
}
  
}

   
}
