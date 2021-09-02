package br.dio.ExerciciosPropostos3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Desafio {

	public static void main(String[] args) {
		int qLanc = 100;

		List<Integer> v = new ArrayList<>();
		Random geradorLan = new Random();
		for(int i=0;i<qLanc;i++) {
			int n = geradorLan.nextInt(6)+1;
			v.add(n);
		}

		System.out.println("===========================================");
		Map<Integer, Integer> lanc = new HashMap<>();
		for(Integer result : v) {
			if(lanc.containsKey(result)) {
				lanc.put(result, (lanc.get(result)));
			}else {
				lanc.put(result, 1);
			}
		}
		System.out.println("===========================================");
		System.out.println("Tocando");
		for(int i=0;i<3;i++) {
			try {
				Thread.sleep(3000);
				System.out.println(".");
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("===========================================");
		System.out.println("\nValor: "+"Quantidade de vezes");
		for(Map.Entry<Integer, Integer> entry : lanc.entrySet()) {
			System.out.printf("%3d %10d\n",entry.getKey(), entry.getValue());
		}
	}
}
