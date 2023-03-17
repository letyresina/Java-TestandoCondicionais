
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		// Para testes, fui mudando o valor aqui
		int idade = 15;
		int quantidadePessoas = 1;
		
		//Testando condicionais para ver se a pessoa é maior de idade
		if (idade >= 18) {
			System.out.println("Você é maior de idade! Seja bem vindo");
		} else 
			if(quantidadePessoas >= 2) {
				System.out.println("Você pode entrar com os acompanhantes");
		} else {
			System.out.println("Você é menor de idade, você não pode entrar.");
		}
	}
}
