public class OperacionesVector{
    public static float norma(String [] vector){
        float suma = 0, indice;
        for (String a: vector)
        {
            indice = Float.parseFloat(a);
            indice = (float) Math.pow(indice,2);
            suma += indice;
        }
        return (float) Math.pow(suma, 0.5);
    }

    public static String [] productoEscalar(String [] vector, int escalar){
        for (String a: vector)
        {
            a = String.valueOf(Float.parseFloat(a) * escalar);
        }
        return vector;
    }

}