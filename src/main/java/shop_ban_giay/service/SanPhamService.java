package shop_ban_giay.service;

import shop_ban_giay.domainModel.SanPham;

import java.util.List;
import java.util.UUID;

public interface SanPhamService {
    List<SanPham> getAll();
    SanPham getOne(UUID id);
    Boolean add(SanPham sanPham);
    Boolean update(SanPham sanPham);
    Boolean delete(SanPham sanPham);
    List<SanPham> searchTen(String ten);
}
