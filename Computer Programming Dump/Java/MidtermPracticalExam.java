import javax.swing.*;
import java.lang.*;

public class MidtermPracticalExam
{
    static String itemName;
    static int itemQuantity = 0;
    static int itemQuantityAdd;
    static double itemPrice = 0;
    static double itemPriceAdd;
    
    public static void main(String[] args)
    {
        transact();
    }
    public static void transact()
    {
        itemName = JOptionPane.showInputDialog( "Please enter item name: ");
        
        while(true)
        {
            itemQuantityAdd = Integer.parseInt(JOptionPane.showInputDialog( "Please enter amount to buy: "));
            if(itemQuantityAdd < 1)
            {
                JOptionPane.showMessageDialog(null, "Value cannot be empty!");
            }
            else if(itemQuantityAdd >= 1)
            {
                break;
            }
        }
        itemQuantity += itemQuantityAdd;
        System.out.println(itemQuantity); // debug purposes
        
        while(true)
        {
            itemPriceAdd = Double.parseDouble(JOptionPane.showInputDialog( "Please enter item price: "));
            if(itemPriceAdd < 1)
            {
                JOptionPane.showMessageDialog(null, "Value cannot be empty!");
            }
            else if(itemPriceAdd >= 1)
            {
                break;
            }
        }
        itemPrice += (itemPriceAdd * itemQuantity);
        
        JOptionPane.showMessageDialog(null, "Shopping Cart: \n\nItem Name: " + itemName + "\nItem Quantity: " + itemQuantityAdd + "\nItem Price: ₽" + String.format("%.2f", itemPriceAdd) + "\n\nTotal Quantity: " + itemQuantity + "\nTotal Price: ₽" + String.format("%.2f", itemPrice));
        newTransaction();
    }
    public static void newTransaction()
    {
        int isTransact = 0;
        
        isTransact = JOptionPane.showConfirmDialog(null, "Do you want to add items?");
        System.out.println(isTransact); // debug purposes
        
        switch(isTransact)
        {
            case 0:
                transact();
                break;
            case 1:
                finalReceipt();
                break;
            case 2:
                finalReceipt();
                break;
        }
    }
    public static void finalReceipt()
    {
        double discountedPrice;
        
        JOptionPane.showMessageDialog(null, "Shopping Cart: \n\nItem Name: " + itemName + "\nItem Quantity: " + itemQuantityAdd + "\nItem Price: ₽" + String.format("%.2f", itemPriceAdd) + "\n\nTotal Quantity: " + itemQuantity + "\nTotal Price: ₽" + String.format("%.2f", itemPrice) + "\n\nClick OK to exit");
        
        if(itemPrice < 50)
        {
            JOptionPane.showMessageDialog(null, "Thank you for shopping!");
        }
        else if(itemPrice >= 50 && itemPrice < 100)
        {
            discountedPrice = (itemPrice - (itemPrice * 0.10));
            JOptionPane.showMessageDialog(null, "You received a 10% discount!\n\nYour total price is now: ₽" + String.format("%.2f", discountedPrice) + "\n\nThank you for shopping!");
        }
        else if(itemPrice >= 100)
        {
            discountedPrice = (itemPrice - (itemPrice * 0.15));
            JOptionPane.showMessageDialog(null, "You received a 15% discount!\n\nYour total price is now: ₽" + String.format("%.2f", discountedPrice) + "\n\nThank you for shopping!");
        }
        
        System.exit(0);
    }
    
}
