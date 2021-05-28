package codes.recursive.aq;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class DemoType {
    private String name;
    private int num;

    public DemoType() {
    }

    public DemoType(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
