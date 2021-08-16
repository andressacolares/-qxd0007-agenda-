public class Contatos {
	private String nome;
	private int telefone;
	private String operadora;
	public Object getTelefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
	public boolean equals(Contatos c) {
		if (this.nome.equalsIgnoreCase(c.getNome())) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "nome'" + nome + ", telefone'" + telefone + "operadora'"+operadora;
	}
	
	
	
}
