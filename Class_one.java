package Final_keyword;

public class Class_one {

	final int a = 348;
	final int b;
	Class_one() {
		b = 34;
	}
	static final String name;
	static {
		name = "Alamgir Hossain";
	}
	
	void display() {
		System.out.println(a+"\n"+b+"\n"+name);
	}
}
