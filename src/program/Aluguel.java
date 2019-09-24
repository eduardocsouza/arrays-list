package program;

import java.util.Locale;
import java.util.Scanner;

import entites.Aluno;

public class Aluguel {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno[] vect = new Aluno[10];
		
		System.out.print("Informe a quntidade de quartos: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quartos: ");
			int quartos = sc.nextInt();
			vect[quartos] = new Aluno(name, email, quartos);			
		}
		
		System.out.println("Busy rooms:");
		for(int i=0; i<vect.length; i++) {
			if(vect[i] != null) {				
				System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
			
		}
		
		sc.close();
	}
}
