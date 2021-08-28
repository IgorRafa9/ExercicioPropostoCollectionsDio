package br.dio.ExercicioProposto2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Questão1 {

	public static void main(String[] args) {
		Set<String> cores = new HashSet<>() {
			{
				add(new String("Vermelho"));
				add(new String("Laranja"));
				add(new String("Amarelo"));
				add(new String("Verde"));
				add(new String("Azul Claro"));
				add(new String("Azul Escuro"));
				add(new String("Roxo"));
			}
		};
		System.out.println("Cores do Arco-Íris: ");
		for(String c : cores) {
			System.out.println(c);
		}
		System.out.println("==============================================");
		System.out.println("Quantidade de cores existentes no Arco-Íris: "+cores.size()+" cores");
		System.out.println("==============================================");
		
		System.out.println("Ordem alfabética: ");
		Set<String> cores2 = new TreeSet<>(cores);
		for(String c2 : cores2) {
			System.out.println(c2);
		}
		System.out.println("==============================================");
		System.out.println("Ordem inversa: ");
		Set<String>cores3 = new LinkedHashSet<>(cores);
		List<String>cores4 = new ArrayList<>(cores2);
		Collections.reverse(cores4);
		for(String c4 : cores4) {
			System.out.println(c4);
		}
		System.out.println("==============================================");
		System.out.println("Exibir todas as cores que começam com a letra 'V': ");
		 for (String cL: cores) {
	            if(cL.startsWith("V")) {
	            	System.out.println(cL);
	            }
	        }
		 System.out.println("==============================================");
		 System.out.println("Remover todas as cores que começam com 'V': ");
		 Iterator <String> iterator = cores.iterator();
		 while (iterator.hasNext()) {
			 if(iterator.next().startsWith("V")) {
				 iterator.remove();
			 }
		 }
		 for(String cL2 : cores) {
			 System.out.println(cL2);
		 }
	}
		
}
