package javatech;

import java.util.Scanner;

public class ExercicioVetor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//vetor contendo 10 números não ordenados e não repetidos
//construir um algoritmo que consiga pesquisar dados no vetor - usuário vai digitar o número
//o programa deve exibir o número digitado na tela e a posição do número no vetor
//número não encontrado - inserir mensagem de não encontrado.


	int posicao, leitura, cont=0;
	int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	Scanner ler = new Scanner (System.in);
	
		System.out.println("\ndigite um número: ");
		leitura = ler.nextInt();
		
		for (posicao = 0; posicao < 10; posicao++) {
			if (numeros[posicao] == leitura) {
				System.out.println("\no número " +  leitura  + "está localizado na posição " + posicao);
				cont++;
			}
		}

if(cont==0) { 
				
		System.out.println("\n o número é inválido!");
		}
	}
	}


