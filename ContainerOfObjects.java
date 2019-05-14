/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeStore;

/**
 *
 * @author czaro
 */
public class ContainerOfObjects {

    private final int DEFAULT_SIZE = 100;
    private Object[] objects;
    private int numElem;

    public ContainerOfObjects(Object[] objects) {
        this.objects = objects;
        this.numElem= objects.length;
    }

    public ContainerOfObjects() {
        objects = new Object[DEFAULT_SIZE];
    }

    public ContainerOfObjects(int maxSize) {
        objects = new Object[maxSize];
        
    }

    protected boolean AddObject(Object object) {
        if (numElem < this.objects.length) {
            this.objects[numElem++] = object;
            return true;
        } else {
            return false;
        }

    }

    protected Object removeObject(int position) {
        if (position >= 0 && position < this.objects.length && position < this.numElem) {
            Object retObject = this.objects[position];
            for (int i = position; i < this.numElem-1;) {
                this.objects[i] = this.objects[++i];
            }
            numElem--;
            return retObject;
        }
        else{
            return null;
        }
    }

    
    protected boolean setObject(int position, Object object) {
        if (position >= 0 && position < this.objects.length && position < this.numElem) {
            this.objects[position] = object;
            return true;
        } else {
            return false;
        }
    }

    protected int findObject(Object obj) {
        for (int i = 0; i < this.numElem; i++) {
            if (obj.equals(this.objects[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "ContainerOfObjects{" + "objects=" + objects + '}';
    }
    
    
    
    protected void setObjects(Object[] objects){
        if(objects.length < this.objects.length){
            System.arraycopy(objects, 0, this.objects,0,objects.length);
            this.numElem=objects.length;
        }
        else{
            System.arraycopy(objects, 0, this.objects,0,this.objects.length);
            this.numElem=this.objects.length;
        }
    }    
    
    protected void printAll(){
        for(int i=0; i<this.numElem; i++){
            System.out.println(this.objects[i].toString());
        }
    }
    
    protected Object[] getObjects(){
        return this.objects;
    }
    
    protected int getNumElem(){
        return this.numElem;
    }
}
