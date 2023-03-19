import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int [101];
		int n;
		System.out.println("Enter the integers between 1 to 100");
		do{
			n=sc.nextInt();
			arr[n]++;
		}while(n!=0);
		for(int i=0;i<100;i++) {
			if(arr[i]>0)
				System.out.println(i+" occurs "+arr[i]+((arr[i]>1)?" times. ":" time. "));
		}
	}

}
