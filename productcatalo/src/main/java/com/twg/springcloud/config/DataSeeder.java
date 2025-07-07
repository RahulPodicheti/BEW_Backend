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

    @Autowired private CategoryRepository categoryRepository;
    @Autowired private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        Category electronics = new Category(); electronics.setName("Electronics");
        Category clothing = new Category(); clothing.setName("Clothing");
        Category home = new Category(); home.setName("Home and Kitchen");
        Category books = new Category(); books.setName("Books");
        Category sports = new Category(); sports.setName("Sports");
        Category beauty = new Category(); beauty.setName("Beauty");
        Category grocery = new Category(); grocery.setName("Grocery");
        Category toys = new Category(); toys.setName("Toys");
        Category stationery = new Category(); stationery.setName("Stationery");

        categoryRepository.saveAll(Arrays.asList(
            electronics, clothing, home, books, sports, beauty, grocery, toys, stationery
        ));

        Product earbuds = new Product();
        earbuds.setName("Realme Buds Air");
        earbuds.setDescription("Wireless earbuds with noise cancellation");
        earbuds.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/41vLX19lGEL._SL300_SY300_.jpg");
        earbuds.setPrice(2499.00);
        earbuds.setCategory(electronics);

        Product tablet = new Product();
        tablet.setName("iPad 10th Gen");
        tablet.setDescription("Apple iPad with 10.9-inch display");
        tablet.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71Unl6Cr2iL._SL1500_.jpg");
        tablet.setPrice(34999.00);
        tablet.setCategory(electronics);

        Product tshirt = new Product();
        tshirt.setName("Puma Sports T-shirt");
        tshirt.setDescription("Dry fit running t-shirt");
        tshirt.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71f5GZZYdfL._UH300_.jpg");
        tshirt.setPrice(899.00);
        tshirt.setCategory(clothing);

        Product mixer = new Product();
        mixer.setName("Philips Mixer Grinder");
        mixer.setDescription("750W powerful motor with 3 jars");
        mixer.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/51dt2Jx0FqL._SL1000_.jpg");
        mixer.setPrice(2999.00);
        mixer.setCategory(home);

        Product book = new Product();
        book.setName("Atomic Habits");
        book.setDescription("Tiny changes, remarkable results by James Clear");
        book.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/91bYsX41DVL._SL1500_.jpg");
        book.setPrice(499.00);
        book.setCategory(books);

        Product football = new Product();
        football.setName("Nivia Football");
        football.setDescription("Size 5 synthetic rubber football");
        football.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/61J6Il1YcfL._SL1500_.jpg");
        football.setPrice(799.00);
        football.setCategory(sports);

        Product facewash = new Product();
        facewash.setName("Himalaya Face Wash");
        facewash.setDescription("Neem face wash for acne-free skin");
        facewash.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/61P4eZ0+RjL._SL1000_.jpg");
        facewash.setPrice(199.00);
        facewash.setCategory(beauty);

        Product rice = new Product();
        rice.setName("India Gate Basmati Rice");
        rice.setDescription("5kg long grain basmati rice");
        rice.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/91n5zTh+aSL._SL1500_.jpg");
        rice.setPrice(699.00);
        rice.setCategory(grocery);

        Product lego = new Product();
        lego.setName("LEGO City Police Station Set");
        lego.setDescription("600+ pieces construction toy set");
        lego.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/81Cxd6URHZL._SL1500_.jpg");
        lego.setPrice(3499.00);
        lego.setCategory(toys);

        Product pens = new Product();
        pens.setName("Cello Butterflow Pens (Pack of 10)");
        pens.setDescription("Smooth ink, blue pens");
        pens.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71OCNfwD6RL._SL1500_.jpg");
        pens.setPrice(199.00);
        pens.setCategory(stationery);

        Product kindle = new Product();
        kindle.setName("Kindle Paperwhite");
        kindle.setDescription("E-reader with adjustable warm light");
        kindle.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/61N6n9sGcJL._SL1000_.jpg");
        kindle.setPrice(10499.00);
        kindle.setCategory(electronics);

        Product hoodie = new Product();
        hoodie.setName("Nike Men's Hoodie");
        hoodie.setDescription("Comfortable fleece hoodie");
        hoodie.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71NH1bmiVHL._SX679_.jpg");
        hoodie.setPrice(2999.00);
        hoodie.setCategory(clothing);

        Product bedsheet = new Product();
        bedsheet.setName("Bombay Dyeing Bedsheet");
        bedsheet.setDescription("Cotton double bedsheet with 2 pillow covers");
        bedsheet.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71snT2V7V3L._SL1500_.jpg");
        bedsheet.setPrice(899.00);
        bedsheet.setCategory(home);

        Product crayons = new Product();
        crayons.setName("Faber-Castell Wax Crayons");
        crayons.setDescription("Set of 24 non-toxic crayons");
        crayons.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/81tJ3tc5YGL._SL1500_.jpg");
        crayons.setPrice(129.00);
        crayons.setCategory(stationery);

        Product shampoo = new Product();
        shampoo.setName("Dove Intense Repair Shampoo");
        shampoo.setDescription("Nourishing shampoo for damaged hair");
        shampoo.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/61ZRY+14tPL._SL1000_.jpg");
        shampoo.setPrice(249.00);
        shampoo.setCategory(beauty);
        
        Product galaxyPhone = new Product();
        galaxyPhone.setName("Samsung Galaxy M14");
        galaxyPhone.setDescription("Mid-range smartphone with 5G");
        galaxyPhone.setImageUrl("https://m.media-amazon.com/images/I/71JS3p0Yg3L._SL1500_.jpg");
        galaxyPhone.setPrice(13499.00);
        galaxyPhone.setCategory(electronics);

        Product lenovoLaptop = new Product();
        lenovoLaptop.setName("Lenovo IdeaPad Slim 3");
        lenovoLaptop.setDescription("15.6 inch FHD Laptop");
        lenovoLaptop.setImageUrl("https://m.media-amazon.com/images/I/71eUwDk8z+L._SL1500_.jpg");
        lenovoLaptop.setPrice(37999.00);
        lenovoLaptop.setCategory(electronics);

        Product sonySpeaker = new Product();
        sonySpeaker.setName("Sony Bluetooth Speaker");
        sonySpeaker.setDescription("Portable wireless speaker with bass");
        sonySpeaker.setImageUrl("https://m.media-amazon.com/images/I/71smqRr0pmL._SL1500_.jpg");
        sonySpeaker.setPrice(4499.00);
        sonySpeaker.setCategory(electronics);

        Product samsungTV = new Product();
        samsungTV.setName("Samsung 32-inch Smart TV");
        samsungTV.setDescription("Smart HD LED TV");
        samsungTV.setImageUrl("https://m.media-amazon.com/images/I/71n95U1xw-L._SL1500_.jpg");
        samsungTV.setPrice(13999.00);
        samsungTV.setCategory(electronics);

        Product powerBank = new Product();
        powerBank.setName("Redmi Power Bank 10000mAh");
        powerBank.setDescription("Fast charging USB and Type-C");
        powerBank.setImageUrl("https://m.media-amazon.com/images/I/71lVwl3q-kL._SL1500_.jpg");
        powerBank.setPrice(1199.00);
        powerBank.setCategory(electronics);

        Product levisJeans = new Product();
        levisJeans.setName("Levi's Slim Fit Jeans");
        levisJeans.setDescription("Comfortable stretch jeans for men");
        levisJeans.setImageUrl("https://m.media-amazon.com/images/I/81eA+eQYRbL._SL1500_.jpg");
        levisJeans.setPrice(1999.00);
        levisJeans.setCategory(clothing);

        Product adidasCap = new Product();
        adidasCap.setName("Adidas Cotton Cap");
        adidasCap.setDescription("Adjustable sports cap");
        adidasCap.setImageUrl("https://m.media-amazon.com/images/I/71qRbL5NDoL._SL1500_.jpg");
        adidasCap.setPrice(599.00);
        adidasCap.setCategory(clothing);

        Product raymondShirt = new Product();
        raymondShirt.setName("Raymond Formal Shirt");
        raymondShirt.setDescription("Cotton shirt for office wear");
        raymondShirt.setImageUrl("https://m.media-amazon.com/images/I/71Imw0B6qWL._SL1500_.jpg");
        raymondShirt.setPrice(899.00);
        raymondShirt.setCategory(clothing);

        Product cottonBedsheet = new Product();
        cottonBedsheet.setName("Floral Cotton Bedsheet");
        cottonBedsheet.setDescription("King size bedsheet with pillow covers");
        cottonBedsheet.setImageUrl("https://m.media-amazon.com/images/I/81GgwnCEfKL._SL1500_.jpg");
        cottonBedsheet.setPrice(1099.00);
        cottonBedsheet.setCategory(home);

        Product philipsBulb = new Product();
        philipsBulb.setName("Philips 9W LED Bulb");
        philipsBulb.setDescription("Energy-efficient LED bulb");
        philipsBulb.setImageUrl("https://m.media-amazon.com/images/I/71cC0kY-HfL._SL1500_.jpg");
        philipsBulb.setPrice(199.00);
        philipsBulb.setCategory(home);

        Product ikigaiBook = new Product();
        ikigaiBook.setName("Ikigai");
        ikigaiBook.setDescription("Japanese secret to long life");
        ikigaiBook.setImageUrl("https://m.media-amazon.com/images/I/71tbalAHYCL._SL1500_.jpg");
        ikigaiBook.setPrice(399.00);
        ikigaiBook.setCategory(books);

        Product monkBook = new Product();
        monkBook.setName("Think Like a Monk");
        monkBook.setDescription("Book by Jay Shetty");
        monkBook.setImageUrl("https://m.media-amazon.com/images/I/81q0N6iIC2L._SL1500_.jpg");
        monkBook.setPrice(449.00);
        monkBook.setCategory(books);

        Product tennisBall = new Product();
        tennisBall.setName("Championship Tennis Ball");
        tennisBall.setDescription("Set of 3 professional balls");
        tennisBall.setImageUrl("https://m.media-amazon.com/images/I/61kFBmEZuIL._SL1500_.jpg");
        tennisBall.setPrice(299.00);
        tennisBall.setCategory(sports);

        Product yogaMat = new Product();
        yogaMat.setName("Yoga Mat 6mm");
        yogaMat.setDescription("Anti-slip workout mat");
        yogaMat.setImageUrl("https://m.media-amazon.com/images/I/71Ckt4fS8KL._SL1500_.jpg");
        yogaMat.setPrice(599.00);
        yogaMat.setCategory(sports);

        Product beardOil = new Product();
        beardOil.setName("Beardo Beard Oil");
        beardOil.setDescription("Beard nourishment and growth");
        beardOil.setImageUrl("https://m.media-amazon.com/images/I/61K4QMjZqXL._SL1500_.jpg");
        beardOil.setPrice(349.00);
        beardOil.setCategory(beauty);

        Product lipBalm = new Product();
        lipBalm.setName("Lakme Lip Balm");
        lipBalm.setDescription("Strawberry moisturizing balm");
        lipBalm.setImageUrl("https://m.media-amazon.com/images/I/51+YWg1vPFL._SL1500_.jpg");
        lipBalm.setPrice(149.00);
        lipBalm.setCategory(beauty);

        Product atta = new Product();
        atta.setName("Aashirvaad Atta 5kg");
        atta.setDescription("Whole wheat flour");
        atta.setImageUrl("https://m.media-amazon.com/images/I/71G9H-vSnfL._SL1500_.jpg");
        atta.setPrice(269.00);
        atta.setCategory(grocery);

        Product butter = new Product();
        butter.setName("Amul Butter 500g");
        butter.setDescription("Delicious and creamy butter");
        butter.setImageUrl("https://m.media-amazon.com/images/I/71DuGlhDcvL._SL1500_.jpg");
        butter.setPrice(275.00);
        butter.setCategory(grocery);

        Product legoCar = new Product();
        legoCar.setName("LEGO Technic Car");
        legoCar.setDescription("Advanced kit for teens");
        legoCar.setImageUrl("https://m.media-amazon.com/images/I/71KM0SB1dZL._SL1500_.jpg");
        legoCar.setPrice(6999.00);
        legoCar.setCategory(toys);

        Product rubiksCube = new Product();
        rubiksCube.setName("Rubik's Cube 3x3");
        rubiksCube.setDescription("Speed puzzle cube");
        rubiksCube.setImageUrl("https://m.media-amazon.com/images/I/71qbjqg8-xL._SL1500_.jpg");
        rubiksCube.setPrice(199.00);
        rubiksCube.setCategory(toys);

        Product geometryBox = new Product();
        geometryBox.setName("Camlin Geometry Box");
        geometryBox.setDescription("Complete math set for students");
        geometryBox.setImageUrl("https://m.media-amazon.com/images/I/51cyXr7Ib+L._SL1000_.jpg");
        geometryBox.setPrice(149.00);
        geometryBox.setCategory(stationery);

        Product staedtlerPencils = new Product();
        staedtlerPencils.setName("Staedtler Pencils Set");
        staedtlerPencils.setDescription("12 graphite pencils for drawing");
        staedtlerPencils.setImageUrl("https://m.media-amazon.com/images/I/71coQZ0ueeL._SL1500_.jpg");
        staedtlerPencils.setPrice(239.00);
        staedtlerPencils.setCategory(stationery);


        Product cereal = new Product();
        cereal.setName("Kellogg’s Corn Flakes");
        cereal.setDescription("Breakfast cereal - 1kg family pack");
        cereal.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71Df1XcavhL._SL1500_.jpg");
        cereal.setPrice(299.00);
        cereal.setCategory(grocery);

        Product doll = new Product();
        doll.setName("Barbie Fashion Doll");
        doll.setDescription("Barbie doll with dress and accessories");
        doll.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71p9bs5rjzL._SL1500_.jpg");
        doll.setPrice(799.00);
        doll.setCategory(toys);

        Product diary = new Product();
        diary.setName("Classmate Spiral Diary");
        diary.setDescription("160 pages ruled diary");
        diary.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/61+eG2ROwSL._SL1000_.jpg");
        diary.setPrice(159.00);
        diary.setCategory(stationery);

        Product novel = new Product();
        novel.setName("It Ends With Us - Colleen Hoover");
        novel.setDescription("Top-selling romance novel");
        novel.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/81s0B6NYXML._SL1500_.jpg");
        novel.setPrice(349.00);
        novel.setCategory(books);

        Product skippingRope = new Product();
        skippingRope.setName("Boldfit Skipping Rope");
        skippingRope.setDescription("Adjustable skipping rope for workouts");
        skippingRope.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/61Yz8QyHhkL._SL1000_.jpg");
        skippingRope.setPrice(299.00);
        skippingRope.setCategory(sports);

        Product airConditioner = new Product();
        airConditioner.setName("LG Split AC");
        airConditioner.setDescription("1.5 Ton 5 Star Inverter Split AC");
        airConditioner.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71XG1eI9lrL._SL1500_.jpg");
        airConditioner.setPrice(34999.00);
        airConditioner.setCategory(electronics);

        Product smartwatchBoat = new Product();
        smartwatchBoat.setName("boAt Xtend Smartwatch");
        smartwatchBoat.setDescription("Alexa built-in smartwatch with SpO2 monitoring");
        smartwatchBoat.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/61IMRs+o0iL._SL1500_.jpg");
        smartwatchBoat.setPrice(2499.00);
        smartwatchBoat.setCategory(electronics);

        Product blazer = new Product();
        blazer.setName("Peter England Men's Blazer");
        blazer.setDescription("Formal blue blazer for office & events");
        blazer.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71n0BBnK0IL._SL1500_.jpg");
        blazer.setPrice(3999.00);
        blazer.setCategory(clothing);

        Product saree = new Product();
        saree.setName("Kanjivaram Silk Saree");
        saree.setDescription("Traditional festive saree");
        saree.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/81KzxEJGqjL._SL1500_.jpg");
        saree.setPrice(1999.00);
        saree.setCategory(clothing);

        Product curtain = new Product();
        curtain.setName("AmazonBasics Room Darkening Curtain");
        curtain.setDescription("Thermal insulated blackout curtain");
        curtain.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71TPfRj5VbL._SL1500_.jpg");
        curtain.setPrice(899.00);
        curtain.setCategory(home);

        Product dinnerSet = new Product();
        dinnerSet.setName("LaOpala Dinner Set");
        dinnerSet.setDescription("35-piece dinner set for 6 people");
        dinnerSet.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/61U0z2HaKXL._SL1500_.jpg");
        dinnerSet.setPrice(1999.00);
        dinnerSet.setCategory(home);

        Product markers = new Product();
        markers.setName("Sharpie Permanent Markers");
        markers.setDescription("Pack of 12 assorted color markers");
        markers.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/81XEPmN3gkL._SL1500_.jpg");
        markers.setPrice(599.00);
        markers.setCategory(stationery);

        Product glue = new Product();
        glue.setName("Fevicol MR Adhesive");
        glue.setDescription("Strong white glue for crafts");
        glue.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71I-9tQkhpL._SL1500_.jpg");
        glue.setPrice(49.00);
        glue.setCategory(stationery);

        Product chips = new Product();
        chips.setName("Lay's Classic Salted Chips");
        chips.setDescription("Potato chips 200g family pack");
        chips.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/81vbdzYt3lL._SL1500_.jpg");
        chips.setPrice(45.00);
        chips.setCategory(grocery);

        Product honey = new Product();
        honey.setName("Dabur Honey");
        honey.setDescription("100% Pure honey - 500g");
        honey.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/61F6PqQr9gL._SL1200_.jpg");
        honey.setPrice(189.00);
        honey.setCategory(grocery);

        Product lipstick = new Product();
        lipstick.setName("Maybelline Matte Lipstick");
        lipstick.setDescription("Long-lasting lipstick - Cherry Chic");
        lipstick.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/51Z+VRzyojL._SL1500_.jpg");
        lipstick.setPrice(299.00);
        lipstick.setCategory(beauty);

        Product eyeliner = new Product();
        eyeliner.setName("Lakme Insta Eye Liner");
        eyeliner.setDescription("Water-resistant black eyeliner");
        eyeliner.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/51k7IHsjpxL._SL1500_.jpg");
        eyeliner.setPrice(120.00);
        eyeliner.setCategory(beauty);

        Product basketball = new Product();
        basketball.setName("Spalding NBA Basketball");
        basketball.setDescription("Official size rubber basketball");
        basketball.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71vTrZ1xY4L._SL1500_.jpg");
        basketball.setPrice(999.00);
        basketball.setCategory(sports);

        Product badminton = new Product();
        badminton.setName("Yonex GR 303 Badminton Racket");
        badminton.setDescription("Full graphite lightweight racket");
        badminton.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/61r98EOxDxL._SL1500_.jpg");
        badminton.setPrice(799.00);
        badminton.setCategory(sports);

        Product chess = new Product();
        chess.setName("Magnetic Chess Board");
        chess.setDescription("Folding chess set for kids and adults");
        chess.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/81I0SGZs1KL._SL1500_.jpg");
        chess.setPrice(599.00);
        chess.setCategory(toys);

        Product puzzle = new Product();
        puzzle.setName("500-Piece Jigsaw Puzzle");
        puzzle.setDescription("Nature scenery puzzle game");
        puzzle.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/81+pJQKPySL._SL1500_.jpg");
        puzzle.setPrice(399.00);
        puzzle.setCategory(toys);

        Product storyBook = new Product();
        storyBook.setName("Panchatantra - Illustrated Stories");
        storyBook.setDescription("Indian fables for children");
        storyBook.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71EqxMyFGeL._SL1000_.jpg");
        storyBook.setPrice(199.00);
        storyBook.setCategory(books);

        Product motivationBook = new Product();
        motivationBook.setName("The Power of Now");
        motivationBook.setDescription("Spiritual guide by Eckhart Tolle");
        motivationBook.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71W0h9J2f0L._SL1500_.jpg");
        motivationBook.setPrice(399.00);
        motivationBook.setCategory(books);

        Product notebook = new Product();
        notebook.setName("Classmate Notebook");
        notebook.setDescription("400 pages ruled notebook");
        notebook.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/81pJP9uT5rL._SL1500_.jpg");
        notebook.setPrice(69.00);
        notebook.setCategory(stationery);

        Product toyCar = new Product();
        toyCar.setName("Hot Wheels Toy Car Set");
        toyCar.setDescription("Set of 5 metal cars");
        toyCar.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/81Uo26xH9DL._SL1500_.jpg");
        toyCar.setPrice(499.00);
        toyCar.setCategory(toys);

        Product waterBottle = new Product();
        waterBottle.setName("Milton Thermosteel Bottle");
        waterBottle.setDescription("1000ml insulated stainless steel bottle");
        waterBottle.setImageUrl("https://m.media-amazon.com/images/I/51I3tFYULsL._SL1000_.jpg");
        waterBottle.setPrice(799.00);
        waterBottle.setCategory(home);

        Product roomHeater = new Product();
        roomHeater.setName("Orpat Room Heater");
        roomHeater.setDescription("Fan heater for small rooms");
        roomHeater.setImageUrl("https://m.media-amazon.com/images/I/71ABh8FMwCL._SL1500_.jpg");
        roomHeater.setPrice(1299.00);
        roomHeater.setCategory(home);

        Product ironBox = new Product();
        ironBox.setName("Philips Dry Iron");
        ironBox.setDescription("1000W lightweight iron");
        ironBox.setImageUrl("https://m.media-amazon.com/images/I/71ZxaZ-DZTL._SL1500_.jpg");
        ironBox.setPrice(799.00);
        ironBox.setCategory(home);

        Product curryMasala = new Product();
        curryMasala.setName("Everest Kitchen King Masala");
        curryMasala.setDescription("100g spice blend");
        curryMasala.setImageUrl("https://m.media-amazon.com/images/I/61LZMCvlcML._SL1000_.jpg");
        curryMasala.setPrice(52.00);
        curryMasala.setCategory(grocery);

        Product greenTea = new Product();
        greenTea.setName("Lipton Green Tea Bags");
        greenTea.setDescription("100 tea bags with antioxidants");
        greenTea.setImageUrl("https://m.media-amazon.com/images/I/71OrqN9GgzL._SL1500_.jpg");
        greenTea.setPrice(299.00);
        greenTea.setCategory(grocery);

        Product sketchPens = new Product();
        sketchPens.setName("Camel Sketch Pens");
        sketchPens.setDescription("24 vibrant color markers");
        sketchPens.setImageUrl("https://m.media-amazon.com/images/I/81NhyC53PUL._SL1500_.jpg");
        sketchPens.setPrice(130.00);
        sketchPens.setCategory(stationery);

        Product planner = new Product();
        planner.setName("2025 Monthly Planner");
        planner.setDescription("Hardcover A5 planner with stickers");
        planner.setImageUrl("https://m.media-amazon.com/images/I/71Bcy0C7VCL._SL1000_.jpg");
        planner.setPrice(349.00);
        planner.setCategory(stationery);

        Product smartwatchFireBoltt = new Product();
        smartwatchFireBoltt.setName("Fire-Boltt Ninja Call Pro");
        smartwatchFireBoltt.setDescription("Smartwatch with Bluetooth calling");
        smartwatchFireBoltt.setImageUrl("https://m.media-amazon.com/images/I/61IM+9UVnUL._SL1500_.jpg");
        smartwatchFireBoltt.setPrice(1599.00);
        smartwatchFireBoltt.setCategory(electronics);

        Product hairDryer = new Product();
        hairDryer.setName("Syska Hair Dryer");
        hairDryer.setDescription("Compact 1000W foldable hair dryer");
        hairDryer.setImageUrl("https://m.media-amazon.com/images/I/61yHD9QvdUL._SL1500_.jpg");
        hairDryer.setPrice(749.00);
        hairDryer.setCategory(beauty);

        Product faceCream = new Product();
        faceCream.setName("Pond's Light Moisturizer");
        faceCream.setDescription("Non-oily freshness cream 150ml");
        faceCream.setImageUrl("https://m.media-amazon.com/images/I/71JZIRcUEfL._SL1500_.jpg");
        faceCream.setPrice(229.00);
        faceCream.setCategory(beauty);

        Product volleyBall = new Product();
        volleyBall.setName("Cosco Volleyball");
        volleyBall.setDescription("Standard size outdoor ball");
        volleyBall.setImageUrl("https://m.media-amazon.com/images/I/71t2OJguWmL._SL1500_.jpg");
        volleyBall.setPrice(749.00);
        volleyBall.setCategory(sports);

        Product tableTennisBat = new Product();
        tableTennisBat.setName("Stag Table Tennis Bat");
        tableTennisBat.setDescription("Beginner racket with cover");
        tableTennisBat.setImageUrl("https://m.media-amazon.com/images/I/81RUtBRCsOL._SL1500_.jpg");
        tableTennisBat.setPrice(399.00);
        tableTennisBat.setCategory(sports);

        Product kidsTent = new Product();
        kidsTent.setName("Playhut Tent House for Kids");
        kidsTent.setDescription("Indoor & outdoor play tent");
        kidsTent.setImageUrl("https://m.media-amazon.com/images/I/81M8N6kNw7L._SL1500_.jpg");
        kidsTent.setPrice(999.00);
        kidsTent.setCategory(toys);

        Product puzzleBall = new Product();
        puzzleBall.setName("Magic Puzzle Ball");
        puzzleBall.setDescription("Color matching fidget toy");
        puzzleBall.setImageUrl("https://m.media-amazon.com/images/I/71Nnq8tz9GL._SL1500_.jpg");
        puzzleBall.setPrice(189.00);
        puzzleBall.setCategory(toys);

        Product encyclopaedia = new Product();
        encyclopaedia.setName("Children's Encyclopaedia");
        encyclopaedia.setDescription("Illustrated general knowledge book");
        encyclopaedia.setImageUrl("https://m.media-amazon.com/images/I/91lfGvPj1qL._SL1500_.jpg");
        encyclopaedia.setPrice(599.00);
        encyclopaedia.setCategory(books);

        Product businessBook = new Product();
        businessBook.setName("Rich Dad Poor Dad");
        businessBook.setDescription("Finance bestseller by Robert Kiyosaki");
        businessBook.setImageUrl("https://m.media-amazon.com/images/I/81bsw6fnUiL._SL1500_.jpg");
        businessBook.setPrice(299.00);
        businessBook.setCategory(books);

        Product glitterPens = new Product();
        glitterPens.setName("Glitter Gel Pens (Pack of 10)");
        glitterPens.setDescription("Sparkling ink pens for art");
        glitterPens.setImageUrl("https://m.media-amazon.com/images/I/71-5ib6c7+L._SL1500_.jpg");
        glitterPens.setPrice(179.00);
        glitterPens.setCategory(stationery);

        Product extensionBoard = new Product();
        extensionBoard.setName("Havells Extension Board 4 Plug");
        extensionBoard.setDescription("Surge protected power strip");
        extensionBoard.setImageUrl("https://m.media-amazon.com/images/I/61tE49kcc9L._SL1500_.jpg");
        extensionBoard.setPrice(699.00);
        extensionBoard.setCategory(electronics);

        Product incenseSticks = new Product();
        incenseSticks.setName("Cycle Three-in-One Agarbatti");
        incenseSticks.setDescription("Pack of 100 long incense sticks");
        incenseSticks.setImageUrl("https://m.media-amazon.com/images/I/81UFS9Jtv+L._SL1500_.jpg");
        incenseSticks.setPrice(95.00);
        incenseSticks.setCategory(home);

        Product mopSet = new Product();
        mopSet.setName("Scotch-Brite Spin Mop Set");
        mopSet.setDescription("360-degree easy spin bucket mop");
        mopSet.setImageUrl("https://m.media-amazon.com/images/I/61xVzMxX2IL._SL1500_.jpg");
        mopSet.setPrice(1499.00);
        mopSet.setCategory(home);

        Product smartTV = new Product();
        smartTV.setName("Samsung 43\" Smart TV");
        smartTV.setDescription("4K Ultra HD LED Smart TV with Voice Assistant");
        smartTV.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/91KZcsGtuOL._SL1500_.jpg");
        smartTV.setPrice(29999.00);
        smartTV.setCategory(electronics);

        Product jeans = new Product();
        jeans.setName("Levi's Men's Jeans");
        jeans.setDescription("Slim fit denim jeans");
        jeans.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/81DJI8VJ2HL._SL1500_.jpg");
        jeans.setPrice(1999.00);
        jeans.setCategory(clothing);

        Product pressureCooker = new Product();
        pressureCooker.setName("Prestige Pressure Cooker");
        pressureCooker.setDescription("3L stainless steel pressure cooker");
        pressureCooker.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/81hbGBBd4gL._SL1500_.jpg");
        pressureCooker.setPrice(1299.00);
        pressureCooker.setCategory(home);

        Product historyBook = new Product();
        historyBook.setName("Sapiens - Yuval Noah Harari");
        historyBook.setDescription("A brief history of humankind");
        historyBook.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71f4fQsVyxL._SL1500_.jpg");
        historyBook.setPrice(499.00);
        historyBook.setCategory(books);

        Product dumbbells = new Product();
        dumbbells.setName("Rubber Coated Dumbbells");
        dumbbells.setDescription("Pair of 5kg dumbbells for fitness");
        dumbbells.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/51Zp1neYsvL._SL1000_.jpg");
        dumbbells.setPrice(999.00);
        dumbbells.setCategory(sports);

        Product foundation = new Product();
        foundation.setName("Lakme Foundation");
        foundation.setDescription("Long wear foundation - natural shade");
        foundation.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/51Oa+AFuhBL._SL1000_.jpg");
        foundation.setPrice(299.00);
        foundation.setCategory(beauty);

        Product oats = new Product();
        oats.setName("Quaker Oats - 1kg");
        oats.setDescription("Healthy breakfast whole grain oats");
        oats.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71Wx+vx39lL._SL1500_.jpg");
        oats.setPrice(159.00);
        oats.setCategory(grocery);

        Product robotToy = new Product();
        robotToy.setName("RoboPet Smart Robot");
        robotToy.setDescription("Interactive robot toy with sensors");
        robotToy.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/61EEEBtMdCL._SL1500_.jpg");
        robotToy.setPrice(1299.00);
        robotToy.setCategory(toys);

        Product stapler = new Product();
        stapler.setName("Kangaro Stapler");
        stapler.setDescription("Mini stapler with pins");
        stapler.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/61Gv8tDqhwL._SL1500_.jpg");
        stapler.setPrice(79.00);
        stapler.setCategory(stationery);

        Product laptopStand = new Product();
        laptopStand.setName("AmazonBasics Laptop Stand");
        laptopStand.setDescription("Aluminum ventilated laptop stand");
        laptopStand.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71KR2i6-WaL._SL1500_.jpg");
        laptopStand.setPrice(1099.00);
        laptopStand.setCategory(electronics);

        Product jacket = new Product();
        jacket.setName("Wildcraft Men's Jacket");
        jacket.setDescription("Waterproof and windproof outdoor jacket");
        jacket.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71UwSHSZRnL._SL1500_.jpg");
        jacket.setPrice(2499.00);
        jacket.setCategory(clothing);

        Product wallClock = new Product();
        wallClock.setName("Ajanta Wall Clock");
        wallClock.setDescription("Silent sweep wall clock");
        wallClock.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71N6RX7u7eL._SL1500_.jpg");
        wallClock.setPrice(499.00);
        wallClock.setCategory(home);

        Product comicBook = new Product();
        comicBook.setName("Marvel Avengers Comic");
        comicBook.setDescription("Illustrated comic book for kids");
        comicBook.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/81xj4LL0DCL._SL1500_.jpg");
        comicBook.setPrice(299.00);
        comicBook.setCategory(books);


        Product kajal = new Product();
        kajal.setName("Lakme Eyeconic Kajal");
        kajal.setDescription("Deep black 22hr smudge-proof kajal");
        kajal.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/61+EB0z6EtL._SL1500_.jpg");
        kajal.setPrice(170.00);
        kajal.setCategory(beauty);

        Product sugar = new Product();
        sugar.setName("Patanjali Brown Sugar");
        sugar.setDescription("Organic 1kg brown sugar");
        sugar.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71T+jIlr4ML._SL1500_.jpg");
        sugar.setPrice(85.00);
        sugar.setCategory(grocery);

        Product teddyBear = new Product();
        teddyBear.setName("Cute Teddy Bear Plush");
        teddyBear.setDescription("Soft toy 30cm plush bear");
        teddyBear.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71j1qIpS2nL._SL1500_.jpg");
        teddyBear.setPrice(399.00);
        teddyBear.setCategory(toys);

        Product binderClips = new Product();
        binderClips.setName("Binder Clips Pack of 12");
        binderClips.setDescription("Office clips 19mm size");
        binderClips.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71xAxunJrgL._SL1500_.jpg");
        binderClips.setPrice(79.00);
        binderClips.setCategory(stationery);

        Product adapter = new Product();
        adapter.setName("Portronics USB Adapter");
        adapter.setDescription("Dual USB charging adapter");
        adapter.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/61Pmyf0OjTL._SL1500_.jpg");
        adapter.setPrice(349.00);
        adapter.setCategory(electronics);

        // (20 more quickly listed below)

        Product socks = new Product(); socks.setName("Adidas Socks"); socks.setDescription("Cotton ankle socks pack"); socks.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71TkQv3G3hL._SL1500_.jpg"); socks.setPrice(399.00); socks.setCategory(clothing);
        Product peeler = new Product(); peeler.setName("Stainless Steel Peeler"); peeler.setDescription("Ergonomic vegetable peeler"); peeler.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/61xG9QcJHXL._SL1500_.jpg"); peeler.setPrice(99.00); peeler.setCategory(home);
        Product travelBook = new Product(); travelBook.setName("Lonely Planet India"); travelBook.setDescription("Travel guide book for India"); travelBook.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/91VRg8+ibgL._SL1500_.jpg"); travelBook.setPrice(999.00); travelBook.setCategory(books);
        Product skippingMat = new Product(); skippingMat.setName("Jump Rope Mat"); skippingMat.setDescription("Protects joints during skipping"); skippingMat.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/81M3+dl-J2L._SL1500_.jpg"); skippingMat.setPrice(799.00); skippingMat.setCategory(sports);
        Product compact = new Product(); compact.setName("Lakme Radiance Compact"); compact.setDescription("Daily wear face compact powder"); compact.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71Xc4NnR+qL._SL1500_.jpg"); compact.setPrice(160.00); compact.setCategory(beauty);
