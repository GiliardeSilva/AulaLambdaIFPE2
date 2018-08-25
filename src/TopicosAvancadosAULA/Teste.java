package TopicosAvancadosAULA;

public class Teste {
	public static void main(String[] args) {
		//Questões da Sala Usando Lambda

		OperacaoSomar somar = (int num1, int num2) -> {
			return num1 + num2;
		};

		//System.out.println(somar.operacoesInterios(10, 15));
		//System.out.println(somar.operacoesInterios(187, 18));

		//--------------------------------------------------//

		OperacaoFatorial fatorial = (int num) -> {
			if (num == 0)
				throw new IllegalArgumentException("numero < 0");

			int resultado = 1;

			for (int i = 1; i <= num; i++) {
				resultado *= i;
			}
			return resultado;
		};

		//System.out.println(fatorial.retornarResultado(5));
		//System.out.println(fatorial.retornarResultado(7));

		//--------------------------------------------------//

		OperacaoPrimo verificaPrimo = (int numero) -> {

			for (int i = 2; i < numero; i++) {
		        if (numero % i == 0)
		            return false;   
		    }
		    return true;

		};

		//System.out.println(verificaPrimo.retornaPrimo(13));
		//System.out.println(verificaPrimo.retornaPrimo(14));

		//--------------------------------------------------//

		InteiroValido inteiroValido = (String texto) -> {
			return texto.matches("-?\\d+");
		};

		//System.out.println(inteiroValido.retornarOperacao("157"));
		//System.out.println(inteiroValido.retornarOperacao("15a7"));


		//--------------------------------------------------//

		VetorMedia calculaMedia = (double[] vetor) -> {
			if (vetor.length == 0) {
				throw new IllegalArgumentException("vetor.length == 0");
			}

			double soma = 0;

			for (double valor : vetor) {
				soma += valor;
			}

			return soma / vetor.length;
		};
		
		double[] array1 = { 1, 10, 6.5, 189.5 };
		double[] array2 = { 10, 58.9, 6.5, 18 };
		
		//System.out.println(calculaMedia.calculoVetor(array1));
		//System.out.println(calculaMedia.calculoVetor(array2));

		//--------------------------------------------------//

		
		VetorMaiorMenor resultado = (double [] vetor) -> {
			if (vetor.length == 0) {
				throw new IllegalArgumentException("vetor.length == 0");
			}
			
			double maiorNumero = vetor[0];
			
			for (int i = 1; i < vetor.length; i++) {
				if (vetor[i] > maiorNumero) {
					maiorNumero = vetor[i];
				}
			}
			
			System.out.println("Maior número = " + maiorNumero);
		};
		
		resultado.retornaMaiorMenor(array1);
		resultado.retornaMaiorMenor(array2);
	}
	
}
