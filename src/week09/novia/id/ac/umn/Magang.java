package week09.novia.id.ac.umn;

public class Magang extends Karyawan {
	public Magang() {}
	public Magang(String id, String nama) {
		super(id, nama);
	}
	
	public int getGaji() {
		gaji=1500000;
		return gaji;
	}
}
