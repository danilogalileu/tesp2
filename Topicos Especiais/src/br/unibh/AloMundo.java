package br.unibh;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import br.unibh.entidades.Aluno;
import br.unibh.entidades.Professor;
import br.unibh.persistencias.JDBCUtil;

public class AloMundo {

	public static Long numero;

	public static void main(String[] args) {

		Aluno a1 = new Aluno(new Long(1), new Long(1234), "Danilo Moraes",
				"07158208699", new Date());
		Aluno a2 = new Aluno(new Long(2), new Long(5789), "Bruno Cesar",
				"98176254322", new Date());
		Aluno a3 = new Aluno(new Long(3), new Long(1357), "Nat� Lopes",
				"12345678900", new Date());
		Aluno a4 = new Aluno(new Long(4), 7193L, "Nat�");
		Professor p1 = new Professor(new Long(5), "Tite", "98765432561",
				new BigDecimal(123456));
		Professor p2 = new Professor(new Long(6), "Cuca", "90185142810");

		System.out.println("BONUS ==== " + Professor.BONUS);
		System.out.println(Aluno.verificaMatricula("11314491"));

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(p1);
		System.out.println(p2);

		try {
			ResultSet res = JDBCUtil.getConnection()
					.prepareStatement("select * from tb_aluno").executeQuery();

			while (res.next()) {
				System.out.println(res.getLong("id") + "\t"
						+ res.getString("nome"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}