package model;

public class NhanVienFullTime extends NhanVien{
    private double heSo;

    public NhanVienFullTime() {
    }

    @Override
    public double salary() {
        return heSo*5000;
    }

    public NhanVienFullTime(String name, int age, String gender, double heSo) {
        super(name, age, gender);
        this.heSo = heSo;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }

    @Override
    public String toString() {
        return super.toString()+ " NhanVienFullTime { " +
                "heSo = " + heSo +
                " }";
    }
}
