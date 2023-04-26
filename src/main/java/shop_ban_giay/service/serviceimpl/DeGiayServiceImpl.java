package shop_ban_giay.service.serviceimpl;

import shop_ban_giay.domainModel.DeGiay;
import shop_ban_giay.repository.DeGiayRepository;
import shop_ban_giay.service.DeGiayService;

import java.util.List;
import java.util.UUID;

public class DeGiayServiceImpl implements DeGiayService {
    private DeGiayRepository deGiayRepository = new DeGiayRepository();

    @Override
    public List<DeGiay> getAll() {
        return deGiayRepository.getAll();
    }

    @Override
    public DeGiay getOne(UUID id) {
        DeGiay deGiay = deGiayRepository.getOne(id);
        return deGiay;
    }

    @Override
    public Boolean add(DeGiay deGiay) {
        deGiayRepository.add(deGiay);
        return true;
    }

    @Override
    public Boolean update(DeGiay deGiay) {
        deGiayRepository.update(deGiay);
        return true;
    }

    @Override
    public Boolean delete(DeGiay deGiay) {
        deGiayRepository.delete(deGiay);
        return true;
    }

    @Override
    public List<DeGiay> searchTen(String ten) {
        return deGiayRepository.searchTen(ten);
    }
}
