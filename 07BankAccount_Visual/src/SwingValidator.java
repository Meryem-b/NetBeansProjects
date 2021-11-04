

import javax.swing.*;
import javax.swing.text.JTextComponent;

public class SwingValidator
{
    public static boolean isPresent(JTextComponent c, String fieldName)
    {
        if (c.getText().length() == 0)
        {
            showMessage(c, fieldName + " is a required field.");
            c.requestFocusInWindow();
            return false;
        }
        return true;
    }

    public static boolean isInteger(JTextComponent c, String fieldName)
    {
        try
        {
            int i = Integer.parseInt(c.getText());
            return true;
        }
        catch (NumberFormatException e)
        {
            showMessage(c, fieldName + " must be an integer.");
            c.requestFocusInWindow();
            return false;
        }
    }

    public static boolean isDouble(JTextComponent c, String fieldName)
    {
        try
        {
            double d = Double.parseDouble(c.getText());
            return true;
        }
        catch (NumberFormatException e)
        {
            showMessage(c, fieldName + " must be a valid real number.");
            c.requestFocusInWindow();
            return false;
        }
    }

    public static boolean isPositive(JTextComponent c, String fieldName)
    {
        try
        {
            double d = Double.parseDouble(c.getText());
            if (d < 0.) throw new RuntimeException();
            else return true;
        }
        catch (RuntimeException e)
        {
            showMessage(c, fieldName + " must be a positive number.");
            c.requestFocusInWindow();
            return false;
        }
    }
    
    private static void showMessage(JTextComponent c, String message)
    {
            JOptionPane.showMessageDialog(c, message, "Invalid Entry",
                JOptionPane.ERROR_MESSAGE);
    }
}