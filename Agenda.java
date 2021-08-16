
public class Agenda {
	private Contatos [] contatos;
	
	public Agenda () {
		this.setContatos(new Contatos[10]);
	}
	
	public Agenda (int tamanho) {
		this.setContatos(new Contatos [tamanho]);
	}

	public Contatos [] getContatos() {
		return contatos;
	}

	public void setContatos(Contatos [] contatos) {
		this.contatos = contatos;
	}
	public void addContatos (Contatos c) {
		if (this.existeContato(c)) {
			System.out.println("Contato já foi adicionado anteriomente");
		} else if (agendaCheia()) { 
			System.out.println("Não é possível adicionar novos contatos, pois a agenda está cheia");
		
		} else {
		boolean encontrado = false;
		for (int i =0; i<contatos.length && !encontrado;i++ ) {
			if (contatos [i]==null) {
				contatos [i]=c;
				encontrado = true;
			}
		}
		if (encontrado) {
			System.out.println("Novo contato adicionado");
			
		} else {
			System.out.println("Não é possível adicionar esse contato, verrifique e tente novamente");
		}
	}
	}
	
	public boolean existeContato (Contatos c) {
	
		for (Contatos element : contatos) {
			if (element!= null && c.equals(element)) {
				return true;
			}
			return false;
	}
		return false;
	
}
	public void listarContatos() {
		for (int i =0; i<contatos.length;i++ ) {
			System.out.println(contatos[i]);
		}
	}
		
	public void BuscarPorNome (String nome) {
		
		boolean encontrou= true;
		for (int i =0; i<contatos.length && !encontrou ;i++ ) {
			if (contatos [i]!=null && contatos[i].getNome().equalsIgnoreCase(nome) ) {
				System.out.println("Contatos relacionados a pesquisa"+contatos[i].getTelefone());
		encontrou = false;
			}
		}
		
	if (!encontrou) {
		System.out.println("Contato não foi encontrado");
		}
	}
	public boolean agendaCheia () {
		for (int i =0; i<contatos.length;i++ ) {
			if (contatos [i]==null) {
				return false;
			}
		}
		return true;
	}
	
	public void eliminarContato (Contatos c) { 
		boolean encontrado=false;
		for (int i =0; i<contatos.length;i++ ) {
			if (contatos [i]!=null && contatos[i].equals(c)) {
				contatos[i]=null;
				encontrado = true;
		}
			}
		if (!encontrado) {
			System.out.println("Não há contatos para eliminar no momento.");
		}
		
		public int EspaçoLivre () {
			int cont=0;
			for (int i =0; i<contatos.length;i++ ) {
				cont++;
			}
		
			return cont;
		}
			
	}
