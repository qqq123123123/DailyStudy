package kr.or.shi.initialize;

import java.util.Arrays;

public class ProductTest {

	public static void main(String[] args) {
		Product product1 = new Product();
		System.out.println("Product.number: " + product1.number + ", countNo: " + product1.countNo);
		
		Product product2 = new Product();
		System.out.println("Product.number: " + product2.number + ", countNo: " + product2.countNo);

		System.out.println(Arrays.toString(product1.arr));
		System.out.println(Arrays.toString(product2.arr));
	}

}
