package atv;

public class main {

	public static void main(String[] args) {
		
		livros obj = new livros();
		obj.insere("Nome do Vento", "Francisco", "1990");
		obj.insere("Cidade de Papel", "La casa de Papel", "2013");
		obj.insere("Coliseu", "Companhia das Letras", "2005");
		obj.insere("Quando a vida desacelera", "Haemin - Sumin", "2020");
		obj.listar();																											
		
	}

}
