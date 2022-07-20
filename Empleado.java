package logica;

public class Empleado {

	String cedula;
	String nombre;
	int antiguedad;
	double sueldo;
	
	public Empleado (String a, String b, int c, double d) {
	
	cedula a;
	nombre b;
	int c;
	double d;
	}
	public Empleado() {
		
		}
	public String getCedula() {
		return cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setCedula(String a) {
		cedula = a;
	}
	public void setNombre(String b) {
		nombre = b;
	}
	public void setAntiguedad(int c) {
		antiguedad = c;
	}
	public void setSueldo(double d) {
		sueldo = d;
	}
	
	 public String toString() { 
	    	return "cedula: " + cedula  +  "- nombre: " + nombre  +  "- antiguedad: " + antiguedad  +  "- sueldo: " + sueldo;
	 }
}
