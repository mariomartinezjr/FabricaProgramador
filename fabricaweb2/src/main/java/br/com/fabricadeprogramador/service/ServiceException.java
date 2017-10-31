package br.com.fabricadeprogramador.service;

public class ServiceException extends Throwable{
	
	
	public ServiceException(String msg) {
		super(msg);
	}

	public ServiceException(String msg , Throwable causa) {
		super(msg,causa);
	}
}
