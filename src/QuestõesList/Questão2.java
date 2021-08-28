package br.dio.ExercicioProposto1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Questão2 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		List <String> resp = new ArrayList<>();
		int s=0;
			
		System.out.println("Pergunta: ");
		System.out.println("Telefonou pra vítima?");
		String r = key.next();
		resp.add(r.toLowerCase());
		System.out.println("Esteve no local da cena do crime?");
		r = key.next();
		resp.add(r.toLowerCase());
		System.out.println("Mora perto da vítima?");
		r = key.next();
		resp.add(r.toLowerCase());
		System.out.println("Devia algo pra vítima?");
		r = key.next();
		resp.add(r.toLowerCase());
		System.out.println("Já trabalhou com ou para a vítima?");
		r = key.next();
		resp.add(r.toLowerCase());
		System.out.println("========================");
		
		for(String res:resp) {
			System.out.println("Resposta: "+res+"\t");
		}
		System.out.println("========================");
		
		Iterator <String> contador = resp.iterator();
		while(contador.hasNext()) {
			String re = contador.next();
			if(re.contains("s")) {
				s++;
			}
		}
		switch(s) {
			case 2:
				System.out.println("----> SUSPEITA <----");
				break;
			case 3:
			case 4:
				System.out.println("----> CÚMPLICE <----");
				break;
			case 5:
				System.out.println("----> ASSASSINO <----");
				break;
			default:
				System.out.println("----> Inocente <----");
		}
	}
}
