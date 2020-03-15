import javax.swing.*;  
import java.awt.event.*;  
import java.net.*;  
public class Whatismyip extends JFrame implements ActionListener{  
    JLabel l,w;  
    JTextField tf;  
    JButton b;  
Whatismyip(){  
    w=new JLabel("What's my IP??");
    w.setBounds(100,16,150,20);
    l=new JLabel("Enter URL:");  
    l.setBounds(50,70,150,20);;  
    tf=new JTextField();  
    tf.setBounds(50,100,200,20);  
      
    b=new JButton("Find IP");  
    b.setBounds(50,150,80,30);  
    b.addActionListener(this);  
    add(w);
    add(l); 
    add(tf);  
    add(b);  
    setSize(300,300);  
    setLayout(null);  
    setVisible(true);  
}  
public void actionPerformed(ActionEvent e){  
    String url=tf.getText();  
    try {  
        InetAddress ia=InetAddress.getByName(url);  
        String ip=ia.getHostAddress();  
        JOptionPane.showMessageDialog(this,ip);  
    } catch (UnknownHostException e1) {  
        JOptionPane.showMessageDialog(this,"Invalid web address!!!");  
    }  
}  
public static void main(String[] args) {  
    new Whatismyip();  
}  
}  