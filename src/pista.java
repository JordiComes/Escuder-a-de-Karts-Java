public class pista extends PistaHerencia {

	private int adherencia;
	private float temperatura;

	public pista(String marca, String caducidad, int dureza, int adherencia, float temperatura, String color, String dibujo) {
		super(marca, caducidad, dureza, color, dibujo);
		this.adherencia = adherencia;
		this.temperatura = temperatura;
	}
	
	public int getAdherencia() {
		return adherencia;
	}


	public void setAdherencia(int adherencia) {
		this.adherencia = adherencia;
	}


	public float getTemperatura() {
		return temperatura;
	}


	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	

	public String toString () {
		
		return "El neumático de pista de marca "+this.getMarca()+" con caducidad en "+this.getCaducidad()+" y de dureza "+this.getDureza()+" adherencia "+this.getAdherencia()+" tambíen con su temperatura de "+this.getTemperatura()+" y color "+this.getColor()+" y su dibujo para terreno "+this.getDibujo()+"";
	}
	
}
