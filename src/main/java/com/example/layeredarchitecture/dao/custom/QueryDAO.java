package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.SupperDAO;
import com.example.layeredarchitecture.model.PlacedOrdersDTO;

import java.sql.SQLException;

public interface QueryDAO extends SupperDAO {
    PlacedOrdersDTO printPlacedOrdersDetails() throws SQLException, ClassNotFoundException;
}
