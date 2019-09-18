import java.util.Arrays;
import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int nnum = sc.nextInt();
		
		int[] numbers = new int[10];
		
		int ptr = 1;
		while(sc.hasNextInt()) {
			int n = sc.nextInt();
			numbers[ptr] = n;
			ptr++;
		}
		
		System.out.println(Arrays.toString(numbers));
		
		//int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//int[] even =  new int[10];
	
		//int evenptr = 0;
		//for(int i = 0; i < numbers.length; i++) {
			//int a = numbers[i]%2;
			
			
			//if(a == 0){
				//even[evenptr] = numbers[i];
				//evenptr++;
			//}
			
		//}
		
		//System.out.println(Arrays.toString(even));

	}

}
