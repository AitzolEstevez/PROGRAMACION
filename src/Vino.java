
public class Vino extends Articulo {
	
	private String color;
	private String origen;
	private int anio;
	private String uva;
	private int alcohol;
		
	public Vino(String codigo, String nombre, String marca, double precio, int stock, String color,
			String origen, int anio, String uva, int alcohol) {
		super(codigo, nombre, marca, precio, stock);
		
		this.color = color;
		this.origen = origen;
		this.anio = anio;
		this.uva = uva;
		this.alcohol = alcohol;
	}
		// TODO Auto-generated constructor stub

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getUva() {
		return uva;
	}

	public void setUva(String uva) {
		this.uva = uva;
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
