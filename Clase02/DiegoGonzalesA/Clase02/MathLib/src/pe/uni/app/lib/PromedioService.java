package pe.uni.app.lib;

public class PromedioService {

    public double promedio(double n1, double n2) {
        double pr;
        pr = (n1 + n2) / 2;
        return pr;
    }

    public double promedio(double n1, double n2, double n3) {
        double pr;
        pr = (n1 + n2 + n3) / 3;
        return pr;
    }

    public double promedio(double n1, double n2, double n3, double n4) {
        double pr;
        pr = (n1 + n2 + n3 + n4) / 4;
        return pr;
    }

}
