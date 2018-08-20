public class OperacionesVector{
	private String [] auxVector;

	public static float norma(String [] vector) {
		float suma = 0, indice;
		for(String a: vector) {
			indice = Float.parseFloat(a);
			indice = (float) Math.pow(indice,2);
			suma += indice;
		}
		return (float) Math.pow(suma, 0.5);
	}

	public static String [] productoEscalar(String [] vector, float escalar) {
		for (int i=0; i<vector.length; i++) {
			vector[i] = String.valueOf(Float.parseFloat(vector[i]) * escalar);
		}
		return vector;
	}

	public static String [] restaDeVectores(String[] vector1, String[] vector2){
		int length = vector1.length;
		String[] vector3 = new String[length];
		float[] resta = new float[length];
		for (int i = 0; i < length; i++) {
			resta[i] = Float.parseFloat(vector1[i]) - Float.parseFloat(vector2[i]);
			vector3[i] = String.valueOf(resta[i]);
		}
		return vector3;
	}

	public static String [] sumaDeVectores(String[] vector1, String[] vector2){
		int length = vector1.length;
		String [] vector3 = new String[length];
		float [] resta = new float[length];
		for (int i = 0; i < length; i++) {
			resta[i] = Float.parseFloat(vector1[i]) + Float.parseFloat(vector2[i]);
			vector3[i] = String.valueOf(resta[i]);
		}
		return vector3;
	}

	public static float productoPunto(String [] vector1, String [] vector2) {
		int length = vector1.length;
		float resultado = 0;

		for(int i = 0; i < length ; i++) {
			resultado += Float.parseFloat(vector1[i]) * Float.parseFloat(vector2[i]);
		}
		return resultado;
	}


    //Realiza el producto punto, útil en la operación ángulo
    public static float anguloVectores(String [] vector1, String [] vector2){
        //Realiza el producto punto
        float suma=0,norma1=0,norma2=0,angulo;
        for(int i=0; i<vector1.length; i++)
        {
            suma=suma+(Float.parseFloat(vector1[i])*Float.parseFloat(vector2[i]));
        }
        //Realiza las normas de los vectores
        norma1=OperacionesVector.norma(vector1);
        norma2=OperacionesVector.norma(vector2);
        //Saca el ángulo
        angulo=(float) ((float) Math.acos(suma/(norma1*norma2))*180/Math.PI);
        return angulo;
    }
}
