package org.example.ObjectRelations.Composition.Association;

// 1 A has 1 C via 1 B
// A associates with B, which associates with C
public class A {
    private B myBObj;

    public B getMyBObj() {
        return myBObj;
    }

    public A(B myBObj) {
        this.myBObj = myBObj;
    }

    public void useComposition() {
        C myCObj = myBObj.getMyCObj();
    }
}
