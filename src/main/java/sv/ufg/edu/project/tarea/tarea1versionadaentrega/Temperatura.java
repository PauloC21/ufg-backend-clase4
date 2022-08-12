package sv.ufg.edu.project.tarea.tarea1versionadaentrega;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

@WebService
public class Temperatura {
    @WebMethod(operationName = "Fahrenheit2Celcius")
    public String Fahrneit2Celcius(@WebParam(name = "temperaturaFahrenheit") Double grad) {
        double celsius = ((grad - 32)* 5)/9;
        return "Celsius :" + celsius;
    }

    @WebMethod(operationName = "Celsius2Fahrenheit")
    public String Celcius2Fahrenheit (@WebParam(name = "temperaturaCelcius") Double grad)
    {
        double fahrenheit = (grad * 9/5) + 32;
        return "Fahrenheit :" + fahrenheit;
    }
}
