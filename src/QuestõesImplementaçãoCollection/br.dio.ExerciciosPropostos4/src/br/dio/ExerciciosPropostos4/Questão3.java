package br.dio.ExerciciosPropostos4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Questão3 {

	public static void main(String[] args) {
		Set<Integer> num = new HashSet<>() {
			{
				add(5);
				add(88);
				add(20);
				add(44);
				add(3);
			}
		};
		for(Integer n : num) {
			System.out.println(n);
		}
		
		System.out.println("==============================================");
		Set<Integer> num2 = new TreeSet<>(num);
		for(Integer n2 : num2) {
			System.out.println(n2);
		}
		
		System.out.println("==============================================");
		num2.remove(3);
		for(Integer n2 : num2) {
			System.out.println(n2);
		}
		System.out.println("==============================================");
		num2.add(23);
		for(Integer n2 : num2) {
			System.out.println(n2);
		}
		
		System.out.println("==============================================");
		//num.clear();
		System.out.println("Está vazio?");
		if(num.isEmpty()) {
			System.out.println("Sim, está vazia");
		}else {
			System.out.println("Não, não está vazia");
		}	
		
	}

}
