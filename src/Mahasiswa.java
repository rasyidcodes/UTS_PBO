public class Mahasiswa {
    String nim;
    String nama;
    int jmlSks;
    int semester;
    String bidang;

    public Mahasiswa(String nim, String nama, int jmlSks, int semester) {
        this.nim = nim;
        this.nama = nama;
        this.jmlSks = jmlSks;
        this.semester = semester;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJmlSks() {
        return jmlSks;
    }

    public void setJmlSks(int jmlSks) {
        this.jmlSks = jmlSks;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }
}
