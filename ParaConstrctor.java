package CONSTRUCTOR;

public class ParaConstrctor {
	
	ParaConstrctor()
	{
		
	}
	ParaConstrctor(int a , int b)
	{
		System.out.println("A :"+ a+ " B :"+ b);
	}
	
	ParaConstrctor(int p)
	{
		System.out.println("p :" + p );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParaConstrctor obj = new ParaConstrctor(10,20);
	                   obj = new ParaConstrctor(10);
	                   
	                   

	}

}
