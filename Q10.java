import java.util.Scanner;
public class Q10 {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of array ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		boolean str=true;
		while(str) {
			System.out.println("Menu :");
			System.out.println("b- Display array elements.");
			System.out.println("c- Insert an element at specific position.");
			System.out.println("d- Delete an element at specific position.");
			System.out.println("e- Exit.");
			char ch=sc.next().charAt(0);
			switch(ch) {
			case 'b': display(arr);
					break;
			case 'c': insert(arr);
					break;
			case 'd': delete(arr);
			        break;
			case 'e': str = false;
					System.out.println("Thank you!");
					break;
			default : 
					System.out.println("Invalid option, Try again ");
			}
		}
	}
	public static void display(int a[]) {
		for(int j:a)
			System.out.print(j+" ");
		System.out.println();
	}
	public static void insert(int a[]) {
		System.out.println("Enter the numbr to insert :");
		int e=sc.nextInt();
		System.out.println("Enter the position :");
		int p=sc.nextInt();
		for(int i=a.length-2;i>=p;i--) {
			a[i+1]=a[i];
		}
		a[p]=e;
		System.out.println("Number inserted sucessfully!");
	}
	public static void delete(int a[]) {
		System.out.println("Enter the position to delete :");
		int p=sc.nextInt();
		for(int i=p;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		if(a[a.length-1]==0) {
			System.out.println("Number deleted sucessfully");
		}
	}
}
