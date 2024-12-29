package coding.practice;

public class myFirstProgram {
	int a = 0;
	static int b = 0;

	public myFirstProgram() {
		a++;
		b++;
		System.out.println("a- " + a);
		System.out.println("b- " + b);
	}

	public static void main(String[] args) {
			myFirstProgram p1= new myFirstProgram();
			myFirstProgram p2= new myFirstProgram();
			myFirstProgram p3= new myFirstProgram();

	}

}
