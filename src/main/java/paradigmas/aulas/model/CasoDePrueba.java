package paradigmas.aulas.model;

import java.io.File;
import java.util.List;

public class CasoDePrueba {
    private File entrada;
    private File salida;
    private List<SolucionOficial> solucionesOficiales;

    public CasoDePrueba(File entrada, File salida) {
        this.entrada = entrada;
        this.salida = salida;
    }
}
