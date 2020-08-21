import java.util.Scanner;

public class FindTheNumber {
	/**
	 * 有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
	 * @param args [description]
	 */
	
	//打印
	public static void print(int[] a) {
		for (int x : a) {
			System.out.print(x);
        }
    }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入数组长度:");
		int n=scan.nextInt();
		System.out.println("输入数组（请输入一行整数用空格隔开）：");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		print(arr);
	}
}