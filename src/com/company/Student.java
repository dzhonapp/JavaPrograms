package com.company;

/**
 * Created by bma on 10/27/17.
 */
public class Student {
    private String firstName, lastName, major;
    private int hoursAttempted;

    public Student (String fn, String ln, String m, int ha) {
        this.firstName = fn;
        this.lastName = ln;
        this.major = m;
        this.hoursAttempted = ha;
    }
    public Student () {
        firstName = "Unknown: ";
        lastName = "Unknown: ";
        major = "Unknown";
        hoursAttempted = 0;
    }

    public int getHoursAttempted(){
        return hoursAttempted;
    }

    public String getName() {
        return firstName + "" + lastName;
    }
    public String getMajor() {
        return major;
    }

    public String toString() {
        return "Student: " + lastName + ", " + firstName + "\n Major = " + major;
    }
public static void main(String[] args){


    System.out.println(bar(400));


    //Student berdi = new Student("Berdi", "Mammedov", "Computers", 5);
    //System.out.println(berdi.firstName);
    //Student s1 = new Student ("Jane", "Doe", "CS", 52);
    //berdi.hoursAttempted = 10;
    //System.out.println(berdi.hoursAttempted);
    //System.out.println(s1.equals("Jane Doe"));
int [] contacts = {3, 4, 5, 6, 7, 6} ;


}

    public static int bar (int n)  {
        if (n<0)
            return -1;
        int i = 0;
        while (n>0) {
            i++;
            n = n/2;
            System.out.println(n);

        }
        return i;
    }

}
