package com.guilhermelinares.demospring.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = -1294265652652940139L;

	public ResourceNotFoundException(Object id) {
		super("Resouce not found. Id " + id);
	}
	
}
