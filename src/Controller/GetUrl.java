package Controller;
/**
 * OpenExchangeRates.Com service
 */
public class GetUrl{
	public static String getUrlString(String apiKey, String from, String to) {
		return "https://free.currconv.com/api/v7/convert?q=" + from + "_" + to + "&compact=ultra&apiKey="+ "f50bedde5636a7304af2";
	}	
}