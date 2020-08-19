package com.example.demo.calculator.SOAP.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.demo.calculate.GetCalculatorRequest;
import com.example.demo.calculate.GetCalculatorResponse;
import com.example.demo.calculate.Calculator;
import com.example.demo.calculator.SOAP.service.CalculatorServices;


@Endpoint
public class CalculateEndPoint {

	@Autowired
	private CalculatorServices service;
	
	@PayloadRoot(namespace="http://demo.example.com/calculate" ,localPart="GetCalculatorRequest")
	@ResponsePayload
	public GetCalculatorResponse processCourseDetailRequest(@RequestPayload GetCalculatorRequest request) {
		GetCalculatorResponse response=new GetCalculatorResponse();
		if(request.getOperation().equals("+"))
		{
			
			Calculator calculate=new Calculator();
			calculate.setNumber1(request.getNumber1());
			calculate.setNumber2(request.getNumber2());
			calculate.setOperator(request.getOperation());
			calculate.setResult(service.add(calculate));			
			response.setCalculator(calculate);
			return response;
		}
		else if(request.getOperation().equals("-"))
		{
			
			Calculator calculate=new Calculator();
			calculate.setNumber1(request.getNumber1());
			calculate.setNumber2(request.getNumber2());
			calculate.setOperator(request.getOperation());
			calculate.setResult(service.sub(calculate));			
			response.setCalculator(calculate);
			return response;
		}
		else if(request.getOperation().equals("*"))
		{
			
			Calculator calculate=new Calculator();
			calculate.setNumber1(request.getNumber1());
			calculate.setNumber2(request.getNumber2());
			calculate.setOperator(request.getOperation());
			calculate.setResult(service.Mul(calculate));			
			response.setCalculator(calculate);
			return response;
		}
		else
		{
			
			Calculator calculate=new Calculator();
			calculate.setNumber1(request.getNumber1());
			calculate.setNumber2(request.getNumber2());
			calculate.setOperator(request.getOperation());
			calculate.setResult(service.Div(calculate));			
			response.setCalculator(calculate);
			return response;
		}

}
}

