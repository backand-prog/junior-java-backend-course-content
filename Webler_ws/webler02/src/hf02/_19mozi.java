package hf02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class _19mozi {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int[][] cinemaRoom = createCinemaRoom(30, 40);
		printRoom(cinemaRoom);
		System.out.println("Az eddigi �sszes bev�tel: " + incomeSoFar(cinemaRoom) + " Ft.");
		System.out.println("Eddig ennyi jegyet nem adtak m�g el: " + ticketsNotSold(cinemaRoom));
		System.out.println(soldTicketsDiscountPercentage(cinemaRoom) + "% a nem eladott jegyek sz�zal�kos ar�nya.");
		checkFreeAndReserve(cinemaRoom);
		freeSeatsInRow8(cinemaRoom);
		System.out.println("Az els� �s utols� k�t sor szabad sz�keinek sz�ma: " + freeSeatsInFirstAndLast2Rows(cinemaRoom));
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
					System.out.println((i+1) + ". sorban van egym�s mellett h�rom �res hely.");
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
			
			System.out.println((i + 1) + ". sorban a helyek " + seatSoldInRowPercentage + " sz�zal�k�t adt�k el.");
			System.out.println("A sorban eladott feln�tt jegyek sz�zal�ka: " + seatSoldInRowFullPricePerc + "%");
			System.out.println("A sorban eladott kedvezm�nyes jegyek sz�zal�ka: " + seatSoldInRowDiscountPerc + "%");
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
			System.out.println("Az els� h�sz sor bev�lete (" + fist20rowsIncome + " Ft) nagyobb, mint a m�sodik h�sz sor bevt�tele (" + second20rowsIncome + " Ft)");
		} else if (fist20rowsIncome < second20rowsIncome) {
			System.out.println("A m�sodik h�sz sor bev�lete (" + second20rowsIncome + " Ft) nagyobb, mint a m�sodik h�sz sor bevt�tele (" + fist20rowsIncome + " Ft)");
		} else {
			System.out.println("A bev�tel�k egyenl�: " + fist20rowsIncome + " Ft.");
		}
		
	}
	
	public static void moreFullPriceRows (int[][] room) {
		System.out.print("Ezekben a sorokban adtak el t�bb feln�ttjegyet, mint kedvezm�nyes jegyet: ");
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
			System.out.print("A nyolcadik sor �res sz�kei: ");
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
		System.out.print("Adja meg a sor sz�m�t: ");
		int rowNum = Integer.parseInt(br.readLine()) - 1;
		System.out.print("Adja meg a sz�k sz�m�t: ");
		int seatNum = Integer.parseInt(br.readLine()) - 1;
		
		if (room[rowNum][seatNum] == 1 || room[rowNum][seatNum] == 2) {
			System.out.println("A megadott hely: " + (rowNum + 1)  + ". sor, " + (seatNum + 1) + ". sz�k. A hely m�r foglalt.");
		} else {
			System.out.print("A megadott hely: " + (rowNum + 1) + ". sor, " + (seatNum + 1) + ". sz�k. A hely m�g �res.\nK�rem adja meg, hogy milyen t�pus� jegyet szeretne foglalni (1-2): ");
			int seatBook = Integer.parseInt(br.readLine());
			room[rowNum][seatNum] = seatBook;
			System.out.println("Sikeres foglal�s.");
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
