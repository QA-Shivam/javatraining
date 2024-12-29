package coding.exercise;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Arrray: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter " + size + " elements for the array:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Original Array: " + Arrays.toString(array));
		findMinimumElement(array);
		findMaximumElement(array);
		findSumandAvgofElements(array);
		findElement(array);
		sortArray(array);
	}

	public static int findMinimumElement(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Minimum element in array is: " + min);
		return min;
	}

	public static int findMaximumElement(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Maximum element in array is: " + max);
		return max;
	}

	public static int findSumandAvgofElements(int arr[]) {
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		System.out.println("Sum of elements in array is: " + sum);
		System.out.println("Average of elements in array is: " + avg);
		return sum;
	}

	public static void findElement(int arr[]) {
		boolean flag = false;
		System.out.println("Enter element you want to find : ");
		Scanner sc = new Scanner(System.in);
		int element = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				System.out.println("Element " + element + " present at " + i + "index in array");
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Element " + element + " is not present in the array: " + Arrays.toString(arr));
		}
	}

	public static void sortArray(int arr[]) {
		Arrays.sort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}
}
