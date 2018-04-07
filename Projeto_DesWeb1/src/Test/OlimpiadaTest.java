package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Model.AnoOlimpiada;
import Model.Modalidade;
import Model.Olimpiada;
import Model.Pais;
import Service.OlimpiadaService;

public class OlimpiadaTest {
	AnoOlimpiada aO;
	Olimpiada ol;
	OlimpiadaService oS;
	Pais p;
	Modalidade m;
	static int idAno = 0;
	static int idPais = 0;
	static int idModalidade = 0;
	
	
	@Test
	public void test00Carregar() {
		System.out.println("carregar");
		oS = new OlimpiadaService();
		
		ol = new Olimpiada();
		p = new Pais();
		m = new Modalidade();
		oS.carregarOlimpiada(p, m, aO);assertEquals("testa inclusao", ol);
	}
	@Test
	public void test01Criar() {
		System.out.println("criar");
		ol = new Olimpiada();
		oS = new OlimpiadaService();
		p = new Pais();
		m = new Modalidade();
		aO = new AnoOlimpiada();
		oS.criarOlimpiada(p, m, aO);
		idAno = aO.getId();
		idPais = p.getId();
		idModalidade = m.getId();
		System.out.println(idAno);
		System.out.println(idPais);
		System.out.println(idModalidade);
		
		assertEquals("testa criacao", ol);
	}
	@Test
	public void test02Atualizar() {
		System.out.println("atualizar");
		
		oS = new OlimpiadaService();
		m = new Modalidade();
		p = new Pais();
		aO = new AnoOlimpiada();
		ol = new Olimpiada();
		
		
		m.setPrata(3);
		oS.atualizarOlimpiada(p, m, aO);
		oS.carregarOlimpiada(p, m, aO);
		
		assertEquals("testa atualizacao", ol);
	}

	
}
