/**
 * Esta clase la utilizo para aprender a documentar con javadoc
 * 
 * @author Manu Martinez
 * @version 0.0.8
 * @since 14/04/23
 */ 


package ies;

	/**
	 *
	 * @param emp_no: un entero que representa el número de empleado
	 * @param nombre: una cadena que representa el nombre del empleado
	 * @param apellido: una cadena que representa el apellido del empleado
	 * @param pobla: una cadena que representa la población del empleado
	 * @param oficio: una cadena que representa el puesto de trabajo del empleado
	 * @param salario: un número decimal que representa el salario del empleado
	 * 
	 */

public class Empleado {
	private int emp_no;
	private String nombre;
	private String apellido;
	private String pobla;
	private String oficio;
	private Double salario;

	/**
	 * Constructor para crear un objeto Empleado con todos los atributos especificados.
	 */


	public Empleado(int emp_no, String nombre, String apellido, String pobla, String oficio,
			Double salario) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pobla = pobla;
		this.oficio = oficio;
		this.salario = salario;
	}

	/**
	 * Constructor para crear un objeto Empleado con algunos atributos especificados y los demás
     * atributos inicializados con valores predeterminados.
	 */
	
	public Empleado(int emp_no, String nombre, Double salario) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.salario = salario;

	}

	/**
	 * @return devuelve el numero del empleado
	 */

	public int getEmp_no() {
		return emp_no;
	}

	/**
	 * Establece el número de empleado.
     *
     * @param emp_no el número de empleado.
	 */

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	/**
	 * @return devuelve el nombre del empleado
	 */	

	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del empleado
	 * 
	 * @param nombre el nombre del empleado
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return devuelve la poblacion del empleado
	 */

	public String getPobla() {
		return pobla;
	}

	/**
	 * Establece la población del empleado.
     *
     * @param pobla la población del empleado.
	 */

	public void setPobla(String pobla) {
		this.pobla = pobla;
	}

	/**
	 * @return devuelve el oficio del empleado
	 */

	public String getOficio() {
		return oficio;
	}

	/**
	 * Establece el puesto de trabajo del empleado.
     *
     * @param oficio el puesto de trabajo del empleado.
	 */

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	/**
	 * Devuelve el salario del empleado.
     *
     * @return el salario del empleado
	 */

	public Double getSalario() {
		return salario;
	}

	/**
	 * Establece el salario del empleado
	 * 
	 * @param salario salario del empleado
	 */

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	/**
	 * Aumenta el salario del empleado en la cantidad dada.
     *
     * @param subida la cantidad en la que aumentar el salario
	 */
	
	public void subidasalario(Double subida) {
		salario = salario + subida;
	}
	
	/**
	 * Comprueba si el nombre del empleado no está vacío.
     *
     * @return true si el nombre del empleado no está vacío, false en caso contrario
	 */

	private boolean comprobar(){
		if (nombre.equals("")){
			
			return false;
		}
		return true;
	}
}