package miniccalcultor;

public class Results {
	int a,b,c;
	void addition() {
		c=a+b;
	}
	void substraction() {
		c=a-b;
	}
	void multiplication() {
		c=a*b;
	}
	void division(){
		c=a/b;
		
	}
	void display() {
		System.out.println("answer="+c);
	}

}
