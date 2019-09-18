package domaci;

public class GlavniProgram {

	public static void main(String[] args) {
		Zadatak_2_09062019.setExcell("Data (DOM).xls");
		Zadatak_2_09062019.setWorkSheet(0);
		System.out.println(Zadatak_2_09062019.getDataAt(4, 0));
		System.out.println(Zadatak_2_09062019.getLastRowIndex(0));
		Zadatak_2_09062019.setDataAt(14, 0, 234);
		System.out.println(Zadatak_2_09062019.getDataAt(14, 0));
		System.out.println(Zadatak_2_09062019.suma());
		
	}

}
