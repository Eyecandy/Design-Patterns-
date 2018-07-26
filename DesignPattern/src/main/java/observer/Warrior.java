package observer;

import java.util.Observable;
import java.util.Observer;

public class Warrior implements Observer {
    WarriorState warriorState = WarriorState.IDLE;
    @Override
    public void update(Observable o, Object arg) {
        Commander commander = (Commander) o;
        Command command = commander.getCurrentCommand();
        updateState(command);



    }
    private void updateState(Command command) {
        switch(command) {
            case FORM_POSITIONS:
                warriorState = WarriorState.IN_FRONT_LINE;
                break;
            case COMBAT_FORMATION:
                warriorState = WarriorState.SHIELDED_UP;
                break;
            case CHARGE:
                warriorState = WarriorState.CHARGING_ENEMY;
                break;
        }
    }
    public WarriorState getState() {
        return warriorState;
    }
}
