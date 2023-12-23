package com.SpringPractice.Beans;

public class ClassRoom {
    private String name;
    private int roll_No;
    private boolean isPass;

    public ClassRoom() {
        super();
        System.out.println("Hello From ClassRoom Bean Created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_No() {
        return roll_No;
    }

    public void setRoll_No(int roll_No) {
        this.roll_No = roll_No;
    }

    public boolean isPass() {
        return isPass;
    }

    public void setPass(boolean pass) {
        this.isPass = pass;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "name='" + name + '\'' +
                ", roll_No=" + roll_No +
                ", isPass=" + isPass +
                '}';
    }
}
