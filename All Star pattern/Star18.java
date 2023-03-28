class Star18{
	public static void main(String[] args){
			for(int i=1; i<=5; i++){
				
				for(char j='A'; j<=70-i; j++){
				System.out.print(j+" ");
				}
				System.out.println();
			}
		}
	}
	/*
	public static void main(String[] args) {
		char a=64;
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print((char)((a)+(6-j)));
			}
			System.out.println();
		}
	}
	*/