package filter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;   
class Product{  
    int id;  
    String name;  
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	float price;  
    public Product(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class FilterExample{  
    public static void main(String[] args) {  
        List<Product> list=new ArrayList<Product>();  
        list.add(new Product(1,"Samsung A5",17000f));  
        list.add(new Product(3,"Iphone 6S",65000f));  
        list.add(new Product(2,"Sony Xperia",25000f));  
        list.add(new Product(4,"Nokia Lumia",15000f));  
        list.add(new Product(5,"Redmi4 ",26000f));  
        list.add(new Product(6,"Lenevo Vibe",19000f));  
         
        List<Product> srt =list.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).toList();
        srt.stream().forEach(System.out::println);
        System.out.println("================================================");
        List<Product> srt1 =list.parallelStream().sorted(Comparator.comparing(Product::getPrice).reversed()).toList();
        srt1.parallelStream().forEach(System.out::println);
        // using lambda to filter data  
        Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);  
          
        // using lambda to iterate through collection  
        filtered_data.forEach(  
                product -> System.out.println(product.name+": "+product.price)  
        );  
    }  
}  
