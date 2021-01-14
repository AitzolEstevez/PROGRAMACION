
public class Cerveza extends Articulo {

	private String origen;
	private String[] cereales;
	private int alcohol;
	
	public Cerveza(String codigo, String nombre, String marca, double precio,
			int stock, String origen, String[] cereales, int alcohol) {
		super(codigo, nombre, marca, precio, stock);
		// TODO Auto-generated constructor stub
		this.origen = origen;
		this.cereales = cereales;
		this.alcohol = alcohol;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String[] getCereales() {
		return cereales;
	}

	public void setCereales(String[] cereales) {
		this.cereales = cereales;
	}

	public int getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(int alcohol) {
		this.alcohol = alcohol;
	}

	@Override
	public void verCaracteristicas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean saludable() {
		// TODO Auto-generated method stub
		return false;
	}

	public void bebida_muy_alcoholica(){}
}
