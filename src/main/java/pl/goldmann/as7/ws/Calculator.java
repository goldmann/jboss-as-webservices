package pl.goldmann.as7.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Calculator {

  @WebMethod
  public long sum(long a, long b);
}

