
/*
 * El nodo es la que estructura fundamental de una lista enlazada. 
 * Conectamos nodos de forma que tengamos una colección de elementos
 * creciendo o reduciendo de forma dinámica. Esta definición es la 
 * más sencilla posible. 
 */

public class Nodo {
	// atributos
	public String nombre;
	public int numero;
	public String correo;
	public String relacion;
	public Nodo siguiente;		
	
	public Nodo() {
		setSiguiente(null);
		setNombre(null);
		setNumero(0);
		setCorreo(null);
		setRelacion(null);
	}
	
	public Nodo(String a, int b, String c, String d) {
		setSiguiente(null);
		setNombre(a);
		setNumero(b);
		setCorreo(c);
		setRelacion(d);
	}
	
	public Nodo(String a, int b,String c, String d, Nodo n) {
		setSiguiente(n);
		setNombre(c);
		setNumero(b);
		setCorreo(c);
		setRelacion(d);
	}
	
	public Nodo getSiguiente() {
		return siguiente;
	}
	
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRelacion() {
		return relacion;
	}

	public void setRelacion(String relacion) {
		this.relacion = relacion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}




