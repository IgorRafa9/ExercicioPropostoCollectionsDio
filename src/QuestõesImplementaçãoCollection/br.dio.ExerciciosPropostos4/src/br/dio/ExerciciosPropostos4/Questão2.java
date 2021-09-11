package br.dio.ExerciciosPropostos4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Questão2 {

	public static void main(String[] args) {
		Queue <String> nomes = new LinkedList<>();
		//Quesito 1
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");
		
		//Quesito 2
		for(String name : nomes) {
			System.out.println(name);
		}
		System.out.println("======================================");
		//Quesito 3
		String primeiroNome = nomes.peek();
		System.out.println(primeiroNome+"\n");
		for(String name : nomes) {
			System.out.println(name);
		}
		
		System.out.println("======================================");
		//Quesito 4
		System.out.println(nomes.peek());
		nomes.remove("Juliana");		
		System.out.println(nomes);
		
		System.out.println("======================================");
		//Questão 5	
		List <String> nomes2 = new ArrayList<>(nomes);
		nomes.add("Daniel");
		System.out.println("Posição do nome Daniel"+":"+nomes2.indexOf("Daniel"));
		
		System.out.println("======================================");
		System.out.println("Tamanho da lista: "+nomes.size());
		for(String name : nomes) {
			System.out.println(name);
		}
		
		System.out.println("======================================");
		System.out.println("Lista está vazia: "+nomes.isEmpty());
		
		System.out.println("======================================");
		System.out.println("O nome Carlos está na lista?");
		if(nomes.contains("Carlos")) {
			System.out.println("O nome Carlos está na lista.");
		}else {
			System.out.println("O nome Carlos não está na lista.");
		}
		
		
	}
}
