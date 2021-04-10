import java.util.ArrayList;
import java.util.List;

public class ManagerNhanVien {
    private List<NhanVien> nhanViens;

    public ManagerNhanVien(){
        this.nhanViens = new ArrayList<>();
    }
    public void addNhanVien(NhanVien nhanVien){
        this.nhanViens.add(nhanVien);
    }

    public boolean deleteNhanVien(String id){
        NhanVien search = this.nhanViens.stream()
                .filter(nhanVien -> nhanVien.getMaNhanVien().equals(id))
                .findFirst().orElse(null);

        if(search == null)
            return false;
        this.nhanViens.remove(search);
        return true;
    }

    public void showNhanVien(){
        for (NhanVien nhanVien : this.nhanViens) {
            System.out.println(nhanVien.toString());
        }
    }

    List<NhanVien> listTrungBinh() {

        List<NhanVien> nhanViens1 = new ArrayList<>();
        int sumLuong = 0;
        double trungBinhLuong = 0;
        for (NhanVien nhanVien : this.nhanViens) {
            sumLuong += nhanVien.getLuong();
        }

        trungBinhLuong = sumLuong/nhanViens.size();

        for(int i = 0; i < nhanViens.size(); i++){
            if(trungBinhLuong > nhanViens.get(i).getLuong()){
                nhanViens1.add(nhanViens.get(i));
            }
        }


        return nhanViens1;
    }
    public void showTrungBinh(){
        List newarray = listTrungBinh();
        for (Object nhanvien :newarray) {
            System.out.println(nhanvien);
        }
    }

    public double luongTraPartime(){
        double luong = 0;

        for (NhanVien nhanVien : this.nhanViens) {
            if(nhanVien instanceof NhanVienParttime){
                luong += nhanVien.getLuong();
            }
        }
        return luong;
    }




}
