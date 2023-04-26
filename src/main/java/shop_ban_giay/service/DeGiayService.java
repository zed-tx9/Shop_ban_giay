package shop_ban_giay.service;

import shop_ban_giay.domainModel.DeGiay;

import java.util.List;
import java.util.UUID;

public interface DeGiayService {
    List<DeGiay> getAll();
    DeGiay getOne(UUID id);
    Boolean add(DeGiay deGiay);
    Boolean update(DeGiay deGiay);
    Boolean delete(DeGiay deGiay);
    List<DeGiay> searchTen(String ten);
}
