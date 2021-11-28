package Controller;

import Model.HtmlReader;
import java.io.IOException;

public class Operations{
    
    public static double Exchange(String apiKey, String from, String to) throws IOException{
        String prueba = HtmlReader.reader(GetUrl.getUrlString(apiKey,from,to));
        String Value = getExchangeValue(prueba);
        return Double.parseDouble(Value);
    }
    public static String getExchangeValue(String APIString){
        char [] cadena = APIString.toCharArray();
        String ExchangeValue = "";
        for (int i = 0; cadena.length > i;i++){
            if(Character.isDigit(cadena[i]) || cadena[i]=='.'){
                ExchangeValue += cadena[i];
            }
        }
        return ExchangeValue;
    }
}
