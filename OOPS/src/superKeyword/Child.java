package superKeyword;

public class Child extends Parent {
int c,d;
Child (int a, int b, int c,int d)
{
	super(a,b);
	this.c=c;
	this.d=d;
}
void Dispaly()
{
	System.out.println("patents a "  + super.a);
	System.out.println("patents b "  + super.b);
	System.out.println("child c"  + this.c);
	System.out.println("child  d "  + this.d);
}

	void f1()
	{
		super.f1();
		System.out.println("child f1");
	}
}
