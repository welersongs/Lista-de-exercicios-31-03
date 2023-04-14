package exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteAnimais2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Animal> animais = new ArrayList<Animal>();
		List<Peixe> peixes = new ArrayList<Peixe>();
		List<Mamifero> mamiferos = new ArrayList<Mamifero>();
				
		int opcaoEscolhida = 0;
		
		while (opcaoEscolhida != 4) {
			System.out.println("Escolha uma opção");
			System.out.println("1 - Adicionar Animal");
			System.out.println("2 - Adicionar Peixe");
			System.out.println("3 - Adicionar Mamifero");
			System.out.println("4 - Terminar cadastro");
			
			opcaoEscolhida = sc.nextInt();
			
			if (opcaoEscolhida < 1 || opcaoEscolhida > 4) {
				System.out.println("Opção invalida!");
				continue;
			}
			
			if (opcaoEscolhida == 4) {
				break;
			}		
			
			System.out.println("Opção escolhida: " + opcaoEscolhida);
			System.out.println("Qual o nome do animal? \n");
			String nome = sc.next();
			
			System.out.println("Qual o comprimento? \n");
			int comprimento = sc.nextInt();
			
			System.out.println("Qual a velocidade? \n");
			float velocidade = sc.nextFloat();
			
			String cor;
			int numeroDePatas;

			
			switch (opcaoEscolhida) {
				case 1:
					if (animais.size() >= 10) {
						System.out.println("Limite de animais atingido, escolha outra opção!");
						continue;
					}
					
					System.out.println("Quantas patas? \n");
					numeroDePatas = sc.nextInt();
					
					System.out.println("Qual a cor? \n");
					cor = sc.next();
					
					System.out.println("Qual o ambiente? \n");
					String ambiente = sc.next();
					
					Animal animal = new Animal(nome, cor, ambiente, comprimento, velocidade, numeroDePatas);
					animais.add(animal);
					break;
				case 2:
					if (peixes.size() >= 10) {
						System.out.println("Limite de peixes atingido, escolha outra opção!");
						continue;
					}
					
					System.out.println("Qual a caracteristica? \n");
					String caracteristica = sc.next();
					
					Peixe peixe = new Peixe(nome, caracteristica, comprimento, velocidade);
					peixes.add(peixe);
					break;
				case 3:
					if (mamiferos.size() >= 10) {
						System.out.println("Limite de mamiferos atingido, escolha outra opção!");
						continue;
					}
					
					System.out.println("Quantas patas? \n");
					numeroDePatas = sc.nextInt();
					
					System.out.println("Qual a cor? \n");
					cor = sc.next();
					
					System.out.println("Qual o alimento? \n");
					String alimento = sc.next();

					
					Mamifero mamifero = new Mamifero(nome, cor, alimento, comprimento, velocidade, numeroDePatas);
					mamiferos.add(mamifero);
					break;
				default:
					System.out.println("Opção invalida!");
					continue;
			}
						
			
		}
		
		System.out.println("------------------------------");
		System.out.println("Zoo");
		System.out.println("------------------------------");
		
		for (Animal animal : animais) {
			animal.dados();
			System.out.println("------------------------------");
		}
		
		for (Peixe peixe: peixes) {
			peixe.dados();
			System.out.println("------------------------------");
		}
		
		for (Mamifero mamifero: mamiferos) {
			mamifero.dados();
			System.out.println("------------------------------");
		}
 		
	}
}
