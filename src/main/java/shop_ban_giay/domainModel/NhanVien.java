package shop_ban_giay.domainModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "NhanVien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "IdNV")
    private UUID id;
    @Column(name = "MaNV")
    private String ma;
    @Column(name = "HoTen")
    private String hoTen;
    @Column(name = "GioiTinh")
    private String gioiTinh;
    @Column(name = "NgaySinh")
    private Date ngaySinh;
    @Column(name = "DiaChi")
    private String diaChi;
    @Column(name = "Sdt")
    private String sdt;
    @Column(name = "MatKhau")
    private String matKhau;
    @ManyToOne()
    @JoinColumn(
            name = "IdCV",
            referencedColumnName = "IdCV"
    )
    private ChucVu cv;

    public NhanVien() {
    }

    public NhanVien(UUID id, String ma, String hoTen, String gioiTinh, Date ngaySinh, String diaChi, String sdt, String matKhau, ChucVu cv) {
        this.id = id;
        this.ma = ma;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.matKhau = matKhau;
        this.cv = cv;
    }

    public NhanVien(String ma, String hoTen, String gioiTinh, Date ngaySinh, String diaChi, String sdt, String matKhau, ChucVu cv) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.matKhau = matKhau;
        this.cv = cv;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public ChucVu getCv() {
        return cv;
    }

    public void setCv(ChucVu cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "id=" + id +
                ", ma='" + ma + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", diaChi='" + diaChi + '\'' +
                ", sdt='" + sdt + '\'' +
                ", matKhau='" + matKhau + '\'' +
                ", cv=" + cv +
                '}';
    }
}
