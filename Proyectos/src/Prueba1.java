import java.util.Scanner;
public class Prueba1 {
	public static void main (String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Elige una opcion: ");
	int num;
	System.out.println("   Opcion 1");
	System.out.println("   opcion 2");
	System.out.println("   opcion 3");
	System.out.println("||----------||");
	num = sc.nextInt();
	sc.close();
	
	switch (num)
	{
		case 1 : System.out.println("Has elegido 1");
			break;
		case 2 : System.out.println("Has elegido 2");
			break;
		case 3 : System.out.println("Has elegido 3");
			break;
		default : System.out.println("No has elegido una opción valida!");
	}	
	
	}	
}
