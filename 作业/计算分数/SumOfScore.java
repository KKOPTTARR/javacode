public class SumOfScore {
	/**
	 * 分数计算
	 * 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 
	 * @param args [description]
	 */
	public static void main(String[] args) {
		double a=1;
		double b=2;
		double add=0;
		double sub=0;

		//先算1/1+1/3+1/5+...
		while(a<99) {
			add=(1)/a + add;
			a+=2;
		}
		

		//再算1/2+1/4+1/6+...
		while(b<100) {
			sub=(1)/b + sub;
			b+=2;
		}
		
		
		System.out.println("1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值是：");
		System.out.println(add-sub);
	}
}