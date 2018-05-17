package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;

public class Seance {
    private SimpleStringProperty matiere;
    private SimpleStringProperty nature;
    private SimpleObjectProperty<LocalDate> date;
    private SimpleObjectProperty<LocalDate> heure;
    private SimpleIntegerProperty duree;
    private SimpleStringProperty enseignant;

    public Seance(){}


    public Seance(SimpleStringProperty matiere, SimpleStringProperty nature, SimpleObjectProperty<LocalDate> date, SimpleObjectProperty<LocalDate> heure, SimpleIntegerProperty duree, SimpleStringProperty enseignant) {
        this.matiere = matiere;
        this.nature = nature;
        this.date = date;
        this.heure = heure;
        this.duree = duree;
        this.enseignant = enseignant;
    }

    public String getMatiere() {
        return matiere.get();
    }

    public SimpleStringProperty matiereProperty() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere.set(matiere);
    }

    public String getNature() {
        return nature.get();
    }

    public SimpleStringProperty natureProperty() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature.set(nature);
    }

    public LocalDate getDate() {
        return date.get();
    }

    public SimpleObjectProperty<LocalDate> dateProperty() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date.set(date);
    }

    public LocalDate getHeure() {
        return heure.get();
    }

    public SimpleObjectProperty<LocalDate> heureProperty() {
        return heure;
    }

    public void setHeure(LocalDate heure) {
        this.heure.set(heure);
    }

    public int getDuree() {
        return duree.get();
    }

    public SimpleIntegerProperty dureeProperty() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree.set(duree);
    }

    public String getEnseignant() {
        return enseignant.get();
    }

    public SimpleStringProperty enseignantProperty() {
        return enseignant;
    }

    public void setEnseignant(String enseignant) {
        this.enseignant.set(enseignant);
    }
}
