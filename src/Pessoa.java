// Classe pai para definir outras pessoas que farão parte da empresa. 

public class Pessoa {
		public String nome;
		public String cpf;
		public String dataNascimento;
		public String endereco;
		public String contato;
		
		
		public Pessoa(String nome, String cpf, String data, String endereco, String telefone) {
			this.nome = nome;
			this.cpf = cpf;
			this.dataNascimento = data;
			this.endereco = endereco;
			this.contato = telefone;
			
	}
		public Pessoa(String nome) {
	        this.nome = nome;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getCpf() {
	        return cpf;
	    }

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }
	    
	    public String getDataNascimento() {
	        return dataNascimento;
	    }

	    public void setDataNascimento(String dataNascimento) {
	        this.dataNascimento = dataNascimento;
	    }

	    public String getEndereco() {
	        return endereco;
	    }

	    public void setEndereco(String endereco) {
	        this.endereco = endereco;
	    }

	    public String getContato() {
	        return contato;
	    }

	    public void setContato(String telefone) {
	        this.contato = telefone;
	    }

		public String imprimirDados() {
			return "Nome: "+nome+"\n"+"CPF: "+cpf+"\n"+"Data de nascimento: :"+dataNascimento+"\nEndereço: "+endereco+"\nTelefone de contato: "+contato;
		}
	}