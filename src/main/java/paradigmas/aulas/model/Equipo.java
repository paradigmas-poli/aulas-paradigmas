package paradigmas.aulas.model;

import java.util.List;

public class Equipo {
    private final Universidad universidad;
    private final Estudiante estudiante1;
    private final Estudiante estudiante2;
    private final Estudiante estudiante3;
    private List<Solucion> soluciones;

    public Equipo(Universidad universidad, Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {
        this.universidad = universidad;
        this.estudiante1 = estudiante1;
        this.estudiante2 = estudiante2;
        this.estudiante3 = estudiante3;
    }

    public void addSolucion(Solucion solucion){
        soluciones.add(solucion);
    }
}
