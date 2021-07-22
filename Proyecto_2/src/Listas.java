
import java.lang.String;

public class Listas {
	private Nodo primero;
	private Nodo ultimo;
	public Nodo raiz;
	private int tamaArray =19;
	public Listas() {
		this.vaciar();
	}
	
	public boolean estaVacia() {		
		return (ultimo == null);
	}
	
	public String getPrimero() {
		return primero.getNombre();
	}

	public String getUltimo() {
		return ultimo.getNombre();
	}

	public void vaciar() {
		primero = null;
		ultimo = null;
	}
	
	
	public boolean esVacia(){
        return primero == null;
    }
	//solo para aumentar el tamano del for
	public void aumentartama(int tama) {
		tamaArray ++;
	}
	
	/***FUNCION PARA ORDENAR LA LISTA A MEDIDA QUE SE VAN INSERTANDO LOS ELEMENTOS***/
	public Listas InsertarOrdenado(String nombre, int numero, String correo, String relacion) {
		
		Nodo nuevo ;
		nuevo = new Nodo(nombre, numero, correo, relacion);
		if (primero == null) // lista vacía
		primero = nuevo;
		else if (nombre.compareTo(primero.getNombre())<0)
		{
		nuevo.setSiguiente(primero);;
		primero = nuevo;
		}
		else /* búsqueda del nodo anterior a partir del que
		se debe insertar */
		{
		Nodo anterior, p;
		anterior = p = primero;
		while ((p.getSiguiente() != null) && (nombre.compareTo(p.getNombre())>0))
		{
		anterior = p;
		p = p.getSiguiente();
		}
		if (nombre.compareTo(p.getNombre())>0) //se inserta después del último nodo
		anterior = p;
		// Se procede al enlace del nuevo nodo
		nuevo.setSiguiente(anterior.getSiguiente());
		anterior.setSiguiente(nuevo);
		}
		
		return this;
	
	}
	
	
	/***FUNCION PARA IMPRIMIR LA LISTA***/
	public void imprimir(){
        if (!esVacia()) {
            Nodo aux = primero;
            Nodo auxnu = primero;
            Nodo auxco = primero;
            Nodo auxre = primero;
        	System.out.println();
        	
            for(int i=0;i<tamaArray;i++) {
	            	String aux2=(String)aux.getNombre();
	            	int auxnu2=(int)auxnu.getNumero();
	            	String auxco2=(String)auxco.getCorreo();
	            	String auxre2=(String)auxre.getRelacion();
		            	System.out.println("___________________________________________________________________________________________");
		            	System.out.println();
		            	if(i<10) {
		            		System.out.println((i+1)+".NOMBRE                   NUMERO         CORREO                         RELACION");
		            		System.out.println(("  ")+aux2+auxnu2+auxco2+auxre2);
		            	}else if(i>=10) {
		            		System.out.println((i+1)+".NOMBRE                   NUMERO         CORREO                         RELACION");
		            		System.out.println(("   ")+aux2+auxnu2+auxco2+auxre2);	
		            	}
	            	aux=aux.getSiguiente();
	            	auxnu=auxnu.getSiguiente();
	            	auxco=auxco.getSiguiente();
	            	auxre=auxre.getSiguiente();
            }
        }
    }
	
}