//        Product atta = new Product(); atta.setName("Aashirvaad Whole Wheat Atta"); atta.setDescription("5kg pack of wheat flour"); atta.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71VqPxaL4DL._SL1500_.jpg"); atta.setPrice(250.00); atta.setCategory(grocery);
        Product puzzleBlocks = new Product(); puzzleBlocks.setName("Wooden Puzzle Blocks"); puzzleBlocks.setDescription("Educational toy for toddlers"); puzzleBlocks.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/91CVzFvY2nL._SL1500_.jpg"); puzzleBlocks.setPrice(599.00); puzzleBlocks.setCategory(toys);
        Product notebookSet = new Product(); notebookSet.setName("Set of 5 Notebooks"); notebookSet.setDescription("Classmate notebooks combo"); notebookSet.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/81Bmf0fRBoL._SL1500_.jpg"); notebookSet.setPrice(229.00); notebookSet.setCategory(stationery);
        Product earphones = new Product(); earphones.setName("boAt Bassheads 100"); earphones.setDescription("Wired earphones with mic"); earphones.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/719elVA3FvL._SL1500_.jpg"); earphones.setPrice(399.00); earphones.setCategory(electronics);
        Product hoodieWomen = new Product(); hoodieWomen.setName("Allen Solly Women's Hoodie"); hoodieWomen.setDescription("Cotton hoodie with zip"); hoodieWomen.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/51BG1tbNkoL._SL1500_.jpg"); hoodieWomen.setPrice(1799.00); hoodieWomen.setCategory(clothing);
        Product kettle = new Product(); kettle.setName("Bajaj Electric Kettle"); kettle.setDescription("1.2L stainless steel kettle"); kettle.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/61lyl1QaaWL._SL1500_.jpg"); kettle.setPrice(1199.00); kettle.setCategory(home);
        Product scienceBook = new Product(); scienceBook.setName("A Brief History of Time"); scienceBook.setDescription("Stephen Hawking’s science book"); scienceBook.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/81WcnNQ-TBL._SL1500_.jpg"); scienceBook.setPrice(399.00); scienceBook.setCategory(books);
        Product badmintonShuttle = new Product(); badmintonShuttle.setName("Yonex Mavis 350 Shuttle"); badmintonShuttle.setDescription("Pack of 6 nylon shuttlecocks"); badmintonShuttle.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/81BrAaJ8R7L._SL1500_.jpg"); badmintonShuttle.setPrice(899.00); badmintonShuttle.setCategory(sports);
        Product faceSerum = new Product(); faceSerum.setName("Minimalist Face Serum"); faceSerum.setDescription("Niacinamide 10% serum"); faceSerum.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/61Od9mLr1hL._SL1500_.jpg"); faceSerum.setPrice(599.00); faceSerum.setCategory(beauty);
        Product almonds = new Product(); almonds.setName("Happilo Premium Almonds"); almonds.setDescription("500g Californian almonds"); almonds.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/81xCr7BYcPL._SL1500_.jpg"); almonds.setPrice(449.00); almonds.setCategory(grocery);
        Product trainToy = new Product(); trainToy.setName("Toy Train Set"); trainToy.setDescription("Battery-operated toy train with tracks"); trainToy.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/81PfRJrXRaL._SL1500_.jpg"); trainToy.setPrice(749.00); trainToy.setCategory(toys);
        Product stickyNotes = new Product(); stickyNotes.setName("Sticky Notes Pack"); stickyNotes.setDescription("Colorful sticky notes set"); stickyNotes.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/81DspQwBTZL._SL1500_.jpg"); stickyNotes.setPrice(119.00); stickyNotes.setCategory(stationery);
        Product smartPlug = new Product(); smartPlug.setName("Wipro Smart Plug"); smartPlug.setDescription("WiFi smart plug for appliances"); smartPlug.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/51MLkavhfDL._SL1000_.jpg"); smartPlug.setPrice(999.00); smartPlug.setCategory(electronics);
        Product trenchCoat = new Product(); trenchCoat.setName("Women’s Trench Coat"); trenchCoat.setDescription("Double-breasted stylish coat"); trenchCoat.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/61T9QfN+88L._SL1200_.jpg"); trenchCoat.setPrice(2999.00); trenchCoat.setCategory(clothing);

        Product airFryer = new Product();
        airFryer.setName("Philips Digital Air Fryer");
        airFryer.setDescription("Low oil usage, touch panel, 4.1L capacity");
        airFryer.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/61NpLGe0KqL._SL1500_.jpg");
        airFryer.setPrice(8999.00);
        airFryer.setCategory(home);

        productRepository.saveAll(Arrays.asList(
        	    earbuds, tablet, tshirt, mixer, book, football, facewash, rice, lego, pens,
        	    kindle, hoodie, bedsheet, crayons, shampoo, cereal, doll, diary, novel, skippingRope,
        	    airConditioner, smartwatchBoat, blazer, saree, curtain, dinnerSet, markers, glue,
        	    chips, honey, lipstick, eyeliner, basketball, badminton, chess, puzzle, storyBook,
        	    motivationBook, notebook, toyCar, waterBottle, roomHeater, ironBox, curryMasala, greenTea,
        	    sketchPens, planner, smartwatchFireBoltt, hairDryer, faceCream, volleyBall, tableTennisBat,
        	    kidsTent, puzzleBall, airFryer, encyclopaedia, businessBook, glitterPens, extensionBoard,
        	    incenseSticks, mopSet, smartTV, jeans, pressureCooker, historyBook, dumbbells,
        	    foundation, oats, robotToy, stapler, laptopStand, jacket, wallClock, comicBook, yogaMat,
        	    kajal, sugar, teddyBear, binderClips, adapter, socks, peeler, travelBook, skippingMat,
        	    compact, atta, puzzleBlocks, notebookSet, earphones, hoodieWomen, kettle, scienceBook,
        	    badmintonShuttle, faceSerum, almonds, trainToy, stickyNotes, smartPlug, trenchCoat
        	));


    }
}
