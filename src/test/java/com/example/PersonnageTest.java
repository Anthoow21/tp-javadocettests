package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Personnage;

public class PersonnageTest {

    Personnage personne;

    @BeforeEach
    public void setup() {
        personne = new Personnage("pTest1", 1, 2, 5);
    }
    
    @Test
    public void PersonnageConstructeurValideEtInvalide() {
        assertEquals(personne.getNom(), "pTest1");
        assertEquals(personne.getX(), 1);
        assertEquals(personne.getY(), 2);
        assertEquals(personne.getPointsDeVie(), 5);
        assertThrows(IllegalArgumentException.class, () -> new Personnage("pTest2", 0, 0, -1));
    }

    @Test
    public void PersonnageDeplacerTest() {
        personne.deplacer(2, 0);
        assertEquals(personne.getX(), 3);
        personne.deplacer(0, 5);
        assertEquals(personne.getY(), 7);
        personne.deplacer(-1, -3);
        assertEquals(personne.getX(), 2);
        assertEquals(personne.getY(), 4);
    }

    @Test
    public void PersonnageSubirDegatsTest() {
        personne.subirDegats(2);
        assertEquals(personne.getPointsDeVie(), 3);
        personne.subirDegats(-1);
        assertEquals(personne.getPointsDeVie(), 4);
        personne.subirDegats(5);
        assertEquals(personne.getPointsDeVie(), 0);
    }

    @Test
    public void PersonnageEstHorsJeuTest() {
        personne.subirDegats(5);
        assertTrue(personne.estHorsJeu());
        personne.subirDegats(-1);
        assertFalse(personne.estHorsJeu());
    }


}
