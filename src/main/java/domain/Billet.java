package domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Billet {
    @Id
    @GeneratedValue
    private Long id;
    private double prix;
    private int quantiteDisponible;
//    private BilletType billetType;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Billet(double prix, int quantiteDisponible) {
        this.prix = prix;
        this.quantiteDisponible = quantiteDisponible;
    }

    public Billet() {
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantiteDisponible() {
        return quantiteDisponible;
    }

    public void setQuantiteDisponible(int quantiteDisponible) {
        this.quantiteDisponible = quantiteDisponible;
    }
}
