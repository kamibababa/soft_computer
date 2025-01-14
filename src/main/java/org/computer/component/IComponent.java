package org.computer.component;

public interface IComponent {
    void connectOutput(IComponent iComponent);
    void setInputWire(int index, boolean value);
    boolean getOutputWire(int index);
}
