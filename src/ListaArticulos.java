import java.util.*;
import java.io.*;

public class ListaArticulos {

	public String[] Reponer() {
		return null;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Articulo> art = new ArrayList<Articulo>();
		
		Scanner input = new Scanner(System.in);
		try {
			String ruta = "Fitxategiak/articulos.txt";
			BufferedReader buffer = new BufferedReader(new FileReader(new File(ruta)));
			String linea = buffer.readLine();
			String[]  data;
			while(linea!= null) {
				data = linea.split("::");
				if(data[0].contains("FRES")) {
					art.add(new Refresco(data[0], data[1], data[2], Double.parseDouble(data[3]), Integer.parseInt(data[4]),
					data[5],Boolean.parseBoolean(data[6]), Boolean.parseBoolean(data[7]), Integer.parseInt(data[8])));
				}else if(data[0].contains("WINE")) {
					art.add(new Vino(data[0], data[1], data[2], Double.parseDouble(data[3]), Integer.parseInt(data[4]), data[5], data[6], Integer.parseInt(data[7]), data[8], Integer.parseInt(data[9])));
				}else if(data[0].contains("BEER")) {
					art.add(new Cerveza(data[0], data[1], data[2], Double.parseDouble(data[3]), Integer.parseInt(data[4]), data[5], data[6].split(","), ((Double) Double.parseDouble(data[7])).intValue() ) );
				}
				linea = buffer.readLine();
			}
			
	}catch(Exception e) {
		System.out.println("Algo ha salido mal");
	}
		
		int opcion;
		
		
		do {System.out.println("..........................\r\n"
				+ "GESTION VENTA DE ARTICULOS\r\n"
				+ "..........................\r\n"
				+ "1- Hacer una venta (crear venta)\r\n"
				+ "2- Listar todos los articulos\r\n"
				+ "3- Ver los articulos saludables\r\n"
				+ "4- Sacar una lista de articulos\r\n"
				+ " con precio equivalente\r\n"
				+ "5- Ver los articulos mas caros\r\n"
				+ "6- Ver los articulos con poco stock\r\n"
				+ "0- Salir\r\n"
				+ "..........................\r\n"
				+ "Tu opcion (1-6) Salir-0\r\n"
				+ "..........................");
			opcion = input.nextInt();
			
			if(opcion>=0 && opcion<=6) {
				switch(opcion) {
				case 1: ;
				break;
				case 2: ;
				break;
				case 3: ;
				break;
				case 4: ;
				break;
				case 5: ;
				break;
				case 6: ;
				break;
				case 0: System.out.println("Hasta la proxima");
				}
			}else {
				System.out.println("TA MAL");
			}
		}while(opcion!=0);
}
}
