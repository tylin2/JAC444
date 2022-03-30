
public class ReverseArray {
	
	public static void main(String args[]) {
		int[] arr1= {1,2,3,4,5};
		int[] arr2=reverse(arr1);
		
		System.out.println("The address value of arr1   "+ arr1);
		System.out.println("The address value of arr2   "+ arr2);
		for(int i:arr2) {
			System.out.print(i + " ");
		}
	}


								//(new int[] = {1,2,3,4,5})
	public static int[] reverse(int[] arr) {
		
		arr[0]=36;
		System.out.println("The address value of arr    " + arr);
		int[] result = new int[arr.length];
		System.out.println("The address value of result " + result);
	
		for(int i=0, j=result.length-1; i<arr.length; i++, j--) {
			result[j]=arr[i];
		}
		return result;
	}
}
