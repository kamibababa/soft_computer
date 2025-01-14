package org.computer.circuit;

public class Wire {
    String name;
    boolean value;

    public Wire(String name, boolean value) {
        this.name = name;
        this.value = value;
    }

    public void setValue(boolean value){
        this.value = value;
    }

    public boolean getValue(){
        return this.value;
    }

    @Override
    public String toString() {
        return "Wire{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
