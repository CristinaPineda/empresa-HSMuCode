import java.util.List;

public class Rh {
    protected String nomeCompleto;
    protected int codigo;
    protected String enderecoCompleto;
    protected List<Colaborador> colaboradores;
    protected String dataInauguracao;
    protected double faturamentoMensal;
    
    public Rh(String nomeCompleto, int codigo) {
        this.nomeCompleto = nomeCompleto;
        this.codigo = codigo;
    }

    public String getNome() {
        return nomeCompleto;
    }

    public void setNome(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getEndereco() {
        return enderecoCompleto;
    }

    public void setEndereco(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

    public List<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(List<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }

   
    public String getDataInauguracao() {
        return dataInauguracao;
    }

    public void setDataInauguracao(String dataInauguracao) {
        this.dataInauguracao = dataInauguracao;
    }

    public double getFaturamentoMensal() {
        return faturamentoMensal;
    }

    public void setFaturamentoMensal(double faturamentoMensal) {
        this.faturamentoMensal = faturamentoMensal;
    }
    
}