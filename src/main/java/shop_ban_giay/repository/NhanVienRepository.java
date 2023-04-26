package shop_ban_giay.repository;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import shop_ban_giay.domainModel.NhanVien;
import shop_ban_giay.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class NhanVienRepository {
    public List<NhanVien> getAll(){
        List<NhanVien> list = new ArrayList<>();
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("from NhanVien ",NhanVien.class);
            list = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public NhanVien getOne(UUID id){
        NhanVien nhanVien = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("from NhanVien where id=:id");
            query.setParameter("id",id);
            nhanVien = (NhanVien) query.getSingleResult();
        } catch (Exception e){
            e.printStackTrace();
        }
        return nhanVien;
    }

    public Boolean add(NhanVien nhanVien){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.persist(nhanVien);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public Boolean update(NhanVien nhanVien){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.merge(nhanVien);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public Boolean delete(NhanVien nhanVien){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.delete(nhanVien);
            transaction.commit();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public List<NhanVien> searchTen(String hoTen){
        List<NhanVien> list = new ArrayList<>();
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("from NhanVien where hoTen=:hoTen");
            query.setParameter("hoTen",hoTen);
            list = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public List<NhanVien> sortByTen(boolean isAscending){
        List<NhanVien> list = new ArrayList<>();
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            String queryStr = "from NhanVien order by hoTen ";
            if(isAscending){
                queryStr += "asc";
            } else {
                queryStr += "desc";
            }
            Query query = session.createQuery(queryStr);
            list = query.getResultList();
        } catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }


}
