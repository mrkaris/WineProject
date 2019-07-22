/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thewineproject.services;

import com.mycompany.thewineproject.daos.ColourDao;
import com.mycompany.thewineproject.models.Colour;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("colourService")
@Transactional
public class ColourServiceImpl implements ColourService {

    @Autowired
    private ColourDao dao;

    @Override
    public Colour findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveColour(Colour colour) {
        dao.saveColour(colour);
    }

    
    @Override
    public void updateColour(Colour colour) {
        Colour entity = dao.findById(colour.getClid());
        if (entity != null) {
            entity.setCldescr(colour.getCldescr());

        }
    }

    @Override
    public void deleteColourById(int id) {
        dao.deleteColourById(id);
    }

    @Override
    public List<Colour> findAllColours() {
        return dao.findAllColours();
    }

}
