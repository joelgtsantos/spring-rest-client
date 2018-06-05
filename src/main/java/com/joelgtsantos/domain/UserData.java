/**
 * 
 */
package com.joelgtsantos.domain;

import java.util.List;

/**
 * @author Joel Santos
 *
 * spring-rest-client
 * 2018
 */
public class UserData {
	List<User> data;
	
    public void setData(List<User> data) {
        this.data = data;
    }

	/**
	 * @return
	 */
	public List<User> getData() {
		return data;
	}

}
