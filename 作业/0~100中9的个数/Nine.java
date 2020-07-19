public class Nine {
	public static void main(String[] args) {
		int count =0;
	    int a=1;
	    for(;a<=100;a++) {
	    	if(a%10==9) {
	    		count++;
	    		//System.out.println(a);
	    	}
	    	if(a/9==10) {
	    		count++;
	    		//System.out.println(a);
	    	}
	    	if(a%9==0&&a/9==10) {
	    		count++;
	    		//System.out.println(a);
	    	}
	    }
	    System.out.println(count);
	}
}