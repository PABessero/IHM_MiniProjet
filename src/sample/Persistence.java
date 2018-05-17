package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Persistence {
    private File fichier;

    public Persistence(String unNom){
        fichier = new File(unNom);
    }

    public void sauve(ObservableList<Seance> uneListe){

    }

    public ObservableList<Seance> restaure() throws IOException {

        ObservableList<Seance> seances = FXCollections.observableArrayList();
        try{
            Scanner s = new Scanner(fichier);
            while (s.hasNext()){
                Seance seance = new Seance();
                seance.setMatiere(s.next());
                seance.setDuree(s.nextInt());
                seance.setEnseignant(s.next());
                seance.setHeure(LocalDate.parse(s.next()));
                seance.setNature(s.next());
                seance.setDate(LocalDate.of(s.nextInt(), s.nextInt(), s.nextInt()));
                seances.add(seance);
            }

            s.close();
        }


        return seances;
    }
}
