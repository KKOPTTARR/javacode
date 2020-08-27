public class MaxAndMin
{
	public static void main(String[] args)
	{
		
		int a=1;
		int b=2;
		int c=3;
		int max=0;
		int min=0;
		System.out.println("a:" +  a + "b:" +  b + "c:" +  c);


		if(a>c&&a>b)
		{
			max=a;
			if(b>c)
			{
				min=c;
			}
			else
			{
				min=b;
			}
		}
		else if(b>a&&b>c)
		{
			max=b;
			if(a>c)
			{
				min=c;
			}
			else
			{
				min=a;
			}
		}
		else if(c>a&&c>b)
		{
			max=c;
			if(a>b)
			{
				min=b;
			}
			else
			{
				min=a;
			}
		}

		System.out.println("max:" +  max +  "min" +  min);
	}
}



