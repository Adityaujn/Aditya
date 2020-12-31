import java.io.*; 
class Numbers 

{ 
	static void number(int n) 
	{ 
		if(n > 0) 
		{ 
			number(n-1); 
			System.out.print(n + " "); 
		} 
		return; 
	} 

	public static void main(String[] args) 
	{ 
		number(100); 
	} 
}
