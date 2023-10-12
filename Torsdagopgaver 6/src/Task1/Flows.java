package Task1;
public class Flows {

    public void methodA(String input) {
        System.out.println("J");
        if (!input.equals("start")) {
            System.out.println("b");
            methodB("start");
        } else {
            System.out.println("a");
            System.out.println(methodC(input));

        }
        System.out.println("s");
    }

    public void methodB(String start) {
        if (start.equals("start")) {
            System.out.println("a");
            System.out.println("e");
        }
        else{

        }
    }

    public String methodC(String input) {
        System.out.println("v");
        methodB("start");
        return "r";
    }

    public void methodD(int number) {
        System.out.println("j");
        System.out.println("o");
        if (number > 5) {
            System.out.println("v");
        }
        System.out.println("t");

    }


}
