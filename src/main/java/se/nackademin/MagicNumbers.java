package se.nackademin;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;

    public int calculateA() {
        int number = 0;
        for(char c : name.toCharArray()) {
            if(c == ' ') {
                number++;
            }
        }
        number += income;
        while(number > 9) {
            number -= 7;
        }
        return number;
    }

    public int calculateB() {
        int number = location.length();
        number += income;
        while(number > 9) {
            number -= 7;
        }
        return number;
    }

    public int calculateC() {
        int number = calculateA() + calculateB();
        number -= height;
        while(number < 0) {
            number += 10;
        }
        return number;
    }

    public int calculateD() {
        int number = calculateA();
        if(number > 5) {
            number += calculateB();
        }
        else {
            number += calculateC();
        }
        number -= income;
        while(number < 0) {
            number += 10;
        }
        return number;
    }

    public int calculateE() {
        double number = age;
        for(int i = 0; i < 2; i++) {
            number *= income;
        }
        number *= height;
        number = Math.sqrt(number);
        while(number > 9) {
            number /= 2;
        }
        return (int) Math.round(number);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
