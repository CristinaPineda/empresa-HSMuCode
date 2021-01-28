// Colaborador herda atributos da classe pai Pessoa.

public class Colaborador extends Pessoa {
	protected int matricula;
	protected double salarioAnual;
	protected String vinculo;
	
	public Colaborador(String nome, int matricula, String cargo, double salario) {
		super(nome);
		this.matricula = matricula;
		this.salarioAnual = salario;
		this.vinculo = cargo;
	}
	
	public Colaborador(String nome, String cargo) {
		super(nome);
		this.vinculo = cargo;
	}
	
	public int getMatricula() {
        return matricula;
    }
	
    public void setMatricula(int matricula) {
    	this.matricula = matricula;
    }
    
    public double getSalario() {
        return salarioAnual;
    }

    public void setSalario(double salario) {
        this.salarioAnual = salario;
    }
	
	public String getCargo() {
        return vinculo;
    }

    public void setCargo(String cargo) {
        this.vinculo = cargo;
    }

}
