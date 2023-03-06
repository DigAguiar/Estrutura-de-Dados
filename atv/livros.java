package atv;

import java.util.Iterator;

public class livros implements livrosInterface {
	private String titulo, editora , ano ;
	private String vetorT[] = new String[10],vetorE[] = new String[10], vetorA[] = new String[10];
	int n=0;

	@Override
	public void insere(String titulo,String editora ,String ano) {
		vetorT[n] = titulo;
		vetorE[n] = editora;
		vetorA[n] = ano;
		n++;
	}
	@Override
	public int tamanho() {

		return n;

	}
	@Override
	public void listar() {
	/*	
	 * for (String titulo : vetorT) {
			System.out.println(titulo);
		}
		for (String editora : vetorE) {
			System.out.println(editora);
		}
		for (String ano : vetorA) {
			System.out.println(ano);
		}
*/
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] == null) {
				
			}else 
			System.out.println(vetorT[i] + "," + vetorE[i] + "," + vetorA[i]);
			
		}
		
		
	}



}
