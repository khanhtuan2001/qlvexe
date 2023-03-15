/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;
import javax.swing.JOptionPane;
import java.awt.Component;
/**
 *
 * @author ASUS
 */
public class messagedialoghelper {
    public static void showMessageDialog(Component parent, String content ,String title ) {
        JOptionPane.showMessageDialog(parent, content ,title,JOptionPane.INFORMATION_MESSAGE );
    }
  public static void showErorDialog(Component parent, String content ,String title ) {
        JOptionPane.showMessageDialog(parent, content ,title,JOptionPane.ERROR_MESSAGE);
    }
  public static int showConfirmDialog(Component parent, String content ,String title ) {
       int choose =JOptionPane.showConfirmDialog(parent, content ,title,JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE );
      return choose;
 }
}
