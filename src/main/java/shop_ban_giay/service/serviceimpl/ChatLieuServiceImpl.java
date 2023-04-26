package shop_ban_giay.service.serviceimpl;

import shop_ban_giay.domainModel.ChatLieu;
import shop_ban_giay.repository.ChatLieuRepository;
import shop_ban_giay.service.ChatLieuService;

import java.util.List;
import java.util.UUID;

public class ChatLieuServiceImpl implements ChatLieuService {
    private ChatLieuRepository chatLieuRepository = new ChatLieuRepository();

    @Override
    public List<ChatLieu> getAll() {
        return chatLieuRepository.getAll();
    }

    @Override
    public ChatLieu getOne(UUID id) {
        ChatLieu chatLieu = chatLieuRepository.getOne(id);
        return chatLieu;
    }

    @Override
    public Boolean add(ChatLieu chatLieu) {
        chatLieuRepository.add(chatLieu);
        return true;
    }

    @Override
    public Boolean update(ChatLieu chatLieu) {
        chatLieuRepository.update(chatLieu);
        return true;
    }

    @Override
    public Boolean delete(ChatLieu chatLieu) {
        chatLieuRepository.delete(chatLieu);
        return true;
    }

    @Override
    public List<ChatLieu> searchTen(String ten) {
        return chatLieuRepository.searchTen(ten);
    }
}
