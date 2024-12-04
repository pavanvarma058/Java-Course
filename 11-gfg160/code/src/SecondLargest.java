public class SecondLargest {
    public static void main(String[] args) {
        // Given an array of positive integers arr[], return the second-largest element from the array.
        // If the second-largest element doesn't exist then return -1.
        //Note: The second-largest element should not be equal to the largest element.
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        System.out.println(getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {
        // Code Here
        int n = arr.length;

        int largest = -1;
        int secondLargest = -1;

        for(int i=0; i<n; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}