package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class TesteJava {
	
	Elementos e = new Elementos();
	Metodos m = new Metodos();
	
	@Dado("que eu esteka na tela de login do site {string}")
	public void que_eu_esteka_na_tela_de_login_do_site(String url) {
	   m.abrirnavegador(url);
	}

	@Quando("preencho os campos com usuario e senha")
	public void preencho_os_campos_com_usuario_e_senha() throws InterruptedException {
		m.pause(750);
		m.preencher(e.getNome(),"standard_user" );
		m.pause(750);
		m.preencher(e.getSenha(),"secret_sauce");
	    
	}
	
	@Quando("clico em login")
	public void clico_em_login() throws InterruptedException {
		m.pause(750);
		m.clicar(e.getBotao());
	  
	}

	@Entao("devo logar no site com sucesso")
	public void devo_logar_no_site_com_sucesso() throws InterruptedException {
		m.pause(750);
		m.fechar(null);
	}

}
