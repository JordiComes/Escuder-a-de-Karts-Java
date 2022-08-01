public class karts extends PistaHerencia{

	
	private int llanta;
	

	public karts (String marca, String caducidad, int dureza, int llanta, String color, String dibujo ) {
		super(marca, caducidad, dureza, color, dibujo);
		
		this.llanta=llanta;
		
		}

	public int getLlanta() {
		return llanta;
	}

	public void setLlanta(int llanta) {
		this.llanta = llanta;
	}
	
	public String toString () {
		
		return "El neumático de karts de marca "+this.getMarca()+" con caducidad en "+this.getCaducidad()+" y de dureza "+this.getDureza()+" con su llanta de "+this.getLlanta()+" tambíen con su color "+this.getColor()+" y su dibujo para terreno "+this.getDibujo()+"";
		
	}
}
