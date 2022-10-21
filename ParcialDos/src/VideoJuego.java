
public class VideoJuego {
		public static final String Mayor = null;
		String titulo;
		int horas =10;
		boolean entregado =false;
		String genero;
		String compañia;
		public VideoJuego() {
			
			
		}
		@SuppressWarnings("unused")
		private VideoJuego(final String titulo, final int horas) {
			this.titulo = titulo;
			this.horas = horas;

			
		
		}
		@SuppressWarnings("unused")
		private VideoJuego(final String titulo, final int horas, final String genero, final String compañia) {
			super();
			this.titulo = titulo;
			this.horas = horas;
			this.genero = genero;
			this.compañia = compañia;
		}
		@SuppressWarnings("unused")
		private String getTitulo() {
			return titulo;
		}
		@SuppressWarnings("unused")
		private void setTitulo(final String titulo) {
			this.titulo = titulo;
		}
		@SuppressWarnings("unused")
		private int getHoras() {
			return horas;
		}
		@SuppressWarnings("unused")
		private void setHoras(int horas) {
			this.horas = horas;
		}
		@SuppressWarnings("unused")
		private String getGenero() {
			return genero;
		}
		@SuppressWarnings("unused")
		private void setGenero(final String genero) {
			this.genero = genero;
		}
		@SuppressWarnings("unused")
		private String getCompañia() {
			return compañia;
		}
		@SuppressWarnings("unused")
		private void setCompañia(final String compañia) {
			this.compañia = compañia;
		}
		@Override
		public String toString() {
			return "VideoJuego [titulo=" + titulo + ", horas=" + horas + ", entregado=" + entregado + ", genero=" + genero
					+ ", compañia=" + compañia + "]";
		}
		public void entregar() {
			// TODO Auto-generated method stub
			
		}
		public String compareTo(VideoJuego videojuegoMayor) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		
	}

