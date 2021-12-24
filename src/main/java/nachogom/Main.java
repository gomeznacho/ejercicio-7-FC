package nachogom;


import nachogom.candidato.Candidato;
import nachogom.candidato.CandidatosList;
import nachogom.candidato.Presencialidad;
import nachogom.etiqueta.Etiqueta;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        CandidatosList.addCandidato(new Candidato(1,"cand1", "Madrid", "666666", "email@email.email", true, Presencialidad.REMOTO, 2,new ArrayList<Etiqueta>()));
        CandidatosList.addCandidato(new Candidato(2,"cand2", "Valencia", "666777", "email2@email.email", false, Presencialidad.MIXTO, 1, new ArrayList<Etiqueta>()));
        CandidatosList.addCandidato(new Candidato(3,"cand3", "Madrid", "666888", "email3@email.email", true, Presencialidad.REMOTO, 1, new ArrayList<Etiqueta>()));
        CandidatosList.addCandidato(new Candidato(4,"cand4", "Barcelona", "666999", "email4@email.email", true, Presencialidad.REMOTO, 3, new ArrayList<Etiqueta>()));


    }
}
