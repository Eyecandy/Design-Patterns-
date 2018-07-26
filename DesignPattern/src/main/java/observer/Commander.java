package observer;


import java.util.Observable;
import java.util.Observer;

public class Commander extends Observable {
    Command currentCommand;

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public synchronized int countObservers() {
        return super.countObservers();
    }

    public void setCommand(Command command) {
        currentCommand = command;
        setChanged();
        notifyObservers();
    }
    public Command getCurrentCommand() {
        return currentCommand;
    }



}
