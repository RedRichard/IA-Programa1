public class OperacionesVector{
    private String [] auxVector;
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
        for (int i=0; i<vector.length; i++) {
            vector[i] = String.valueOf(Float.parseFloat(vector[i]) * escalar);
        }
        // System.out.println(Arrays.toString(vector));
        return vector;
    }

    public static String [] restaDeVectores(String[] vector1,String[] vector2){
        int length = vector1.length;
        String[] vector3 = new String[length];
        float[] resta = new float[length];
        for (int i = 0; i < length; i++) {
            resta[i] = Float.parseFloat(vector1[i]) - Float.parseFloat(vector2[i]);
            vector3[i] = String.valueOf(resta[i]);
        }
        return vector3;
    }

}
