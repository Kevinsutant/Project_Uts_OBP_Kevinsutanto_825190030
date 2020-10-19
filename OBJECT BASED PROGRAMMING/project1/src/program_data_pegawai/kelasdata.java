package program_data_pegawai;

public class kelasdata {
    //kelas data
    private int id_pegawai;
    private String nama;
    private int gaji;
    private String status;
    private double tunj;
    private int lembur;
    private String nomor;
    private String alamat;
    private String note;

    //constructor
    public void setid(int id)
    {
        id_pegawai = id ;
    }

    public int getid()
    {
        return id_pegawai;
    }

    public void setnama(String np)
    {
        nama = np ;
    }

    public String getnama()
    {
        return nama;
    }

    public void setnomor(String hp)
    {
        nomor= hp;
    }

    public String getnomor()
    {
        return nomor ;
    }

    public void setalamat(String alm)
    {
        alamat= alm;
    }
    public String getalamat()
    {
        return alamat ;
    }
    public void setgaji(int gp)
    {
        gaji = gp ;
    }

    public int getgaji()
    {
        return gaji;
    }

    public void setLembur(int lmbr)
    {
            lembur = lmbr;
    }
    public int getlembur()
    {
        return  lembur;
    }

    public double lemburr ()
    {
        if(lembur>=1) {
            return lembur * (gaji * 0.005);
        }
        else{
            return 0;
        }
    }

    public void setstatus(String sts)
    {
        status = sts ;
    }

    public String getstatus()
    {
        return status;
    }

    public double tunjangan()
    {
        switch (status) {
            case "M":
                tunj=gaji*0.1;
                break;
            case "B":
                tunj=0;
                break;
        }

        return tunj;
    }

    public void setnot(String nt)
    {
        note = nt ;
    }

    public String getnot()
    {
        return note;
    }

    public double total_gaji()
    {
        return gaji+tunjangan()+lemburr();
    }

}
