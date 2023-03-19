import java.util.Scanner;
public class Q8 {
	public static void reverse(int a[]) {
		int i,j,temp=0;
		for(i=0,j=a.length-1;i<j;i++,j--) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println("Array elements after reversal :");
		for(int k:a) {
			System.out.print(k+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The array elements are before reverse :");
		for(int j:arr) {
			System.out.print(j+" ");
		}
		System.out.println();
		reverse(arr);
	}

}
