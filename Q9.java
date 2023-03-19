import java.util.Scanner;
public class Q9 {
	public static int searchelement(int a[],int e) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==e)
				return i ;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array Elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the elemnt which you want to search :");
		int e=sc.nextInt();
		int ps=searchelement(arr,e);
		if (ps!=-1)
			System.out.println("The position of element present in array at position :"+(ps+1));
		else
			System.out.println("Element is not present in the array");
	}

}
