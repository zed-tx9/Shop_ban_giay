/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop_ban_giay.repository;

import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.hibernate.Session;
import org.hibernate.Transaction;
import shop_ban_giay.domainModel.ChatLieu;
import shop_ban_giay.util.HibernateUtil;

/**
 *
 * @author PC
 */
public class ChatLieuRepository {
    public List<ChatLieu> getAll(){
        List<ChatLieu> list = new ArrayList<>();
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("from ChatLieu ",ChatLieu.class);
            list = query.getResultList();
        } catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public ChatLieu getOne(UUID id){
        ChatLieu chatLieu = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createNamedQuery("from ChatLieu where id=:id");
            query.setParameter("id",id);
            chatLieu = (ChatLieu) query.getSingleResult();
        } catch(Exception e){
            e.printStackTrace();
        }
        return chatLieu;
    }
    // Add
    public Boolean add(ChatLieu chatLieu){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.persist(chatLieu);
            transaction.commit();
            return true;
        } catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    // Update
    public Boolean update(ChatLieu chatLieu){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.merge(chatLieu);
            transaction.commit();
            return true;
        } catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    // Delete
    public Boolean delete(ChatLieu chatLieu){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.delete(chatLieu);
            transaction.commit();
            return true;
        } catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    // search
    public List<ChatLieu> searchTen(String ten){
        List<ChatLieu> list = new ArrayList<>();
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("from ChatLieu where ten=:ten ");
            query.setParameter("ten", ten); // Thiết lập tham số ten với giá trị tên cần tìm
            list = query.getResultList(); // Lấy danh sách kết quả tìm kiếm
        } catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }


//    public static void main(String[] args) {
//        new ChatLieuRepository().getAll().forEach(s-> System.out.println(s.toString()));
//    }

//    public static void main(String[] args) {
//        // Lấy danh sách tất cả các chất liệu
//        ChatLieuRepository chatLieuRepository = new ChatLieuRepository();
//        List<ChatLieu> allChatLieus = chatLieuRepository.getAll();
//        System.out.println("Danh sách tất cả chất liệu:");
//        for (ChatLieu chatLieu : allChatLieus) {
//            System.out.println(chatLieu.toString());
//        }
//
//        // Gọi hàm tìm kiếm theo tên
//        String ten = "Bong"; // Thay thế bằng tên chất liệu thực tế cần tìm
//        List<ChatLieu> result = chatLieuRepository.searchTen(ten);
//        if (result.isEmpty()) {
//            System.out.println("Không tìm thấy chất liệu có tên: " + ten);
//        } else {
//            System.out.println("Danh sách chất liệu có tên \"" + ten + "\":");
//            for (ChatLieu chatLieu : result) {
//                System.out.println(chatLieu.toString());
//            }
//        }
//    }

}
