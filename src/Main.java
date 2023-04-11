public class Main {
    public static void main(String[] args) {
        DoctoralLecturer pakGanjar = new DoctoralLecturer("G1", "Pak Ganjar", "AI");
        pakGanjar.tambahTopik("Health Analysis");
        pakGanjar.tambahTopik("Smart Farming");

        DoctoralLecturer buDivi = new DoctoralLecturer("D1", "Bu Divi", "Nlp");
        buDivi.tambahTopik("Sentimen Analisis");
        buDivi.tambahTopik("Natural Language Generation");
        buDivi.tambahTopik("Speech Recognition");

        Lecturer buRochana = new Lecturer("R1", "Bu Rochana", "Data Mining");
        Lecturer pakDinar = new Lecturer("D2", "Pak Dinar", "Machine Learning");
        Lecturer buReta = new Lecturer("M1", "Bu Margareta", "hci");

        ProgramStudi trpl = new ProgramStudi("TRPL");
        trpl.tambahDosenDoktor(pakGanjar);
        trpl.tambahDosenDoktor(buDivi);
        trpl.tambahDosenMaster(buRochana);
        trpl.tambahDosenMaster(pakDinar);
        trpl.tambahDosenMaster(buReta);

        Mahasiswa akbar = new Mahasiswa("SV/TRPL/2021/1","Akbar" , 120, 4);
        Mahasiswa revan = new Mahasiswa("SV/TRPL/2021/2","Revan" , 120, 7);
        Mahasiswa wisnu = new Mahasiswa("SV/TRPL/2019/1","Wisnu" , 136, 7);
        wisnu.setBidang("data mining");
        Mahasiswa resti = new Mahasiswa("SV/TRPL/2019/2","Resti" , 136, 8);
        resti.setBidang("iot");
        Mahasiswa hilmi = new Mahasiswa("SV/TRPL/2019/3","Hilmi" , 128, 8);

        System.out.println("####################################################################################");
        trpl.keteranganPengambilanTA(akbar);
        trpl.keteranganPengambilanTA(revan);
        trpl.keteranganPengambilanTA(wisnu);
        trpl.keteranganPengambilanTA(hilmi);
        trpl.keteranganPengambilanTA(resti);
        System.out.println("####################################################################################");
        trpl.rekomendasiDosenPembimbing(wisnu);
        System.out.println("####################################################################################");
        trpl.rekomendasiDosenPembimbing(resti);
        System.out.println("####################################################################################");
        trpl.rekomendasiDosenPembimbing(hilmi);
        System.out.println("####################################################################################");
        trpl.assignDosenPembimbing(wisnu, pakGanjar);
        trpl.assignDosenPembimbing(resti, pakGanjar);
        trpl.assignDosenPembimbing(hilmi, pakGanjar);
        System.out.println("####################################################################################");
        trpl.assignDosenPembimbing(hilmi, buRochana);
        System.out.println("####################################################################################");
        trpl.printAnakBimbing(pakGanjar);
        System.out.println("####################################################################################");
    }
}