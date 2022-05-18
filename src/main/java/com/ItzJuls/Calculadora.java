package com.ItzJuls;

import java.lang.Integer;

public class Calculadora {

	private int Num1;
	private int Num2;
	private char Op;
	private float res;
	
	public int getNum1() {
		return Num1;
	}
	public void setNum1(int num1) {
		Num1 = num1;
	}
	public int getNum2() {
		return Num2;
	}
	public void setNum2(int num2) {
		Num2 = num2;
	}
	public char getOp() {
		return Op;
	}
	public void setOp(char op) {
		Op = op;
	}
	public float getRes() {
		return res;
	}
	public void setRes(float res) {
		this.res = res;
	}
	
	public void Calcular()
	{
		switch (Op) {
		case '+':
			res= Num1+Num2;
			break;
		case '-':
			res= Num1-Num2;
			break;
		case '*':
			res= Num1*Num2;
			break;
		case '/':
			float a= Num1;
			float b= Num2;
			res= a/b;
			break;
			
			default:
				break;
		}
	}
}
