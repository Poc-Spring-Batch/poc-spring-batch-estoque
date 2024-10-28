package br.com.pupposoft.poc.springbatch.estoque.exception;

public abstract class SystemBaseException extends RuntimeException {
	private static final long serialVersionUID = 443911183945646720L;

	
	public abstract String getCode();
	public abstract Integer getHttpStatus();
	@Override
	public abstract String getMessage();

}
