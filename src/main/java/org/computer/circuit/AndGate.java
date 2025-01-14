package org.computer.circuit;

public class AndGate {
    private Wire output;

    public AndGate() {
        this.output = new Wire("AndGate",false);
    }

    public void run(boolean inputA, boolean inputB){
        this.output.setValue(inputA && inputB);
    }

    public boolean getOutput(){
        return this.output.getValue();
    }
}
