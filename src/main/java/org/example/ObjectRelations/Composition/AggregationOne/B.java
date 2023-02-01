package org.example.ObjectRelations.Composition.AggregationOne;

public class B {
    private C[] myCObjs;

    public C[] getMyCObjs() {
        return myCObjs;
    }

    public B(C[] myCObjs) {
        this.myCObjs = myCObjs;
    }
}
