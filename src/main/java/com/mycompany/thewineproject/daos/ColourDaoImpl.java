/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thewineproject.daos;

import com.mycompany.thewineproject.models.Colour;
import java.util.List;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("colourDao")
@Transactional
public class ColourDaoImpl extends AbstractDao<Integer, Colour> implements ColourDao{
    
    @Override
    public Colour findById(int id) {
        return getByKey(id);
    }

    @Override
    public void saveColour(Colour colour) {
        persist(colour);
    }

    @Override
    public void deleteColourById(int id) {
        delete(findById(id));
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Colour> findAllColours() {
        Criteria criteria = createEntityCriteria();
        return (List<Colour>) criteria.list();
    }

}
