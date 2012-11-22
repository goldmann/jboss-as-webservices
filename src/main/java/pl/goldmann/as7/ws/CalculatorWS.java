package pl.goldmann.as7.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "pl.goldmann.as7.ws.Calculator", serviceName = "CalculatorWS")
public class CalculatorWS implements Calculator {     

  public long sum(long a, long b) {
    return a + b;
  }
}

