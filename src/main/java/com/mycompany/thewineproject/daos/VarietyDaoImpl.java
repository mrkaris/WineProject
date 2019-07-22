/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thewineproject.daos;

import com.mycompany.thewineproject.models.Variety;
import java.util.List;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("varietyDao")
@Transactional
public class VarietyDaoImpl extends AbstractDao<Integer, Variety> implements VarietyDao {

    @Override
    public Variety findById(int id) {
        return getByKey(id);
    }

    @Override
    public void saveVariety(Variety variety) {
        persist(variety);
    }

    @Override
    public void deleteVarietyById(int id) {
        delete(findById(id));
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Variety> findAllVarieties() {
        Criteria criteria = createEntityCriteria();
        return (List<Variety>) criteria.list();
    }

}
