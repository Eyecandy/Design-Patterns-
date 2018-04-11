package observer;

import java.util.Observable;
import java.util.Observer;

public class Artillery implements Observer {
    ArtilleryState artilleryState = ArtilleryState.IDLE;
    @Override
    public void update(Observable o, Object arg) {
        Commander commander = (Commander) o;
        Command command = commander.getCurrentCommand();
        updateState(command);
    }
    private void updateState(Command command) {
        switch (command) {
            case FORM_POSITIONS:
                artilleryState = ArtilleryState.IN_BACK_LINE;
                break;
            case COMBAT_FORMATION:
                artilleryState = ArtilleryState.LOCKED_AND_LOADED;
                break;
            case FIRE:
                artilleryState = ArtilleryState.SHOOTING_ON_COMMAND;
                break;
            case CHARGE:
                artilleryState = ArtilleryState.FIRING_AT_WILL;
                break;
        }
    }
    public ArtilleryState getState() {
        return artilleryState;
    }
}
