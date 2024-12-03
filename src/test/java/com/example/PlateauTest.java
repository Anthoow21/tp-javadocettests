package com.example;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Plateau;
import com.Personnage;

import java.util.ArrayList;
import java.util.List;

public class PlateauTest {
    
    Plateau plateau;
    Personnage personneValide;
    Personnage personneInvalide;
    List<Personnage> listePersonnage;

    @BeforeEach
    public void setup() {
        plateau = new Plateau(8, 12);
        personneValide = new Personnage("test1", 2, 0, 6);
        personneInvalide = new Personnage("test2", 12, 2, 2);
        listePersonnage = new ArrayList();
    }

    @Test
    public void PlateauConstructeurInvalideTest() {
        assertThrows(IllegalArgumentException.class, () -> new Plateau(0, 0));
        assertThrows(IllegalArgumentException.class, () -> new Plateau(5, -4));
        assertThrows(IllegalArgumentException.class, () -> new Plateau(-2, 4));
    }

    @Test
    public void PlateauAjouterPersonnageTest() {
        plateau.ajouterPersonnage(personneValide);
        assertEquals(plateau.getPersonnages().get(0).getX(), personneValide.getX());
        assertThrows(IllegalArgumentException.class, () -> plateau.ajouterPersonnage(personneInvalide));
    }

    @Test
    public void PlateauEstVideTest() {
        assertTrue(plateau.estVide());
        plateau.ajouterPersonnage(personneValide);
        assertFalse(plateau.estVide());
    }

    
}
