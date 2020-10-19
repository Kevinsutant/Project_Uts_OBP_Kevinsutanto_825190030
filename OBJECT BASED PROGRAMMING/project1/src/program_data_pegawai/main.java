package program_data_pegawai;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        kelasdata datapegawai = new kelasdata();

        String lagi;

        do
        {

            System.out.println();
            System.out.printf("ID Pegawai : ");
            datapegawai.setid(input.nextInt());
            System.out.printf("Nama : ");
            datapegawai.setnama(input.next());
            System.out.printf("Nomor HP : ");
            datapegawai.setnomor(input.next());
            System.out.printf("Alamat : ");
            datapegawai.setalamat(input.next());
            System.out.printf("Gaji : ");
            datapegawai.setgaji(input.nextInt());
            System.out.printf("waktu lembur/jam : ");
            datapegawai.setLembur(input.nextInt());
            System.out.printf("Status [M(menikah)/B(belum)] : ");
            datapegawai.setstatus(input.next());
            System.out.println("---------------------------");
            System.out.println("Upah Lembur : "+datapegawai.lemburr());
            System.out.println("Tunjangan = "+datapegawai.tunjangan());

            System.out.println("Total Gaji = "+datapegawai.total_gaji());

            System.out.println("Note: tunjangan = 10 persen dari gaji");
            System.out.println("Coba Lagi [Y/T] : ");
            lagi=input.next();


        }
        while("Y".equals(lagi));

    }

}


