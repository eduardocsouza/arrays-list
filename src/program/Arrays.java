package program;
import java.util.Locale;
import java.util.Scanner;

public class Arrays {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe um número:");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		System.out.println("Informe a altura");
		
		for(int i = 0; i<n; i++) {			
			vect[i] = sc.nextDouble();
		}
		
			double soma = 0.0;
			for(int i=0; i<n; i++) {		
				soma += vect[i];
			}
			
			double avg = soma /n;
			System.out.printf("Average height: %.2f", avg);
				
		
		sc.close();
	}

}
