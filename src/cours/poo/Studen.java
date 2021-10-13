package cours.poo;


import java.util.ArrayList;

import java.util.List;

public class Studen {

    /**
     * create a student object with a name & 2 marks
     * create a method to calculate the avg
     * create a method to print name & avg
     */

//variables
    public String name;
    public List<Integer> marks;

    //constructor
    public Studen(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }
        //methods
        public double giveAverage() {
            double total = 0;
            double average = 0;
            for (int mark : marks) {
                total += this.marks.get(mark);
                average = total / this.marks.size();
            }return average;
        }
        public void show () {
            System.out.println("the student " + this.name + " has gotten an average of " + this.giveAverage() + " this semester.");
        }
    }

