package com.example.spring.react_crud_webclient_proj;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/client")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/items")
	public Flux<Products> getAllItems() {
		return productService.getAllItems();
	}
	
	@PostMapping("/items")
	public Mono<Products> createItem(@RequestBody Products products) {
		return productService.createItem(products);
	}
	
	@GetMapping("/items/{name}")
	public Flux<Products> getItemsByName(@PathVariable String name) {
		return productService.getItemsByName(name);
	}
	
	@GetMapping("/items/search/{id}")
	public Mono<Products> getItemById(@PathVariable String id) {
		return productService.getItemById(id);
	}
	
	@DeleteMapping("/item/{id}")
	public Mono<Void> deleteItem(@PathVariable String id) {
		return productService.deleteItem(id);
	}
	
	@GetMapping("/backpressure")
	public void callBackPressure() {
		productService.consumeNumberStream();
	}
	

}
