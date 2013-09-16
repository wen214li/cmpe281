package cokemachine;

/**
 * Write a description of class v1.S0 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class S20 implements State {
    // reference to v1.State machine
    private CokeMachine m;

    public S20(CokeMachine _m) {
        this.m = _m;
    }

    public void insertNickel() {
        m.setState(CokeMachineState.S25);
    }

    public void insertDime() {
        m.setState(CokeMachineState.S30);
    }

    public void insertQuarter() {
        m.setState(CokeMachineState.S45);
    }

    public void ejectCoke() {
        System.out.println("Not Enough Money!");
    }

}
