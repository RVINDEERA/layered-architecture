package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.dto.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBO extends SupperBO {
    ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException;
    boolean saveItem(ItemDTO dto) throws SQLException, ClassNotFoundException;
    boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException;
    boolean deleteItem(String id) throws SQLException, ClassNotFoundException ;
    String generateNewItemId() throws SQLException, ClassNotFoundException;
    boolean existItem(String id) throws SQLException, ClassNotFoundException;

}
