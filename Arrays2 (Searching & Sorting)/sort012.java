
public class Solution {

    public static void sort012(int[] arr){
    	//Your code goes here
        
        int left=0, right=arr.length-1;

        int i=0;

        while(i <= right) {

            if(arr[i] == 1) {

                i++;
            }

            else if(arr[i] == 0) {

                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                i++;
                left++;
            }

            else {

                int temp = arr[i];
                arr[i] = arr[right];
                arr[right] = temp;

                right--;
            }
        }       
    }
}
