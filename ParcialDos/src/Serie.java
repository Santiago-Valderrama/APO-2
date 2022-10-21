
public class Serie {
	public static final Object Mayor = null;
	String titulo;
	boolean entregado = false;
	String genero;
	String creador;
	int t = 3;
	public static void main(String[] args) {
		

		}
	public Serie() {
		super();

	}
	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
	}
	public Serie(String titulo, String genero, String creador, int t) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.t = t;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public int getT() {
		return t;
	}
	public void setT(int t) {
		this.t = t;
	}
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", entregado=" + entregado + ", genero=" + genero + ", creador=" + creador
				+ ", t=" + t + ", getTitulo()=" + getTitulo() + ", getGenero()=" + getGenero() + ", getCreador()="
				+ getCreador() + ", getT()=" + getT() + "]";
	}
	public void entregar() {
		// TODO Auto-generated method stub
		
	}
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return false;
	}
	public void devolver() {
		// TODO Auto-generated method stub
		
	}
	public Object compareTo(Serie serieMayor) {
		// TODO Auto-generated method stub
		return null;
	}
	
	}

