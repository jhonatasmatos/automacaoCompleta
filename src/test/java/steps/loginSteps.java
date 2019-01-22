/**
 * Classe para a execução dos testes de login 
 * utilizando arquivo .xls para armazenamento de massa de dados e DDT para execução
 * 
 * @author Jhonatas Santos Matos
 */

package steps;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.LoginPage;
import utils.Web;

@RunWith(DataDrivenTestRunner.class)
// Carregando dados armazenados em .xls
// @DataLoader(filePaths = {"massadedados//massadedados.xls"}, loaderType=LoaderType.EXCEL)

// Carregando dados armazenados em .csv
@DataLoader(filePaths = {"massadedados//massadedados.csv"})
public class loginSteps {
	private WebDriver navegador;
	private LoginPage loginPage;
	private HomePage homePage;
	
	@Rule
	public TestName nomeTest = new TestName();
	
	/**
	 * Método responsável por fazer o setup da execução dos testes e iniciar a instância das pages
	 */
	
	@Before
	public void setUp() {
		navegador = Web.abrirBrowser();
		loginPage = new LoginPage(navegador);
		homePage = new HomePage(navegador);
	}
	
	/**
	 * Método responsável por fechar o browser após o termino de cada execução
	 */
	
	@After
	public void tearDown() {
		navegador.close();
	}
	
	/**
	 * Método que realiza o teste de login com sucesso
	 * @param email String - email de login do usuário
	 * @param senha String - senha de acesso do usuário
	 * @param msgLoginComSucesso String - mensagem exibida na tela Home após efetuar o login com sucesso
	 */
	
	@Test
	public void testRealizarLoginComSucesso(@Param(name="email")String email, 
											@Param(name="senha")String senha, @Param(name="mensagemLogin")String msgLoginComSucesso) {
		
		loginPage.realizarLogin(email, senha);
		homePage.validarLoginComSucesso(msgLoginComSucesso);
		homePage.tirarEvidencia(nomeTest);
	}
}
