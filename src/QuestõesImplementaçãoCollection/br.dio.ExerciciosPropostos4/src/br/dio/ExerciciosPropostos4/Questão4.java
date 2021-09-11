package br.dio.ExerciciosPropostos4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Quest�o4 {

	public static void main(String[] args) {
		Map<String, String> estadosBR = new HashMap<>(){
			{
				put("SE","Sergipe");
				put("BA","Bahia");
				put("AL","Alagoas");
				put("PE","Pernambuco");
				put("PB","Para�ba");
				put("RN","Rio Grande do Norte");
				put("CE","Cear�");
				put("PI","Piau�");
				put("MA","Maranh�o");
				put("MG","Minas Gerais");
				put("RJ","Rio de Janeiro");
				put("SP","S�o Paulo");
				put("ES","Esp�rito Santo");
				put("PR","Paran�");
				put("SC","Santa Catarina");
				put("RS","Rio Grande do Sul");
				put("MT","Mato Grosso");
				put("MS","Mato Grosso do Sul");
				put("GO","Goias");
				put("AC","Acre");
				put("AM","Amazonas");
				put("RR","Roraima");
				put("RO","Rond�nia");
				put("TO","Tocatins");
				put("PA","Par�");
				put("AP","Amap�");
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
		estadosBR2.put("DF","Bras�lia");
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
		System.out.println(estadosBR2.containsValue("Maranh�o"));
	}

}
