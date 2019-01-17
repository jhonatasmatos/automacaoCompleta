/**
 * Classe base para movimentar a mesma instância dos browsers entre as classes page
 * 
 * @author Jhonatas Santos Matos
 */

package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
	protected WebDriver navegador;
	
	public BasePage(WebDriver navegador) {
		this.navegador = navegador;
	}
}
