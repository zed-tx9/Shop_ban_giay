/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop_ban_giay.repository;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import shop_ban_giay.domainModel.ThuongHieu;
import shop_ban_giay.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author PC
 */
public class ThuongHieuRepository {
    public List<ThuongHieu> getAll(){
        List<ThuongHieu> list = new ArrayList<>();
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("from ThuongHieu ",ThuongHieu.class);
            list = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public ThuongHieu getOne(UUID id){
        ThuongHieu thuongHieu = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("from ThuongHieu where id=:id");
            query.setParameter("id",id);
            thuongHieu = (ThuongHieu) query.getSingleResult();
        } catch (Exception e){
            e.printStackTrace();
        }
        return thuongHieu;
    }
    public List<ThuongHieu> searchTen(String ten){
        List<ThuongHieu> thuongHieuList = new ArrayList<>();
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("from ThuongHieu  where ten=:ten");
            query.setParameter("ten",ten);
            thuongHieuList = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return thuongHieuList;
    }
    public Boolean add(ThuongHieu thuongHieu){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.persist(thuongHieu);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public Boolean update(ThuongHieu thuongHieu){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.merge(thuongHieu);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public Boolean delete(ThuongHieu thuongHieu){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.delete(thuongHieu);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
