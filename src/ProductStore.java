import java.util.ArrayList;
import java.util.List;

class ProductStore implements Observable {
    private List<Observer> observers = new ArrayList<>();

    //implement obeserver class
    @Override
    public void addObserver(Observer observer) {

    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyObservers(Product product) {

    }
}