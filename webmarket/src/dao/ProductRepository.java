package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {

	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();

	public static ProductRepository getInstance() {
		return instance;
	}

	public ProductRepository() {
		Product aaa = new Product("P1234", "asd", 1234);
		aaa.setdecription("asd");
		aaa.setcategory("asd");
		aaa.setmanufacturer("asd");
		aaa.setunitInStock(100);
		aaa.setcondition("asd");

		Product bbb = new Product("P1235", "asdf", 1235);
		aaa.setdecription("sdf");
		aaa.setcategory("sdf");
		aaa.setmanufacturer("sdf");
		aaa.setunitInStock(100);
		aaa.setcondition("newsdf");

		Product ccc = new Product("P1236", "dfg", 1236);
		aaa.setdecription("dfg");
		aaa.setcategory("dfg");
		aaa.setmanufacturer("dfg");
		aaa.setunitInStock(100);
		aaa.setcondition("dfg");

		listOfProducts.add(aaa);
		listOfProducts.add(bbb);
		listOfProducts.add(ccc);

	}

	public Product getProductById(String productId) {
		Product productById = null;

		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;

			}
		}
		return productById;
	}

	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}

	public void addProduct(Product product) {
		listOfProducts.add(product);
	}

}