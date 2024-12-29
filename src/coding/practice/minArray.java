package coding.practice;

public class minArray {

	public static void findMin(int arr[]) {
		int min=arr[0];
		for(int i =1;i <arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}	
		}
		System.out.println("Minimum Element is: "+ min);
	}
	public static void main(String[] args) {
		minArray mn= new minArray();
		int array[] = {23,45,67,4};
		mn.findMin(array);
	}
}
