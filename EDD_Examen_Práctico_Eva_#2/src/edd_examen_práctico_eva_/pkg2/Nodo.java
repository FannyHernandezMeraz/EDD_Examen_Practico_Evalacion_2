package edd_examen_práctico_eva_.pkg2;

/**
 * @author 21550292 | 21550332
 */
public class Nodo {

    private String valor;
    private Nodo derecha;
    private Nodo izquierda;

    public Nodo() {
        this.derecha = null;
        this.izquierda = null;
    }

    public Nodo(String valor) {
        this.valor = valor;
        this.derecha = null;
        this.izquierda = null;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

}
