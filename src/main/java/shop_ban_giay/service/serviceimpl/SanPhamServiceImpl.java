package shop_ban_giay.service.serviceimpl;

import shop_ban_giay.domainModel.SanPham;
import shop_ban_giay.repository.SanPhamRepository;
import shop_ban_giay.service.SanPhamService;

import java.util.List;
import java.util.UUID;

public class SanPhamServiceImpl implements SanPhamService {
    private SanPhamRepository sanPhamRepository = new SanPhamRepository();

    @Override
    public List<SanPham> getAll() {
        return sanPhamRepository.getAll();
    }

    @Override
    public SanPham getOne(UUID id) {
        SanPham sanPham = sanPhamRepository.getOne(id);
        return sanPham;
    }

    @Override
    public Boolean add(SanPham sanPham) {
        sanPhamRepository.add(sanPham);
        return true;
    }

    @Override
    public Boolean update(SanPham sanPham) {
        sanPhamRepository.update(sanPham);
        return true;
    }

    @Override
    public Boolean delete(SanPham sanPham) {
        sanPhamRepository.delete(sanPham);
        return true;
    }

    @Override
    public List<SanPham> searchTen(String ten) {
        return sanPhamRepository.searchTen(ten);
    }
}
