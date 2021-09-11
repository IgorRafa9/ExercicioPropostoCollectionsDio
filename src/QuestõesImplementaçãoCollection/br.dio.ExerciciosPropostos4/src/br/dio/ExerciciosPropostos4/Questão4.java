package br.dio.ExerciciosPropostos4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Questão4 {

	public static void main(String[] args) {
		Map<String, String> estadosBR = new HashMap<>(){
			{
				put("SE","Sergipe");
				put("BA","Bahia");
				put("AL","Alagoas");
				put("PE","Pernambuco");
				put("PB","Paraíba");
				put("RN","Rio Grande do Norte");
				put("CE","Ceará");
				put("PI","Piauí");
				put("MA","Maranhão");
				put("MG","Minas Gerais");
				put("RJ","Rio de Janeiro");
				put("SP","São Paulo");
				put("ES","Espírito Santo");
				put("PR","Paraná");
				put("SC","Santa Catarina");
				put("RS","Rio Grande do Sul");
				put("MT","Mato Grosso");
				put("MS","Mato Grosso do Sul");
				put("GO","Goias");
				put("AC","Acre");
				put("AM","Amazonas");
				put("RR","Roraima");
				put("RO","Rondônia");
				put("TO","Tocatins");
				put("PA","Pará");
				put("AP","Amapá");
			}
		};
		for(Map.Entry<String, String> eB : estadosBR.entrySet()) {
			System.out.println(eB.getKey()+","+eB.getValue());
		}
		
		System.out.println("====================================================");
		Map<String, String> estadosBR2 = new TreeMap<>(estadosBR);
		for(Map.Entry<String, String> eB2 : estadosBR2.entrySet()) {
			System.out.println(eB2.getKey()+","+eB2.getValue());
		}
		
		System.out.println("====================================================");
		estadosBR2.remove("MG", "Minas Gerais");
		for(Map.Entry<String, String> eB : estadosBR.entrySet()) {
			System.out.println(eB.getKey()+","+eB.getValue());
		}
		
		System.out.println("====================================================");
		estadosBR2.put("DF","Brasília");
		for(Map.Entry<String, String> eB2 : estadosBR2.entrySet()) {
			System.out.println(eB2.getKey()+","+eB2.getValue());
		}
		
		System.out.println("====================================================");
		estadosBR2.remove("MS");
		for(Map.Entry<String, String> eB2 : estadosBR2.entrySet()) {
			System.out.println(eB2.getKey()+","+eB2.getValue());
		}
		
		System.out.println("====================================================");
		for(Map.Entry<String, String> eB2 : estadosBR2.entrySet()) {
			System.out.println(eB2.getValue()+"("+eB2.getKey()+")");
		}
		
		System.out.println("====================================================");
		System.out.println(estadosBR2.containsKey("SC"));
		
		System.out.println("====================================================");
		System.out.println(estadosBR2.containsValue("Maranhão"));
	}

}
