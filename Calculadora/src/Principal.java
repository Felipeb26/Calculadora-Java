
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		System.out.println(" Utilizar os operadores permitidos ou o nome da operacao:\n ");
		System.out.println(" + Adicao = soma ou + , Subtracao = menos ou -");
		System.out.println(" Multiplicacao = multiplicar ou * ou x,  Divisao = dividir ou / \n");

		Scanner scanner = new Scanner(System.in);
		double numero1 = 0;
		double numero2 = 0;
		String operacao = "" ;
		double conta = 0;
		int contador = 0;
		String loop = "sim";
		String valor1 = " ";
		String valor2 = " ";
		
		/*Pega o valor*/
		
		System.out.printf("Digite um numero abaixo:\n");
		valor1 = scanner.next();
		System.out.printf("Digite outro numero abaixo:\n");
		valor2 = scanner.next();
		System.out.printf("Qual a operacao\n ");
		operacao = scanner.next();
		operacao = operacao.toLowerCase();
		
		try {
			numero1 = Double.parseDouble(valor1);
		} catch (NumberFormatException e) {
			System.out.println("O primeiro numero foi digitado incorretamente!");
		}
		try {
			numero2 = Double.parseDouble(valor2);
		} catch (NumberFormatException e) {
			System.out.println("O segundo numero foi digitado incorretamente!");
		}
		while (!operacao.equals("soma") && !operacao.equals("+") && !operacao.equals("subtrair")
				&& !operacao.equals("-") && !operacao.equals("multiplicar") && !operacao.equals("x")
				&& !operacao.equals("*") && !operacao.equals("dividir") && !operacao.equals("/") && contador < 3) {
			System.out.println(
					"Precisa necessario informar um operador valido para efetuar a operacao, volte para o inicio, veja quais sao no inicio.");
			operacao = scanner.next();
			contador++;
		}

		while(operacao.equals("dividir")  && numero2 == 0) {
			System.out.println("Nao se e  possivel dividir um numero por 0, insira outro valor");
			numero2 = scanner.nextDouble();
		}
		while(operacao.equals("/")  && numero2 == 0) {
			System.out.println("Nao se e  possivel dividir um numero por 0, insira outro valor");
			numero2 = scanner.nextDouble();
		}

		/*Realiza a operacao*/
		
		if (operacao.equals("soma") || operacao.equals("+")) {
			conta = numero1 + numero2;
		} else if (operacao.equals("subtrair") || operacao.equals("-")) {
			conta = numero1 - numero2;
		} else if (operacao.equals("multiplicar") || operacao.equals("x") || operacao.equals("*")) {
			conta = numero1 * numero2;
		} else if (operacao.equals("dividir") || operacao.equals("/")) {
			conta = numero1 / numero2;
		} else {
			System.out.println("Erro: numero maximo de tentaivas");
		}
		System.out.println("o valor foi " + conta + "\n");
		System.out.println("Quer fazer outra conta?Digite 'sim' " + "\n");
		loop = scanner.next();
		loop = loop.toLowerCase();
		
		if (loop.equals("sim")) {
			main(args);
		} else {
			System.out.println("finalizando......");
		}
	}
}
