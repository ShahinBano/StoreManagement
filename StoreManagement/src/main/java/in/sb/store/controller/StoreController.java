package in.sb.store.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sb.store.entity.Store;
import reactor.core.publisher.Mono;

@RestController
public class StoreController 
{
 public Mono<Store> createStore(@RequestBody Store store)
 {
	 return Mono.just(store);
 }
}
