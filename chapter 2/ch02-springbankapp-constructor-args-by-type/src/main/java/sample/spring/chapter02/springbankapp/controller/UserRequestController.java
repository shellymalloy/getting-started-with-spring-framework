package sample.spring.chapter02.springbankapp.controller;

import sample.spring.chapter02.springbankapp.domain.Request;

public interface UserRequestController {
	void submitRequest(Request request);
}
