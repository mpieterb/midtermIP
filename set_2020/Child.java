package set_2020;

public class Child {
    private String name;
    private int age;
    private boolean isHere;
    private String activity;


    public Child(String name, int age) {
        this.name = name;
        this.age = age;
        isHere = false;
        activity = null;
    }

    public void setIsHere(boolean isHere) {
        if (isHere) {
            this.isHere = true;
        } else this.isHere = false;
    }

    public void setIsHere() {
        setIsHere(true);
    }

    public boolean isOlderThan(int ageLimit) {
        if (age >= ageLimit) {
            return true;
        } else return false;
    }

    public boolean setActivity(String newActivity) {
        if (activity == null || newActivity == null) {
            activity = newActivity;
            return true;
        } else return false;
    }

    public String getActivity() {
        return activity;
    }

    public void display() {
        if (isHere && getActivity() == null) {
            System.out.println(name + " (" + age + ") - is here");
        } else if (isHere && getActivity() != null) {
            System.out.println(name + " (" + age + ") - is here, " + getActivity());
        } else System.out.println(name + " (" + age + ") - is not here");
    }
}
