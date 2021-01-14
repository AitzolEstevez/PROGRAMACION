import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class Kudeatzailea {
		ListaArticulos art = new ListaArticulos ();
		ArrayList<Articulo> lista =art.getLista();
		/*Factura factura = new Factura ();*/
		
		
		public void verSaludable () {
			
			Iterator<Articulo> iteradorea=lista.iterator();
			Articulo artTemp;
			
			while(iteradorea.hasNext()) {
				artTemp=iteradorea.next();
				if(artTemp.saludable()==true) {
					System.out.println(artTemp.getNombre());
				}
			}
		}
		
		public void artGuztiak() {
			
			Iterator<Articulo> iteradorea=lista.iterator();
			Articulo artTemp;
			
			while(iteradorea.hasNext()) {
				artTemp=iteradorea.next();
				System.out.println(artTemp.getNombre());
			}	
		}
		public void verIguales (){
			Scanner input = new Scanner (System.in);
			int i=0,x=0;
			System.out.println("Introduce el codigo del producto: ");
			String codigo = input.next();
			
			while (art.getLista().size()>i) {
				if (art.getLista().get(i).getCodigo().equalsIgnoreCase(codigo)) {
					while (x<art.getLista().size()) {
						if (art.getLista().get(i).getPrecio()== art.getLista().get(x).getPrecio()) {
							art.getLista().get(x).verCaracteristicas();
						}
						x++;
					}	
				}
				i++;
			}
			input.close();
		}
		public void masCaro() {
			System.out.println("Este es:  "+art.masCaro().getNombre());
		}
		public void pocoStock() {
			Iterator<Articulo> iteratorea= lista.iterator();
			Articulo artTemp;
			
			int i =0;
			String[] Repuesto;
			Repuesto = art.Reponer();
			boolean busqueda=false;
			
			while(Repuesto[i]!=null) {
				busqueda=false;
				while(iteratorea.hasNext() && !busqueda) {
					artTemp=iteratorea.next();
					if(artTemp.getCodigo().contentEquals(art.Reponer()[i])) {
						System.out.println(artTemp.getNombre() + " " + artTemp.getStock());
						busqueda=true;
					}
				}
				i++;
			}
		}
}


