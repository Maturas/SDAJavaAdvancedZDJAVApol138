package org.example.ObjectRelations.Association;

// 1 A has 1 B
// A associates with B
public class A {
    private B myBObj;

    public A(B myBObj) {
        this.myBObj = myBObj;
    }

    public B getMyBObj() {
        return myBObj;
    }
}
