package homework;

public class FirstClass {
    public static void main(String[] args) {
        //task1();
        task2();
    }
    static void task1() {
        String country = "Estonia";
        double populationMillion = 1.3;
        double areaSquareKm = 45.339;
        String capital = "Tallinn";
        boolean ES = true;
        char €;

        System.out.println(country + " is a country in Northern Europe. The capital city " +
                capital + " and Tartu are the two largest urban areas of the country. Total area of " +
                country + " are " + areaSquareKm + " square kilometres. With a population of just over " +
                populationMillion + " million, it is one of the least populous members of the European Unions.");
    }
    static void task2() {
        int val1 = 12;
        int val2 = 5;
        int val3 = 15;
        int val4 = 6;

        System.out.println(val1 + " + " + val2 + " = " + (val1 + val2) );
        System.out.println(val3 + " + " + val4 + " = " + (val3 + val4) );
        System.out.println(val3 + " + " + val2 + " = " + (val3 + val2) );

        System.out.println(val1 + " - " + val2 + " = " + (val1 - val2));
        System.out.println(val4 + " - " + val2 + " = " + (val4 - val2));
        System.out.println(val1 + " - " + val4 + " = " + (val1 - val4));

        System.out.println(val3 + " * " + val4 + " = " + (val4 * val3));
        System.out.println(val3 + " * " + val2 + " = " + (val3 * val2));
        System.out.println(val1 + " * " + val2 + " = " + (val1 * val2));

        System.out.println(val1 +  "/" + val2 + " = " + (val1 / val2));
        System.out.println(val3 +  "/" + val2 + " = " + (val3 / val2));
        System.out.println(val4 +  "/" + val2 + " = " + (val4 / val2));

        System.out.println(val1 + " % " + val2 + " = " + (val1 % val2));
        System.out.println(val1 + " % " + val2 + " = " + (val1 % val2));
        System.out.println(val1 + " % " + val2 + " = " + (val1 % val2));
    }
}
