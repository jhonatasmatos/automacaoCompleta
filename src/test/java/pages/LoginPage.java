/**
 * Classe para o mapeamento dos elementos contidos na página de login
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
	 * Método para mapeamento do campo email e preenchimento do email informado pelo usuário
	 * @param email String - email informado pelo usuário para efetuar login
	 */
	
	public void preencherEmail(String email) {
		navegador.findElement(By.cssSelector(".form-group > input[name=email]")).sendKeys(email);
	}
	
	/**
	 * Método para mapeamento do campo senha e preenchimento da senha informada pelo usuário
	 * @param senha String - senha informada pelo usuário para efetuar login
	 */

	public void preencherSenha(String senha) {
		navegador.findElement(By.cssSelector(".form-group > input[name=senha]")).sendKeys(senha);
	}
	
	/**
	 * Método que mapeia e clica em Entrar após o preenchimento do email e senha do usuário
	 */
	
	public void clicarEntrar() {
		navegador.findElement(By.cssSelector("button[type=submit]")).click();
	}
	
	/**
	 * Método responsavel por chamar os métodos anteriores e executar o login
	 * @param email String - email fornecido pelo usuário
	 * @param senha String - senha fornecida pelo usuário
	 * @return
	 */
	
	public HomePage realizarLogin(String email, String senha) {
		preencherEmail(email);
		preencherSenha(senha);
		clicarEntrar();
		
		return new HomePage(navegador);
	}

}
