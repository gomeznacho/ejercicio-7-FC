package nachogom.candidato;

import nachogom.etiqueta.Etiqueta;
import nachogom.repositories.CandidatosRepo;

import java.util.ArrayList;

public class CandidatosList {
    public static void addCandidato(Candidato candidato){
        CandidatosRepo.candidatosRepository.add(candidato);
    }

    public static void deleteCandidatoById(int id){
       Candidato c = CandidatosRepo.findById(id);
       CandidatosRepo.candidatosRepository.remove(c);
    }

    public ArrayList<Candidato> filtrar(String ciudad){
        ArrayList<Candidato> porCiudad = new ArrayList<>();
        for(Candidato c : CandidatosRepo.candidatosRepository){
            if (c.getCiudad().equals(ciudad))
                porCiudad.add(c);
        }
        return porCiudad;
    }

    public ArrayList<Candidato> filtrarPresen(String presencialidad){
        ArrayList<Candidato> porPresencialidad = new ArrayList<>();
        for(Candidato c : CandidatosRepo.candidatosRepository){
            if(c.getPresencialidad().toString().contains(presencialidad))
                porPresencialidad.add(c);
        }

        return porPresencialidad;
    }

    public ArrayList<Candidato> filtrar(Etiqueta etiqueta){
        ArrayList<Candidato> porEtiqeta = new ArrayList<>();
        for(Candidato c : CandidatosRepo.candidatosRepository) {
            if (c.etiquetas.contains(etiqueta))
                porEtiqeta.add(c);
        }
        return porEtiqeta;
    }


    public static ArrayList<Candidato> filtrar(boolean tipoTraslado){
        ArrayList<Candidato> porMovilidad = new ArrayList<>();
        for(Candidato c : CandidatosRepo.candidatosRepository){
            if (c.isMovilidad())
                porMovilidad.add(c);
        }
        return porMovilidad;
    }

    public static ArrayList<Candidato> filtrar(String ciudad, String presencialidad, boolean tipoTraslado){
        ArrayList<Candidato> porCiudadPresenTras = new ArrayList<>();
        String presen= "Presencialidad." + presencialidad.toUpperCase();
        for(Candidato c : CandidatosRepo.candidatosRepository){
            if ((c.getCiudad().equals(ciudad) && c.getPresencialidad().equals(presen)) || c.isMovilidad())
                porCiudadPresenTras.add(c);
        }
        return porCiudadPresenTras;
    }

    public static Candidato buscarEmail(String email) {
        for (Candidato c : CandidatosRepo.candidatosRepository) {
            if (c.getEmail().equals(email)) ;
            System.out.println(c);
            return c;
        }
        System.out.println("No existe un candidato con ese email");
        return null;
    }
    public static Candidato buscarTelefono(String telefono) {
        for (Candidato c : CandidatosRepo.candidatosRepository) {
            if (c.getTelefono().equals(telefono)) ;
            return c;
        }
        System.out.println("No existe un candidato con ese teléfono");
        return null;
    }

}
