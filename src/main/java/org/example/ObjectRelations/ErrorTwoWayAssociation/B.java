package org.example.ObjectRelations.ErrorTwoWayAssociation;

public class B {
    private A myAObj;

    public A getMyAObj() {
        return myAObj;
    }

    public B(A myAObj) {
        this.myAObj = myAObj;
    }
}
