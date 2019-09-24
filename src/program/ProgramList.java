package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Funcionario;

public class ProgramList {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
				
		System.out.print("Informe a quantidade de funcion�rio: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Funcion�rio #" + i);
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Sal�rio: ");
			double salario = sc.nextDouble();
			list.add(new Funcionario(name, salario, id));
							
		}
	
		
		System.out.print("Informe o ID do funcion�rio que ir� receber um aumento: ");
		int id = sc.nextInt();
		
		Funcionario fun = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(fun == null) {
			System.out.println("Id n�o existe!");
		}else {
			System.out.print("Informe porcentagem: ");
			double valor = sc.nextDouble();
			fun.aumento(valor);
		}
		System.out.println();
		System.out.println("Lista de Funcion�rios:");
		for(Funcionario obj : list) {
			System.out.println(obj);
		}
		sc.close();
	}
}
