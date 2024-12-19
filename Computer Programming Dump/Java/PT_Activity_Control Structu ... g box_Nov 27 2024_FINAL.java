import javax.swing.*;


public class JavaLogin 
{

    static final int cardNumber = 1234567890;
    static final int pin = 1234;
    static int cardNumberInput;
    static int pinInput;
    static int balance = 1000;

    public static void main(String[] args) 
    {
        cardNumberInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter your card number", JOptionPane.QUESTION_MESSAGE));
        loginCardNum(cardNumberInput);
        System.err.println("Back to main with Number");
        pinInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter your PIN", JOptionPane.QUESTION_MESSAGE));
        loginPIN(pinInput);
        System.err.println("Back to main with PIN");
        System.err.println("Initializing Account...");
        mainWindow();
        System.err.println("Closing Program...");
        System.exit(0);
    }

    public static void loginCardNum(int inCardNumber) 
    {
        while (true) 
        {
            if (inCardNumber == cardNumber && String.valueOf(inCardNumber).length() == 10) 
            {
                System.err.println("Correct Number!");
                break;
            } 
            else if (inCardNumber != cardNumber && String.valueOf(inCardNumber).length() == 10) 
            {
                System.err.println("Incorrect Number!");
                inCardNumber = Integer.parseInt(JOptionPane.showInputDialog("Incorrect number!\nPlease Enter your card number again", JOptionPane.ERROR_MESSAGE));
            } 
            else if (String.valueOf(inCardNumber).length() != 10) 
            {
                System.err.println("Number should have 10 digits!");
                inCardNumber = Integer.parseInt(JOptionPane.showInputDialog("Number must have 10 digits!\nPlease Enter your card number again", JOptionPane.ERROR_MESSAGE));
            }
        }
        return;
    }

    public static void loginPIN(int inPINNumber) 
    {
        if (inPINNumber == pin && String.valueOf(inPINNumber).length() == 4) 
        {
            System.err.println("Correct PIN");
            return;
        } 
        else if (inPINNumber != pin && String.valueOf(inPINNumber).length() == 4) 
        {
            System.err.println("Incorrect PIN");
            JOptionPane.showMessageDialog(null, "Incorrect PIN! The program will now exit.", "Incorrect PIN!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } 
        else if (String.valueOf(inPINNumber).length() != 4) 
        {
            System.err.println("PIN should have 4 digits!");
            JOptionPane.showMessageDialog(null, "PIN should have 4 digits!\nThe program will now exit.", "PIN should have 4 digits!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    public static void mainWindow() 
    {
        String[] options = {"Deposit", "Withdraw", "Close"};

        int optionSelected = JOptionPane.showOptionDialog(null, "Your Balance is: ₱" + balance, "ATM", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        switch (optionSelected) 
        {
            case 0:
                deposit();
                break;
            case 1:
                withdraw();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Bruh");
                System.exit(0);
                break;
        }
        
    }
    
    public static void deposit()
    {
        System.err.println("Deposit Window!");
        int depositedAmount = Integer.parseInt(JOptionPane.showInputDialog(null, "How much do you want to deposit?", JOptionPane.QUESTION_MESSAGE));
        balance += depositedAmount;
        JOptionPane.showMessageDialog(null, "You deposited: ₱" + depositedAmount + "\nYour balance is now: ₱" + balance + "\n\n\nClick OK to exit.", "Account", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    public static void withdraw()
    {
        System.err.println("Withdraw Window!");
        int withdrewAmount = Integer.parseInt(JOptionPane.showInputDialog(null, "How much do you want to withdraw?", JOptionPane.QUESTION_MESSAGE));
        if(withdrewAmount <= balance)
        {
            balance -= withdrewAmount;
            JOptionPane.showMessageDialog(null, "You withdrew: ₱" + withdrewAmount + "\nYour balance is now: ₱" + balance + "\n\n\nClick OK to exit.", "Account", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(withdrewAmount > balance)
        {
            System.err.println("Insufficient Balance!");
            JOptionPane.showMessageDialog(null, "You can't withdraw more than your available balance!", "Insufficient Balance", JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }
}
