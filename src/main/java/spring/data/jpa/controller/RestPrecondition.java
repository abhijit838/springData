package spring.data.jpa.controller;

import java.util.Collection;

import spring.data.jpa.exception.RequestedResourceNotFoundException;


public class RestPrecondition {
	
	public static <T> T checkFound(final T resource){
		 if (resource == null
		            || (resource instanceof Collection
		                && ((Collection) resource).isEmpty())
		            || (resource instanceof Iterable
		                && !((Iterable) resource).iterator().hasNext())) {
		            throw new RequestedResourceNotFoundException();
		        }
		        return resource;
	}
}
