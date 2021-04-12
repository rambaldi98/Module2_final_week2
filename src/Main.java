public class Main {
    public static void main(String[] args) {

        ManagerNhanVien mana = new ManagerNhanVien();

        NhanVien a = new NhanVienFulltime("abc","ten so 1",18,2225,"doiencong",0,0,300000);
        NhanVien a2 = new NhanVienFulltime("abcd","ten so 2",18,2225,"doiencong",0,0,300000);

        NhanVien b = new NhanVienParttime("abcde","ten so 3",18,2225,"doiencong",2);
        NhanVien b2 = new NhanVienParttime("abcdf","ten so 4",18,2225,"doiencong",2);

        mana.addNhanVien(a);
        mana.addNhanVien(a2);
        mana.addNhanVien(b);
        mana.addNhanVien(b2);


        // show nhan vien
        mana.showNhanVien();
        System.out.println("danh sach nhan vien co luong it hon trung binh");
        mana.showTrungBinh();
        System.out.println("tong so phai tra nhan vien partime " + mana.luongTraPartime());


        // xoa nhan vien voi id la
        mana.deleteNhanVien("abc");
        System.out.println("sau khi xoa");
        mana.showNhanVien();

    }
}
