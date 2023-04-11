import java.util.ArrayList;
import java.util.Objects;

public class ProgramStudi {

    String namaProdi;

    ArrayList<Lecturer> daftarDosen = new ArrayList<>();
    ArrayList<DoctoralLecturer> daftarDosenS3 = new ArrayList<>();
    public ProgramStudi(String namaProdi) {
        this.namaProdi = namaProdi;
    }

    public void tambahDosenDoktor(DoctoralLecturer lecturer){
        daftarDosenS3.add(lecturer);
    }

    public void tambahDosenMaster(Lecturer lecturer){
        daftarDosen.add(lecturer);
    }

    public void keteranganPengambilanTA(Mahasiswa mahasiswa){
        int jmlSks = mahasiswa.getJmlSks();
        int semester = mahasiswa.getSemester();
        String namaMhs =  mahasiswa.getNama();

        if (jmlSks >= 126 && semester >= 7){
            System.out.println(namaMhs + " sudah diperbolehkan untuk mengambil Tugas Akhir");
        }else{
            System.out.println(namaMhs + " belum diperbolehkan untuk mengambil Tugas Akhir");
        }
    }

    public  void rekomendasiDosenPembimbing(Mahasiswa mahasiswa){
        String namaMhs = mahasiswa.getNama();
        String bidangMhs = mahasiswa.getBidang();
        System.out.println("Berikut rekomendasi dosen pembimbing untuk " + namaMhs);

        String ketertarikanMhs = mahasiswa.getBidang();



        boolean found = false;
        for(int i = 0; i < daftarDosen.size(); i++){
            String keahlianDosen = daftarDosen.get(i).getKeahlian().toLowerCase();

            if (Objects.equals(ketertarikanMhs, keahlianDosen)){
                System.out.println(daftarDosen.get(i).getName());
                found = true;
            }
        }
        if (found == false){

            for (int i = 0; i < daftarDosenS3.size(); i++){
                System.out.println((i+1) +". "+ daftarDosenS3.get(i).getName());
                ArrayList<String> arrayList = daftarDosenS3.get(i).getTopikList();

                System.out.println("Berikut Rekomendasi topik dari "+ daftarDosenS3.get(i).getName());
                for(int x = 0; x < arrayList.size(); x++){
                    System.out.println(arrayList.get(x));
                }
            }
        }

    }

    public void assignDosenPembimbing(Mahasiswa mahasiswa, Lecturer lecturer){

        String bidangMhs = mahasiswa.getBidang();
        String keahlianDosen = lecturer.getKeahlian();

        if (bidangMhs == keahlianDosen){
            if (lecturer.getKuota() > 0){
                lecturer.addMhsBimbinganToDosen(mahasiswa);
                lecturer.setKuota(lecturer.getKuota() - 1);
                System.out.println("Dosen " + lecturer.getName() + " mendapat anak bimbing bernama "+ mahasiswa.getNama());

            }else {
                System.out.println("Kuota anak bimbing untuk dosen " + lecturer.getName() + " sudah penuh");
            }
        }else{
            if (lecturer.getKuota() > 0){
                lecturer.addMhsBimbinganToDosen(mahasiswa);
                lecturer.setKuota(lecturer.getKuota() - 1);
                System.out.println("Dosen " + lecturer.getName() + " mendapat anak bimbing bernama "+ mahasiswa.getNama());

            }else {
                System.out.println("Kuota anak bimbing untuk dosen " + lecturer.getName() + " sudah penuh");
            }
        }
    }

    public void printAnakBimbing(Lecturer lecturer){
        ArrayList<Mahasiswa> mahasiswaArrayList = lecturer.getMhsBimbinganArrayList();
        System.out.println("Anak bimbing dari "+ lecturer.getName());
        for (int i = 0; i < mahasiswaArrayList.size(); i++){
            System.out.println(mahasiswaArrayList.get(i).getNama());
        }
    }

}
