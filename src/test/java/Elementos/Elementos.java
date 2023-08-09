package Elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By nome = By.id("user-name");
	private By senha = By.id("password");
	private By botao = By.id("login-button");
	
	
	public By getNome() {
		return nome;
	}
	public By getSenha() {
		return senha;
	}
	public By getBotao() {
		return botao;
	}

}
