package org.example.FunctionalProgramming.FunctionChaining;

public class LambdaCalculatingObject {
    private Integer value;

    public static void example() {
        Integer result = createNew(10)
                .calc(x -> x + 15)
                .calc(x -> x * 3)
                .calc(x -> x / 2)
                .calc(x -> x - 5)
                .calc(x -> (x + 200) * 4 / 10)
                .getValue();
        System.out.println(result);
    }

    public LambdaCalculatingObject(Integer value) {
        this.value = value;
    }

    public static LambdaCalculatingObject createNew(Integer initialValue) {
        return new LambdaCalculatingObject(initialValue);
    }

    public LambdaCalculatingObject calc(LambdaCalculation calculation) {
        this.value = calculation.calc(this.value);
        return this;
    }

    public Integer getValue() {
        return this.value;
    }
}
