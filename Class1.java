import java.util.Arrays;
import java.util.stream.*;

public class Class1 {

	public static void main(String[] args) {
		
		int arr[] = {5,2,11,6,22,41,8,3,1,99};
		
		double sum = IntStream.of(arr).sum();
		
		System.out.println(sum / arr.length);
		
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		
		System.out.println(max);
		System.out.println(min);
		
		
		
		
		
		
		
//		double total = 0;
		
//		int min = arr[0];
//		int max = arr[0];
//		
//		for(int i = 0; i < arr.length; i++) {
//			total += arr[i];
//			
//			if(arr[i] < min)
//				min = arr[i];
//			
//			if(arr[i] > max)
//				max = arr[i];
//		}
//		
//		System.out.println("Avarge = " + (total/arr.length));
////		System.out.println("Smallest = " + min);
////		System.out.println("Largest = " + max);
//		
//		Arrays.sort(arr);
//		System.out.println("Smallest = " + arr[0]);
//		System.out.println("Largest = " + arr[arr.length-1]);
	}

}
