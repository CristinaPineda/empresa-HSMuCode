
import java.util.List;

public class Empresa {
	protected String nome;
	protected String cnpj;
	protected String dataInauguracao;
	protected Empresa_sede sede;
	protected List<Socio> socios;
	protected List<Filial> filiais;
	
	
	
	public Empresa(String nome, String cnpj, String data) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.dataInauguracao = data;
	}
	
	public String dadosEmpresa() {
		return "Empresa: "+nome+"\nCNPJ: "+cnpj+"\nInaugurada em: "+dataInauguracao;
	}
	
	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInauguracao() {
        return dataInauguracao;
    }

    public void setInauguracao(String inauguracao) {
        this.dataInauguracao = inauguracao;
    }
    
    public Empresa_sede getEmpresa_Sede() {
        return sede;
    }

    public void setEmpresa_Sede(Empresa_sede sede) {
        this.sede = sede;
    }

    public List<Socio> getSocios() {
        return socios;
    }

    public void setSocios(List<Socio> socios) {
        this.socios = socios;
    }

    public List<Filial> getFiliais() {
        return filiais;
    }

    public void setFiliais(List<Filial> filiais) {
        this.filiais = filiais;
    }
    	
}
