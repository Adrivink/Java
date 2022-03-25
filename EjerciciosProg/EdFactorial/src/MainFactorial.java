import java.util.Scanner;

public class MainFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int num;
		System.out.println("Introducir número");
		num=sn.nextInt();
		System.out.println(factorial(num));
	}

	public static int factorial(int num) {
		int aux=num;
     for(int i=num;i>1;i--) {
    	 num=num*(aux-1);
    	 aux=aux-1;
    	 }
     return num;
	}
}
