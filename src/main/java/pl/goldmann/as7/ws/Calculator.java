package pl.goldmann.as7.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Calculator {

  @WebMethod
  public float add(float a, float b);

  @WebMethod
  public float sub(float a, float b);

  @WebMethod
  public float multiply(float a, float b);

  @WebMethod
  public float divide(float a, float b);
}

