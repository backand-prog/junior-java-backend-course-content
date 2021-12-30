package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * A magyar kultúra napján 3 program közül választhatnak a diákok. A színházi jegy ára 2500 Ft-ba
kerül, a komolyzenei koncert jegyének ára 2200 Ft, a népzenei koncert jegyének ára pedig 2400
Ft. Olvasd be, hogy az iskolából melyik programra hányan jelentkeznek, és add meg, hogy
összesen mennyibe fognak a jegyek kerülni!
 */

public class _26szinhaz_jegyek {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//jegyárak
		int theatreTicketPrice = 2500;
		int orchestraTicketPrice = 2200;
		int folkTicketPrice = 2400;
		
		//résztvevõk bekérése események alapján
		System.out.print("Hányan jelentkeztek színházba a diákok közül?");
		int theatreAttended = Integer.parseInt(br.readLine());
		System.out.print("Hányan jelentkeztek komolyzenei elõadásra a diákok közül?");
		int orchestraAttended = Integer.parseInt(br.readLine());
		System.out.print("Hányan jelentkeztek népzenei elõadásra a diákok közül?");
		int folkAttended = Integer.parseInt(br.readLine());
		
		//egyes eseményekre az összes költség
		int sumTheatreCost = theatreAttended * theatreTicketPrice;
		int sumOrchestraCost = orchestraAttended * orchestraTicketPrice;
		int sumFolkCost = folkAttended * folkTicketPrice;
		//összes költség
		int sumCost = sumFolkCost + sumOrchestraCost + sumTheatreCost;

		
		System.out.println("Színházra " + theatreAttended + " tanuló, komolyzenei elõadásra "
				+ orchestraAttended + " tanuló, népzenei elõadásra pedig " + folkAttended + " jelentkezett.");
		System.out.println("A jegyek összesen " + sumCost + " forintba fognak kerülni.");
		
		br.close();
		
	}

}
