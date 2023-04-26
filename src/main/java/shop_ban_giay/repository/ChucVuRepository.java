/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop_ban_giay.repository;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import shop_ban_giay.domainModel.ChucVu;
import shop_ban_giay.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author PC
 */
public class ChucVuRepository {

    // getAll
    public List<ChucVu> getAll(){
        List<ChucVu> list = new ArrayList<>();
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("from ChucVu ",ChucVu.class);
            list = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
//    getOne
    public ChucVu getOne(UUID id){
        ChucVu chucVu = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("from ChucVu where id=:id");
            query.setParameter("id",id);
            chucVu = (ChucVu) query.getSingleResult();
        } catch (Exception e){
            e.printStackTrace();
        }
        return chucVu;
    }
    // add
    public Boolean add(ChucVu chucVu){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(chucVu);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    // update
    public Boolean update(ChucVu chucVu){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.update(chucVu);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    // delete
    public Boolean delete(ChucVu chucVu){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.remove(chucVu);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public List<ChucVu> searchTen(String ten){
        List<ChucVu> lists = new ArrayList<>();
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
           Query query = session.createQuery("from ChucVu where ten=:ten");
           query.setParameter("ten",ten);
           lists = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return lists;
    }
}
