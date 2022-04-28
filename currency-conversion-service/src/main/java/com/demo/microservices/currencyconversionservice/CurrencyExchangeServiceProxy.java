package com.demo.microservices.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// se quita la URL estatica ya que se van a tener múltiples instancias del servicio corriendo para Ribbon
//@FeignClient(name = "currency-conversion-service", url = "localhost:8000")
@FeignClient(name = "currency-conversion-service")
@RibbonClient(name = "currency-conversion-service")
public interface CurrencyExchangeServiceProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);

}
