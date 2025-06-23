package visitor;

import java.util.ArrayList;
import java.util.Arrays;

public class VisitorPatternDemo {
    public static void main(String[] args) {


        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}