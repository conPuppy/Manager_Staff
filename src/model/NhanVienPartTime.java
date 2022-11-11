package model;

public class NhanVienPartTime extends NhanVien{
    private int soBuoi;

    @Override
    public double salary() {
        return soBuoi*200;
    }

    public NhanVienPartTime() {
    }

    public NhanVienPartTime(String name, int age, String gender, int soBuoi) {
        super(name, age, gender);
        this.soBuoi = soBuoi;
    }

    public int getSoBuoi() {
        return soBuoi;
    }

    public void setSoBuoi(int soBuoi) {
        this.soBuoi = soBuoi;
    }

    @Override
    public String toString() {
        return super.toString()+" NhanVienPartTime { " +
                "soBuoi = " + soBuoi +
                '}';
    }
}
