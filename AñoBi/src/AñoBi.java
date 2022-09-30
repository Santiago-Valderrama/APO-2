import java.util.Scanner;
 
public class AñoBi {
 
    public static void main(String[] args) {
 
        try (Scanner sn = new Scanner(System.in)) {	
			System.out.println("Introduce un año");
			int ano = sn.nextInt();
			if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 100 == 0 && ano % 400 == 0)) {
			    System.out.println(  ano + " es bisiesto");
			} 
			else {
			    System.out.println( ano + " no es bisiesto");
			}
		}
 
    }
 
}
