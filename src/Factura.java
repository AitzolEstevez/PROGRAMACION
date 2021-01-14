import java.util.ArrayList;

public class Factura implements Facturacion{
	private int numero;
	private String Nombre;
	private String Apellido;
	ArrayList<LineaFactura>lineas = new ArrayList<LineaFactura>();
	private double total;
	
	//añadir una linea
	public Factura(int numero, String Nombre, String Apellido, ArrayList<LineaFactura> lineas, double total) {
		this.numero = numero;
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.total = total;
		this.lineas = lineas;
	}
	
	void AniadirLinea (String codigo, int cantidad, double total) {
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public ArrayList<LineaFactura> getLineas() {
		return lineas;
	}
	public void setLineas(ArrayList<LineaFactura> lineas) {
		this.lineas = lineas;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public void print() {
		System.out.println("*****************************\r\n"
				+ "Num. factura: + zenbakia\r\n"
				+ "+Nombre articulo: + Izena\r\n"
				+ "+Apellido cliente: + Abizena\r\n"
				+ "+**************************************\r\n"
				+ "+Codigo  -->  Cantidad  -->	Subtotal\r\n");
		
		for (int i=0;i<lineas.size();i++){
			System.out.println("** "+lineas.get(i).getCodigo()+"	  	"
					+ lineas.get(i).getCantidad() + "	  	"
					+ lineas.get(i).getTotalLinea());
			}
	}

	@Override
	public double calcularTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
}
