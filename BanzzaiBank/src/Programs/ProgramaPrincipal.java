package Programs;

import java.util.Locale;
import java.util.Scanner;

import Objects.ContaCorrente;
import Objects.ContaEspecial;
import Objects.ContaPoupanca;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
//		ContaPoupanca poupanca = new ContaPoupanca(25,0.00,29);
//		ContaCorrente corrente = new ContaCorrente(123,0.00,3);
//		ContaEspecial especial = new ContaEspecial(234,0.00,1000.00);
		
		Locale.setDefault(Locale.US);
		MenuPrincipal();

	}
	public static void Tela2 (String x) {
		
		ContaPoupanca poupanca = new ContaPoupanca(25,0.00,29);
		ContaCorrente corrente = new ContaCorrente(123,0.00,3);
		ContaEspecial especial = new ContaEspecial(234,0.00,1000.00);
		
		Scanner leia = new Scanner(System.in);
		int i = 0;
		int operacaoMenu;
		do{
			
			System.out.println("-------BANZZAI------");
			System.out.println("--時間は私たちの保証です--");
			
			System.out.println();
			System.out.println("===================");
			System.out.println("1 - SAQUE");
			System.out.println("2 - DEPÓSITO");
			System.out.print(x);
			System.out.println("0 - VOLTAR AO MENU");
			System.out.println("===================");
			System.out.println();
			
			System.out.println("Selecione uma operação.");
			operacaoMenu = leia.nextInt();
		
		if(operacaoMenu == 1) {
			//super();
		}
		
			i++;
			
		}while( i < 10);
		leia.close();
		
		
	}
	
	public static void MenuPrincipal () {

		
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("------BANZZAI------");
		System.out.println("--時間は私たちの保証です--");
		
		System.out.println();
		System.out.println("===================");
		System.out.println("1 - CONTA POUPANÇA");
		System.out.println("2 - CONTA CORRENTE");
		System.out.println("3 - CONTA ESPECIAL");
		System.out.println("4 - CONTA EMPRESARIAL");
		System.out.println("5 - CONTA ESTUDANTIL");
		System.out.println("6 - SAIR");
		System.out.println("==================="); 
		System.out.println();
		System.out.print("Selecione uma operação: ");
		int escolhaMenu = leia.nextInt();
		
		
		switch(escolhaMenu) {
		case 1: 
			System.out.println("\n------POUPANÇA------");
			//ContaPoupanca();
			Tela2("");
			break;
		case 2:
			System.out.println("Corrente");
			//ContaCorrente
			Tela2("");
			break;
		case 3:
			System.out.println("Especial");
			//ContaEspecial
			Tela2("3 - LIMITE\n");
			break;
		case 4:
			System.out.println("Empresarial");
			//ContaEmpresarial
			Tela2("3 - EMPRÉSTIMO\n");
			break;
		case 5:
			System.out.println("Estudantil");
			//ContaEstudantil
			Tela2("3 - LIMITE ESTUDANTIL\n");
			break;
		case 6:
			System.out.println("SAIR");
			break;
		default: 
			System.out.println("Opção inválida.\n");
			MenuPrincipal();
		}
		
		
		leia.close();
	}

}
