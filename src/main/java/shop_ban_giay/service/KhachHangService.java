package shop_ban_giay.service;

import shop_ban_giay.domainModel.KhachHang;

import java.util.List;
import java.util.UUID;

public interface KhachHangService {
    List<KhachHang> getAll();
    KhachHang getOne(UUID id);
    Boolean add(KhachHang khachHang);
    Boolean update(KhachHang khachHang);
    Boolean delete(KhachHang khachHang);
    List<KhachHang> searchTen(String ten);

}
