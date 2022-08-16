
public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = output.length-1;
        
        int sum=0, carry=0;
        
        while(j >= 0) {
           
            sum = arr1[i--] + arr2[j--] + carry;
            
            output[k--] = sum % 10;
            
            carry = sum / 10;
        }
        
        while(i >= 0) {
            
            sum = arr1[i--] + carry;
            
            output[k--] = sum % 10;
            
            carry = sum / 10;
        }
        
        output[k] = carry;
    }

}
