package set_2020;

import java.util.ArrayList;

public class DayCare {
    private String name;
    private Child[] children;
    private int childCount;
    
    
    public DayCare(String name, int maxChildren) {
        this.name = name;
        children = new Child[maxChildren];
        childCount = 0;
    }

    public void signUp(Child child) throws TooManyChildren {
        if (childCount < children.length){
            children[childCount] = child;
            childCount++;
        } else throw new TooManyChildren();
    }

    public boolean attemptSignUp(Child child) {
        try {
            signUp(child);
            return true;
        }
        catch (Exception TooManyChildren) {
            return false;
        }
    }

    public void display() {
        System.out.println("--- " + name + " (" + children.length + ") ---");
        for (int i = 0; i < childCount; i++) {
            children[i].display();
        }
    }
}
