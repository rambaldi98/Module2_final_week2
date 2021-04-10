public class NhanVienParttime extends NhanVien{
    private double hour;

    public NhanVienParttime(String maNhanVien, String hoTen, int age, int number, String email, double hour) {
        super(maNhanVien, hoTen, age, number, email);
        this.hour = hour;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public double getLuong() {
        return getHour()*100000;
    }

    @Override
    public String toString() {
        return "NhanVienParttime{" +
                "maNhanVien=" + this.getMaNhanVien() +
                ", hoTen='" + this.getHoTen() + '\'' +
                ", age=" + this.getAge() +
                ", phone=" + this.getPhone() +
                ", email='" + this.getEmail() + '\'' +
                "hour=" + hour +
                '}';
    }
}
