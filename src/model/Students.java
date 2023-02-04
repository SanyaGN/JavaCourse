package model;

public class Students implements Comparable<Students> {
    private String name;
    private int mark;

    public Students(String stringFromFile) {
        String[] split = stringFromFile.split("-");
        this.name = split[0];
        this.mark = Integer.parseInt(split[1]);
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Students o) {
        return this.mark - o.mark;
    }

    @Override
    public String toString() {
        return name + ": " + mark;
    }
}
