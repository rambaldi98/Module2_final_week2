public  class NhanVienFulltime extends NhanVien{
    private double tienThuong;
    private double tienPhat;
    private double luongCung;

    public NhanVienFulltime(String maNhanVien, String hoTen, int age, int number, String email, double tienThuong, double tienPhat, double luongCung) {
        super(maNhanVien, hoTen, age, number, email);
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
        this.luongCung = luongCung;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    @Override
    public double getLuong() {
        return (getLuongCung()+ getTienThuong() - getTienPhat());
    }




    @Override
    public String toString() {
        return "NhanVienFulltime{" +
                "maNhanVien=" + this.getMaNhanVien() +
                ", hoTen='" + this.getHoTen() + '\'' +
                ", age=" + this.getAge() +
                ", phone=" + this.getPhone() +
                ", email='" + this.getEmail() + '\'' +
                "tienThuong=" + this.getTienThuong() +
                ", tienPhat=" + this.getTienPhat() +
                ", luongCung=" + this.getLuongCung() +
                '}';
    }
}
