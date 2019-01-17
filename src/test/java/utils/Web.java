/**
 * Classe genérica para criação de métodos utilizados no setup das execuções de teste
 * 
 * @author Jhonatas Santos Matos
 */

package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	
	/**
	 * Método responsável para configurar e iniciar a instância do navegador
	 * @return navegador do tipo WebDriver
	 */
	public static WebDriver abrirBrowser() {
		final String URL = "http://srbarriga.herokuapp.com/login";
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\drivers\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		
		navegador.manage().window().maximize();
		navegador.get(URL);
		
		return navegador;
	}
}
