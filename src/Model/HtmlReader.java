package Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HtmlReader {

    public static String reader(String APIurl) throws MalformedURLException, IOException {
    URL url = new URL(APIurl);
    URLConnection uc = url.openConnection();
    uc.connect();
    String contenido;
        try ( //Creamos el objeto con el que vamos a leer
                BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()))) {
            String inputLine;
            contenido = "";
            while ((inputLine = in.readLine()) != null) {
                contenido += inputLine + "\n";
            }   } 
    return contenido;
    }
}

