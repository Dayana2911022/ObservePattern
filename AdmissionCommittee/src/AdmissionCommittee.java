import java.util.ArrayList;
import java.util.List;

public class AdmissionCommittee implements IObservable{
    private List<IObserver> observers =new ArrayList<>();
    private List<String> grants =new ArrayList<>();

    public void addGrants (String grants){
        this.grants.add(grants);
        notifyAllObservers();
    }
    @Override
    public void register(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregister(IObserver observer) {
        this.observers.remove(observer);

    }

    @Override
    public void notifyAllObservers() {
        for(IObserver observer: this.observers){
            observer.update(this.grants);
        }

    }
}
