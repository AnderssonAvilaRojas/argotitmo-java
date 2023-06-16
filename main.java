
import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
        
        int[] arr1={1,2,3,4};
       String arrReturn = Arrays.toString(returnArrayInt1(arr1,1));
     
         System.out.println("res. "+arrReturn);
        // System.out.println("long. "+arr1.length);
            
    }
    static int[] returnArrayInt1(int arr[],int m) {
      if(m<arr.length && m>0){
      int[]original=arr.clone();
        for(int i=original.length-m-1;i>=0;i--){
            arr[i+m]=arr[i];
        }
      int[] temp = new int[arr.length-1];
      int r=0;
        for(int j=m;j>0;j--){
         int k=original.length-j;
          temp[r] = original[k];
        r=r+1;
        }
 
       for(int q=0;q<m;q++){
           arr[q]=temp[q];
       }
 
        return arr;
    }
      else{
          return arr; } 
    }

}
