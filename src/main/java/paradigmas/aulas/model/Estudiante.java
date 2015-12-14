package paradigmas.aulas.model;

import java.util.Date;

public class Estudiante {
    private String nombres;
    private String apellidos;
    private int documento;
    private String correoPersonal;
    private String correoInstitucional;
    private Date fechaDeNacimiento;

    public Estudiante(String nombres, String apellidos, int documento, String correoPersonal, String correoInstitucional, Date fechaDeNacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.correoPersonal = correoPersonal;
        this.correoInstitucional = correoInstitucional;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}
