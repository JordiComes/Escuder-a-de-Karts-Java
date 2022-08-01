import java.util.ArrayList;

public class Main {
	
	public static ArrayList<PistaHerencia> Neumaticos = new ArrayList<PistaHerencia>();

	public static void main(String[] args) {
		
		pista NeumaticoPista = new pista("Bridgestone", "Diciembre", 8, 7, -10, "Banda blanca", "seco");
		
		rallies NeumaticoRallies = new rallies("Michellin", "Enero", 30, 3, "negro", 1, "mojado");
		
		karts NeumaticoKarts = new karts ("Hancock", "Marzo", 70, 12, "Gris", "intermedio");
		
		Neumaticos.add(NeumaticoPista);
		Neumaticos.add(NeumaticoRallies);
		Neumaticos.add(NeumaticoKarts);
		
		System.out.println("La caducidad de los neumaticos son:\n ");
		for (PistaHerencia Neumatico: Neumaticos) {
	
			System.out.println(Neumatico.obtenerMarcayCaducidad());
			Neumatico.mostrarDureza();
		}
		
		
		System.out.println(NeumaticoPista.toString());
		System.out.println(NeumaticoRallies.toString());
		System.out.println(NeumaticoKarts.toString());
		}
		
	
		}
	


