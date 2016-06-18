package io.github.aritzack.saws;

import io.github.aritzhack.aritzh.bds.Transient;

import java.util.Random;

/**
 * @author aritzh
 */
public class Test implements ITest {

    private String name;

    @Transient
    private String trans;

    public Test() {
        this.name = "Not deserialized";
        this.trans = "What?";
    }

    public Test(String name, String trans) {
        this.name = name;
        this.trans = trans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return name != null ? name.equals(test.name) : test.name == null && (trans != null ? trans.equals(test.trans) : test.trans == null);

    }

    @Override
    public int hashCode() {
        return name.hashCode() + 31 * trans.hashCode();
    }

    @Override
    public void method1(String arg1) {
        System.out.println("Running method1 with arg " + arg1);
    }

    @Override
    public void method2(String arg1) {
        System.out.println("Running method2 with arg " + arg1);
    }
}
