/**
 * Classe responsável por fazer a tratativa das horas
 * para incluir no nome do screenshot
 * 
 * @author Jhonatas Santos Matos
 */

package utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Generator {
	public static String dataHoraParaArquivo(){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("ddMMyyyy").format(ts);
    }
}
