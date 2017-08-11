import java.util.Scanner;
public class segundograu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double a,b,c,delta,x1,x2;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		
		//calculando delta b²-4ac
		
		
		
		delta=(b*b)-(4*a*c);
		
		
		
		//calculando x1 x2
		
		
		x1 = (-b + Math.sqrt(delta))/(2*a);
		
		x2 = (-b - Math.sqrt(delta)) /(2*a);
		
		//imprimindo na tela
		
		System.out.println("x¹ = "+x1+" e x² = "+x2);
		
		

	}

}
