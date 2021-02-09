package week09.novia.id.ac.umn;

public class Tetap extends Karyawan {
	public Tetap() {}
	public Tetap(String id, String nama) {
		super(id, nama);
	}
	
	public int getGaji() {
		gaji=3000000;
		return gaji;
	}
}
