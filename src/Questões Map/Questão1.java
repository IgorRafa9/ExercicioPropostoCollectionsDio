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

public class Quest�o1 {

	public static void main(String[] args) {
		System.out.println("Crie um dicion�rio e relacione suas popula��es: ");
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
		System.out.println("Substitua a popula��o do estado do RN por 3.534.165: ");
		populacaoEstimada.put("RN", 3534165f);
		for(Map.Entry<String, Float> pE : populacaoEstimada.entrySet()) {
			System.out.println(pE.getKey()+" - "+pE.getValue()+" hab.");
		}
		System.out.println("===========================================");
		System.out.println("Confira se o estado PB est� no dicion�rio: " + populacaoEstimada.containsKey("PB"));
		populacaoEstimada.put("PB", 4039277f);
		for(Map.Entry<String, Float> pE2 : populacaoEstimada.entrySet()){
			System.out.println(pE2.getKey() + " - " + pE2.getValue()+" hab.");
		}
		System.out.println("===========================================");
		System.out.println("Popul��o do PE: "+populacaoEstimada.get("PE")+" hab");
		System.out.println("====================================================");
		System.out.println("Exibir tudo em ordem de inser��o: ");
		for(Map.Entry<String, Float> pE3:populacaoEstimada.entrySet()) {
			System.out.println(pE3.getKey() + " - " +pE3.getValue()+ " hab.");
		}
		System.out.println("===========================================");
		System.out.println("Ordem Alfab�tica: ");
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
		System.out.println("Maior Estado e sua popula��o: "+maiorPop+"/"+Collections.max(popHab));
		System.out.println("Menor Estado e sua popula��o: "+menorPop+"/"+Collections.min(popHab));
		System.out.println("===========================================");
		System.out.println("Soma das popula��es dos Estados: ");
		Iterator<Float> itr = populacaoEstimada.values().iterator();
		Float soma = 0f;
		while(itr.hasNext()) {
			soma+=itr.next();
		}
		System.out.printf("%.2f\n",soma);
		System.out.println("===========================================");
		System.out.printf("M�dia da popula��o: %2f\n",soma/populacaoEstimada.size());
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
		System.out.println("Conferindo se a lista est� vazia: "+populacaoEstimada.isEmpty());
	}
}
