package consola;
import java.util.Scanner;
import logica.*;
public class Princi_Empleado {
		
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		Empleado e1 = new Empleado();
		Empleado e2 = new Empleado();
		
		System.out.println("ingrese cedula");
		String cedula = teclado.next();
		System.out.println("ingrese su nombre");
		String nombre = teclado.next();
		System.out.println("ingrese antiguedad");
		int antiguedad = teclado.nextInt();
		System.out.println("e ingrese su sueldo");
		double sueldo = teclado.nextDouble();
		
		e1.setCedula("1111");
		e1.setNombre("Pedro");
		e1.setAntiguedad(4);
		e1.setSueldo(2500);
		
		e2.setNombre(nombre);
		e2.setCedula(cedula);
		e2.setAntiguedad(antiguedad);
		e2.setSueldo(sueldo);
		
		System.out.println(e1);
		System.out.println(e2);
	}

}
