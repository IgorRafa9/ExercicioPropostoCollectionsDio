package br.dio.ExerciciosPropostos4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Questão1 {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");
		System.out.println("Listando os nomes: ");
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("==========================================================");
		System.out.println("Mude o nome de Carlos para Roberto: ");
		nomes.set(2, "Roberto");
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("==========================================================");
		System.out.println("Nome da posição 1: "+nomes.get(1));
		System.out.println("==========================================================");
		System.out.println("Remova o nome da posição 4: ");
		nomes.remove(4);
		for(String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("==========================================================");
		System.out.println("Retorne a quantidade de itens na lista: "+nomes.size());
		System.out.println("==========================================================");
		if(nomes.contains("Juliano")) {
			System.out.println("Existe na lista");
		}else {
			System.out.println("O nome não existe na lista");
		}
		System.out.println("==========================================================");
		List<String> nomes2 = new ArrayList<>();
		
		nomes.add("Ismael");
		nomes.add("Rodrigo");
		nomes.add("João");
		System.out.println("Listando os nomes: ");
		for(String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("==========================================================");
		System.out.println("Por ordem alfabética: ");
		Collections.sort(nomes);
		for(String nome2 : nomes) {
			System.out.println(nome2);
		}
		System.out.println("==========================================================");
		System.out.println("Lista está vazia: ");
		if(nomes.isEmpty()) {
			System.out.println("Está vazia");
		}else {
			System.out.println("Não está vazia");
		}
	}

}
