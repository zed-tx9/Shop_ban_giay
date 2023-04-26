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
@Table(name="Mau")
public class MauSac {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id")
    private UUID id;
    @Column(name = "Ma")
    private String ma;
    @Column(name = "Mau")
    private String mau;

    public MauSac() {
    }

    public MauSac(UUID id, String ma, String mau) {
        this.id = id;
        this.ma = ma;
        this.mau = mau;
    }

    public MauSac(String ma, String mau) {
        this.ma = ma;
        this.mau = mau;
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

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    @Override
    public String toString() {
        return "MauSac{" + "id=" + id + ", ma=" + ma + ", mau=" + mau + '}';
    }
    
}
