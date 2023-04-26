package shop_ban_giay.service.serviceimpl;

import shop_ban_giay.domainModel.KhachHang;
import shop_ban_giay.repository.KhachHangRepository;
import shop_ban_giay.service.KhachHangService;

import java.util.List;
import java.util.UUID;

public class KhachHangServiceImpl implements KhachHangService {
    private KhachHangRepository khachHangRepository = new KhachHangRepository();

    @Override
    public List<KhachHang> getAll() {
        return khachHangRepository.getAll();
    }

    @Override
    public KhachHang getOne(UUID id) {
        KhachHang khachHang = khachHangRepository.getOne(id);
        return khachHang;
    }

    @Override
    public Boolean add(KhachHang khachHang) {
        khachHangRepository.add(khachHang);
        return true;
    }

    @Override
    public Boolean update(KhachHang khachHang) {
        khachHangRepository.update(khachHang);
        return true;
    }

    @Override
    public Boolean delete(KhachHang khachHang) {
        khachHangRepository.delete(khachHang);
        return true;
    }

    @Override
    public List<KhachHang> searchTen(String ten) {
        return khachHangRepository.searchTen(ten);
    }
}
