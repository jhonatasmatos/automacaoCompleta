/**
 * Classe para o mapeamento dos elementos contidos na p�gina home ap�s login
 * 
 * @author Jhonatas Santos Matos
 */

package pages;

import static org.junit.Assert.assertEquals;

import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.Generator;
import utils.Screenshot;

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
	
	/**
	 * M�todo respons�vel para tirar screenshot e salvar no diret�rio informado
	 * @param nomeTest Objeto - com os atributos de TastName
	 */
	
	public void tirarEvidencia(TestName nomeTest) {
		String caminhoArquivo = "C:\\eclipse-web\\automacaoCompleta\\src\\test\\resources\\evidencias\\";
		String nomeMetodo = nomeTest.getMethodName();
		String screenshotArquivo = caminhoArquivo + Generator.dataHoraParaArquivo() + "_" + nomeMetodo +".png";
        Screenshot.capturarTela(navegador, screenshotArquivo);
	}

}
