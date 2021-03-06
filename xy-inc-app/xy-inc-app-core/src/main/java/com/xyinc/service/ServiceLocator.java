package com.xyinc.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public final class ServiceLocator implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private ApplicationContext applicationContext;

	private static final ServiceLocator INSTANCE = new ServiceLocator();

	private ServiceLocator() {

	}

	public static ServiceLocator getInstance() {
		return INSTANCE;
	}

	public IPontoInteresseService getPontoInteresseService() {
		return applicationContext.getBean("pontoInteresseService", IPontoInteresseService.class);
	}
}
