package minhnv.xda.edu.banhangonline.model;

/**
 * Created by MinhNguyen on 11/26/2017.
 */

public class Loaisp {
    public int id;
    public String Tenloaisp;
    public String Hinhanhloaisp;

    public Loaisp(int id, String tenloaisp, String hinhanhloaisp) {
        this.id = id;
        Tenloaisp = tenloaisp;
        Hinhanhloaisp = hinhanhloaisp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenloaisp() {
        return Tenloaisp;
    }

    public void setTenloaisp(String tenloaisp) {
        Tenloaisp = tenloaisp;
    }

    public String getHinhanhloaisp() {
        return Hinhanhloaisp;
    }

    public void setHinhanhloaisp(String hinhanhloaisp) {
        Hinhanhloaisp = hinhanhloaisp;
    }
}
