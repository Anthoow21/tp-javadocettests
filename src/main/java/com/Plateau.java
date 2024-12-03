package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Cette classe représente un plateau.
 * Un plateau est définit par une hauteur et un personnage, et il peut contenir un ou plusieurs personnages.
 */
public class Plateau {

    private int largeur;
    private int hauteur;
    private List<Personnage> personnages;

    /**
     * Initialise un plateau avec une largeur, une hauteur, ainsi qu'une liste de personnage vide par défaut
     * @param largeur largeur du plateau initiale
     * @param hauteur hauteur du plateau initiale
     * @throws IllegalArgumentException Si les dimensions du plateau sont négatives ou nul
     */
    public Plateau(int largeur, int hauteur) {
        if (largeur <= 0 || hauteur <= 0) {
            throw new IllegalArgumentException("Les dimensions du plateau doivent être positives.");
        }
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.personnages = new ArrayList<>();
    }

    /**
     * Ajoute un personnage dans la liste de personnage
     * @param p le personnage à ajouter à la liste
     * @throws IllagalArgumentException Si le personnage est hors des limites du plateau
     */
    public void ajouterPersonnage(Personnage p) {
        if (p.getX() >= largeur || p.getY() >= hauteur) {
            throw new IllegalArgumentException("Le personnage est hors des limites du plateau.");
        }
        this.personnages.add(p);
    }

    /**
     * Vérifie si la liste des personnages est vide
     * @return true si elle est vide
     *         false sinon
     */
    public boolean estVide() {
        return this.personnages.isEmpty();
    }

    /**
     * Retourne la liste des personnages
     * @return la liste des personnages
     */
    public List<Personnage> getPersonnages() {
        return personnages;
    }

}

