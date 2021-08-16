public class Telefone {
	private String nome;
	private String operadora;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
	public String getTelefone()
    {   return nome+" "+operadora;
     }
}
