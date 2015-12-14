package paradigmas.aulas.model;

import java.util.List;

public class Competencia {
    private final List<String> lenguajes;
    private final List<Problema> problemas;
    private final List<Equipo> equipos;

    public Competencia(List<String> lenguajes, List<Problema> problemas, List<Equipo> equipos) {
        this.lenguajes = lenguajes;
        this.problemas = problemas;
        this.equipos = equipos;
    }
}
