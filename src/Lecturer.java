import java.util.ArrayList;

public class Lecturer {

    String nika;
    String name;
    String keahlian;

    int kuota;

    String pendidikan;

    ArrayList<Mahasiswa> mhsBimbinganArrayList = new ArrayList<>();



    public Lecturer(String nika, String name, String keahlian) {
        this.nika = nika;
        this.name = name;
        this.keahlian = keahlian;
        this.kuota  = 2;

    }

    public int getKuota() {
        return kuota;
    }

    public void setKuota(int kuota) {
        this.kuota = kuota;
    }

    public String getNika() {
        return nika;
    }

    public void setNika(String nika) {
        this.nika = nika;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }

    public void  addMhsBimbinganToDosen(Mahasiswa mahasiswa){
        mhsBimbinganArrayList.add(mahasiswa);
    }

    public ArrayList<Mahasiswa> getMhsBimbinganArrayList() {
        return mhsBimbinganArrayList;
    }

}
