package shop_ban_giay.service.serviceimpl;

import shop_ban_giay.domainModel.ChucVu;
import shop_ban_giay.repository.ChucVuRepository;
import shop_ban_giay.service.ChucVuService;

import java.util.List;
import java.util.UUID;

public class ChucVuServiceIpml implements ChucVuService {
    private ChucVuRepository chucVuRepository = new ChucVuRepository();

    @Override
    public List<ChucVu> getAll() {
        return chucVuRepository.getAll();
    }

    @Override
    public ChucVu getOne(UUID id) {
        ChucVu chucVu = chucVuRepository.getOne(id);
        return chucVu;
    }

    @Override
    public Boolean add(ChucVu chucVu) {
        chucVuRepository.add(chucVu);
        return true;
    }

    @Override
    public Boolean update(ChucVu chucVu) {
        chucVuRepository.update(chucVu);
        return true;
    }

    @Override
    public Boolean delete(ChucVu chucVu) {
        chucVuRepository.delete(chucVu);
        return true;
    }

    @Override
    public List<ChucVu> searchTen(String ten) {
        return chucVuRepository.searchTen(ten);
    }
}
