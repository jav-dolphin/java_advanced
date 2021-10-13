package lesson1;

import java.util.Objects;

public class Pudge {
    private String name;
    private int level;

    public Pudge(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "lesson1.Pudge{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pudge pudge = (Pudge) o;
        return level == pudge.level && name.equals(pudge.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level);
    }
}
