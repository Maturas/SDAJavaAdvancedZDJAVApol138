package org.example.ObjectRelations.Aggregation;

// 1 Parent has Many Children
// Parent aggregates Children
public class Parent {
    private Child[] children;

    public Child[] getChildren() {
        return children;
    }

    public Parent(Child[] children) {
        this.children = children;
    }
}
