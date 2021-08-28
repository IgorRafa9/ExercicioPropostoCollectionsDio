package br.dio.ExercicioProposto2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Questão2 {
	public static void main(String[] args) {
		Set <LF> lf = new LinkedHashSet<>() {
			{
				add(new LF("Java", "Eclipse", 1995));
				add(new LF("C", "DevC++", 1972));
				add(new LF("C++", "DevC++",1990));
			}
		};
		for(LF Lf1 : lf) {
			System.out.println(Lf1);
		}
		System.out.println("======================================");
		System.out.println("Por nome: ");
		Set <LF> lf2 = new TreeSet<>(lf);
		for(LF Lf2 : lf2) {
			System.out.println(Lf2.getLF());
		}
		System.out.println("======================================");
		System.out.println("Por IDE: ");
		Set<LF> lf3 = new TreeSet<>(lf);
		for(LF Lf3 : lf3) {
			System.out.println(Lf3.getIDE());
		}
		System.out.println("======================================");
		System.out.println("Nome e Ano: ");
		Set<LF> lf4 = new TreeSet<>(lf);
		for(LF Lf4 : lf4) {
			System.out.println(Lf4.getAnoDeCriacao()+"/"+Lf4.getLF());
		}
		System.out.println("======================================");
		System.out.println("Nome/Ano de Criação/IDE: ");
		Set<LF> lf5 = new TreeSet<>(new ComparatorNomeAnoIde());
		lf5.addAll(lf);
		for(LF Lf5 : lf5) {
			System.out.println(Lf5.getLF()+"/"+Lf5.getAnoDeCriacao()+"/"+Lf5.getIDE());
		}
	}

}
class LF implements Comparable<LF>{
	private String LF;
	private String IDE;
	private int anoDeCriacao;

	public LF(String lF, String iDE, int anoDeCriacao) {
		super();
		LF = lF;
		IDE = iDE;
		this.anoDeCriacao = anoDeCriacao;
	}

	public String getLF() {
		return LF;
	}

	public String getIDE() {
		return IDE;
	}

	public int getAnoDeCriacao() {
		return anoDeCriacao;
	}
	
	

	@Override
	public String toString() {
		return "Linguagem: " + LF + "\nIDE: " + IDE + "\nAno de criacao: " + anoDeCriacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(IDE, LF, anoDeCriacao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LF other = (LF) obj;
		return Objects.equals(IDE, other.IDE) && Objects.equals(LF, other.LF) && anoDeCriacao == other.anoDeCriacao;
	}

	@Override
	public int compareTo(LF lf) {
		int anoDeCriacao = Integer.compare(this.getAnoDeCriacao(),lf.getAnoDeCriacao());
		if(anoDeCriacao!=0) return anoDeCriacao;
		return this.getLF().compareTo(lf.getLF());
	}
}

class ComparatorNome implements Comparator<LF>{
	@Override
	public int compare(LF lf1, LF lf2) {
		Integer LF = lf1.getLF().compareTo(lf2.getLF());
		if(LF!=0) return LF;
		return Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
	}
}

class ComparatorIDE implements Comparator<LF>{
	@Override
	public int compare(LF lf1, LF lf2) {
		Integer IDE = lf1.getIDE().compareTo(lf2.getIDE());
		if(IDE!=0) return IDE;
		return Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
	}
}
class ComparatorNomeAnoIde implements Comparator<LF>{
	@Override
	public int compare(LF lf1, LF lf2) {
		int LF = lf1.getLF().compareTo(lf2.getLF());
		if(LF!=0) return LF;
		
		int IDE = lf1.getIDE().compareTo(lf2.getIDE());
		if(IDE!=0) return IDE;
		
		return Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
	}
	
}