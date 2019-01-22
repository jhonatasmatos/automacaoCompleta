/**
 * Classe para o mapeamento dos elementos contidos na página home após login
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
	 * Método que compara a mensagem retornada pelo sistema com a mensagem informada na documentação 
	 * @param msgLoginSucesso String - mensagem de sucesso após login
	 */
	
	public void validarLoginComSucesso(String msgLoginSucesso) {
		String msgLoginComSucesso = navegador.findElement(By.cssSelector("div[role=alert]")).getText();
		assertEquals(msgLoginSucesso, msgLoginComSucesso);
	}
	
	/**
	 * Método responsável para tirar screenshot e salvar no diretório informado
	 * @param nomeTest Objeto - com os atributos de TastName
	 */
	
	public void tirarEvidencia(TestName nomeTest) {
		String caminhoArquivo = "C:\\eclipse-web\\automacaoCompleta\\src\\test\\resources\\evidencias\\";
		String nomeMetodo = nomeTest.getMethodName();
		String screenshotArquivo = caminhoArquivo + Generator.dataHoraParaArquivo() + "_" + nomeMetodo +".png";
        Screenshot.capturarTela(navegador, screenshotArquivo);
	}

}
