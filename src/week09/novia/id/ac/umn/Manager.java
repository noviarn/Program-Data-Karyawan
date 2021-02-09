package week09.novia.id.ac.umn;

public class Manager extends Karyawan {
	public Manager() {}
	public Manager(String id, String nama) {
		super(id, nama);
	}
	
	public int getGaji() {
		gaji=10000000;
		return gaji;
	}
}
