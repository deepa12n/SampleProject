package com.sample.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping(method=RequestMethod.GET,path="/sampleMessage")
	public String sampleMessage() {
		return "Sample Message";
	}
}
