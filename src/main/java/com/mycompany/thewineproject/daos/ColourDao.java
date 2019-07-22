
package com.mycompany.thewineproject.daos;

import com.mycompany.thewineproject.models.Colour;
import java.util.List;


public interface ColourDao {

    Colour findById(int id);

    void saveColour(Colour product);

    void deleteColourById(int id);

    List<Colour> findAllColours();

}
