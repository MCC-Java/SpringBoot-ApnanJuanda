/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.crud.repositories;

import com.mcc.crud.entities.Region;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


/**
 *
 * @author ASUS
 */
public interface RegionRepository extends JpaRepository<Region, Integer>{
    
    @Query("SELECT r FROM Region r WHERE r.name LIKE %?1%")
    public List<Region> findAll(String keyword); //ini findAll khusus untuk proses searching aktif
    
    
    
}
