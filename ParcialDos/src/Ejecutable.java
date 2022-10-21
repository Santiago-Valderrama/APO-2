
public class Ejecutable {

	private static VideoJuego[] listaVideojuegos;

	public static void main(String[] args) {
		
		Serie listadeSeries[]=new Serie[5];
		VideoJuego listadeVideojuegos[]=new VideoJuego[5];
		
		
		listadeSeries[0]=new Serie();
		listadeSeries[1]=new Serie("aaa","eee");
		listadeSeries[2]=new Serie("bbb","eee");
		listadeSeries[3]=new Serie("ccc","eee");
		listadeSeries[4]=new Serie("ddd","eee");
		
		listadeVideojuegos[0]=new VideoJuego();
		listadeVideojuegos[1]=new VideoJuego();
		listadeVideojuegos[2]=new VideoJuego();
		listadeVideojuegos[3]=new VideoJuego();
		listadeVideojuegos[4]=new VideoJuego();
		
		listadeSeries[1].entregar();
		listadeSeries[4].entregar();
		
		listadeVideojuegos[0].entregar();
		listadeVideojuegos[3].entregar();

		int entregados=0;
	
for(int i=0;i<listadeSeries.length;i++) {
	if (listadeSeries[i].isEntregado()) {
		entregados+=1;
		listadeSeries[i].devolver();
	}
}
System.out.println("Hay "+entregados+" articulos entregados");

Serie serieMayor=listadeSeries[0];
VideoJuego videojuegoMayor=listadeVideojuegos[0];

for(int i=1;i<listadeSeries.length;i++) {
	if(listadeSeries[i].compareTo(serieMayor)==Serie.Mayor) {
		serieMayor=listadeSeries[i];}
	}
	
	int i = 0;
	if(listadeVideojuegos[i].compareTo(videojuegoMayor)==VideoJuego.Mayor) {
		videojuegoMayor=listaVideojuegos[i];
	}
	System.out.println(serieMayor);
	System.out.println(videojuegoMayor);
	
}
	

	

}
