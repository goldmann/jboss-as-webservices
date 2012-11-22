package pl.goldmann.as7.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "pl.goldmann.as7.ws.Calculator", serviceName = "CalculatorWS")
public class CalculatorWS implements Calculator {     

  public float add(float a, float b) {
    return a + b;
  }

  public float sub(float a, float b) {
    return a - b;
  }

  public float multiply(float a, float b) {
    return a * b;
  }

  public float divide(float a, float b) {
    return a / b;
  }
}

