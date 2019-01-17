/**
 * Classe para o mapeamento dos elementos contidos na p�gina de login
 * 
 * @author Jhonatas Santos Matos
 */

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver navegador) {
		super(navegador);
	}

	/**
	 * M�todo para mapeamento do campo email e preenchimento do email informado pelo usu�rio
	 * @param email String - email informado pelo usu�rio para efetuar login
	 */
	
	public void preencherEmail(String email) {
		navegador.findElement(By.cssSelector(".form-group > input[name=email]")).sendKeys(email);
	}
	
	/**
	 * M�todo para mapeamento do campo senha e preenchimento da senha informada pelo usu�rio
	 * @param senha String - senha informada pelo usu�rio para efetuar login
	 */

	public void preencherSenha(String senha) {
		navegador.findElement(By.cssSelector(".form-group > input[name=senha]")).sendKeys(senha);
	}
	
	/**
	 * M�todo que mapeia e clica em Entrar ap�s o preenchimento do email e senha do usu�rio
	 */
	
	public void clicarEntrar() {
		navegador.findElement(By.cssSelector("button[type=submit]")).click();
	}
	
	/**
	 * M�todo responsavel por chamar os m�todos anteriores e executar o login
	 * @param email String - email fornecido pelo usu�rio
	 * @param senha String - senha fornecida pelo usu�rio
	 * @return
	 */
	
	public HomePage realizarLogin(String email, String senha) {
		preencherEmail(email);
		preencherSenha(senha);
		clicarEntrar();
		
		return new HomePage(navegador);
	}

}
