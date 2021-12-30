package hf02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class _19mozi {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int[][] cinemaRoom = createCinemaRoom(30, 40);
		printRoom(cinemaRoom);
		System.out.println("Az eddigi összes bevétel: " + incomeSoFar(cinemaRoom) + " Ft.");
		System.out.println("Eddig ennyi jegyet nem adtak még el: " + ticketsNotSold(cinemaRoom));
		System.out.println(soldTicketsDiscountPercentage(cinemaRoom) + "% a nem eladott jegyek százalékos aránya.");
		checkFreeAndReserve(cinemaRoom);
		freeSeatsInRow8(cinemaRoom);
		System.out.println("Az elsõ és utolsó két sor szabad székeinek száma: " + freeSeatsInFirstAndLast2Rows(cinemaRoom));
		moreFullPriceRows(cinemaRoom);
		firstOrSecond20RowsMoreIncome(cinemaRoom);
		statSoldPerRow(cinemaRoom);
		threeBorderingEmptyInRow(cinemaRoom);
		
	}
	
public static void threeBorderingEmptyInRow (int [][] room ) {
		
		for (int i = 0; i < room.length; i++) {
			int emptySeatCounter = 0;
			
			for (int j = 0; j < room[i].length; j++) {
				if (room[i][j] == 1) {
					emptySeatCounter = 0;
				} else if (room[i][j] == 0) {
					emptySeatCounter++;
				}
				
				if (emptySeatCounter > 2) {
					System.out.println((i+1) + ". sorban van egymás mellett három üres hely.");
					break;
				}
				
			}
					
		}

	}
	
	public static void statSoldPerRow (int[][] room) {
		for (int i = 0; i < room.length; i++) {
			int sumSoldInRow = 0;
			int sumSoldFullPrice = 0;
			int sumSoldDiscount = 0;
			
			for (int j = 0; j < room[i].length; j++) {
				if (room[i][j] == 1 || room[i][j] == 2) {
					sumSoldInRow++;
					if (room[i][j] == 1) {
						sumSoldFullPrice++;
					} else if (room[i][j] == 2) {
						sumSoldDiscount++;
					}
					
				}

			}

			int seatSoldInRowPercentage = (int)(( (double)sumSoldInRow / (double)room[i].length ) * 100);
			int seatSoldInRowFullPricePerc = (int)(( (double)sumSoldFullPrice / (double)room[i].length ) * 100);
			int seatSoldInRowDiscountPerc = (int)(( (double)sumSoldDiscount / (double)room[i].length ) * 100);
			
			System.out.println((i + 1) + ". sorban a helyek " + seatSoldInRowPercentage + " százalékát adták el.");
			System.out.println("A sorban eladott felnõtt jegyek százaléka: " + seatSoldInRowFullPricePerc + "%");
			System.out.println("A sorban eladott kedvezményes jegyek százaléka: " + seatSoldInRowDiscountPerc + "%");
		}
			
	
	}
	
	public static void firstOrSecond20RowsMoreIncome (int[][] room) {
		System.out.println();
		int fullPrice = 1600;
		int discountPrice = 1200;
		
		int fist20rowsIncome = 0;	
		
		for (int i = 0; i < room.length/2; i++) {
			for (int j = 0; j < room.length; j++) {
				if (room[i][j] == 1) {
					fist20rowsIncome += fullPrice;
				} else if (room[i][j] == 2) {
					fist20rowsIncome += discountPrice;
				}
			}
		}
		
		int second20rowsIncome = 0;
		
		for (int i = room.length/2; i < room.length; i++) {
			for (int j = 0; j < room.length; j++) {
				if (room[i][j] == 1) {
					second20rowsIncome += fullPrice;
				} else if (room[i][j] == 2) {
					second20rowsIncome += discountPrice;
				}
			}
		}
		
		if (fist20rowsIncome > second20rowsIncome) {
			System.out.println("Az elsõ húsz sor bevélete (" + fist20rowsIncome + " Ft) nagyobb, mint a második húsz sor bevtétele (" + second20rowsIncome + " Ft)");
		} else if (fist20rowsIncome < second20rowsIncome) {
			System.out.println("A második húsz sor bevélete (" + second20rowsIncome + " Ft) nagyobb, mint a második húsz sor bevtétele (" + fist20rowsIncome + " Ft)");
		} else {
			System.out.println("A bevételük egyenlõ: " + fist20rowsIncome + " Ft.");
		}
		
	}
	
	public static void moreFullPriceRows (int[][] room) {
		System.out.print("Ezekben a sorokban adtak el több felnõttjegyet, mint kedvezményes jegyet: ");
		for (int i = 0; i < room.length; i++) {
			int fullPrice = 0;
			int discountPrice = 0;
			for (int j = 0; j < room.length; j++) {
				if (room[i][j] == 1) {
					fullPrice++;
				} else if (room[i][j] == 2) {
					discountPrice++;
				}
				
			}
			
			if (fullPrice > discountPrice) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void freeSeatsInRow8 (int[][] room) {
		
		for (int i = 7; i < 8; i++) {
			System.out.print("A nyolcadik sor üres székei: ");
			for (int j = 0; j < room.length; j++) {
				if (room[i][j] == 0) {
					System.out.print((j+1) + " ");
				}
			}
		}
	}
	
	
	public static int freeSeatsInFirstAndLast2Rows (int[][] room) {
		System.out.println();
		
		int freeSeats = 0;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < room.length; j++) {
				if (room[i][j] == 0) {
					freeSeats++;
				}
			}
			
		}
		
		for (int i = room.length - 3; i < room.length; i++) {
			for (int j = 0; j < room.length; j++) {
				if (room[i][j] == 0) {
					freeSeats++;
				}
			}
			
		}
		
		return freeSeats;
	}
	
	public static void checkFreeAndReserve(int[][] room) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Adja meg a sor számát: ");
		int rowNum = Integer.parseInt(br.readLine()) - 1;
		System.out.print("Adja meg a szék számát: ");
		int seatNum = Integer.parseInt(br.readLine()) - 1;
		
		if (room[rowNum][seatNum] == 1 || room[rowNum][seatNum] == 2) {
			System.out.println("A megadott hely: " + (rowNum + 1)  + ". sor, " + (seatNum + 1) + ". szék. A hely már foglalt.");
		} else {
			System.out.print("A megadott hely: " + (rowNum + 1) + ". sor, " + (seatNum + 1) + ". szék. A hely még üres.\nKérem adja meg, hogy milyen típusú jegyet szeretne foglalni (1-2): ");
			int seatBook = Integer.parseInt(br.readLine());
			room[rowNum][seatNum] = seatBook;
			System.out.println("Sikeres foglalás.");
		}
		
	}
		
		
	
	public static int soldTicketsDiscountPercentage (int[][] room) {
		int allTickets = 0;
		for (int i = 0; i < room.length; i++) {
			for (int j = 0; j < room[i].length; j++) {
				allTickets++;
			}
		}
		
		int discountTickets = 0;
		
		for (int i = 0; i < room.length; i++) {
			for (int j = 0; j < room[i].length; j++) {
				if (room[i][j] == 0) {
					discountTickets++;
				}
			}
		}
		
		int discountPercentage = (int)(((double)discountTickets / (double)allTickets) * 100);
		
		return discountPercentage;
		
	}
	
	public static int ticketsNotSold (int[][] room) {
		int notSoldCounter = 0;
		
		for (int i = 0; i < room.length; i++) {
			for (int j = 0; j < room[i].length; j++) {
				if (room[i][j] == 0) {
					notSoldCounter++;
				}
			}
		}
		
		return notSoldCounter;
	}
	
	public static int incomeSoFar (int[][] room) {
		int income = 0;
		int fullPrice = 1600;
		int discountPrice = 1200;
		
		for (int i = 0; i < room.length; i++) {
			for (int j = 0; j < room[i].length; j++) {
				if (room[i][j] == 1) {
					income+=fullPrice;
				} else if (room[i][j] == 2) {
					income+=discountPrice;
				}
			}
			
		}
		
		return income;
	}
	
	public static void printRoom (int[][] room) {
		
		for (int i = 0; i < room.length; i++) {
			System.out.print("\t");
			for (int j = 0; j < room[0].length; j++) {
				System.out.print((i+1) + "sz.\t");
				i++;
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < room.length; i++) {
			System.out.print((i + 1) + ". sor: ");
			for (int j = 0; j < room[i].length; j++) {
				
				System.out.print(room[i][j] + "\t");
			}
			
			System.out.println();
		}
		
	}
	
	public static int[][] createCinemaRoom (int rowNum, int seatNum) {
		
		int[][] cinemaRoom = new int[rowNum][seatNum];
		
		Random r = new Random();
		
		for (int i = 0; i < cinemaRoom.length; i++) {
			for (int j = 0; j < cinemaRoom[i].length; j++) {
				cinemaRoom[i][j] = r.nextInt(3);
						
			}
		}
		
		return cinemaRoom;
		
	}

}
