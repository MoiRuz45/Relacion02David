package objetos2;

public class Avoins {

	public static void main(String[] args) {
		
		Avion a = new Avion("DIR",4);
		Avion a2= new Avion("ju", 3);
		
		a.mostrarDatos();
		a2.mostrarDatos();
		a.setFabricante("Carrier");
		a.setNumMotores(34);
		a.mostrarDatos();
	}

}
