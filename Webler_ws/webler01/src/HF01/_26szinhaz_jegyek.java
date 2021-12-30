package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * A magyar kult�ra napj�n 3 program k�z�l v�laszthatnak a di�kok. A sz�nh�zi jegy �ra 2500 Ft-ba
ker�l, a komolyzenei koncert jegy�nek �ra 2200 Ft, a n�pzenei koncert jegy�nek �ra pedig 2400
Ft. Olvasd be, hogy az iskol�b�l melyik programra h�nyan jelentkeznek, �s add meg, hogy
�sszesen mennyibe fognak a jegyek ker�lni!
 */

public class _26szinhaz_jegyek {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//jegy�rak
		int theatreTicketPrice = 2500;
		int orchestraTicketPrice = 2200;
		int folkTicketPrice = 2400;
		
		//r�sztvev�k bek�r�se esem�nyek alapj�n
		System.out.print("H�nyan jelentkeztek sz�nh�zba a di�kok k�z�l?");
		int theatreAttended = Integer.parseInt(br.readLine());
		System.out.print("H�nyan jelentkeztek komolyzenei el�ad�sra a di�kok k�z�l?");
		int orchestraAttended = Integer.parseInt(br.readLine());
		System.out.print("H�nyan jelentkeztek n�pzenei el�ad�sra a di�kok k�z�l?");
		int folkAttended = Integer.parseInt(br.readLine());
		
		//egyes esem�nyekre az �sszes k�lts�g
		int sumTheatreCost = theatreAttended * theatreTicketPrice;
		int sumOrchestraCost = orchestraAttended * orchestraTicketPrice;
		int sumFolkCost = folkAttended * folkTicketPrice;
		//�sszes k�lts�g
		int sumCost = sumFolkCost + sumOrchestraCost + sumTheatreCost;

		
		System.out.println("Sz�nh�zra " + theatreAttended + " tanul�, komolyzenei el�ad�sra "
				+ orchestraAttended + " tanul�, n�pzenei el�ad�sra pedig " + folkAttended + " jelentkezett.");
		System.out.println("A jegyek �sszesen " + sumCost + " forintba fognak ker�lni.");
		
		br.close();
		
	}

}
