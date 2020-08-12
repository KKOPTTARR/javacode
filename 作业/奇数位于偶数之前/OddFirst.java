import java.util.Scanner;

public class OddFirst {
	
	//打印数组
	public static void print(int[] arr1) {
		for (int x : arr1) {
			System.out.print(x + " ");	}
		}

	
    //奇数优先
	public static void oddFirst(int[] arr2) {
		for (int i=0; i<arr2.length-1; i++) {
			for (int j=0; j<arr2.length-1; j++) {
				if(arr2[j+1]%2==0 && arr2[j]%2==1) {
					int temp=arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=temp;
				}
				
			}
					
		}
	}

	
	//main
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入数组长度:");
		int n=scan.nextInt();
		System.out.println("输入数组（请输入一行整数用空格隔开）：");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		oddFirst(arr);
		print(arr);
	}
}