
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

public class swing implements ActionListener{
    JFrame ventana;
    JButton primboton;
    JButton segboton;
    JButton terboton;
    JPanel panel;
    JDialog mensaje;
    int contador;

    public swing(){
        ventana=new JFrame ("Botones");
        ventana.setBounds(10,10,410,210);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        agregar();
        ventana.pack();
        ventana.setVisible(true);
    }
    private void agregar(){
        primboton = new JButton("Primer Boton");
        primboton.addActionListener(this);
        segboton = new JButton("Segundo Boton");
        segboton.addActionListener(this);
        terboton = new JButton("Tercer Boton");
        terboton.addActionListener(this);

        panel = new JPanel();
        panel.setLayout(new GridLayout(15,1));

        panel.add(primboton);
        panel.add(segboton);
        panel.add(terboton);
        ventana.add(panel, BorderLayout.CENTER);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(primboton)){
            try{
                if (contador != 0) {
                    contador = 0;
                    throw new ArithmeticException(" ");
                }
                else
                {
                    contador+=1;
                }
            }
            catch(Exception i){
                JOptionPane.showMessageDialog(ventana,"Orden Incorrecto");
            }
        }
        try{
            if(e.getSource().equals(segboton)){
                if (contador != 1) {
                    contador = 0;
                    throw new ArithmeticException("Orden incorrecto");
                }
                else
                {
                    contador+=1;
                }
            }
        }
        catch(Exception i){
            JOptionPane.showMessageDialog(ventana,"Orden Incorrecto");
        }
        try{
            if(e.getSource().equals(terboton)){
                if (contador != 2) {
                    contador = 0;
                    throw new ArithmeticException("Orden incorrecto");
                }
                else{
                    contador+=1;
                }
            }
        }
        catch(Exception i){
            JOptionPane.showMessageDialog(ventana,"Orden Incorrecto");
        }
        if(contador==3){
            JOptionPane.showMessageDialog(ventana,"Orden Correcto");
            contador = 0;
        }
    }
}
