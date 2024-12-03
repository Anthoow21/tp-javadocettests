package com;

/**
 * Cette classe représente un personnage.
 * Un personnage est représenté par un nom, une position et des points de vie.
 * On peut effectuer plusieurs opérations sur lui comme le déplacer, lui faire subir des dégâts, ...
 */
public class Personnage {

    private String nom;
    private int x;
    private int y;
    private int pointsDeVie;

    /**
    * Initialise un personnage avec un nom, une position et des points de vie.
    * @param nom Le nom du personnage.
    * @param x La position X initiale.
    * @param y La position Y initiale.
    * @param pointsDeVie Le nombre initial de points de vie (doit être >= 0).
    * @throws IllegalArgumentException Si les points de vie sont négatifs.
    */
    public Personnage(String nom, int x, int y, int pointsDeVie) {
        if (pointsDeVie < 0) {
            throw new IllegalArgumentException("Les points de vie ne peuvent pas être négatifs.");
        }
        this.nom = nom;
        this.x = x;
        this.y = y;
        this.pointsDeVie = pointsDeVie;
    }

    /**
     * Déplace le joueur de la position x + dx et de la position y + dy
     * @param dx position x à laquelle la joueur va se déplacer à partir de sa position actuelle
     * @param dy position y à laquelle la joueur va se déplacer à partir de sa position actuelle
     */
    public void deplacer(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    /**
     * Fait perdre des points de vie au joueur lorsqu'il subit des dégâts
     * Il ne peut pas descendre en dessous de 0 point de vie
     * @param degats dégats reçus par le joueur
     */
    public void subirDegats(int degats) {
        this.pointsDeVie = Math.max(0, this.pointsDeVie - degats);
    }

    /**
     * Permet de définir si un joueur est hors jeu ou non
     * @return true si le joueur est hors jeu
     *         false si le joueur n'est pas hors jeu
     */
    public boolean estHorsJeu() {
        return this.pointsDeVie == 0;
    }

    /**
     * Retourne la position X du joueur
     * @return la position X du joueur
     */
    public int getX() {
        return x;
    }

    /**
     * Retourne la position Y du joueur
     * @return la position Y du joueur
     */
    public int getY() {
        return y;
    }

    /**
     * Retourne le nom du joueur
     * @return le nom du joueur
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne le nombre de points de vie du joueur
     * @return le nombre de points de vie du joueur
     */
    public int getPointsDeVie() {
        return pointsDeVie;
    }

}
