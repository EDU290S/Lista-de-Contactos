import javax.swing.JOptionPane;

public class Main {

	

	public static void main(String[] args) {

		Listas lista=new Listas();
		
		
		
		/**AQUI SE CREAN LOS CONTACTOS PARA MAS ADELANTE INSERTARLOS EN LA LISTA**/
		String contacto1="Eduardo Salgado__________";
		String contacto2="Miguel Artica____________";
		String contacto3="Fredy Salgado____________";
		String contacto4="Maria Flores_____________";
		String contacto5="Carmen Salgado___________";
		String contacto6="Miguel Salgado___________";
		String contacto7="Hector Mendez____________";
		String contacto8="Ronal Arrazola___________";
		String contacto9="Erik Rodriguez___________";
		String contacto10="Diego Galo_______________";
		String contacto11="Emid Avilez______________";
		String contacto12="Danilo Coello____________";
		String contacto13="Juan C. Diaz_____________";
		String contacto14="Alejandra Fonseca________";
		String contacto15="Carlos Martinez__________";
		String contacto16="Policarpo Paz____________";
		String contacto17="Jose Castellanos_________";
		String contacto18="David Cruz_______________";
		String contacto19="Mario Lagos______________";
	//	String contacto20="David Arteaga____________";
		
		/**SE CREAN LOS NUMEROS DE LOS CONTACTOS**/
		int numero1 = 32545556;
	    int numero2 = 96090143;
	    int numero3 = 12345678;
	    int numero4 = 91011121;
	    int numero5 = 31415161;
	    int numero6 = 71819202;
	    int numero7 = 87784854;
	    int numero8 = 32558655;
	    int numero9 = 99024830;
	    int numero10 = 12223224;
	    int numero11 = 25262728;
	    int numero12 = 29303132;
	    int numero13 = 33343536;
	    int numero14 = 38451286;
	    int numero15 = 78541236;
	    int numero16 = 14368527;
	    int numero17 = 78126549;
	    int numero18 = 59148263;
	    int numero19 = 69745281;
	   // int numero20 = 62849137;
	    
	    /**SE CREAN LOS CONTACTOS DE LOS CONTACTOS**/
	    String correo1="_______edusalgado00@gmail.com_________";
	    String correo2="_______esalgadoa@unah.hn______________";
	    String correo3="_______edusalgado0002@gmail.com_______";
	    String correo4="_______edusalgado0003@gmail.com_______";
	    String correo5="_______edusalgado0004@gmail.com_______";
	    String correo6="_______edusalgado0005@gmail.com_______";
	    String correo7="_______hjmendez@unah.hn_______________";
	    String correo8="_______ronal.arrazola@unah.hn_________";
	    String correo9="_______ejrodrigueza@unah.hn___________";
	    String correo10="_______edusalgado0011@gmail.com_______";
	    String correo11="_______edusalgado0006@gmail.com_______";
	    String correo12="_______edusalgado0008@gmail.com_______";
	    String correo13="_______edusalgado0010@gmail.com_______";
	    String correo14="_______                        _______";
	    String correo15="_______edusalgado0001@gmail.com_______";
	    String correo16="_______                        _______";
	    String correo17="_______                        _______";
	    String correo18="_______                        _______";
	    String correo19="_______                        _______";
	   //String correo20="_______                       ________";

	    /**SE CREA LA RELACION DE LOS CONTACTOS**/
	    String relacion1="";
	    String relacion2="";
	    String relacion3="Padre";
	    String relacion4="Madre";
	    String relacion5="Hermana";
	    String relacion6="Hermano";
	    String relacion7="Compañero";
	    String relacion8="Compañero";
	    String relacion9="Compañero";
	    String relacion10="Amigo";
	    String relacion11="Amigo";
	    String relacion12="Amigo";
	    String relacion13="Primo";
	    String relacion14="Prima";
	    String relacion15="Amigo";
	    String relacion16="Amigo";
	    String relacion17="Amigo";
	    String relacion18="Amigo";
	    String relacion19="Amigo";
	  //  String relacion20="Amigo";
		
		
		/**SE INSERTAN LOS CONTACTOS EN LA LISTA**/
		lista.InsertarOrdenado(contacto1,numero1,correo1,relacion1);
		lista.InsertarOrdenado(contacto2,numero2,correo2,relacion2);
		lista.InsertarOrdenado(contacto3,numero3,correo3,relacion3);
		lista.InsertarOrdenado(contacto4,numero4,correo4,relacion4);
		lista.InsertarOrdenado(contacto5,numero5,correo5,relacion5);
		lista.InsertarOrdenado(contacto6,numero6,correo6,relacion6);
		lista.InsertarOrdenado(contacto7,numero7,correo7,relacion7);
		lista.InsertarOrdenado(contacto8,numero8,correo8,relacion8);
		lista.InsertarOrdenado(contacto9,numero9,correo9,relacion9);
		lista.InsertarOrdenado(contacto10,numero10,correo10,relacion10);
		lista.InsertarOrdenado(contacto11,numero11,correo11,relacion11);
		lista.InsertarOrdenado(contacto12,numero12,correo12,relacion12);
		lista.InsertarOrdenado(contacto13,numero13,correo13,relacion13);
		lista.InsertarOrdenado(contacto14,numero14,correo14,relacion14);
		lista.InsertarOrdenado(contacto15,numero15,correo15,relacion15);
		lista.InsertarOrdenado(contacto16,numero16,correo16,relacion16);
		lista.InsertarOrdenado(contacto17,numero17,correo17,relacion17);
		lista.InsertarOrdenado(contacto18,numero18,correo18,relacion18);
		lista.InsertarOrdenado(contacto19,numero19,correo19,relacion19);
	//	lista.InsertarOrdenado(contacto20,numero20,correo20,relacion20);

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
				//aumentatama yama a la funcion que aumenta el ciclo for de imprimir y hace que se ordenen los contactos
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