package it.uniroma3.siw.spring.controller.validator;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


import it.uniroma3.siw.spring.model.Buffet;
import it.uniroma3.siw.spring.service.BuffetService;

@Component
public class BuffetValidator implements Validator{

	@Autowired
	private BuffetService personaService;
	
	@Override
	public boolean supports(Class<?> pClass)	{
		return Buffet.class.equals(pClass);
	}
	
	@Override
	public void validate(Object target, Errors errors)	{
		;
	}
	
	
}
