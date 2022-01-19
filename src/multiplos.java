public class multiplos {
	
		public static void main(String[] args) {
			
			int n = leerN();
			int m = leerM(n);
			int multiplo = 0;
			while (multiplo < (m-1)) {
				System.out.println(siguienteMultiplo(n, multiplo));
				multiplo = multiplo + n;
			}
		}

		public static int leerN() {
			int n = 0;
			while (n <= 0) {
				System.out.println("Introduce un numero positivo");
				n=Console.readInt();
			}
			return n;
		}
		
		public static int leerM(int n) {
			int m = 0;
			while (m <= n) {
				System.out.println("Introduce otro numero positivo");
				m=Console.readInt();
			}
			return m;
		}
		
		public static int siguienteMultiplo(int n, int despuesDe) {
			int multiplo = despuesDe + 1;
			while (multiplo % n != 0) {
				multiplo++;
			}
		return multiplo;	
		}	
	}