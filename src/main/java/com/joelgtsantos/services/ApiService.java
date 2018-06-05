/**
 * 
 */
package com.joelgtsantos.services;
import java.util.List;

import com.joelgtsantos.domain.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Joel Santos
 *
 * spring-rest-client
 * 2018
 */
public interface ApiService {
	 List<User> getUsers(Integer limit);
	 
	 Flux<User> getUsers(Mono<Integer> limit);
}
