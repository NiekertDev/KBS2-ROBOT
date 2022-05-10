import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScherm extends JFrame implements ActionListener {

    private JButton jbVoorraad;
    private JButton jbRoute;
    private JButton jbOrders;
    private JButton jbTaken;
    private JButton jbToevoegen;
    private JButton jbDozen;

    public MainScherm(){
        setTitle("Titel");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(9, 1, 0, 0));
        setLocationRelativeTo(null);

        JLabel jlHome = new JLabel("Home", SwingConstants.CENTER);
        jlHome.setFont(new Font("Verdana", Font.BOLD, 20));
        add(jlHome);

        jbVoorraad = new JButton("Voorraad");
        jbVoorraad.setPreferredSize(new Dimension(400, 40));
        jbVoorraad.addActionListener(this);
        JPanel sizePanel1 = new JPanel();
        sizePanel1.add(jbVoorraad);
        add(sizePanel1);

        jbRoute = new JButton("Route");
        jbRoute.setPreferredSize(new Dimension(400, 40));
        jbRoute.addActionListener(this);
        JPanel sizePanel2 = new JPanel();
        sizePanel2.add(jbRoute);
        add(sizePanel2);

        jbOrders = new JButton("Orders");
        jbOrders.setPreferredSize(new Dimension(400, 40));
        jbOrders.addActionListener(this);
        JPanel sizePanel3 = new JPanel();
        sizePanel3.add(jbOrders);
        add(sizePanel3);

        jbTaken = new JButton("Taken");
        jbTaken.setPreferredSize(new Dimension(400, 40));
        jbTaken.addActionListener(this);
        JPanel sizePanel4 = new JPanel();
        sizePanel4.add(jbTaken);
        add(sizePanel4);

        jbToevoegen = new JButton("Order toevoegen");
        jbToevoegen.setPreferredSize(new Dimension(400, 40));
        jbToevoegen.addActionListener(this);
        JPanel sizePanel5 = new JPanel();
        sizePanel5.add(jbToevoegen);
        add(sizePanel5);

        jbDozen = new JButton("Dozen");
        jbDozen.setPreferredSize(new Dimension(400, 40));
        jbDozen.addActionListener(this);
        JPanel sizePanel6 = new JPanel();
        sizePanel6.add(jbDozen);
        add(sizePanel6);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbVoorraad){
            new DialoogVoorraad();
            this.dispose();
        }
    }
}
