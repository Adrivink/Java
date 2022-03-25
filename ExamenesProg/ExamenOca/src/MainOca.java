import java.util.Scanner;
public class MainOca {
	public static int TAMCIRCUITO = 11;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int fichaJ1, fichaJ2;
		fichaJ1=0;
		fichaJ2=0;
		double minDado, maxDado;
		int tirada1, tirada2;
		int dado1, dado2;
		String nomJ1, nomJ2;
		
		
		System.out.println("¡BIENVENIDO A LA CARRERA DEL SIGLO!");
		System.out.println("¿Cual es el número mínimo del dado?");
		minDado=sn.nextInt();
		System.out.println("¿Cual es el número máximo del dado?");
		maxDado=sn.nextInt();
		System.out.println("¿Cual es el nombre del jugador 1?");
		nomJ1=sn.next();
		System.out.println("¿Cual es el nombre del jugador 2?");
		nomJ2=sn.next();
		while(nomJ2.equals(nomJ1)) {
			System.out.println("Los dos jugadores no se pueden llamar igual");
			System.out.println("¿Cual es el nombre del jugador 2?");
			nomJ2=sn.next();
			
		}
		System.out.println("¡COMENCEMOS A JUGAR!");
		
		
		pintaPista(fichaJ1, fichaJ2);
		
		while(fichaJ1<TAMCIRCUITO && fichaJ2<TAMCIRCUITO) {
			System.out.println("Pulsa cualquier tecla para la siguiente ronda");
			sn.next();
			System.out.println("Turno para el jugador 1 "+nomJ1);
			dado1=(int) tiraDados(minDado,maxDado);
			System.out.println("Ha sacado un "+dado1+" en la primera tirada");
			dado2=(int) tiraDados(minDado,maxDado);
			System.out.println("Ha sacado un "+dado2+" en la segunda tirada");
			tirada1=(int) (dado1+dado2);
			
			if(sumaDeNumerosEsPrimo(tirada1)==true) {
				System.out.println("¡TIRADA VALIDA!");
				fichaJ1=fichaJ1+tirada1;
				pintaPista(fichaJ1, fichaJ2);
				System.out.println(" ");
			}else {
				System.out.println("¡TIRADA NO VALIDA!");
				System.out.println("No suma puntos ya que la suma de los dos números NO ES PRIMO");
				pintaPista(fichaJ1, fichaJ2);
				System.out.println(" ");
				imprimeComoVaLaCarrera(nomJ1,nomJ2,fichaJ1,fichaJ2);
				System.out.println(" ");
			}
			
			System.out.println("Turno para el jugador 2 "+nomJ2);
			dado1=(int) tiraDados(minDado,maxDado);
			System.out.println("Ha sacado un "+dado1+" en la primera tirada");
			dado2=(int) tiraDados(minDado,maxDado);
			System.out.println("Ha sacado un "+dado2+" en la segunda tirada");
			tirada2=(int) (dado1+dado2);
			
			if(sumaDeNumerosEsPrimo(tirada2)==true) {
				System.out.println("¡TIRADA VALIDA!");
				fichaJ2=fichaJ2+tirada2;
				pintaPista(fichaJ1, fichaJ2);
				System.out.println(" ");
			}else {
				System.out.println("¡TIRADA NO VALIDA!");
				System.out.println("No suma puntos ya que la suma de los dos números NO ES PRIMO");
				pintaPista(fichaJ1, fichaJ2);
				System.out.println(" ");
				imprimeComoVaLaCarrera(nomJ1,nomJ2,fichaJ1,fichaJ2);
				System.out.println(" ");
			}
			
		}
		if(fichaJ1>=TAMCIRCUITO) {
			System.out.println("JUGADOR GANADOR: "+EsGanador(nomJ1,nomJ2,fichaJ1,fichaJ2));
			
		}else if(fichaJ2>=TAMCIRCUITO) {
			System.out.println("JUGADOR GANADOR: "+EsGanador(nomJ1,nomJ2,fichaJ1,fichaJ2));
		}else {
			System.out.println(EsGanador(nomJ1,nomJ2,fichaJ1,fichaJ2));
		}
sn.close();
	}

	public static double tiraDados(double minDado, double maxDado) {
		return Math.random() * maxDado + minDado;

	}

	public static void pintaPista(int fichaJ1, int fichaJ2) {
		System.out.print("   ");
		for (int i = 0; i < TAMCIRCUITO; i++) {
			System.out.print(i + 1 + "  ");
		}

		System.out.println(" ");
		
		for (int j = 0; j < TAMCIRCUITO; j++) {
			if(j==fichaJ1) {
			System.out.print("J1 ");
			}else {
				System.out.print("   ");
			}
		}
		System.out.println(" ");
		
		for (int k = 0; k < TAMCIRCUITO; k++) {
			if(k==fichaJ2) {
				System.out.print("J2 ");
			}else {
				System.out.print("   ");
			}
		}
		System.out.println(" ");
	}

	public static boolean sumaDeNumerosEsPrimo(int tirada) {
		boolean primo = true;
		for (int i = 2; i < tirada; i++) {
			if (tirada % i == 0) {
				primo = false;
			}
		}
		if (primo == true) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void imprimeComoVaLaCarrera(String nomJ1,String nomJ2,int fichaJ1,int fichaJ2) {
		if(fichaJ1==fichaJ2) {
			System.out.println("!Van empatados!");
		}else if(fichaJ1>fichaJ2){
			System.out.println("Va ganando el jugador 1 "+nomJ1);
		}else {
			System.out.println("Va ganando el jugador 2 "+nomJ2);
		}
	}
	
	public static String EsGanador(String nomJ1,String nomJ2,int fichaJ1,int fichaJ2) {
		if(fichaJ1>=TAMCIRCUITO) {
			return nomJ1;
		}else if(fichaJ2>=TAMCIRCUITO) {
			return nomJ2;
		}else {
			return "";
		}
	}

}

