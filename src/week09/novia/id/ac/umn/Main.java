package week09.novia.id.ac.umn;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
	
	static Scanner scanner1 = new Scanner(System.in);
	static Scanner scanner2 = new Scanner(System.in);
	static Manager[] manager = new Manager[100];
	static Tetap[] tetap = new Tetap[100];
	static Magang[] magang = new Magang[100];
	public static int inputManager, inputTetap, inputMagang;
	private static AtomicInteger manager_ID = new AtomicInteger(1);
	private static AtomicInteger tetap_ID = new AtomicInteger(1);
	private static AtomicInteger magang_ID = new AtomicInteger(1);

	public static void menuUtama() {
		int input_mu;
		
		System.out.println("-----Program Data Karyawan-----");
		System.out.println("1. Lihat Karyawan");
		System.out.println("2. Tambah Karyawan");
		System.out.println("3. Keluar");
		System.out.print("Pilih : ");
		input_mu=scanner1.nextInt();
		
		switch(input_mu) {
			case 1:
					lihatKaryawan();
					break;
			case 2:
					tambahKaryawan();
					break;
			case 3:
					System.out.println("Keluar berhasil.");  
					System.exit(0); 
					break;
		}
		
	}
	
	public static void seedNull()
	{
		int i;
		
		for(i=0;i<50;i++){
			manager[i] = null;
			tetap[i] = null;
			magang[i] = null;
		}
	}
	
	public static void tambahKaryawan() {
		int input_tk;
		int ID;
		String managerNama, managerID;
		String tetapNama, tetapID;
		String magangNama, magangID;
		
		System.out.println("-----Program Data Karyawan-----");
		System.out.println("1. Manager");
		System.out.println("2. Karyawan Tetap");
		System.out.println("3. Karyawan Magang");
		System.out.print("Pilih : ");
		input_tk=scanner1.nextInt();
		
		switch(input_tk) {
			case 1:
					System.out.print("Nama : ");
					managerNama=scanner2.nextLine();
					ID=manager_ID.getAndIncrement();
					managerID = "M" + ID;
					manager[inputManager]=new Manager(managerID, managerNama);
					inputManager++;
					System.out.println("Manajer baru telah ditambahkan");
					scanner2.nextLine();
					break;
			case 2:
					System.out.print("Nama : ");
					tetapNama=scanner2.nextLine();
					ID=tetap_ID.getAndIncrement();
					tetapID = "M" + ID;
					tetap[inputTetap]=new Tetap(tetapID, tetapNama);
					inputTetap++;
					System.out.println("Pegawai tetap baru telah ditambahkan");
					scanner2.nextLine();
					break;
			case 3:
					System.out.print("Nama : ");
					magangNama=scanner2.nextLine();
					ID=magang_ID.getAndIncrement();
					magangID = "M" + ID;
					magang[inputMagang]=new Magang(magangID, magangNama);
					inputMagang++;
					System.out.println("Pegawai magang baru telah ditambahkan");
					scanner2.nextLine();
					break;
		}
	}
	
	public static void lihatKaryawan() {
		int i;
		
		System.out.println("-----Daftar Manager-----");

		if(manager[0]==null){
			System.out.println("Tidak ada");
		}
		else{
			for(i=0;i<manager.length;i++){
				if(manager[i]==null){
					break;
				}
				else{
					System.out.println("ID   : " + manager[i].getID());
					System.out.println("Nama : " + manager[i].getNama());
					System.out.println("Gaji : Rp. " + manager[i].getGaji());
					System.out.println("---------------------");
				}
			}
		}
		
		System.out.println("-----Daftar Pegawai Tetap-----");

		if(tetap[0]==null){
			System.out.println("Tidak ada");
		}
		else{
			for(i=0;i<tetap.length;i++){
				if(tetap[i]==null){
					break;
				}
				else{
					System.out.println("ID   : " + tetap[i].getID());
					System.out.println("Nama : " + tetap[i].getNama());
					System.out.println("Gaji : Rp. " + tetap[i].getGaji());
					System.out.println("---------------------");
				}
			}
		}
		
		System.out.println("-----Daftar Pegawai Magang-----");

		if(magang[0]==null){
			System.out.println("Tidak ada");
			scanner2.nextLine();
		}
		else{
			for(i=0;i<magang.length;i++){
				if(magang[i]==null){
					break;
				}
				else{
					System.out.println("ID   : " + magang[i].getID());
					System.out.println("Nama : " + magang[i].getNama());
					System.out.println("Gaji : Rp. " + magang[i].getGaji());
					System.out.println("---------------------");
				}
			}
			scanner2.nextLine();
		}
	}
	
	public static void main(String[] args) {
		for(;;) {
			menuUtama();
		}
	}

}
