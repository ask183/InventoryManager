/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sg.inventory.repositories;

import com.sg.inventory.entities.Product;
import com.sg.inventory.entities.Store;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author abekoppal
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
    List<Product> findByStore(Store store);
}
