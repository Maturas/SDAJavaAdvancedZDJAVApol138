package org.example.FunctionalProgramming;

public class CalculatingObject {
    private Integer value;

    public static void example() {
        Integer result = createNew(10)
                .add(15)
                .mul(3)
                .div(2)
                .sub(5)
                .add(200)
                .mul(4)
                .div(10)
                .getValue();
        System.out.println(result);
    }

    public CalculatingObject(Integer value) {
        this.value = value;
    }

    public static CalculatingObject createNew(Integer initialValue) {
        return new CalculatingObject(initialValue);
    }

    public CalculatingObject add(Integer toAdd) {
        this.value += toAdd;
        return this;
    }

    public CalculatingObject sub(Integer toSub) {
        this.value -= toSub;
        return this;
    }

    public CalculatingObject mul(Integer toMul) {
        this.value *= toMul;
        return this;
    }

    public CalculatingObject div(Integer toDiv) {
        this.value /= toDiv;
        return this;
    }

    public Integer getValue() {
        return value;
    }
}
