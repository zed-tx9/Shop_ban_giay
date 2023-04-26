/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop_ban_giay.repository;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import shop_ban_giay.domainModel.Size_1;
import shop_ban_giay.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author PC
 */
public class SizeRepository {
    public List<Size_1> getAll(){
        List<Size_1> list = new ArrayList<>();
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("from Size ", Size_1.class);
            list = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    //    getOne
    public Size_1 getOne(UUID id){
        Size_1 size1 = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("from Size_1 where id=:id");
            query.setParameter("id",id);
            size1 = (Size_1) query.getSingleResult();
        } catch (Exception e){
            e.printStackTrace();
        }
        return size1;
    }
    // add
    public Boolean add(Size_1 size1){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(size1);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    // update
    public Boolean update(Size_1 size1){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.update(size1);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    // delete
    public Boolean delete(Size_1 size1){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.remove(size1);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
//    public List<Size_1> searchTen(String Size){
//        List<Size_1> lists = new ArrayList<>();
//        try (Session session = HibernateUtil.getFACTORY().openSession()) {
//            Query query = session.createQuery("from Size_1 where ten=:size");
//            query.setParameter("size",Size);
//            lists = query.getResultList();
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        return lists;
//    }
}
