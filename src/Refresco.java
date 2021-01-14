
public class Refresco extends Articulo{
	private String sabor;
	private boolean zumo;
	private boolean gas;
	private int azucar;
	
	
	public Refresco(String codigo, String nombre, String marca, double precio, int stock, String sabor, boolean zumo, boolean gas, int azucar) {
		super(codigo, nombre, marca, precio, stock);
		// TODO Auto-generated constructor stub
		this.sabor = sabor;
		this.zumo = zumo;
		this.gas = gas;
		this.azucar = azucar;
	}
	
	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isZumo() {
		return zumo;
	}

	public void setZumo(boolean zumo) {
		this.zumo = zumo;
	}

	public boolean isGas() {
		return gas;
	}

	public void setGas(boolean gas) {
		this.gas = gas;
	}

	public int getAzucar() {
		return azucar;
	}

	public void setAzucar(int azucar) {
		this.azucar = azucar;
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

	

}
