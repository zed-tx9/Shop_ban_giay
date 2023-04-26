/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop_ban_giay.domainModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "KhachHang")

public class KhachHang {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "IdKH")
    private UUID id;
    @Column(name = "MaKH")
    private String ma;
    @Column(name = "HoTen")
    private String hoTen;
    @Column(name = "Sdt")
    private String sdt;
    @Column(name = "Email")
    private String email;

    public KhachHang() {
    }

    public KhachHang(UUID id, String ma, String hoTen, String sdt, String email) {
        this.id = id;
        this.ma = ma;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.email = email;
    }

    public KhachHang(String ma, String hoTen, String sdt, String email) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.email = email;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "id=" + id +
                ", ma='" + ma + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", sdt='" + sdt + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
