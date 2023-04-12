import java.util.Scanner;
public class Q4 {
	public static void min(int a[]) {
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if (a[i]<min) 
				 min=a[i];
		}
		System.out.println("The smallest number present in array is :"+min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The array element are :");
		for(int j:arr) {
			System.out.print(j+" ");
		}
		System.out.println();
		min(arr);
	}

}
