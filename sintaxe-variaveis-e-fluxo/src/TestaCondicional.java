
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("Voc? tem 18 anos ou mais");
			System.out.println("Seja bem vindo");
		} else if (quantidadePessoas >= 2 && idade < 18) {
			System.out.println("Voc? n?o tem 18 anos, mas pode entrar pois esta acompanhado");
		} else {
			System.out.println("infelizmente voc? n?o pode entrar");
		}
	}
}
