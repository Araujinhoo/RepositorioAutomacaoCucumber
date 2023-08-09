package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	
	WebDriver driver;
	
	public void abrirnavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	public void clicar (By elemento) {
		driver.findElement(elemento).click();
	}
	
	public void pause (int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}
	
	public void preencher (By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
	
	public void fechar (By elemento) {
		driver.quit();
	}


}
