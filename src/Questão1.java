package br.dio.ExercicioProposto1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Questão1 {

	public static void main(String[] args) {
		List <Double> temperatura = new ArrayList<>(); 
		temperatura.add(23.5);
		temperatura.add(15.6);
		temperatura.add(35.6);
		temperatura.add(24.9);
		temperatura.add(10.2);
		temperatura.add(9.5);
		
		List <String> mes = new ArrayList<>();
		mes.add("Janeiro");
		mes.add("Fevereiro");
		mes.add("Março");
		mes.add("Abril");
		mes.add("Maio");
		mes.add("Junho");
		
		double media=0.0;

		Iterator <Double> iterator = temperatura.iterator();
		Double soma=0.0;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma+=next;
			media = soma/temperatura.size();
		}
		System.out.printf("Média semestral: %.1f°C\n",media);	
		for(Double t:temperatura) {
			if(t>media) {
				int index = temperatura.indexOf(t);
				switch(index) {
					case 0:
						System.out.println((index + 1)+" - Janeiro: "+t+"°C");
						break;
					case 1:
						System.out.println((index + 1)+" - Fevereiro: "+t+"°C");
						break;
					case 2: 
						System.out.println((index + 1)+" - Março: "+t+"°C");
						break;
					case 3:
						System.out.println((index + 1)+" - Abril: "+t+"°C");
						break;
					case 4:
						System.out.println((index + 1)+" - Maio: "+t+"°C");
						break;
					case 5:
						System.out.println((index + 1)+" - Junho: "+t+"°C");
				}
			}		
		}
	}
	

}
