package sv.ufg.edu.project.tarea.tarea1versionadaentrega;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

@WebService
public class Aritmetica {
    @WebMethod(operationName ="Suma")
    public String Suma (@WebParam(name="val1")double val1, @WebParam(name ="val2")double val2)
    {
        double result = val1 + val2;
        return "Result: " + result;
    }

    @WebMethod(operationName ="Resta")
    public String Resta (@WebParam(name="val1")double val1, @WebParam(name ="val2")double val2)
    {
        double result = val1 - val2;
        return "Result: " + result;
    }

    @WebMethod(operationName ="Multiplicacion")
    public String Multiplicacion (@WebParam(name="val1")double val1, @WebParam(name ="val2")double val2)
    {
        double result = val1 * val2;
        return "Result: " + result;
    }

    @WebMethod(operationName ="Division")
    public String Division (@WebParam(name="val1")double val1, @WebParam(name ="val2")double val2)
    {
        if(val2 == 0)
        {
            return "no se puede dividir entre 0";
        }

        double result = val1 / val2;
        return "Result: " + result;
    }
}
