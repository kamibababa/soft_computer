package org.computer.storage;

import org.computer.circuit.NandGate;
import org.computer.circuit.Wire;

import java.util.Arrays;

public class Bit {
    NandGate[] gates;
    Wire output;

    public Bit() {
        gates = new NandGate[4];
        for(int i = 0; i < gates.length; i++){
            gates[i] = new NandGate();
        }
        this.output = new Wire("Bit", false);
    }

    public boolean getOutput() {
        return output.getValue();
    }

    public void run(boolean input, boolean set){
        for(int i = 0; i < 2; i++){
            this.gates[0].run(input, set);
            this.gates[1].run(this.gates[0].getOutput(), set);
            this.gates[2].run(this.gates[0].getOutput(), this.gates[3].getOutput());
            this.gates[3].run(this.gates[2].getOutput(), this.gates[1].getOutput());
            this.output.setValue(this.gates[2].getOutput());
        }
    }

    public static void main(String[] args) {
        Bit bit = new Bit();
        bit.run(false, true);
//        bit.run(true, true);
        System.out.println(bit.getOutput());
//        Arrays.stream(bit.gates).forEach(item->System.out.println(item));
    }
}
