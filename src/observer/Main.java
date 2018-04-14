package observer;

import java.util.logging.Logger;

/**
 * Behavioral Design Pattern
 */

public class Main {
    private static final Logger LOGGER = Logger.getLogger(observer.Main.class.getName());
    public static void main(String[] args) {
        Commander commander = new Commander();
        Warrior warrior = new Warrior();
        Artillery artillery = new Artillery();
        commander.addObserver(warrior);
        commander.addObserver(artillery);
        System.out.println(commander.countObservers());

        for (Command c: Command.values()) {
            commander.setCommand(c);
            LOGGER.info("Commander gives command: " + c);
            LOGGER.info("Artillery is now: "+ artillery.getState());
            LOGGER.info("Warrior is now:  "+ warrior.getState());
            LOGGER.info("---------------------");


        }


    }
}
