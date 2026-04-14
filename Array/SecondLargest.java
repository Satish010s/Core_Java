import java.util.Scanner;
import java.util.Arrays;
class SecondLargest 
{
	public static void main(String[] args) 
	{
		System.out.println("Calculate the second largest element of array");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int []arr=new int [n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int maxele=Integer.MIN_VALUE;
		int secmax=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(arr[i]>maxele){
				secmax=maxele;
				maxele=arr[i];
			}
			else if(arr[i]>secmax && arr[i]!=maxele){
				secmax=arr[i];
			}
		}
		if(secmax==Integer.MIN_VALUE){
			System.out.println("No second largest is exist");
		}
		else{
		System.out.println("The second maximum element is"+ secmax);
		}
	}
}
