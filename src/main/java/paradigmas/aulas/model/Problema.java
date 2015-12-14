package paradigmas.aulas.model;

import java.io.File;
import java.util.List;

public class Problema {
    private final String titulo;
    private String enunciado;
    private File fileEnunciado;
    public enum Formato {
        TXT, PDF, DOC, DOCX, ODT, PLANO
    }
    private final Formato formato;
    private final long tiempoLimiteSegundos;
    private final List<CasoDePrueba> casosDePrueba;

    public Problema(String titulo, Formato formato, long tiempoLimiteSegundos, List<CasoDePrueba> casosDePrueba) {
        this.titulo = titulo;
        this.formato = formato;
        this.tiempoLimiteSegundos = tiempoLimiteSegundos;
        this.casosDePrueba = casosDePrueba;
    }
}
