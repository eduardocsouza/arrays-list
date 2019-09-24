package entites;

public class Funcionario {
	
	private String name;
	private Double salario;
	private Integer id;
	
	
	public Funcionario(String name, Double salario, Integer id) {
		this.name = name;
		this.salario = salario;
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getSalaraio() {
		return salario;
	}

	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	
	public void aumento(double valor) {
		salario += salario * valor /100;
	}
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + salario;
	}
	
	
}
