package easy;

public class HamiltonWeight {
	public static void main(String[] args) {
		
		System.out.println(hamiltonWeight(2147483645));
		
	}
	
	public static int hamiltonWeight(int n)
	{
		int count=0;
		int temp=n;
		while(temp>0)
		{
			if(temp%2==1)
				count++;
			temp=temp/2;
		}
		return count;
	}

}
