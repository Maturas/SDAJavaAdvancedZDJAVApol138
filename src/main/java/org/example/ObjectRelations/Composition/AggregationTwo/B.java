package org.example.ObjectRelations.Composition.AggregationTwo;

public class B {
    private C myCObj;

    public C getMyCObj() {
        return myCObj;
    }

    public B(C myCObj) {
        this.myCObj = myCObj;
    }
}
