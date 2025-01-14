package org.computer.storage;
import org.computer.circuit.Wire;
import org.computer.component.IComponent;
import org.computer.constant.Const;

public class Word implements IComponent{

    Wire[] inputs;
    Bit[] bits;
    Wire[] outputs;
    IComponent next;

    public Word() {
        inputs = new Wire[Const.BUS_WIDTH];
        outputs = new Wire[Const.BUS_WIDTH];
        bits = new Bit[Const.BUS_WIDTH];
        for(int i = 0; i < bits.length; i++){
            bits[i] = new Bit();
        }
    }

    @Override
    public void connectOutput(IComponent iComponent) {
        this.next = iComponent;
    }

    @Override
    public void setInputWire(int index, boolean value) {
        this.inputs[index].setValue(value);
    }

    @Override
    public boolean getOutputWire(int index) {
        return this.outputs[index].getValue();
    }

    public void run(boolean set){
        for(int i = 0; i < this.inputs.length; i++){
            this.bits[i].run(this.inputs[i].getValue(), set);
            this.outputs[i].setValue(this.inputs[i].getValue());
        }
        if(this.next != null){
            for(int i = 0; i < this.outputs.length; i++){
                this.next.setInputWire(i, this.outputs[i].getValue());
            }
        }
    }
}
