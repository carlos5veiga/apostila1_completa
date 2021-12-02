import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		exerc47();

	}

	public static void exerc_resolv() {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a largura do terreno: ");
		double largura = sc.nextDouble();
		System.out.println("Informe o comprimento do terreno: ");
		double comprimento = sc.nextDouble();
		System.out.println("Informe o valor do metro quadrado: ");
		double metroQuad = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuad;

		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preco = %.2f%n", preco);

		sc.close();
	}

	public static void exerc1() {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int soma = num1 + num2;

		System.out.println("Soma = " + soma);

		sc.close();
	}

	public static void exerc2() {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double raio = sc.nextDouble();
		double pi = 3.14159;

		double area = pi * Math.pow(raio, 2);

		System.out.printf("Area = %.4f%n", area);

		sc.close();
	}

	public static void exerc3() {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int diferenca = ((a * b) - (c * d));

		System.out.println("Diferenca = " + diferenca);

		sc.close();
	}

	public static void exerc4() {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int numFunc = sc.nextInt();
		int horas = sc.nextInt();
		double valorPorHora = sc.nextDouble();

		double salario = horas * valorPorHora;

		System.out.println("Number = " + numFunc);
		System.out.printf("Salary = US$ %.2f%n", salario);

		sc.close();
	}

	public static void exerc5() {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		// inteiro cod1 = sc.nextInt();
		int quant1 = sc.nextInt();
		double valUnit1 = sc.nextDouble();
		// inteiro cod2 = sc.nextInt();
		int quant2 = sc.nextInt();
		double valUnit2 = sc.nextDouble();

		double total = ((quant1 * valUnit1) + (quant2 * valUnit2));

		System.out.printf("Valor a pagar = R$ %.2f%n", total);

		sc.close();
	}

	public static void exerc6() {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double pi = 3.14159;

		double areaTri = a * c / 2;
		double areaCirc = pi * Math.pow(c, 2);
		double areaTrap = (a + b) * c / 2;
		double areaQuad = Math.pow(b, 2);
		double areaRet = a * b;

		System.out.printf("Triangulo = %.3f%n", areaTri);
		System.out.printf("Circulo = %.3f%n", areaCirc);
		System.out.printf("Trapezio = %.3f%n", areaTrap);
		System.out.printf("Quadrado = %.3f%n", areaQuad);
		System.out.printf("Retangulo = %.3f%n", areaRet);

		sc.close();
	}

	// Apostila 2
	public static void exerc21() {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Não negativo");
		}

		sc.close();

	}

	public static void exerc22() {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Ímpar");
		}

		sc.close();

	}

	public static void exerc23() {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();

		int num2 = sc.nextInt();

		if ((num1 % num2 == 0) || (num2 % num1 == 0)) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}

		sc.close();
	}

	public static void exerc24() {

		Scanner sc = new Scanner(System.in);

		int inicio = sc.nextInt();
		int fim = sc.nextInt();

		if (fim > inicio) {
			System.out.println("O jogo durou " + (fim - inicio) + " hora(s)");
		} else {
			if (inicio > fim) {
				System.out.println("O jogo durou " + (24 + fim - inicio) + " hora(s)");
			} else {
				System.out.println("O jogo durou 24 hora(s)");
			}
		}

		sc.close();
	}

	public static void exerc25() {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();

		int quant = sc.nextInt();

		double total;

		if (codigo == 1) {
			total = quant * 4.00;
			System.out.printf("Total: R$ %.2f", total);
		} else if (codigo == 2) {
			total = quant * 4.50;
			System.out.printf("Total: R$ %.2f", total);
		} else if (codigo == 3) {
			total = quant * 5.00;
			System.out.printf("Total: R$ %.2f", total);
		} else if (codigo == 4) {
			total = quant * 2.00;
			System.out.printf("Total: R$ %.2f", total);
		} else if (codigo == 5) {
			total = quant * 1.50;
			System.out.printf("Total: R$ %.2f", total);
		}

		sc.close();
	}

	public static void exerc26() {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double num = sc.nextDouble();

		if ((num >= 0.00) && (num <= 100.00)) {

			if (num <= 25.00) {
				System.out.println("Intervalo [0,25]");
			} else if (num <= 50.00) {
				System.out.println("Intervalo (25,50]");
			} else if (num <= 75.00) {
				System.out.println("Intervalo (50,75]");
			} else if (num <= 100.00) {
				System.out.println("Intervalo (75,100]");
			}
		} else {
			System.out.println("Fora de intervalo");
		}

		sc.close();
	}

	public static void exerc27() {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		if ((x == 0.0) && (y == 0.0)) {
			System.out.println("Origem");
		} else if (x == 0.0) {
			System.out.println("Eixo Y");
		} else if (y == 0.0) {
			System.out.println("Eixo X");
		} else if (x > 0.0) {
			if (y > 0.0) {
				System.out.println("Q1");
			} else {
				System.out.println("Q4");
			}
		} else {
			if (y > 0.0) {
				System.out.println("Q2");
			} else {
				System.out.println("Q3");
			}
		}

		sc.close();
	}

	public static void exerc28() {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double temp, imposto;

		if (salario > 0) {
			if (salario <= 2000.00) {
				System.out.println("Isento");
			} else if (salario <= 3000.00) {
				temp = salario - 2000.00;
				imposto = temp * 0.08;
				System.out.printf("R$ %.2f%n", imposto);
			} else if (salario <= 4500.00) {
				temp = salario - 3000.00;
				imposto = temp * 0.18 + 80.00; // 80 é o valor sobre a faixa 1
				System.out.printf("R$ %.2f%n", imposto);
			} else {
				temp = salario - 4500.00;
				imposto = temp * 0.28 + 350.00; // 350 é o valor das faixas 1 e 2
				System.out.printf("R$ %.2f%n", imposto);
			}
		} else {
			System.out.println("Informe um salário válido");
		}

		sc.close();
	}

	// Apostila 3
	public static void exerc31() {

		Scanner sc = new Scanner(System.in);

		int senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha inválida");
			senha = sc.nextInt();
		}

		System.out.println("Acesso permitido");

		sc.close();
	}

	public static void exerc32() {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		while ((x != 0) && (y != 0)) {
			if (x > 0) {
				if (y > 0) {
					System.out.println("Primeiro");
				} else {
					System.out.println("Quarto");
				}
			} else {
				if (y > 0) {
					System.out.println("Segundo");
				} else {
					System.out.println("Terceiro");
				}
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();
	}

	public static void exerc33() {

		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		int codigo = sc.nextInt();

		while (codigo != 4) {
			switch (codigo) {
			case (1): {
				alcool += 1;
				break;
			}
			case (2): {
				gasolina += 1;
				break;
			}
			case (3): {
				diesel += 1;
				break;
			}
			}
			codigo = sc.nextInt();
		}

		System.out.println("Muito Obrigado.");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}

	// Apostila 4
	public static void exerc41() {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			if (i%2 == 1) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

	public static void exerc42() {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int dentro = 0;
		int fora = 0;
		
		for (int i=0; i<n; i++) {
			int num = sc.nextInt();
			if ((num >=10) && (num<=20)) {
				dentro++;
			}
			else {
				fora++;
			}
		}
		
		System.out.println(dentro + " in");
		System.out.println(fora + " out");
		
		sc.close();
	}

	public static void exerc43() {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double media = ((a*2)+(b*3)+(c*5))/10;
			System.out.printf("%.1f", media);
		}
		
		
		sc.close();
	}

	public static void exerc44() {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			if (b==0) {
				System.out.println("divisao impossivel");
			}
			else {
				System.out.printf("%.1f%n", a/b);
			}
		}
		
		sc.close();
	}

	public static void exerc45() {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if (x==0) {
			x=1;
		}
		
		for (int i=x-1; i>0; i--) {
			x *= i;
		}
		System.out.println(x);
		sc.close();
	}

	public static void exerc46() {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (n%i==0) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
	}

	public static void exerc47() {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print(i + " ");
			System.out.print((int)(Math.pow(i, 2)) + " ");
			System.out.println((int)(Math.pow(i, 3)));
		}
		
		sc.close();
	}


}
