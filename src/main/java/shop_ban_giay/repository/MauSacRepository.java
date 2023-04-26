/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop_ban_giay.repository;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import shop_ban_giay.domainModel.MauSac;
import shop_ban_giay.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author PC
 */
public class MauSacRepository {
    public List<MauSac> getAll(){
        List<MauSac> list = new ArrayList<>();
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("from MauSac ",MauSac.class);
            list = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    //    getOne
    public MauSac getOne(UUID id){
        MauSac mauSac = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("from MauSac where id=:id");
            query.setParameter("id",id);
            mauSac = (MauSac) query.getSingleResult();
        } catch (Exception e){
            e.printStackTrace();
        }
        return mauSac;
    }
    // add
    public Boolean add(MauSac mauSac){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(mauSac);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    // update
    public Boolean update(MauSac mauSac){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.update(mauSac);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    // delete
    public Boolean delete(MauSac mauSac){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.remove(mauSac);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public List<MauSac> searchTen(String mau){
        List<MauSac> lists = new ArrayList<>();
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("from MauSac where mau=:mau");
            query.setParameter("mau",mau);
            lists = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return lists;
    }
}
