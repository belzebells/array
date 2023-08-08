package javatech;
import java.util.Scanner;
public class ExercicioMatriz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4
//bimestres de um ano. As 4 notas de cada participante serão armazenadas em uma
//linha de uma matriz de números reais, logo cada linha da matriz serão as notas de
//um participante. Em um vetor de números reais, armazene as médias de cada
//participante e exiba as médias de cada um na tela.
	
	int linha, coluna, NotasClasse = 0;
	int [] [] medias = new int [10][4];
	
	Scanner leia = new Scanner (System.in);
	
	for(coluna=0;coluna<4;coluna++)
		for(linha=0;linha<10;linha++) {		
	}		System.out.println("\ndigite a nota: ");
			medias[linha][coluna]=leia.nextInt();
	
	NotasClasse += medias[linha][coluna];
	
	NotasClasse =0;
	
	for(coluna=0;coluna<4;coluna++)
		System.out.println("\na média do aluno " + (coluna + 1)+ "é: " +NotasClasse);
	
	}
	}

