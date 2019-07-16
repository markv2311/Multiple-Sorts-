import java.util.*;


public class swapsort 
{
	public static void main (String args[])
	{
		int fixme [] = new int [5];
		Scanner input = new Scanner (System.in);
		System.out.println("What numbers would you like in the array pick 5\n");
		for (int i = 0; i < fixme.length; i++)
		{
			fixme[i]= input.nextInt();
		}
        System.out.println("Here is what is in your list unsorted\n");
        for (int k = 0; k < fixme.length; k++){
			System.out.print(fixme[k]+", ");
		}
		sendto(fixme);
		System.out.print("Here is what is in your list sorted: ");
		for (int j = 0; j < fixme.length; j++){
			System.out.print(fixme[j]+", ");
		}
	}
	public static void sendto (int A[])
	{
		boolean issorted = false;
		int lastsort = A.length -1;
		while (!issorted){
			issorted = true;
			for (int i =0; i < lastsort; i++){
				if (A[i] > A[i +1]){
					swap( A, i, i+1);
					issorted = false;
				}
			}
		}
		
	}
	public static void swap (int A[], int i, int j) 
	{
		int temp = A[i]; 
		A[i] = A[j];
		A[j] = temp; 
	}
	
}