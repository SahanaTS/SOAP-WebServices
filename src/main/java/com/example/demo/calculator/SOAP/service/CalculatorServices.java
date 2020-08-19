package com.example.demo.calculator.SOAP.service;

import org.springframework.stereotype.Component;

import com.example.demo.calculate.Calculator;

@Component
public class CalculatorServices {
	private Calculator calculate=new Calculator();
	
	public float add(Calculator calculate) {
		return calculate.getNumber1()+calculate.getNumber2();
	}
	public float sub(Calculator calculate) {
		return calculate.getNumber1()-calculate.getNumber2();
	}
	public float Mul(Calculator calculate) {
		return calculate.getNumber1()*calculate.getNumber2();
	}
	public float Div(Calculator calculate) {
		return calculate.getNumber1()/calculate.getNumber2();
	}

}
