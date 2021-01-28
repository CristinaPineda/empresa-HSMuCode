// Classe Filial recebe herança da classe Rh para definir os colaboradores responsaveis pela empresa filial

public class Filial extends Rh {
	protected Colaborador responsavel;
	
	public Filial(String nomeCompleto, int codigo, Colaborador responsavel) {
        super(nomeCompleto, codigo);
        this.responsavel = responsavel;
    }

    public Colaborador getresponsavel() {
        return responsavel;
    }

    public void setResponsavel(Colaborador responsavel) {
        this.responsavel = responsavel;
    }
	
}
