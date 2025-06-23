package lab14;

import java.util.ArrayList;

public class subject {
    private int state = 0;
     private ArrayList<observ> list = new ArrayList<>();
     public void add(observ item){
         list.add(item);
     }

     public void setState(int val){
         if (val != this.state){
             this.state = val;
             notifyAllObs();
         }
     }

     public int getState(){
         return state;
     }

     public void notifyAllObs(){
         for (observ ob : list) {
             ob.notify2(state);
         }
     }

}
