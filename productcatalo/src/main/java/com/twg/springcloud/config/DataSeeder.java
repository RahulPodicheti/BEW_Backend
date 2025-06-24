package com.twg.springcloud.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.twg.springcloud.model.Category;
import com.twg.springcloud.model.Product;
import com.twg.springcloud.repository.CategoryRepository;
import com.twg.springcloud.repository.ProductRepository;

@Component
public class DataSeeder implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {

		 //clear all existing data
		categoryRepository.deleteAll();
		productRepository.deleteAll();
		
		//create categories
		Category electronics = new Category();
		electronics.setName("Electronics");
		
		Category clothing = new Category();
		clothing.setName("Clothing");
		
		Category home = new Category();
		home.setName("Home and Kitchen");
		
		categoryRepository.saveAll(Arrays.asList(electronics, home, clothing));
		
		//create products
		
		Product Smartphone = new Product();
		Smartphone.setDescription("Latest Smart Phone");
		Smartphone.setImageUrl("https://c8.alamy.com/comp/MA5YER/new-realistic-mobile-smart-phone-modern-style-vector-smartphone-with-ui-icons-isolated-on-white-background-MA5YER.jpg");
		Smartphone.setName("Samsung Gallaxy");
		Smartphone.setPrice(9999.00);
		Smartphone.setCategory(electronics);
		
		Product laptop = new Product();
		laptop.setDescription("High Performance Laptop");
		laptop.setImageUrl("https://media.istockphoto.com/id/458477309/photo/lenovo-thinkpad-logo.jpg?s=612x612&w=0&k=20&c=lMoOEtCzaM9skTUvmtzbBQgyTDA-XuAInVnLhJ0-M2I=");
		laptop.setName("Lenovo Thinkpad");
		laptop.setPrice(15999.00);
		laptop.setCategory(electronics);
		
		Product applewatch = new Product();
		applewatch.setDescription("smart  Watch");
		applewatch.setImageUrl("https://media.istockphoto.com/id/498340744/photo/apple-watch-sport-42mm-silver-aluminum-case-with-white-band.jpg?s=612x612&w=0&k=20&c=7uI6S3_892ccNoVVnr9bW0bz5J6brL_PX0Bzk17jEH8=");
		applewatch.setName("Apple Watch");
		applewatch.setPrice(3999.00);
		applewatch.setCategory(electronics);
		
		Product Kerchief = new Product();
		Kerchief.setDescription("Cotton Napkin");
		Kerchief.setImageUrl("https://www.shutterstock.com/image-photo/handkerchief-hand-studio-photography-nose-260nw-1666197337.jpg");
		Kerchief.setName("Kerchief");
		Kerchief.setPrice(999.00);
		Kerchief.setCategory(clothing);
		
		Product Jacket = new Product();
		Jacket.setDescription("Demin Cloth Jacket");
		Jacket.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOYQ4p8f8VjPa63ouZ5VdCmj1kv-h1wUGVnw&s");
		Jacket.setName("Winter Jacket");
		Jacket.setPrice(2999.00);
		Jacket.setCategory(clothing);
		
		Product Pant = new Product();
		Pant.setDescription("latest style pant");
		Pant.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRKWn1n1dMQ5oWdXatKKWScs2bPDmyNwRK0lA&s");
		Pant.setName("Cargo Pant");
		Pant.setPrice(1599.00);
		Pant.setCategory(clothing);
		
		Product bed = new Product();
		bed.setDescription("very Spongy bed");
		bed.setImageUrl("https://m.media-amazon.com/images/I/816MIzKKcPL.jpg");
		bed.setName("Sleepwell bed");
		bed.setPrice(2599.00);
		bed.setCategory(home);
		
		Product fan = new Product();
		fan.setDescription("High Speed fan");
		fan.setImageUrl("https://www.ushafans.com/sites/default/files/MicrosoftTeams-image.png");
		fan.setName("Mr. 360");
		fan.setPrice(5599.00);
		fan.setCategory(home);
		
		Product light = new Product();
		light.setDescription("High Voltage Light");
		light.setImageUrl("https://www.energy.gov/sites/default/files/styles/full_article_width/public/2024-01/shutterstock_1043273287_0.jpg?itok=P1Urr0zo");
		light.setName("LED 99");
		light.setPrice(599.00);
		light.setCategory(home);
		
		productRepository.saveAll(Arrays.asList(light,fan, bed, Kerchief, Jacket, Pant, laptop, Smartphone, applewatch));
	}

}
