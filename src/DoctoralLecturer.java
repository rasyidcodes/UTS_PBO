import java.util.ArrayList;

public class DoctoralLecturer extends Lecturer {

    ArrayList<String> topikList =  new ArrayList<>();
    String pendidikan;
    public DoctoralLecturer(String nika, String name, String keahlian) {
        super(nika, name, keahlian);
    }


    public void tambahTopik(String topik){
        topikList.add(topik);
    }


    public ArrayList<String> getTopikList() {
        return topikList;
    }


}
