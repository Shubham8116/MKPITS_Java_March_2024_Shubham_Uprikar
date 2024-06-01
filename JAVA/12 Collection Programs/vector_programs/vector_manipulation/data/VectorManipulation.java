//class VectorMaipulation to perform operations on the Vectors
package vector_programs.vector_manipulation.data;

import java.util.Vector;

public class VectorManipulation {
    int output=0;
    Vector vector3=new Vector();
    public void addition(Vector vector1, Vector vector2)
    {
        output=0;
        for (int i = 0; i <vector1.size() ; i++) {
            output=(Integer.parseInt(vector1.get(i).toString()))+(Integer.parseInt(vector2.get(i).toString()));
            vector3.add(i,output);
        }
        System.out.println(vector3);
        vector3.clear();
    }
    public void subtraction(Vector vector1, Vector vector2)
    {
        output=0;
        for (int i = 0; i <vector1.size() ; i++) {
            output=(Integer.parseInt(vector1.get(i).toString()))-(Integer.parseInt(vector2.get(i).toString()));
            vector3.add(i,output);
        }

        System.out.println(vector3);
        vector3.clear();
    }
    public void scalerMultiplication(Vector vector1)
    {
        int scaler=10;
        output=0;
        for (int i = 0; i < vector1.size(); i++) {
            output=(Integer.parseInt(vector1.get(i).toString()))*scaler;
            vector3.add(i,output);

        }
        System.out.println(vector3);
        vector3.clear();
    }
    public void dotProduct(Vector vector1, Vector vector2)
    {
        output=0;
        for (int i = 0; i <vector1.size() ; i++) {
            output+=(Integer.parseInt(vector1.get(i).toString()))*(Integer.parseInt(vector2.get(i).toString()));

        }
        System.out.println(output);
        vector3.clear();
    }
}
