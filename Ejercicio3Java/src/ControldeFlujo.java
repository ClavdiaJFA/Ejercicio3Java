import java.util.Scanner;

public class ControldeFlujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Escribir un programa que pida el nombre y la edad de un paticipante. 
		 Si la edad es mayor o igual a 18 y menor o igual a 29, mostrar un 
		 mensaje que diga "Felicidades + nombreIngresado, estás aceptado en 
		 el programa de Generation Java Full Stack".
		 En caso de no cumplirse la condición, mostrar un mensaje que dige:
		 "No cumples con los requisitos para el bootcamp Java Full Stack".
		 */
		System.out.println("Introduce tu nombre:");
		String entradaTeclado = "";
		Scanner entradaEscaner = new Scanner (System.in);
		entradaTeclado = entradaEscaner.nextLine ();
		
		Scanner leerEdad = new Scanner(System.in);
		System.out.println("Ingresa tu edad:");
		int edad = leerEdad.nextInt();
		String mensaje = entrar(edad);
		System.out.println(mensaje);

	}
	
	public static String entrar(int edad) {
		String mensaje = "";
		if(edad >=18 & edad <=30) {
			mensaje = "Felicidades, estás aceptado/a en el programa "
					+ "de Generation Java Full Stack";
		} else {
			mensaje = "No fuiste aceptado/a en el programa";
		}
		
		return mensaje;
	}
	
}
