package org.example.ObjectRelations.Composition.AggregationThree;

public class Parent {
    private Child[] myChildObjs;

    public Child[] getMyCObjs() {
        return myChildObjs;
    }

    public Parent(Child[] myChildObjs) {
        this.myChildObjs = myChildObjs;
    }
}
