/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop_ban_giay.util;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import shop_ban_giay.domainModel.ChatLieu;
import shop_ban_giay.domainModel.ChucVu;
import shop_ban_giay.domainModel.DeGiay;
import shop_ban_giay.domainModel.KhachHang;
import shop_ban_giay.domainModel.MauSac;
import shop_ban_giay.domainModel.SanPham;
import shop_ban_giay.domainModel.Size_1;
import shop_ban_giay.domainModel.ThuongHieu;

/**
 *
 * @author PC
 */
public class HibernateUtil {

    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "123");
        properties.put(Environment.SHOW_SQL, "true");

        conf.setProperties(properties);
        conf.addAnnotatedClass(ChucVu.class);
        conf.addAnnotatedClass(KhachHang.class);
        conf.addAnnotatedClass(MauSac.class);
        conf.addAnnotatedClass(ChatLieu.class);
        conf.addAnnotatedClass(Size_1.class);
        conf.addAnnotatedClass(ThuongHieu.class);
        conf.addAnnotatedClass(DeGiay.class);
        conf.addAnnotatedClass(SanPham.class);
        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);

    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }

    public static void main(String[] args) {
        System.out.println(getFACTORY());
    }
}
