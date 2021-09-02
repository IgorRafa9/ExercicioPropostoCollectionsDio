package br.dio.ExerciciosPropostos3;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Questão1 {

	public static void main(String[] args) {
		System.out.println("Crie um dicionário e relacione suas populações: ");
		Map<String, Float> populacaoEstimada = new HashMap<>() {
			{
				put("PE",9616621f);
				put("AL",3351543f);
				put("CE",9187103f);
				put("RN",3534265f);
			}
		};
		for(Map.Entry<String, Float> pE : populacaoEstimada.entrySet()) {
			System.out.println(pE.getKey()+" - "+pE.getValue()+" hab.");
		}
		System.out.println("===========================================");
		System.out.println("Substitua a população do estado do RN por 3.534.165: ");
		populacaoEstimada.put("RN", 3534165f);
		for(Map.Entry<String, Float> pE : populacaoEstimada.entrySet()) {
			System.out.println(pE.getKey()+" - "+pE.getValue()+" hab.");
		}
		System.out.println("===========================================");
		System.out.println("Confira se o estado PB está no dicionário: " + populacaoEstimada.containsKey("PB"));
		populacaoEstimada.put("PB", 4039277f);
		for(Map.Entry<String, Float> pE2 : populacaoEstimada.entrySet()){
			System.out.println(pE2.getKey() + " - " + pE2.getValue()+" hab.");
		}
		System.out.println("===========================================");
		System.out.println("Populção do PE: "+populacaoEstimada.get("PE")+" hab");
		System.out.println("====================================================");
		System.out.println("Exibir tudo em ordem de inserção: ");
		for(Map.Entry<String, Float> pE3:populacaoEstimada.entrySet()) {
			System.out.println(pE3.getKey() + " - " +pE3.getValue()+ " hab.");
		}
		System.out.println("===========================================");
		System.out.println("Ordem Alfabética: ");
		Map<String, Float> populacaoEstimada2 = new TreeMap<>(populacaoEstimada);
		for(Map.Entry<String, Float> pE4 : populacaoEstimada2.entrySet()) {
			System.out.println(pE4.getKey()+" - "+pE4.getValue());
		}
		System.out.println("===========================================");
		Collection<Float> popHab = populacaoEstimada.values();
		String menorPop = "";
		String maiorPop = "";
		for(Map.Entry<String, Float> pE5 : populacaoEstimada.entrySet()) {
			if(pE5.getValue().equals(Collections.max(popHab))) {
				maiorPop = pE5.getKey();
			}
			if(pE5.getValue().equals(Collections.min(popHab))){
				menorPop = pE5.getKey();
			}
		}
		System.out.println("Maior Estado e sua população: "+maiorPop+"/"+Collections.max(popHab));
		System.out.println("Menor Estado e sua população: "+menorPop+"/"+Collections.min(popHab));
		System.out.println("===========================================");
		System.out.println("Soma das populações dos Estados: ");
		Iterator<Float> itr = populacaoEstimada.values().iterator();
		Float soma = 0f;
		while(itr.hasNext()) {
			soma+=itr.next();
		}
		System.out.printf("%.2f\n",soma);
		System.out.println("===========================================");
		System.out.printf("Média da população: %2f\n",soma/populacaoEstimada.size());
		System.out.println("===========================================");
		System.out.println("Remova os estados com menos de 4.000.000 de hab.:");
		Iterator<Float> itr2 = populacaoEstimada.values().iterator();
		while(itr2.hasNext()) {
			if(itr2.next()<=4000000) {
				itr2.remove();
			}
		}
		System.out.println(populacaoEstimada);
		System.out.println("===========================================");
		System.out.println("Apagando a lista de Estados: ");
		populacaoEstimada.clear();
		for(Map.Entry<String, Float> pE6 : populacaoEstimada.entrySet()) {
			System.out.println(pE6.getKey() + " - " +pE6.getValue());
		}
		System.out.println("===========================================");
		System.out.println("Conferindo se a lista está vazia: "+populacaoEstimada.isEmpty());
	}
}
