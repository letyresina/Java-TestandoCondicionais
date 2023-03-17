
public class TestaCondicionalBoolean {
	public static void main(String[] args) {
		
		// Para testes, fui mudando o valor aqui
		int idade = 20;
		//int quantidadePessoas = 2;
		boolean acompanhado = true; //pode ser tbm boolean acompanhando =  quantidadePessoas >= 2
		
		/* || significa "ou", para facilitar o código, basta uma das condicões ser verdadeira para 
		acontecer em que: condicao || acompanhado == true */
		if (idade >= 18 && acompanhado == true) {
			System.out.println("Seja bem vindo(a)!");
		} else {
			System.out.println("Você é menor de idade, você não pode entrar.");
		}
		
		/* %% significa "e", indicando que aquela condição só é verdadeira caso 
		 ambas as condições sejam verdadeiras! */
		
		// == é comparação no Java
		
		//Teste para Atividade Alura
		
		int idade2 = 68;
		boolean ehIdoso = idade2 >= 65;
		System.out.println(ehIdoso);
		
	}
}
