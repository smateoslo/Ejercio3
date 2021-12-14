
public class Debugger {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		
		System.out.print("Dame un numero: ");
		int num = Console.readInt();
		int n_factorial = factorial(num);
	}
	
	public static int factorial(int num){
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact = fact * i;
		}
	
		return fact;
	}
}
