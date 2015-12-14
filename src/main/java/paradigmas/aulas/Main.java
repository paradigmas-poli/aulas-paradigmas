package paradigmas.aulas;

import paradigmas.aulas.model.*;
import paradigmas.aulas.model.Problema.Formato;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lenguajes = Arrays.asList("Java", "Python", "C++");
        List<Problema> problemas = new ArrayList<Problema>();

        List<CasoDePrueba> casosDePrueba1 = new ArrayList<CasoDePrueba>();
        casosDePrueba1.add(new CasoDePrueba(new File("suma2EnterosIn.txt"), new File("suma2EnterosOut.txt")));
        problemas.add(new Problema("Suma 2 Enteros", Formato.PLANO, 600L, casosDePrueba1));

        Universidad distrital = new Universidad("Distrital");
        Universidad politecnico = new Universidad("Politecnico Gran Colombiano");

        List<Equipo> equipos = new ArrayList<Equipo>();
        equipos.add(new Equipo(politecnico,
                new Estudiante("Oscar Said", "Fayad Rodriguez", 123456789, "adalid_negro@gmail.com", "sfayadr@poligran.edu.co", new Date(1983, 10, 02)),
                null,
                null));

        Competencia competencia = new Competencia(lenguajes, problemas, equipos);

    }
}
