public class PistaHerencia {
	
	private String marca;
	private String caducidad;
	private int dureza;
	private String color;
	private String dibujo;

	
public PistaHerencia (String marca, String caducidad, int dureza, String color, String dibujo) {
		
		this.marca=marca;
		this.caducidad=caducidad;
		this.dureza=dureza;
		this.color=color;
		this.dibujo=dibujo;
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(String caducidad) {
		this.caducidad = caducidad;
	}

	public int getDureza() {
		return dureza;
	}

	public void setDureza(int dureza) {
		this.dureza = dureza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDibujo() {
		return dibujo;
	}

	public void setDibujo(String dibujo) {
		this.dibujo = dibujo;
	}
	
	public String obtenerMarcayCaducidad () {
		return "marca: " + this.marca + " caducidad: " + this.caducidad;
	}
	
	public void mostrarDureza () {
		if (this.dureza < 10) {
			System.out.println("blando");
		}
		else {
			if(this.dureza >= 10 && this.dureza<50) {
				System.out.println("medio");
			}
			else {
				if(dureza>=50) {
					System.out.println("duro");
				}
			}
		}
	}
	
}
