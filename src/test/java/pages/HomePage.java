/**
 * Classe para o mapeamento dos elementos contidos na p�gina home ap�s login
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
	 * M�todo que compara a mensagem retornada pelo sistema com a mensagem informada na documenta��o 
	 * @param msgLoginSucesso String - mensagem de sucesso ap�s login
	 */
	
	public void validarLoginComSucesso(String msgLoginSucesso) {
		String msgLoginComSucesso = navegador.findElement(By.cssSelector("div[role=alert]")).getText();
		assertEquals(msgLoginSucesso, msgLoginComSucesso);
	}

}
