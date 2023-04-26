package shop_ban_giay.service;

import shop_ban_giay.domainModel.ChatLieu;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface ChatLieuService {
    List<ChatLieu> getAll();
    ChatLieu getOne(UUID id);
    Boolean add(ChatLieu chatLieu);
    Boolean update(ChatLieu chatLieu);
    Boolean delete(ChatLieu chatLieu);
    List<ChatLieu> searchTen(String ten);
}
