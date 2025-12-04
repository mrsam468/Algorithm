package booklibrary;

public class People implements Comparable<People> {
   private String name;
    private int decision;

    public People(String name, int decision){
        this.name = name;
        this.decision = decision;
    }
    public int compareTo(People comparedPeople){
        return Integer.compare(
                 this.decision,comparedPeople.decision
        );
    }
    public String toString(){
        return name;
    }
}
