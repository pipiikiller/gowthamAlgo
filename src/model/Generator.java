package model;

/**
 * Created by WinHan on 13/3/17.
 */
public class Generator {
    private int number;

    public Generator(int number){
        this.number= number;
    }
    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Generator generator = (Generator) o;

        return number == generator.number;
    }

    @Override
    public int hashCode() {
        return number;
    }
}
