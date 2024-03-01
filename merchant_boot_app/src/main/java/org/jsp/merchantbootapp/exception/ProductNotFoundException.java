package org.jsp.merchantbootapp.exception;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
public class ProductNotFoundException extends RuntimeException{
		public ProductNotFoundException(String message) {
			super(message);
		}
	}
