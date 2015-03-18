package br.unibh;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.unibh.entidades.Aluno;
import br.unibh.entidades.Professor;
import br.unibh.persistencias.AlunoDAO;
import br.unibh.persistencias.ProfessorDAO;

public class Testes {

	@Before
	public void preparaBanco() {
		AlunoDAO dao = new AlunoDAO();
		Aluno a1 = new Aluno(null, new Long(1234), "Danilo Moraes",
				"07158208699", new Date());
		Aluno a2 = new Aluno(null, new Long(5789), "Bruno Cesar",
				"98176254322", new Date());
		Aluno a3 = new Aluno(null, new Long(1357), "Nat� Lopes", "12345678900",
				new Date());
		dao.insert(a1);
		dao.insert(a2);
		dao.insert(a3);
	}

	@After
	public void limpaBanco() {
		AlunoDAO dao = new AlunoDAO();
		dao.clean();
	}

	@Test
	public void testeBuscarAluno() {

		AlunoDAO dao = new AlunoDAO();
		Aluno a = dao.find(1L);
		Assert.assertEquals(a.getCpf(), "07158208699");
	}

	@Test
	public void testeInsertAluno() {

		AlunoDAO dao = new AlunoDAO();
		Aluno a = new Aluno(null, 12321L, "T�maz Gonzaga", "34234342",
				new Date());
		dao.insert(a);
		Aluno a2 = dao.find(4L);
		Assert.assertEquals(a2.getCpf(), "34234342");
	}

	@Test
	public void testeAtualizaAluno() {
		AlunoDAO dao = new AlunoDAO();
		Aluno a = dao.find("07158208699");
		a.setNome("Ti�o");
		dao.update(a);
		Aluno a2 = dao.find("07158208699");
		Assert.assertEquals(a2.getNome(), "Ti�o");
	}

	@Test
	public void testeExcluirAluno() {
		AlunoDAO dao = new AlunoDAO();
		Aluno a = dao.find("07158208699");
		dao.delete(a);
		List<Aluno> lista = dao.findAll();
		Assert.assertEquals(lista.size(), 2);
	}

	@Test
	public void testeSelecionarTodosAluno() {
		AlunoDAO dao = new AlunoDAO();
		List<Aluno> lista = dao.findAll();
		Assert.assertEquals(lista.size(), 3);
	}

	@Before
	public void preparaBancoProfessor() {
		ProfessorDAO dao = new ProfessorDAO();
		Professor p1 = new Professor(null, "Gilberto", "99999999999",
				new BigDecimal(123456));
		Professor p2 = new Professor(null, "Habib", "88888888888",
				new BigDecimal(123456));
		Professor p3 = new Professor(null, "Pollyanna", "77777777777",
				new BigDecimal(123456));
		dao.insert(p1);
		dao.insert(p2);
		dao.insert(p3);
	}

	@After
	public void limpaBancoProfessor() {
		ProfessorDAO dao = new ProfessorDAO();
		dao.clean();
	}

	@Test
	public void testeBuscarProfessor() {

		ProfessorDAO dao = new ProfessorDAO();
		Professor a = dao.find(2L);
		Assert.assertEquals(a.getCpf(), "88888888888");
	}

	@Test
	public void testeInsertProfessor() {

		ProfessorDAO dao = new ProfessorDAO();
		Professor p = new Professor(null, "T�maz Gonzaga", "34234342",
				new BigDecimal("50000"));
		dao.insert(p);
		Professor p2 = dao.find(4L);
		Assert.assertEquals(p2.getCpf(), "34234342");
	}

	@Test
	public void testeAtualizaProfessor() {
		ProfessorDAO dao = new ProfessorDAO();
		Professor p = dao.find("99999999999");
		p.setNome("Leocadio");
		dao.update(p);
		Professor p1 = dao.find("99999999999");
		Assert.assertEquals(p1.getNome(), "Leocadio");
	}

	@Test
	public void testeExcluirProfessor() {
		ProfessorDAO dao = new ProfessorDAO();
		Professor p = dao.find("99999999999");
		dao.delete(p);
		List<Professor> lista = dao.findAll();
		Assert.assertEquals(lista.size(), 2);
	}

	@Test
	public void testeSelecionarTodosProfessor() {
		ProfessorDAO dao = new ProfessorDAO();
		List<Professor> lista = dao.findAll();
		Assert.assertEquals(lista.size(), 3);
	}

}