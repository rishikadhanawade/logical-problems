//11111
//10001
//10001
//10001
//11111
package mypack;

public class SquareOne {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||j==1||j==n)
				{
					System.out.print("1");
				}
				else
					System.out.print("0");
			}
			System.out.println();
		}
		
		
		
		

	}

}
