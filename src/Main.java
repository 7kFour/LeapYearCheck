public class Main {

    public static void main(String[] args) {

        LeapYear.isLeapYear(1924); //true
        LeapYear.isLeapYear(1600); //true
        LeapYear.isLeapYear(-1600); //false
        LeapYear.isLeapYear(2017); //false
        LeapYear.isLeapYear(2000); //true
        LeapYear.isLeapYear(1800); //false
    }
}
