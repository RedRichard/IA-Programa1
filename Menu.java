import javax.swing.JOptionPane;
import java.util.Arrays;

//Clase encargada de desplegar el menu
public class Menu{
    private String [] vector;
    private int escalar;
    public Menu()
    {
        String opcion = JOptionPane.showInputDialog(null,"Escoja una de las siguientes opciones\n1.- Suma\n2.- Resta\n3.- Producto por un escalar\n4.- Norma\n5.-Angulo entre dos vectores" );
        
        switch (opcion){
            case "3":
                SubmenuVector();
                SubmenuEscalar();
                MostrarMensaje("El producto de por el escalar es: " + Arrays.toString(OperacionesVector.productoEscalar(vector, escalar)));
            case "4":   
                SubmenuVector();
                MostrarMensaje("La norma es: " + OperacionesVector.norma(vector));
                break;
            default:
                //En caso de que la opcion no sea válida se ejecuta el menu otravez
                Menu menu = new Menu();
        }
    }    

    public void SubmenuVector(){
        vector = JOptionPane.showInputDialog(null,"Escriba el vector separado por comas\nEjem.  10,2,7,40,56" ).split(",");
    }

    public void SubmenuEscalar(){
        escalar = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el escalar: "));
    }

    public void MostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
}