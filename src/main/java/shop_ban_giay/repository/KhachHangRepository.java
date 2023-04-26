/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop_ban_giay.repository;

import jakarta.persistence.Query;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import shop_ban_giay.domainModel.KhachHang;
import shop_ban_giay.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author PC
 */
public class KhachHangRepository {
    public List<KhachHang> getAll(){
        List<KhachHang> list = new ArrayList<>();
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("from KhachHang",KhachHang.class);
            list = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public KhachHang getOne(UUID id){
        KhachHang khachHang = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("from KhachHang where id=:id");
            query.setParameter("id",id);
            khachHang = (KhachHang) query.getSingleResult();
        } catch (Exception e){
            e.printStackTrace();
        }
        return khachHang;
    }
    public Boolean add(KhachHang khachHang){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.persist(khachHang);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public Boolean update(KhachHang khachHang){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.merge(khachHang);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public Boolean delete(KhachHang khachHang){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.delete(khachHang);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public List<KhachHang> searchTen(String ten){
        List<KhachHang> list = new ArrayList<>();
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("from KhachHang where hoTen=:ten");
            query.setParameter("hoTen",ten);
            list = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
