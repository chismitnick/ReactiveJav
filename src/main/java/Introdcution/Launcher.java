package Introdcution;

import io.reactivex.Observable;
public class Launcher {
    public static void main(String[] args) {
//Declare the observable object which will push five strings
        //observables can push data data or events from various sources
Observable<String> stringObservable =
Observable.just("One","Two","Three","Four","Five");
    }
}
