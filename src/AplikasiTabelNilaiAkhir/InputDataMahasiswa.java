package AplikasiTabelNilaiAkhir;

import java.util.ArrayList;

public class InputDataMahasiswa {
    ArrayList <Mahasiswa> listmahasiswa;
    
    public InputDataMahasiswa(){
        listmahasiswa = new ArrayList<>();
    }
    public void insertData(String NIM, String Nama, String Alamat, String MataKuliah, double nilai1, double nilai2, double nilai3, double nilai4, double nilai5){
        Mahasiswa mhs = new Mahasiswa (NIM, Nama, Alamat, MataKuliah, nilai1, nilai2, nilai3, nilai4, nilai5);
        listmahasiswa.add(mhs);
    }
    public ArrayList <Mahasiswa> getAll(){
        return listmahasiswa;
    }
    public void deleteData(int index){
            if(index >= 0 && index < listmahasiswa.size()){
                listmahasiswa.remove(index);
        }
    }
}
