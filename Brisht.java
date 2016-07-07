import javax.swing.*;
public class Brisht 
{ public static void main(String[] args)
{ 
 String viti = JOptionPane.showInputDialog("Jepni te hollat ne euro");
       int vitiConvert= new Integer(viti).intValue();
       
       if((vitiConvert%4==0 && vitiConvert%100 != 0) || vitiConvert%400==0)
       {JOptionPane.showMessageDialog(null, "Viti "+vitiConvert+" eshte vit i brishte");}
       else {JOptionPane.showMessageDialog(null, "Viti "+vitiConvert+" nuk eshte vit i brishte");}
       }
       }
   