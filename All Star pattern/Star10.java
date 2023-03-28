class Star10{
	
	public static void main(String[] args) {
			int h=64;
			for(int i=5; i>=1 ; i--) {
				
				for(int k=1; k<=i;k++) {
					System.out.print(" ");
					
				}
				for(int k=i; k<=5; k++) {
					System.out.print((char)(k+h)+" ");
				}
				System.out.println();
			}
		}
}