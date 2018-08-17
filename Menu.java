import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.util.Arrays;

//Clase encargada de desplegar el menu
public class Menu{
    private String [] vector1, vector2;
    private int escalar;
    public Menu()
    {
        String opcion = JOptionPane.showInputDialog(null,"Escoja una de las siguientes opciones\n1.- Suma\n2.- Resta\n3.- Producto por un escalar\n4.- Norma\n5.-Angulo entre dos vectores" );

        switch (opcion){
            case "1":
                subMenuSumaResta();
                if(vector1.length != vector2.length){
                    JOptionPane.showMessageDialog(null,"La longitud de los vectores es diferente"
                    ,"error",JOptionPane.ERROR_MESSAGE);
                }else {
                    MostrarMensaje("el nuevo vector es: " +
                    Arrays.toString(OperacionesVector.sumaDeVectores(vector1, vector2)));
                }
            break;
            case "2":
                subMenuSumaResta();
                if(vector1.length != vector2.length){
                    JOptionPane.showMessageDialog(null,"La longitud de los vectores es diferente"
                    ,"error",JOptionPane.ERROR_MESSAGE);
                }else {
                    MostrarMensaje("el nuevo vector es: " +
                    Arrays.toString(OperacionesVector.restaDeVectores(vector1, vector2)));
                }
            break;
            case "3":
                SubmenuVector();
                SubmenuEscalar();
                MostrarMensaje("El producto de por el escalar es: " + Arrays.toString(OperacionesVector.productoEscalar(vector1, escalar)));
            break;
            case "4":
                SubmenuVector();
                MostrarMensaje("La norma es: " + OperacionesVector.norma(vector1));
                break;
            default:
                //En caso de que la opcion no sea válida se ejecuta el menu otravez
                Menu menu = new Menu();
            break;
        }
    }

    public void subMenuSumaResta(){
        JTextField xField = new JTextField(100);
        JTextField yField = new JTextField(100);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new BoxLayout(myPanel, BoxLayout.Y_AXIS));
        myPanel.add(new JLabel("dame el vector x separado por comas"));
        myPanel.add(xField);
        myPanel.add(new JLabel("dame el vector y separado por comas"));
        myPanel.add(yField);
        int result = JOptionPane.showConfirmDialog(null, myPanel, "Please Enter X and Y Values",
                JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("x value: " + xField.getText());
            System.out.println("y value: " + yField.getText());
            vector1 = xField.getText().split(",");
            vector2 = yField.getText().split(",");
        }
    }

    public void SubmenuVector(){
        vector1 = JOptionPane.showInputDialog(null,"Escriba el vector separado por comas\nEjem.  10,2,7,40,56" ).split(",");
    }

    public void SubmenuEscalar(){
        escalar = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el escalar: "));
    }

    public void MostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
