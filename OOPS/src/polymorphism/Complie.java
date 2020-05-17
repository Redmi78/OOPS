package polymorphism;

public class Complie {
	void add(int a ,int b)
	{
		int result= a+b;
		System.out.println(result);
	}
	void sub(int a ,int b)
	{
		int result= a-b;
		System.out.println(result);
	}
	void add(float a ,float b)
	{
		float result= a+b;
		System.out.println(result);
	}
	
	public static void main(String[]args)
	{
		Complie k= new Complie();
		k.add(5, 25);
		k.sub(25, 05);
	}

}
