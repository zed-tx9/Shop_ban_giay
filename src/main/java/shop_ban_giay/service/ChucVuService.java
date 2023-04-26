package shop_ban_giay.service;

import shop_ban_giay.domainModel.ChucVu;

import java.util.List;
import java.util.UUID;

public interface ChucVuService {
    List<ChucVu> getAll();
    ChucVu getOne(UUID id);
    Boolean add(ChucVu chucVu);
    Boolean update(ChucVu chucVu);
    Boolean delete(ChucVu chucVu);
    List<ChucVu> searchTen(String ten);

}
