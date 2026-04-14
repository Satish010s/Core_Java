import java.util.Scanner;
class ReverseAnArray 
{
	public static void main(String[] args) 
	{
		System.out.println("Reverse an array");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n =sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter all element of array");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Now the reverse of array is :");
		for(int i=n-1;i>=0;i--){
			System.out.println(arr[i]);
		}
	}
}
