//package Ejercicio5.lib;

public class Empleado {

    private String nombre;
    private Integer sueldo;

    public Empleado(String nombre, Integer sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getSueldo() {
		return sueldo;
	}

	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString(){
		return this.nombre;
	}

}
