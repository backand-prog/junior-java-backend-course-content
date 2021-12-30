package currencyConverter;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Data {

	public static String[] currencies = {"Forint", "Euro", "Dollar", "Czech Crown", "Zloty", "Pound", "Yen"};
	

	public static Map<String, String> currencyCodes = Stream.of(new String[][] {

		  { "Forint", "HUF" },
		  { "Euro", "EUR" },
		  {	"Dollar", "USD"},
		  { "Czech Crown", "CZK" },
		  { "Zloty", "PLN" },
		  { "Pound", "GBP" },
		  { "Yen", "JPY" },

		}).collect(Collectors.toMap(x -> x[0], x -> x[1]));

}