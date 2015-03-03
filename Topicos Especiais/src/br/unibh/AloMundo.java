package br.unibh;

import java.math.BigDecimal;
import java.util.Date;

public class AloMundo {

	public static Long numero;

	public static void main(String[] args) {

		Aluno a1 = new Aluno(new Long(54321), "Tião", "98798798700", new Date());
		Aluno a2 = new Aluno(new Long(91827), "Danilo", "23421652400",
				new Date());
		Aluno a3 = new Aluno(new Long(76543), "Bruno", "32109287500",
				new Date());
		Aluno a4 = new Aluno(87465L, "32109287500");
		Professor p1 = new Professor("Manoel", "09287536900", new BigDecimal(
				123456));
		Professor p2 = new Professor("Alonso", "98765432100");
		
		

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(p1);
		System.out.println(p2);

		/*
		 * int i =0;
		 * 
		 * while (i < 10) {
		 * 
		 * System.out.println(i+1+ " Alo Mundo."); i++;
		 * 
		 * }
		 */

	}
}
