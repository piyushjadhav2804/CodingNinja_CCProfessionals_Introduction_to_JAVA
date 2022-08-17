public class Solution {	

    public static void insertionSort(int[] arr) {
        
        int n = arr.length;

        for(int i=1; i<n; i++) {

            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key) {

                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }
    
    public static int pairSum(int[] arr, int startIndex, int endIndex, int num) {
        
        int numPair = 0;
        while(startIndex < endIndex){
            if (arr[startIndex] + arr[endIndex] < num) {
                // move from left to right, increase start
                startIndex++;
            } else if (arr[startIndex] + arr[endIndex] > num) {
                // move from right to left, decrease end
                endIndex--;
            } else 
            {
                int elementAtStart = arr[startIndex];
                int elementAtEnd = arr[endIndex];
                // to check for {2,2,2,2,2} all elements same condition
                if (elementAtStart == elementAtEnd) {
                    int totalElementFromStartToEnd = (endIndex - startIndex) + 1;
                    numPair += ((totalElementFromStartToEnd) * (totalElementFromStartToEnd - 1)) / 2;
                    return numPair;
                }
                int tempStartIndex = startIndex + 1;
                int tempEndIndex = endIndex - 1;
                // to check for index of same elements from start/left
                while (tempStartIndex <= tempEndIndex && arr[tempStartIndex] == elementAtStart) {
                    tempStartIndex++;
                }
                // to check for index of same elements from end/right
                while (tempEndIndex >= tempStartIndex && arr[tempEndIndex] == elementAtEnd) {
                    tempEndIndex--;
                }
                // count no of same elements from start
                int totalElementFromStart = tempStartIndex - startIndex;
                // count no of same elements from end
                int totalElementFromEnd = endIndex - tempEndIndex;
                // count no. of total num pairs n*m
                numPair += (totalElementFromEnd * totalElementFromStart);
                // adjust start and end
                startIndex = tempStartIndex;
                endIndex = tempEndIndex;

            }
        }
        return numPair;
	}
    
	public static int tripletSum(int[] arr, int num) {
		//Your code goes here
        
        insertionSort(arr);
        int count=0;
        
        int left=0, right=0;
        
        for(int i=0; i<arr.length; i++) {
            
            int pairSumFor = num - arr[i];
            int numPairs = pairSum(arr, (i+1), (arr.length-1), pairSumFor);
            count += numPairs;
        }
        
    	return count;
    }
}
