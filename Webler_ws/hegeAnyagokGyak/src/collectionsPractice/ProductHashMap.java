package collectionsPractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.HashMap;


public class ProductHashMap {

	 private String name;
	 private String description;
	 private List<String> tags;
	 
	 //Hashmap practice
	    
	 public static void main(String[] args) {
		
		 Map<String, ProductHashMap> productsByName = new HashMap<>();
		 
		 //add new elements
		 ProductHashMap eBike = new ProductHashMap("E-Bike", "A bike with a battery");
		 ProductHashMap roadBike = new ProductHashMap("Road bike", "A bike for competition");
		 ProductHashMap oldSchoolBike = new ProductHashMap("OldSchool Bike", "A styler bike");
		 productsByName.put(eBike.getName(), eBike);
		 productsByName.put(roadBike.getName(), roadBike);
		 productsByName.put(oldSchoolBike.getName(), oldSchoolBike);
		 
		 //get method to get element by key
		 ProductHashMap nextPurchase = productsByName.get("E-Bike");
		 //System.out.println("A bike with a battery".equals(productsByName.get("E-Bike").getDescription()) ? "Match" : "No match");
		 
		 //System.out.println(productsByName.get("EBike")); //not existing value returns null
		 
		 //null as key is possible
		 ProductHashMap bestBike = new ProductHashMap("Best bike", "The best bike ever");
		 productsByName.put(null, bestBike);
		 //System.out.println(productsByName.get(null).getDescription());
		 
		 //same object can be put with different keys
		 productsByName.put(bestBike.name, bestBike);
		
		 printMap(productsByName);
		 
		 System.out.println();
		 //remove
		 productsByName.remove(null);
		 printMap(productsByName);
		 
		 //check if in map
		 System.out.println();
		 System.out.println(productsByName.containsKey("E-Bike")); //true
		 System.out.println(productsByName.containsKey("EBike")); //false
		 
		 //foreach - iterate over all elements 
		 productsByName.forEach((key, productDesc) -> {
			productDesc.setDescription(productDesc.getDescription() + " altered");
			 System.out.println("key: " + key + " product " + productDesc.getDescription());

			});
			
		 
		 //getOrDefault - if not existed key is in the get, default is called
		 ProductHashMap something = new ProductHashMap("DefatultProduct", "This is the deafult product");
		 ProductHashMap defaultProduct = productsByName.getOrDefault("Not valid", something);
		 System.out.println(defaultProduct.getName() + " " + defaultProduct.getDescription());
		 
		 //putIfAbsent - only put if there is no such key so far
		 System.out.println();
		 productsByName.putIfAbsent("E-Bike", defaultProduct); //E-Bike is not added, remains the old value
		 printMap(productsByName);
		 
		 
		 currenciesWithNamePrint();
		 
	}

		public ProductHashMap(String name, String description) {
			super();
			this.name = name;
			this.description = description;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getDescription() {
			return description;
		}



		public void setDescription(String description) {
			this.description = description;
		}



		public List<String> getTags() {
			return tags;
		}



		public void setTags(List<String> tags) {
			this.tags = tags;
		}
		
		
		public ProductHashMap addTagsOfOtherProduct(ProductHashMap product) {
			this.tags.addAll(product.getTags());
			return this;
		}
		
		public static void printMap (Map<String, ProductHashMap> productsByName) {
			for (Map.Entry<String, ProductHashMap> item : productsByName.entrySet()) {
				System.out.println(item.getKey() + " " + item.getValue().name + " " + item.getValue().description);
				 
			}
		}
		
		public static void currenciesWithNamePrint() {
			
			Map<String, String> currencyCodes = Stream.of(new String[][] {
				  { "Forint", "HUF" }, 
				  { "Euro", "EUR" },
				  { "Czech Crown", "CZK" },	  
				  { "Zloty", "PLN" },
				  { "Pound", "GBP" },
				  { "Yen", "JPY" },
				}).collect(Collectors.toMap(x -> x[0], x -> x[1]));
			
			for (Map.Entry<String, String> item : currencyCodes.entrySet()) {
				System.out.println(item.getKey() + " " + item.getValue());
			}
			
		}

		
	
}
