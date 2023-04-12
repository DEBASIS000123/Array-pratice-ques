import java.util.Scanner;
public class Q2 {
	
	public static boolean isprime(int a) {
		for(int i=2;i<=Math.sqrt(a);i++) {
			if(a%i==0)
				return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int c=0;
		for(int i=0;i<n;i++) {
			arr[i]=(int)(Math.random()*(100-1)+1);
			if(isprime(arr[i]))
				c++;
		}
		System.out.println("Array element are: ");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("No of prime numbers present in array is :"+c);
		
		
	}

}
