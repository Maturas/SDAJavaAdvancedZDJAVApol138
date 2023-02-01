package org.example.ObjectRelations.Composition.AggregationTwo;

import java.util.ArrayList;
import java.util.List;

// 1 A has 1 C via Many B
// A aggregates B, which associate with C
public class A {
    private B[] myBObjs;

    public B[] getMyBObjs() {
        return myBObjs;
    }

    public A(B[] myBObjs) {
        this.myBObjs = myBObjs;
    }

    public void useComposition() {
        List<C> myCObjs = new ArrayList<>();
        for (B myBObj : myBObjs) {
            myCObjs.add(myBObj.getMyCObj());
        }
    }
}
