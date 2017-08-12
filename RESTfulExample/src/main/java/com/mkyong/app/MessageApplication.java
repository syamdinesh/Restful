package com.mkyong.app;

import java.util.HashSet;
import java.util.Set;

import com.mkyong.rest.MessageRestService;

/**
 * 
 * 
 * @author syam
 *
 */
public class MessageApplication{
	private Set<Object> singletons=new HashSet<Object>(); 

	public MessageApplication() {
		singletons.add(new MessageRestService());
	}

	public Set<Object> getSingletons() {
		return singletons;
	}
}
