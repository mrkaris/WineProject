/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thewineproject.services;

import com.mycompany.thewineproject.models.Colour;
import java.util.List;

/**
 *
 * @author George
 */
public interface ColourService {

    Colour findById(int id);

    void saveColour(Colour colour);

    void updateColour(Colour colour);

    void deleteColourById(int id);

    List<Colour> findAllColours();

}
