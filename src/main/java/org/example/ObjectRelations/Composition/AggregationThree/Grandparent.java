package org.example.ObjectRelations.Composition.AggregationThree;

import java.util.ArrayList;
import java.util.List;

// 1 A has Many C via Many B
// 1 A aggregates B, which aggregate C
public class Grandparent {
    private Parent[] myParentObjs;

    public Parent[] getMyBObjs() {
        return myParentObjs;
    }

    public Grandparent(Parent[] myParentObjs) {
        this.myParentObjs = myParentObjs;
    }

    public void useComposition() {
        List<Child> myChildObjs = new ArrayList<>();
        for (Parent myParentObj : myParentObjs) {
            for (Child childObj : myParentObj.getMyCObjs()) {
                myChildObjs.add(childObj);
            }
        }
    }
}
