
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
@Table(name = "ChucVu")
public class ChucVu {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "IdCV")
    private UUID id;
    @Column(name = "MaCV")
    private String ma;
    @Column(name = "TenCV")
    private String ten;

    public ChucVu() {
    }

    public ChucVu(UUID id, String ma, String ten) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
    }

    public ChucVu(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
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

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "ChucVu{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + '}';
    }
    
    
}
