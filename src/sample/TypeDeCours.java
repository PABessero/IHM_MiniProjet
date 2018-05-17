package sample;

public enum TypeDeCours {
    COURS("Amphi"),
    TD("TD"),
    TP("TP");
    String nom;
    TypeDeCours(String nom){
        this.nom = nom;
    }
}
