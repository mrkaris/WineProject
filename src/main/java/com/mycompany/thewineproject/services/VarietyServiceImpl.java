/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thewineproject.services;

import com.mycompany.thewineproject.daos.ColourDao;
import com.mycompany.thewineproject.daos.VarietyDao;
import com.mycompany.thewineproject.models.Variety;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("varietyService")
@Transactional
public class VarietyServiceImpl implements VarietyService {
    
    @Autowired
    private VarietyDao dao;

    @Override
    public Variety findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveVariety(Variety variety) {
        dao.saveVariety(variety);
    }

    
    @Override
    public void updateVariety(Variety variety) {
        Variety entity = dao.findById(variety.getVid());
        if (entity != null) {
            entity.setVdescr(variety.getVdescr());
           
        }
    }

    @Override
    public void deleteVarietyById(int id) {
        dao.deleteVarietyById(id);
    }

    @Override
    public List<Variety> findAllVarieties() {
        return dao.findAllVarieties();
    }

}
