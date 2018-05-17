package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Persistence {
    private File fichier;

    public Persistence(String unNom){
        fichier = new File(unNom);
    }

    public void sauve(ObservableList<Seance> uneListe) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fichier.getName()));
        for (Seance seance : uneListe){
            writer.write(seance.getNature() + " " + seance.getMatiere() + " " + seance.getEnseignant() + " " + seance.getDate().getYear() + " " + seance.getDate().getMonth() + " "
                    + seance.getDate().getDayOfMonth() + " " + seance.getHeure() + " " + seance.getDuree());
        }



    }

    public ObservableList<Seance> restaure() throws IOException {

        ObservableList<Seance> seances = FXCollections.observableArrayList();
        try{
            Scanner s = new Scanner(fichier);
            while (s.hasNext()){
                Seance seance = new Seance();
                seance.setNature(s.next());
                seance.setMatiere(s.next());
                seance.setEnseignant(s.next());
                seance.setDate(LocalDate.of(s.nextInt(), s.nextInt(), s.nextInt()));
                seance.setHeure(LocalDate.parse(s.next()));
                seance.setDuree(s.nextInt());
                seances.add(seance);
            }

            s.close();
        }
        catch (Exception e){

        }


        return seances;
    }
}
