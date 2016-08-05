import java.util.*;

public class HelloWorld{

 //// No Need to Pass coefficients. Place methods in Class   
    public static void main(String []args){
        System.out.println("Hello World");
        ArrayList<Double> coefficients = new ArrayList<Double>();
        coefficients.add(2.3);
        coefficients.add(4.3);
        coefficients.add(5.1);
        System.out.println(toString(coefficients));
    }
    
    public static String toString(ArrayList<Double> coefficients) {
        return getFormat("^", "", coefficients);
    }
    
    public static String toHTML(ArrayList<Double> coefficients){
        String k = "<font size=\"20\">";
        k = k + getFormat("<sup>", "</sup>", coefficients);
        return k + "</font>";
    }
    
    public static String getLaTex(ArrayList<Double> coefficients) {
        String k = "\\(";
        k = k + getFormat("^", "", coefficients);
        return k + "\\)";
    }
    
    public static String getFormat(String prePower, String postPower, ArrayList<Double> coefficients) {
        String k = "";
        for(int i = 0; i < coefficients.size(); i++){
            if(coefficients.get(i) > 0){
                k = k + " + " + Math.abs(coefficients.get(i)) + "X" + prePower + (coefficients.size()-i) + postPower;
            }
            else if(coefficients.get(i) < 0){
                k = k + " - " + Math.abs(coefficients.get(i)) + "X" + prePower + (coefficients.size()-i) + postPower;
            }
        }
        if(coefficients.get(0) > 0)
            return k.substring(3);
        else
            return k;
    }
     
}