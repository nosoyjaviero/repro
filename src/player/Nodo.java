/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

/**
 *
 * @author Javier
 */
public class Nodo {

    private String direction;
    public Nodo next;
    public Nodo before;

    public Nodo() {
      
        this.direction = "No se ha definido";
        this.next = null;
        this.before = null;
    }
    public Nodo (String direction){
    this(direction,null,null);
    }

    public Nodo(String direction,Nodo next, Nodo before ) {
        
        this.direction = direction;
        this.next = next;
        this.before = before;
    }
    
//    Nodo(String name, String direction) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }


    /**
     * @return the name
     */
 

    /**
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * @return the next
     */
    public Nodo getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Nodo next) {
        this.next = next;
    }

    /**
     * @return the before
     */
    public Nodo getBefore() {
        return before;
    }

    /**
     * @param before the before to set
     */
    public void setBefore(Nodo before) {
        this.before = before;
    }

}
