import java.util.*;


public class swapsort 
{
	public static void main (String args[])
	{
		int fixme [] = new int [5]; // array holding 5 numbers 
		int answer; 
		Scanner input = new Scanner (System.in); // getting input from the user 
		System.out.println("What numbers would you like in the array pick 5."); 
		for (int i = 0; i < fixme.length; i++) // adding the numbers to the array 
		{
			fixme[i]= input.nextInt(); 
		}
        System.out.print("Here is what is in your list unsorted: ");
        int k = 0;
            while (k != fixme.length - 1) { // do length minus one for the neatness purpose 
                System.out.print(fixme[k]+", "); // prints an unsorted list 
                k++;
            }
		   System.out.print(fixme[k]+""); // prints the last number without the comma there 
		System.out.println("\n");
		System.out.print("What Sort would you like? Bubble: 1 or Selection: 2 ");
		answer = input.nextInt();
		switch (answer){
			case 1:
				bubble(fixme); 
				display(fixme);
				break;
			case 2: 
				selection(fixme);
				display(fixme);
				break; 
			default: 
				System.out.println("You didnt select an option so we picked bubble for you.");
				bubble(fixme);
				display(fixme);
				break;
			}
		
		
		
	
	}
	public static void selection (int A[]){
		int out, in; 
		for (out=0; out <A.length - 1; out ++){
			int min = out; 
			for(in = out+1; in < A.length; in ++)
				if (A[in]<A[min])
					min = in;
				
			
			swap(A, min, out);
		}
	}
	public static void bubble (int A[])
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
	public static void display (int A[]){
		System.out.print("Here is what is in your list sorted: ");
		for (int j = 0; j < A.length; j++){
            if (j == A.length - 1) {
                System.out.print(A[j]+"");
                return;
            }
			System.out.print(A[j]+", ");
		}
	}
	
}