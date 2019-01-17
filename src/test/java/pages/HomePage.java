/**
 * Classe para o mapeamento dos elementos contidos na página home após login
 * 
 * @author Jhonatas Santos Matos
 */

package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver navegador) {
		super(navegador);
	}
	
	/**
	 * Método que compara a mensagem retornada pelo sistema com a mensagem informada na documentação 
	 * @param msgLoginSucesso String - mensagem de sucesso após login
	 */
	
	public void validarLoginComSucesso(String msgLoginSucesso) {
		String msgLoginComSucesso = navegador.findElement(By.cssSelector("div[role=alert]")).getText();
		assertEquals(msgLoginSucesso, msgLoginComSucesso);
	}

}
