package com.demo.controllers;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

import org.aspectj.lang.annotation.Before;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.demo.service.VinValidatorService;

@RunWith(MockitoJUnitRunner.class)
public class VinValidatorControllerTest {
	
	@Mock
	private VinValidatorService vinValidatorService;

	@InjectMocks
	private VinValidatorController vinValidatorController;

	
	@Test
	public void validateTest() {
		MockitoAnnotations.initMocks(this);
		Mockito.when(vinValidatorService.validate(Mockito.anyString())).thenReturn(new Boolean(true));
		
		Boolean response = vinValidatorController.validate("");
		
		Assert.assertNotNull(response);
	}
}
