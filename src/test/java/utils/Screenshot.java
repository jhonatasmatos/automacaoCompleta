/**
 * Classe responsável por gerenciar as screenshots
 * 
 * @author Jhonatas Santos Matos
 */

package utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public static void capturarTela(WebDriver navegador, String arquivo) {
		File screenshot = ((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(screenshot, new File(arquivo));
		} catch (Exception e) {
			System.out.print("Houve problema ao copiar o arquivo para a pasta " + e.getMessage());
		}
	}
}
