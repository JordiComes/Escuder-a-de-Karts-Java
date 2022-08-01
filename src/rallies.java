public class rallies extends PistaHerencia {

	
	private float presion;
	
	private int profundidadDibujo;
	
	
	
	public rallies ( String marca, String caducidad, int dureza, float presion, String color, int profundidadDibujo, String dibujo ) {
		super(marca, caducidad, dureza, color, dibujo);
	
	this.presion=presion;
	this.profundidadDibujo=profundidadDibujo;
	
	}
	
	public float getPresion() {
		return presion;
	}


	public void setPresion(float presion) {
		this.presion = presion;
	}


	public int getProfundidadDibujo() {
		return profundidadDibujo;
	}


	public void setProfundidadDibujo(int profundidadDibujo) {
		this.profundidadDibujo = profundidadDibujo;
	}


	public String toString () {
		
		return "El neumático de rallies de marca "+this.getMarca()+" con caducidad en "+this.getCaducidad()+" y de dureza "+this.getDureza()+" con su presion de "+this.getPresion()+" tambíen con su color "+this.getColor()+" y profundidad de dibujo de "+this.getProfundidadDibujo()+" y su dibujo para terreno "+this.getDibujo()+"";
		
	}
}
