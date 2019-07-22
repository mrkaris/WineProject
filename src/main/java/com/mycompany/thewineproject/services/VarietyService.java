/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thewineproject.services;

import com.mycompany.thewineproject.models.Variety;
import java.util.List;

/**
 *
 * @author George
 */
public interface VarietyService {
    
    Variety findById(int id);

    void saveVariety(Variety variety);

    void updateVariety(Variety variety);

    void deleteVarietyById(int id);

    List<Variety> findAllVarieties();

}
