public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        
        int left = 0;
        int right = arr.length-1;
        
//         while(left < right) {
            
//             while(arr[left]==0 && left<right) {
//                 left++;
//             }
            
//             while(arr[right]==1 && left<right) {
//                 right--;
//             }
            
//             if(left < right) {
                
//                 arr[left] = 0;
//                 arr[right] = 1;
//                 left++;
//                 right--;
//             }
//         }
        
     	while(left < right) {
            
            if(arr[left] == 0) {
                left++;
            }
            
            else {
                
                if(arr[right] != 1) {
                    
                    arr[left] = 0;
                    arr[right] = 1;
                    left++;
                    right--;
                }
                
                else {
                    right--;
                }
            }
        }   
    } 
}
