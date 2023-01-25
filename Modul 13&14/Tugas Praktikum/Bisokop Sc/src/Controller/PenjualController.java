package Controller;
import Entity.AdminEntity;
import Entity.daftarpembeli;
import Entity.PembeliEntity;
import java.util.ArrayList;

public class PenjualController implements ControllerInterface {
    int indexLogin = 0;
    public PenjualController() {
    }
    
    public void dataPenjual() {
        String namaPenjual[] = {"Melissa","Anggun","Mawar"};
        String passwordPenjual[] = {"admin1","admin2","admin3"};
        String bios[] = {"Film1","Film2","Film3"};
        
        for (int i=0; i<namaPenjual.length;i++) {
            AllObjectModel.penjual.inserPenjual(new AdminEntity(namaPenjual[i], passwordPenjual[i], bios[i]));
        }
    }
    public void viewpenjual() {
        AllObjectModel.penjual.view();
    }
    
    public void listPembeliBaju() {
        AllObjectModel.daftar.view();
    }
    
    @Override
    public void login(String nama, String password) {
        indexLogin = AllObjectModel.penjual.cekData(nama, password);
    }
    
    public AdminEntity penjualEntity() {
        return AllObjectModel.penjual.showDataPenjual(indexLogin);
    }
    
    public void updateIsVerified(int index, int indexBaju, PembeliEntity pembeliEntity) {
        AllObjectModel.daftar.updateIsVerified(index, new daftarpembeli(pembeliEntity, true, indexBaju));
    }
    
    public ArrayList<daftarpembeli> cekDaftarModel() {
        return AllObjectModel.daftar.getDaftarArrayList();
    }
}