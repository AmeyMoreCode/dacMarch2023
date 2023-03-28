class Star5{
	
	public static void main(String args[])
		
		{
			int k=64;
			//Upper Triangle
			
			for(int i=1;i<=5;i++)
			{
			
				for(int j=1;j<=i;j++)
				{
					System.out.print((char)(k+i)+" ");
				}
				System.out.println();
			}
					
		}
}