import javax.swing.*;  
public class list1  
{  
     list1(){  
        JFrame f= new JFrame();  
        DefaultListModel<String> l1 = new DefaultListModel<>();  
          l1.addElement("c lang");  
          l1.addElement("c++");  
          l1.addElement("python");  
          l1.addElement("java");  
          JList<String> list = new JList<>(l1);  
          list.setBounds(100,100, 75,75);  
          f.add(list);  
          f.setSize(400,400);  
          f.setLayout(null);  
          f.setVisible(true);  
     }  
public static void main(String args[])  
    {  
    new list1();  
    }
}  
