package shop_ban_giay.service;

import shop_ban_giay.domainModel.MauSac;

import java.util.List;
import java.util.UUID;

public interface MauSacService {
    List<MauSac> getAll();
    MauSac getOne(UUID id);
    Boolean add(MauSac mauSac);
    Boolean update(MauSac mauSac);
    Boolean delete(MauSac mauSac);
    List<MauSac> searchTen(String mau);
}
