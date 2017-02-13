import java.util.Scanner;

public class TestEx01 {
	String color;
	int Tamano;
	public void setColor(String color) {
		this.color = color;
	}
	public void setTamano(int tamano) {
		Tamano = tamano;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un color: ");
		String col = sc.next();
		
		System.out.println("Introduce un tamaño entero: ");
		int tam = sc.nextInt();
		
		
		TestEx01 bola1 = new TestEx01();
		bola1.setColor(col);
		bola1.setTamano(tam);
		
		TestEx01 bola2 = new TestEx01();
		bola2.setColor(col);
		bola2.setTamano(tam);
		
		System.out.println();
		System.out.println(bola2);
	}
	
	
	
	
	
	
	
}
	
