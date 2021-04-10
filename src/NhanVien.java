public abstract class NhanVien {
    private String maNhanVien;
    private String hoTen;
    private int age;
    private int phone;
    private String email;


    public NhanVien(String maNhanVien, String hoTen, int age, int phone, String email) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }


    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract double getLuong();




}
