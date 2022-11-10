package edd_examen_práctico_eva_.pkg2;

/**
 * @author 21550292 | 21550332
 */
public class ArbolBin {

    private Nodo root;

    public ArbolBin() {
        this.root = null;
    }

    //Metodo publico para el usuario
    public void agregar(String valor) {
        if (root == null) {
            root = new Nodo(valor.toLowerCase());
        } else {
            agergarRecur(valor, root);
        }
    }

    //metodo recursivo agregra necesita el valor y el nodo actual
    private void agergarRecur(String valor, Nodo nodoActual) {
        Nodo nuevo = new Nodo(valor.toLowerCase());
        if (nuevo.getValor().compareTo(nodoActual.getValor()) < 0) { //va a la izquierda
            if (nodoActual.getIzquierda() == null) {
                nodoActual.setIzquierda(nuevo);
            } else {
                agergarRecur(valor, nodoActual.getIzquierda());
            }
        } else if (nuevo.getValor().compareTo(nodoActual.getValor()) > 0) { //va a la derecha
            if (nodoActual.getDerecha() == null) {
                nodoActual.setDerecha(nuevo);
            } else {
                agergarRecur(valor, nodoActual.getDerecha());
            }
        } else { //igual
            System.out.println("E L E M E N T O   R E P E T I D O!!");
        }
    }

    //metodo publico
    public void inOrder() {
        inOrderRecur(root);
        System.out.println("");
    }

    //metodo privado recursivo
    private void inOrderRecur(Nodo nodo) {
        if (nodo != null) {
            inOrderRecur(nodo.getIzquierda());
            System.out.print(nodo.getValor() + " - ");
            inOrderRecur(nodo.getDerecha());
        }
    }

    //metodo publico
    public void preOrder() {
        preOrderRecur(root);
        System.out.println("");
    }

    //metodo privado recursivo
    private void preOrderRecur(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.getValor() + " - ");
            preOrderRecur(nodo.getIzquierda());
            preOrderRecur(nodo.getDerecha());
        }
    }

    //metodo publico
    public void postOrder() {
        postOrderRecur(root);
        System.out.println("");
    }

    //metodo privado recursivo
    private void postOrderRecur(Nodo nodo) {
        if (nodo != null) {
            postOrderRecur(nodo.getIzquierda());
            postOrderRecur(nodo.getDerecha());
            System.out.print(nodo.getValor() + " - ");
        }
    }

    public void imprimir() {
        if (root == null) {
            System.out.println("LISTA VACÍA");
        } else {

        }
    }
    
    public void borrar(Nodo n, String v) {
        if (root==null) {
             System.out.println("Arbol vacio");
        }else {
            borrarRec(n,v);
        }
    }

    private Nodo borrarRec(Nodo n, String v){
        if(v.compareTo(n.getValor()) < 0){
            n.setIzquierda(borrarRec(n.getIzquierda(), v));
        }else if (v.compareTo(n.getValor()) > 0){
            n.setDerecha(borrarRec(n.getDerecha(),v));
        } else{
            if (n.getIzquierda()==null || n.getDerecha()==null) {
                Nodo temp = null;
                if (n.getIzquierda()==null) {
                    temp = n.getDerecha();
                }else if(n.getDerecha()==null){
                    temp = n.getIzquierda();
                }
                
                if (temp==null) {
                    return null;
                } else {
                    return n;
                }
            }else{
                Nodo s = sucesor(n);
                n.setValor(s.getValor());
                n.setDerecha(borrarRec(n.getDerecha(), v));
                return n;
            }
        }
        return n;
    }
    
    public Nodo sucesor(Nodo n){
        if (n==null) {
            return null;
        }
        Nodo temp =  n.getDerecha();
        while(temp.getIzquierda()!=null){
            temp = temp.getIzquierda();
        }
        return temp;
    }
}
