package objetos2;

public class Avion {

	private String fabricante;
	private int numMotores;
	
	public Avion() {
		setFabricante("");
		setNumMotores(0);
	}
	public Avion( String fabricante, int numMotores) {
		setFabricante(fabricante);
		setNumMotores(numMotores);
	}
	public Avion (Avion copia) {
		this.fabricante=copia.fabricante;
		this.numMotores=copia.numMotores;
	}
	
	public String getFabricante() {
		return this.fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante=fabricante;
	}
	public int getNumMotores() {
		return numMotores;
	}
	public void setNumMotores(int numMotores) {
		this.numMotores = numMotores;
	}
	
	public void mostrarDatos() {
		System.out.println("Datos del avión: ");
		System.out.println("Número de motores:" +this.getNumMotores());
		System.out.println("Fabricante"+this.getFabricante());
	}
	
}
