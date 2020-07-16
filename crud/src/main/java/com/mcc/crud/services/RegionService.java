/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.crud.services;

import com.mcc.crud.entities.Region;
import com.mcc.crud.repositories.RegionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class RegionService {
    
    @Autowired
    private  RegionRepository regionRepository;
    
    public List<Region> getAll(String keyword){
        if (keyword != null){
            return regionRepository.findAll(keyword);//memanggil findAll khusus
        }
        return regionRepository.findAll(); ////memanggil findAll biasa
    }
    
    public void save(Region region){
        regionRepository.save(region);
    }
    
    public void delete(Integer id){
        regionRepository.delete(new Region(id));
    }
    
    //findBYId
    public Region getById(Integer id){
        return regionRepository.findById(id).get();
    }

   
    
}
