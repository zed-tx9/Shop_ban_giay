/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop_ban_giay.repository;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import shop_ban_giay.domainModel.DeGiay;
import shop_ban_giay.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author PC
 */
public class DeGiayRepository {
    public List<DeGiay> getAll(){
        List<DeGiay> list = new ArrayList<>();
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("from DeGiay ",DeGiay.class);
            list = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    //    getOne
    public DeGiay getOne(UUID id){
        DeGiay deGiay = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("from DeGiay where id=:id");
            query.setParameter("id",id);
            deGiay = (DeGiay) query.getSingleResult();
        } catch (Exception e){
            e.printStackTrace();
        }
        return deGiay;
    }
    // add
    public Boolean add(DeGiay deGiay){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(deGiay);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    // update
    public Boolean update(DeGiay deGiay){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.merge(deGiay);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    // delete
    public Boolean delete(DeGiay deGiay){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.remove(deGiay);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public List<DeGiay> searchTen(String ten){
        List<DeGiay> lists = new ArrayList<>();
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("from DeGiay where ten=:ten");
            query.setParameter("ten",ten);
            lists = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return lists;
    }
}
