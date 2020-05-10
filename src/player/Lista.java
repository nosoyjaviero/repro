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
public class Lista {
   
   
   
    private Nodo first;
    private Nodo last;
    
    //para ir aumentado mientras creamos un nuevo nodo
    public static int size;
    
    //constructor
    public Lista(){
        first = null;
        last = null;
        size = 0;
       
    }
    //este método es para verificar si lista está vacía
    public boolean isEmpty(){
        if (first == null && last == null){
            return true;
        }else{
        return false;    
        }
    }
    public void agegaralfinal (  String f){
        
        
   if (isEmpty()){ 
       
       last= new Nodo(f,null,last);
           last.before.next=last;
   } else{
       first=last= new Nodo(f); 
   }
    }
    
    public int size(){
        if(isEmpty()){
            return 0;
        }else{
            return size;
        }
    }
    
    public int index(Nodo b){
        Nodo aux = first;
        int cont = 0;
        do{
            if (aux == b){
                return cont;
            }
            aux = aux.next;
            cont++;
        }
        while(aux != first);
        return -1;
    }
    
    public Nodo get_song(int index){
        if(index < 0 || index >= size){
            return null;
        }
        int n = 0;
        Nodo aux = first;
        while(n != index){
            aux = aux.next;
            n++;
        }
        return aux;
    }
    
    
     public String direccion_song(int index){
         
         
        if(index < 0 || index >= size){
            return null;
        }
        int n = 0;
        Nodo aux = first;
        while(n != index){
            aux = aux.next;
            n++;
        }
       
        return aux.getDirection() ;
    }
}
