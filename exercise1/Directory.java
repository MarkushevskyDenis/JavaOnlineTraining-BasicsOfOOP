package by.jonline.grow.basicsofoop.exercise1;

import java.util.Objects;

public class Directory {

    private String path;

    public Directory(){

    }

    public Directory(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(path, directory.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path);
    }


}
