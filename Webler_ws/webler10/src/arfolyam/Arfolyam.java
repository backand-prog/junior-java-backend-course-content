package arfolyam;

import java.rmi.RemoteException;

import hu.mnb.www.webservices.MNBArfolyamServiceSoapProxy;
import hu.mnb.www.webservices.MNBArfolyamServiceSoap_GetCurrencies_StringFault_FaultMessage;

public class Arfolyam {

	public static void main(String[] args) {
		
		MNBArfolyamServiceSoapProxy afObj = new MNBArfolyamServiceSoapProxy();
		String arfolyamok;
		
		try {
			arfolyamok = afObj.getCurrencies();
			System.out.println(arfolyamok);
			System.out.println(afObj.getExchangeRates("2019-12-20", "2019-12-20", "EUR"));
		
			String arfolyamEURString = afObj.getExchangeRates("2019-12-20", "2019-12-20", "EUR");
			String[] arfolyamEURSplit = arfolyamEURString.split("curr=\"EUR\">");
			System.out.println(arfolyamEURSplit[1]);
			String[] arfolyamEURSplit2 = arfolyamEURSplit[1].split("</Rate>");
			
			System.out.println(arfolyamEURSplit2[0]);
			
			double eur = Double.parseDouble(arfolyamEURSplit2[0].replace(',', '.'));
			System.out.println("12 EUR ennyi volt (2019-12-20 : " + eur*12);
			System.out.println(afObj.getCurrentExchangeRates());
			
			
		} catch (MNBArfolyamServiceSoap_GetCurrencies_StringFault_FaultMessage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
