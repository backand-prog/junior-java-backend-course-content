package currencyConverter;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Map;
import java.util.Optional;

import hu.mnb.www.webservices.MNBArfolyamServiceSoapProxy;
import hu.mnb.www.webservices.MNBArfolyamServiceSoap_GetExchangeRates_StringFault_FaultMessage;

public class ConvertCurrencies {

	
	private final String forint = "Forint";
	private MNBArfolyamServiceSoapProxy afObj = new MNBArfolyamServiceSoapProxy();

	public Double changeCurrency (String amount, String currencyCodeFrom, String currencyCodeTo, Calendar date) {
		Double result = 0.0;
		Double exchangeRateFrom = 0.0;
		Double exchangeRateTo = 0.0;

		try {


			/* The program running with the actual date
			Date date1 = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
		    String currentDate = formatter.format(date1).toString();    
			*/

			String dateString = new ConvertCurrencies().dateString(date);

			if (!currencyCodeFrom.equals(forint)) {

				currencyCodeFrom = getExchangeFrom(currencyCodeFrom);
					exchangeRateFrom = Double.parseDouble(afObj.getExchangeRates(dateString, dateString, currencyCodeFrom)
							.split("curr=\"" + currencyCodeFrom +"\">")[1]
									.split("</Rate>")[0]
											.replace(",", "."));
			
						
			}

			if (!currencyCodeTo.equals(forint)) {
				
				currencyCodeTo = getExchangeTo(currencyCodeTo);
				exchangeRateTo = Double.parseDouble(afObj.getExchangeRates(dateString, dateString, currencyCodeTo)
						.split("curr=\"" + currencyCodeTo +"\">")[1]
								.split("</Rate>")[0]
										.replace(",", "."));

			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (MNBArfolyamServiceSoap_GetExchangeRates_StringFault_FaultMessage e) {	
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		if (currencyCodeFrom.equals(forint) && currencyCodeTo.equals(forint)) {
			result = Double.parseDouble(amount);
		} else if (!currencyCodeFrom.equals(forint) && currencyCodeTo.equals(forint)) {
			result = Double.parseDouble(amount) * exchangeRateFrom;
		} else if (!currencyCodeTo.equals(forint) && currencyCodeFrom.equals(forint)) {
			result = Double.parseDouble(amount) / exchangeRateTo;
		} else if (!currencyCodeFrom.equals(forint) && !currencyCodeTo.equals(forint)) {
			Double amountInFt = exchangeRateFrom * Double.parseDouble(amount);
			result = amountInFt / exchangeRateTo;
		}
		
		return result;

	}

	public String dateString (Calendar date) {
		String dateString = "";

		Integer year = date.get(date.YEAR);
		Integer month = date.get(date.MONTH);
		Integer day = date.get(date.DAY_OF_MONTH);

		month = month + 1;

		String monthString = month.toString();


		if (monthString.length() == 1) {
			monthString = "0" + monthString;
		}

		dateString = year.toString() + "-" + monthString + "-" + day.toString();


		return dateString;

	}

	public String getExchangeFrom(String currency) {

		 String currencyCode = Data.currencyCodes.entrySet()
				.stream()
				.filter(x -> x.getKey().equals(currency))
				.map(Map.Entry::getValue)
				.findFirst()
				.map(Object::toString)
				.orElse("")
				;

		return currencyCode;

	}

public String getExchangeTo(String currency) {

	 String currencyCode = Data.currencyCodes.entrySet()
				.stream()
				.filter(x -> x.getKey().equals(currency))
				.map(Map.Entry::getValue)
				.findFirst()
				.map(Object::toString)
				.orElse("")
				;

		return currencyCode;

	}

}