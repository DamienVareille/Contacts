package com.example.j.tp2_adapteur;

/**
 * Created by J on 03/02/2016.
 */
public class Contact {
    private String nom;
    private String numero;
    private String photo;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Contact(String nom, String numero, String photo) {
        this.nom = nom;
        this.numero = numero;
        this.photo = photo;
    }

    public String getNom(){
        return this.nom;
    }

    public String getNumero(){
        return this.numero;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setNumero(String num){
        this.numero = num;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "nom='" + nom + '\'' +
                ", numero='" + numero + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
