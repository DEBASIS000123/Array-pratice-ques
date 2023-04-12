import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=(int)(Math.random()*(n-1)+1);
			sum+=arr[i];
		}
		System.out.println("array element are :");
		for(int j:arr) {
			System.out.print(j);
		}
		System.out.println();
		System.out.println("The sum of array elements is :"+sum);
		System.out.println("The avarage of array elements is "+(sum/n));
		
	}

}
