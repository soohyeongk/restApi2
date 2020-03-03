package com.rest.api2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi2Controller {
	@RequestMapping(value = "getRestApi2", method = RequestMethod.GET)
	public String getRestApi2() {
		return "Get Rest Api2";
	}
}
