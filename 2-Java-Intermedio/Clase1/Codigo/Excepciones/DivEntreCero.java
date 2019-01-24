import java.util.Scanner;
import java.util.InputMismatchException;

public class DivEntreCero{
	
	public static int dividir(int num, int den) {

		return num/den;

	}

	public static void main(String[] args) {
		
		boolean bandera = true;

		do{
			int res = 0;
			try{

				Scanner sc = new Scanner(System.in);
				System.out.println("Introduzca el numerador");
				int numerador = sc.nextInt();

				System.out.println("Introduzca el denominador");
				int denominador = sc.nextInt();

				res = dividir(numerador,denominador); //Linea que marca el error
				bandera = false;
			
			}catch(ArithmeticException ae){
				System.err.println(ae.getMessage());
			}catch (InputMismatchException ime) {
				System.err.println(ime.getMessage());
			}catch (Exception e) {
				System.err.println(e.getMessage());
			}

			System.out.println("El resultado es: " + res);

		}while(bandera);



	}

}