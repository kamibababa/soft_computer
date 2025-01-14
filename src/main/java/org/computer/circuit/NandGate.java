package org.computer.circuit;

public class NandGate {
    private Wire output;

    public NandGate() {
        this.output = new Wire("NandGate",false);
    }

    public void run(boolean inputA, boolean inputB){
        this.output.setValue(!(inputA && inputB));
    }

    public boolean getOutput(){
        return this.output.getValue();
    }

    @Override
    public String toString() {
        return "NandGate{" +
                "output=" + output +
                '}';
    }
}
