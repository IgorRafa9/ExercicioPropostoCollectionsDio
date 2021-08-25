package br.dio.ExercicioProposto1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Quest�o2 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		List <String> resp = new ArrayList<>();
		int s=0;
			
		System.out.println("Pergunta: ");
		System.out.println("Telefonou pra v�tima?");
		String r = key.next();
		resp.add(r.toLowerCase());
		System.out.println("Esteve no local da cena do crime?");
		r = key.next();
		resp.add(r.toLowerCase());
		System.out.println("Mora perto da v�tima?");
		r = key.next();
		resp.add(r.toLowerCase());
		System.out.println("Devia algo pra v�tima?");
		r = key.next();
		resp.add(r.toLowerCase());
		System.out.println("J� trabalhou com ou para a v�tima?");
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
				System.out.println("----> C�MPLICE <----");
				break;
			case 5:
				System.out.println("----> ASSASSINO <----");
				break;
			default:
				System.out.println("----> Inocente <----");
		}
	}
}
