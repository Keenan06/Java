package Chap7;

public class Truck extends  Vehicle{
    Truck(int p, int f, int m, int c) {
        super(p,f,m);

        cargocap = c;
    }

    //accessors
    int getCargo(){
        return cargocap;
    }
    void putCargo(int c){
        cargocap = c;
    }
}
