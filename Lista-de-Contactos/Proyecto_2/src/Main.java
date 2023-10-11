import javax.swing.JOptionPane;

public class Main {

	

	public static void main(String[] args) {

		Listas lista=new Listas();

		boolean seguir = true;
		do {
			int nu =Integer.parseInt(JOptionPane.showInputDialog("menu\n"
					+ "1. Ingrese un nuevo Contacto\n"
					+ "2. Ver lista de contactos\n"
					+ "3. Eliminar un contacto\n"
					+ "4. salir"));
			switch(nu) {
			case 1: {
				String nombre =JOptionPane.showInputDialog("Ingrese el nombre");
				int telefono =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de telefono"));
				String correo =JOptionPane.showInputDialog("Ingrese el correo");
				String relacion =JOptionPane.showInputDialog("Ingrese la relacion que tiene con el contacto");
				//aumentatama llama a la funcion que aumenta el ciclo for de imprimir y hace que se ordenen los contactos
				// aunque creo que otra solucion es que tamaArray inicie en 0 y cada ves que se llame a Insertarordenado se le de 1 valor
				// mas tamaArreglo pero no se si dara un problema.  
				lista.aumentartama(1);
				lista.InsertarOrdenado(nombre,telefono,correo,relacion);
				
				break;
			}
			case 2: {
				System.out.println("");
				System.out.println("----------------------------------LISTA DE CONTACTOS---------------------------------------");
				lista.imprimir();
				break;
			}
			case 3:{
				
				break;
			}
			case 4:{
				seguir = false;
				break;
			}
			default :{
				
				break;
			}
			
			}
			
		}while(seguir == true);
		
		
		
		
	}

}