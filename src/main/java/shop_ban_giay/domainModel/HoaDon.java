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
@Table(name = "HoaDon")
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "IdHD")
    private UUID idHD;
    @ManyToOne
    @JoinColumn(
            name = "IdKH",
            referencedColumnName = "IdKH"
    )
    private KhachHang kh;
    @ManyToOne
    @JoinColumn(
            name = "IdNV",
            referencedColumnName = "IdNV"
    )
    private NhanVien nv;
    @Column(name = "Ma")
    private String ma;
    @Column(name = "NgayTao")
    private Date ngayTao;
    @Column(name = "NgayDat")
    private Date ngayDat;
    @Column(name = "NgayThanhToan")
    private Date ngayTT;
    @Column(name = "NgayShip")
    private Date ngayShip;
    @Column(name = "NgayNhan")
    private Date ngayNhan;
    @Column(name = "TinhTrang")
    private Integer tinhTrang;
    @Column(name = "TenNguoiNhan")
    private String nguoiNhan;
    @Column(name = "DiaChi")
    private String diaChi;
    @Column(name = "Sdt")
    private String sdt;
    @Column(name = "HinhThucGiaoDich")
    private Integer hinhThucGD;
    @Column(name = "HinhThucThanhToan")
    private Integer hinhThucTT;

    public HoaDon() {
    }

    public HoaDon(UUID idHD, KhachHang kh, NhanVien nv, String ma, Date ngayTao, Date ngayDat, Date ngayTT, Date ngayShip, Date ngayNhan, Integer tinhTrang, String nguoiNhan, String diaChi, String sdt, Integer hinhThucGD, Integer hinhThucTT) {
        this.idHD = idHD;
        this.kh = kh;
        this.nv = nv;
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.ngayDat = ngayDat;
        this.ngayTT = ngayTT;
        this.ngayShip = ngayShip;
        this.ngayNhan = ngayNhan;
        this.tinhTrang = tinhTrang;
        this.nguoiNhan = nguoiNhan;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.hinhThucGD = hinhThucGD;
        this.hinhThucTT = hinhThucTT;
    }

    public HoaDon(KhachHang kh, NhanVien nv, String ma, Date ngayTao, Date ngayDat, Date ngayTT, Date ngayShip, Date ngayNhan, Integer tinhTrang, String nguoiNhan, String diaChi, String sdt, Integer hinhThucGD, Integer hinhThucTT) {
        this.kh = kh;
        this.nv = nv;
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.ngayDat = ngayDat;
        this.ngayTT = ngayTT;
        this.ngayShip = ngayShip;
        this.ngayNhan = ngayNhan;
        this.tinhTrang = tinhTrang;
        this.nguoiNhan = nguoiNhan;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.hinhThucGD = hinhThucGD;
        this.hinhThucTT = hinhThucTT;
    }

    public UUID getIdHD() {
        return idHD;
    }

    public void setIdHD(UUID idHD) {
        this.idHD = idHD;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public Date getNgayTT() {
        return ngayTT;
    }

    public void setNgayTT(Date ngayTT) {
        this.ngayTT = ngayTT;
    }

    public Date getNgayShip() {
        return ngayShip;
    }

    public void setNgayShip(Date ngayShip) {
        this.ngayShip = ngayShip;
    }

    public Date getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(Date ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public Integer getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(Integer tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getNguoiNhan() {
        return nguoiNhan;
    }

    public void setNguoiNhan(String nguoiNhan) {
        this.nguoiNhan = nguoiNhan;
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

    public Integer getHinhThucGD() {
        return hinhThucGD;
    }

    public void setHinhThucGD(Integer hinhThucGD) {
        this.hinhThucGD = hinhThucGD;
    }

    public Integer getHinhThucTT() {
        return hinhThucTT;
    }

    public void setHinhThucTT(Integer hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "idHD=" + idHD +
                ", kh=" + kh +
                ", nv=" + nv +
                ", ma='" + ma + '\'' +
                ", ngayTao=" + ngayTao +
                ", ngayDat=" + ngayDat +
                ", ngayTT=" + ngayTT +
                ", ngayShip=" + ngayShip +
                ", ngayNhan=" + ngayNhan +
                ", tinhTrang=" + tinhTrang +
                ", nguoiNhan='" + nguoiNhan + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", sdt='" + sdt + '\'' +
                ", hinhThucGD=" + hinhThucGD +
                ", hinhThucTT=" + hinhThucTT +
                '}';
    }
}
