

public class quicksort{
    public static void main (String args[]){
        int arr [] = {5,7,3,1,8,9,4,2}; 
        display(arr);
        quickSort(arr, 0, arr.length-1);
        display(arr);
    }
    public static void display (int A[]){
        System.out.println("Here is what is in your list sorted: ");
        System.out.println("");
		for (int j = 0; j < A.length; j++){
            if (j == A.length - 1) {
                System.out.print(A[j]+"");
                return;
            }
			System.out.print(A[j]+", ");
		}
    }
    public static void quickSort (int arr[], int left, int right){
        if (left >= right){
            return; 
        }
        int pivot = arr[(left+right)/2];
        int index = partition(arr, left, right, pivot);
        quickSort(arr, left, index - 1);
        quickSort(arr, index, right);
    }
    public static int partition(int [] arr, int left, int right, int pivot) {
        while (left <= right){
            while (arr[left] < pivot){
                left++;
            }
            while (arr[right]> pivot){
                right--;
            }
            if (left <= right){
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }
    public static void swap (int A[], int i, int j) 
	{
		int temp = A[i]; 
		A[i] = A[j];
		A[j] = temp; 
	}
}