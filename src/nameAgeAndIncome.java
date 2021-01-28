import javax.swing.*;

public class nameAgeAndIncome {
    public static void main(String[] args){
       String name, userInput;
       int age;
       double desiredAnnualPay;

       name = JOptionPane.showInputDialog("Please enter your name:");
       userInput= JOptionPane.showInputDialog("Please enter your age: ");
       age = Integer.parseInt(userInput);
       userInput = JOptionPane.showInputDialog("Please enter your desired wage: ");
       desiredAnnualPay = Double.parseDouble(userInput);

        JOptionPane.showMessageDialog(null, "Hello my name is " + name +
                " and I am " + age + " years old and my desired annual wage is " + desiredAnnualPay);
    }
}
