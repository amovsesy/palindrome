/* Aleksandr Movsesyan
   Palindrome.java

   Inputs a word and outputs if the word is a palindrome or not
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Palindrome extends JApplet implements ActionListener
{
  JLabel intro,word;
  JTextField wordField;
  JButton checkPalindrome;
  Container layout;

  public void init()
  {

    layout = getContentPane();
    layout.setLayout(new FlowLayout());

    intro = new JLabel("Welcome to Alek's Palindorme Program!");
    layout.add(intro);

    word = new JLabel("Enter a word:");
    layout.add(word);

    wordField = new JTextField(25);
    layout.add(wordField);

    checkPalindrome = new JButton("Check if Palindrome");
    checkPalindrome.addActionListener(this);
    layout.add(checkPalindrome);
  }

  public void actionPerformed(ActionEvent ae)
  {
    String button = ae.getActionCommand();
    boolean yesNo;
    String text = wordField.getText();

    yesNo = checkPalindrome(text);

    if ( yesNo)
    {
      JOptionPane.showMessageDialog(null,"The word you entered is" +
                                         " a palindrome.");
    }
    else
    {
      JOptionPane.showMessageDialog(null,"The word you entered is" +
                                         " not a palindrome.");
    }
    wordField.setText("");
  }

  public boolean checkPalindrome( String original)
  {
    String ending;
    int repeat;

    ending = original.toLowerCase();

    int j = original.length();
    repeat = j / 2;

    for (int i=0; i < repeat; i++)
    {
      j--;
      if ( ending.charAt(i) !=  ending.charAt(j))
        return false;
    }

    return true;
  }
}