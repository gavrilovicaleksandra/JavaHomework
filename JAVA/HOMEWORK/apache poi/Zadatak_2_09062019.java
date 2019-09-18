package domaci;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

/*Napisati program koji racuna sumu brojeva 
 * koji se nalaze prvom worksheet-u Excel tabele 
 * koji se zove Brojevi. 
 * U tabeli se svi brojevi nalaze u prvoj koloni. 
 * Program treba da cita red po red iz tabele i 
 * upisane brojeve dodaje na sumu. 
 * Krajnju sumu nakon toga treba da ispise u konzoli. 
 * Potrebno je omoguciti da program radi i 
 * ukoliko se u datu tabelu doda jos brojeva.
*/
public class Zadatak_2_09062019 {
	private static HSSFWorkbook wb = null;
	private static HSSFSheet sheet = null;
	private static String excellPath; //

	public static boolean setExcell(String path) { // postavljamo excell file
		if (wb != null) { // ako vec imamo postavljen excell onda zatvaramo
			try {
				wb.close();
			} catch (Exception e) {
				System.out.println(e.toString());
				return false;
			}
		}
		File f = new File(path);
		try {
			FileInputStream fis = new FileInputStream(f);// ako se desava greska jer ne moze da se otvori fajl
			wb = new HSSFWorkbook(fis);
			excellPath = path;
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Lose otvaranje fajla!");
			return false;
		}
	}

	public static boolean setWorkSheet(int index) { // metoda koja postavlja worksheet (brojevi u DZ)
		try {
			sheet = wb.getSheetAt(index);
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Lose otvaranje worksheeta!");
			return false;
		}
	}

	public static String getDataAt(int row, int column) {// metoda koja dohvata podatke
		try {
			HSSFRow r = sheet.getRow(row); // dohvatamo red
			HSSFCell celija = r.getCell(column);// dohvatamo celiju u tom redu
			return celija.toString();
		} catch (NullPointerException e) {
			System.out.println(e.toString());
			System.out.println("Nesto je null!");
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Doslo je do greske!");
		}
		return "";
	}

	public static boolean setDataAt(int row, int column, int i) {// metoda koja upisuje podatke
		try {
			HSSFRow r = sheet.getRow(row);// prvo dohvatimo red
			if (r == null) {// ako je red null
				r = sheet.createRow(row);// onda kreiramo red, ako nije pre toga postojao
			}
			HSSFCell celija = r.getCell(column);// iz tog novog reda dohvatamo celiju
			if (celija == null) {// ako je celija prazna
				celija = r.createCell(column);// onda kreiramo novu celiju u tom novom redu
			}
			celija.setCellValue(i);// ovde upisujemo vrednost u tu novu celiju
			FileOutputStream fos = new FileOutputStream(excellPath);
			wb.write(fos);// zelimo da upisani podatak u celiji i sacuvamo
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Doslo je do greske!");
			return false;
		}
	}

	public static int getRowNumber() {// daje nam broj redova
		try {
			return sheet.getLastRowNum() + 1;// posto krece brojanje od nule moramo da dodamo +1 da bi dobili pravi broj
												// redova
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Doslo je do greske!");
			return -1;
		}
	}

	public static int getLastRowIndex(int lri) {// vraca index poslednjeg reda koji sadrzi podatke
		return lri = sheet.getLastRowNum();

	}

	public static boolean closeExcell() {// ako smo zavrsili sa tabelom zelimo da je zatvorimo
		if (wb != null) {
			try {
				wb.close();
				wb = null;
				return true;
			} catch (IOException e) {
				e.printStackTrace();
				wb = null;
				return false;
			}

		}
		return true;
	}

	public static double suma() {
		double sum = 0;
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			HSSFRow r = sheet.getRow(i);
			if (r != null) {
				double data0 = r.getCell(0).getNumericCellValue();
				sum += data0;
			} else {
				System.out.println("<Empty row>");
			}
		}
		return sum;

	}

}
