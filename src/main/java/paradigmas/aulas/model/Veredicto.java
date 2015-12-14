package paradigmas.aulas.model;

public class Veredicto {
    enum Respuesta {
        Accepted, WrongAnswer, TimeLimitExceeded, RuntimeError
    }
    Respuesta respuesta;
}
