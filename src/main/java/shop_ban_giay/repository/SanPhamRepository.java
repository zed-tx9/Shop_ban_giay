/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop_ban_giay.repository;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import shop_ban_giay.domainModel.SanPham;
import shop_ban_giay.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author PC
 */
public class SanPhamRepository {
    public List<SanPham> getAll(){
        List<SanPham> list = new ArrayList<>();
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("from SanPham ",SanPham.class);
            list = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    //    getOne
    public SanPham getOne(UUID id){
        SanPham sanPham = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("from SanPham where id=:id");
            query.setParameter("id",id);
            sanPham = (SanPham) query.getSingleResult();
        } catch (Exception e){
            e.printStackTrace();
        }
        return sanPham;
    }
    // add
    public Boolean add(SanPham sanPham){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(sanPham);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    // update
    public Boolean update(SanPham sanPham){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.update(sanPham);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    // delete
    public Boolean delete(SanPham sanPham){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.remove(sanPham);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public List<SanPham> searchTen(String ten){
        List<SanPham> lists = new ArrayList<>();
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("from SanPham where ten=:ten");
            query.setParameter("ten",ten);
            lists = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return lists;
    }
}
