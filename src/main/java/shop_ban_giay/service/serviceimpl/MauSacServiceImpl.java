package shop_ban_giay.service.serviceimpl;

import shop_ban_giay.domainModel.MauSac;
import shop_ban_giay.repository.MauSacRepository;
import shop_ban_giay.service.MauSacService;

import java.util.List;
import java.util.UUID;

public class MauSacServiceImpl implements MauSacService {
    private MauSacRepository mauSacRepository = new MauSacRepository();

    @Override
    public List<MauSac> getAll() {
        return mauSacRepository.getAll();
    }

    @Override
    public MauSac getOne(UUID id) {
        MauSac mauSac = mauSacRepository.getOne(id);
        return mauSac;
    }

    @Override
    public Boolean add(MauSac mauSac) {
        mauSacRepository.add(mauSac);
        return true;
    }

    @Override
    public Boolean update(MauSac mauSac) {
        mauSacRepository.update(mauSac);
        return true;
    }

    @Override
    public Boolean delete(MauSac mauSac) {
        mauSacRepository.delete(mauSac);
        return true;
    }

    @Override
    public List<MauSac> searchTen(String mau) {
        return mauSacRepository.searchTen(mau);
    }
}
