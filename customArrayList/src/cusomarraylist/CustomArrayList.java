package cusomarraylist;

import java.util.AbstractList;
import java.util.Collection;

public class CustomArrayList<E>  {


    Object[] a=null;
    int index=0;
    CustomArrayList(int size){
        a=new Object[size];
    }
    CustomArrayList() {
        a=new Object[10];
    }
    public CustomArrayList(Collection<? extends E> collection) {
        a = new Object[collection.size()];
        for (E e : collection) {
            a[index] = e;
            index++;
        }
    }
    public void add(E obj) {
        if(index>=a.length) {
            increaseSize();
        }
        a[index]=obj;
        index++;
    }

    public void increaseSize() {
        int newsize=a.length+(a.length/2);
        Object[] obj=new Object[newsize];
        for(int i=0;i<a.length;i++) {
            obj[i]=a[i];
        }
        a=obj;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=0;i<a.length;i++){
            if(i==(a.length-1)){

                sb.append(a[i]);


            }else{
                if(null!=a[i]){
                    sb.append(a[i]+",");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public  E get(int index){
        if(index<0 || index>=a.length){
            throw new IndexOutOfBoundsException();
        }

        return (E) a[index];
    }

    public E remove(int indexToBeDeleted) throws IndexOutOfBoundsException{
        Object obj=get(indexToBeDeleted);
        int noOfShiftsOperstion=a.length-indexToBeDeleted-1;
        if(noOfShiftsOperstion>0){
            System.arraycopy(a,indexToBeDeleted+1,a,indexToBeDeleted,noOfShiftsOperstion);
        }
        a[--index]=null;
        return (E) obj;


    }

    public int size(){
        return a.length;
    }


}











