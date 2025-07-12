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
        earbuds.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRRrWl43OygowCgsmEQx8LcMYn7lYUps-f7-g&s");
        earbuds.setPrice(2499.00);
        earbuds.setCategory(electronics);

        Product tablet = new Product();
        tablet.setName("iPad 10th Gen");
        tablet.setDescription("Apple iPad with 10.9-inch display");
        tablet.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRJCosYlSm7HyJwGNZr3VQYCSnMYWRImKJUjA&s");
        tablet.setPrice(34999.00);
        tablet.setCategory(electronics);

        Product tshirt = new Product();
        tshirt.setName("Puma Sports T-shirt");
        tshirt.setDescription("Dry fit running t-shirt");
        tshirt.setImageUrl("https://images.jdmagicbox.com/quickquotes/images_main/puma-t-shirts-22-06-2021-1243-231379871-qbh4o.jpg");
        tshirt.setPrice(899.00);
        tshirt.setCategory(clothing);

        Product mixer = new Product();
        mixer.setName("Philips Mixer Grinder");
        mixer.setDescription("750W powerful motor with 3 jars");
        mixer.setImageUrl("https://m.media-amazon.com/images/I/71mL2bdyRdL.jpg");
        mixer.setPrice(2999.00);
        mixer.setCategory(home);

        Product book = new Product();
        book.setName("Atomic Habits");
        book.setDescription("Tiny changes, remarkable results by James Clear");
        book.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQIRL5SnfSnRJwnqi7JzpI9xdbvPy9D3kNwJw&s");
        book.setPrice(499.00);
        book.setCategory(books);

        Product football = new Product();
        football.setName("Nivia Football");
        football.setDescription("Size 5 synthetic rubber football");
        football.setImageUrl("https://www.niviasports.com/cdn/shop/files/1_5ccafa5a-f280-40df-badd-12a5291fb0a0.jpg?v=1714132791");
        football.setPrice(799.00);
        football.setCategory(sports);

        Product facewash = new Product();
        facewash.setName("Himalaya Face Wash");
        facewash.setDescription("Neem face wash for acne-free skin");
        facewash.setImageUrl("https://m.media-amazon.com/images/I/61szHmyNAPL.jpg");
        facewash.setPrice(199.00);
        facewash.setCategory(beauty);

        Product rice = new Product();
        rice.setName("India Gate Basmati Rice");
        rice.setDescription("5kg long grain basmati rice");
        rice.setImageUrl("https://m.media-amazon.com/images/I/71xpepHmE8L._UF1000,1000_QL80_.jpg");
        rice.setPrice(699.00);
        rice.setCategory(grocery);

        Product lego = new Product();
        lego.setName("LEGO City Police Station Set");
        lego.setDescription("600+ pieces construction toy set");
        lego.setImageUrl("https://cdn.pixelspray.io/v2/black-bread-289bfa/HrdP6X/original/hamleys-product/493176368/300/493176368-1.jpeg");
        lego.setPrice(3499.00);
        lego.setCategory(toys);

        Product pens = new Product();
        pens.setName("Cello Butterflow Pens (Pack of 10)");
        pens.setDescription("Smooth ink, blue pens");
        pens.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQeYJ643Sc2nbXtrAZ6Bavgs9YLd5XCAeiI7w&s");
        pens.setPrice(199.00);
        pens.setCategory(stationery);

        Product kindle = new Product();
        kindle.setName("Kindle Paperwhite");
        kindle.setDescription("E-reader with adjustable warm light");
        kindle.setImageUrl("https://akm-img-a-in.tosshub.com/indiatoday/images/story/201812/Kindle_Paperwhite_2018_main.jpeg");
        kindle.setPrice(10499.00);
        kindle.setCategory(electronics);

        Product hoodie = new Product();
        hoodie.setName("Nike Men's Hoodie");
        hoodie.setDescription("Comfortable fleece hoodie");
        hoodie.setImageUrl("https://4.imimg.com/data4/RQ/LL/MY-10764091/mens-nike-hoodies.jpeg");
        hoodie.setPrice(2999.00);
        hoodie.setCategory(clothing);

        Product bedsheet = new Product();
        bedsheet.setName("Bombay Dyeing Bedsheet");
        bedsheet.setDescription("Cotton double bedsheet with 2 pillow covers");
        bedsheet.setImageUrl("https://images.meesho.com/images/products/346878574/jazep_512.webp");
        bedsheet.setPrice(899.00);
        bedsheet.setCategory(home);

        Product crayons = new Product();
        crayons.setName("Faber-Castell Wax Crayons");
        crayons.setDescription("Set of 24 non-toxic crayons");
        crayons.setImageUrl("https://m.media-amazon.com/images/I/81J4tPzoa7L.jpg");
        crayons.setPrice(129.00);
        crayons.setCategory(stationery);

        Product shampoo = new Product();
        shampoo.setName("Dove Intense Repair Shampoo");
        shampoo.setDescription("Nourishing shampoo for damaged hair");
        shampoo.setImageUrl("https://m.media-amazon.com/images/I/41mYNA3tXNL.jpg");
        shampoo.setPrice(249.00);
        shampoo.setCategory(beauty);
        
        Product galaxyPhone = new Product();
        galaxyPhone.setName("Samsung Galaxy M14");
        galaxyPhone.setDescription("Mid-range smartphone with 5G");
        galaxyPhone.setImageUrl("https://m.media-amazon.com/images/I/913EiorAS0L.jpg");
        galaxyPhone.setPrice(13499.00);
        galaxyPhone.setCategory(electronics);

        Product lenovoLaptop = new Product();
        lenovoLaptop.setName("Lenovo IdeaPad Slim 3");
        lenovoLaptop.setDescription("15.6 inch FHD Laptop");
        lenovoLaptop.setImageUrl("https://m.media-amazon.com/images/I/81+SKGgJ9yL._UF1000,1000_QL80_.jpg");
        lenovoLaptop.setPrice(37999.00);
        lenovoLaptop.setCategory(electronics);

        Product sonySpeaker = new Product();
        sonySpeaker.setName("Sony Bluetooth Speaker");
        sonySpeaker.setDescription("Portable wireless speaker with bass");
        sonySpeaker.setImageUrl("https://shopatsc.com/cdn/shop/products/SRS-XV900-1.jpg?v=1670058495");
        sonySpeaker.setPrice(4499.00);
        sonySpeaker.setCategory(electronics);

        Product samsungTV = new Product();
        samsungTV.setName("Samsung 32-inch Smart TV");
        samsungTV.setDescription("Smart HD LED TV");
        samsungTV.setImageUrl("https://rukminim2.flixcart.com/image/850/1000/xif0q/television/k/h/w/-original-imah3868qdatnqg8.jpeg?q=90&crop=false");
        samsungTV.setPrice(13999.00);
        samsungTV.setCategory(electronics);

        Product powerBank = new Product();
        powerBank.setName("Redmi Power Bank 10000mAh");
        powerBank.setDescription("Fast charging USB and Type-C");
        powerBank.setImageUrl("https://cdn.dotpe.in/longtail/store-items/4302408/IOy7ySge.jpeg");
        powerBank.setPrice(1199.00);
        powerBank.setCategory(electronics);

        Product levisJeans = new Product();
        levisJeans.setName("Levi's Slim Fit Jeans");
        levisJeans.setDescription("Comfortable stretch jeans for men");
        levisJeans.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTnrqf38aIvuIzktdSkWX54q0rOaUbz_6C22g&s");
        levisJeans.setPrice(1999.00);
        levisJeans.setCategory(clothing);

        Product adidasCap = new Product();
        adidasCap.setName("Adidas Cotton Cap");
        adidasCap.setDescription("Adjustable sports cap");
        adidasCap.setImageUrl("https://scssports.in/cdn/shop/files/COTTON_BASEBALL_CAP_Black_FK0891_01_standard.jpg?v=1728643666");
        adidasCap.setPrice(599.00);
        adidasCap.setCategory(clothing);

        Product raymondShirt = new Product();
        raymondShirt.setName("Raymond Formal Shirt");
        raymondShirt.setDescription("Cotton shirt for office wear");
        raymondShirt.setImageUrl("https://myraymond.com/cdn/shop/files/RMSU13071-B7-1.jpg?v=1725603487");
        raymondShirt.setPrice(899.00);
        raymondShirt.setCategory(clothing);

        Product cottonBedsheet = new Product();
        cottonBedsheet.setName("Floral Cotton Bedsheet");
        cottonBedsheet.setDescription("King size bedsheet with pillow covers");
        cottonBedsheet.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZ0ujmXZcSGxgQqId2XvQBiq4KvhlYNLe7SQ&s");
        cottonBedsheet.setPrice(1099.00);
        cottonBedsheet.setCategory(home);

        Product philipsBulb = new Product();
        philipsBulb.setName("Philips 9W LED Bulb");
        philipsBulb.setDescription("Energy-efficient LED bulb");
        philipsBulb.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ_KRhERNA8TcFHojtOd6DXZLs7vyPjFx-GtA&s");
        philipsBulb.setPrice(199.00);
        philipsBulb.setCategory(home);

        Product ikigaiBook = new Product();
        ikigaiBook.setName("Ikigai");
        ikigaiBook.setDescription("Japanese secret to long life");
        ikigaiBook.setImageUrl("https://benmeer.com/wp-content/uploads/2024/06/Ikigai-by-Justin-Wright_Sized.jpeg");
        ikigaiBook.setPrice(399.00);
        ikigaiBook.setCategory(books);

        Product monkBook = new Product();
        monkBook.setName("Think Like a Monk");
        monkBook.setDescription("Book by Jay Shetty");
        monkBook.setImageUrl("https://bookbins.b-cdn.net/wp-content/uploads/2024/07/Bookbins-Book-Informative-Think-like-a-monk-Buy-Online-Bookbins-1.png");
        monkBook.setPrice(449.00);
        monkBook.setCategory(books);

        Product tennisBall = new Product();
        tennisBall.setName("Championship Tennis Ball");
        tennisBall.setDescription("Set of 3 professional balls");
        tennisBall.setImageUrl("https://m.media-amazon.com/images/I/31HdhnlNSKL.jpg");
        tennisBall.setPrice(299.00);
        tennisBall.setCategory(sports);

        Product yogaMat = new Product();
        yogaMat.setName("Yoga Mat 6mm");
        yogaMat.setDescription("Anti-slip workout mat");
        yogaMat.setImageUrl("https://m.media-amazon.com/images/I/41fQHCuWAsL.jpg");
        yogaMat.setPrice(599.00);
        yogaMat.setCategory(sports);

        Product beardOil = new Product();
        beardOil.setName("Beardo Beard Oil");
        beardOil.setDescription("Beard nourishment and growth");
        beardOil.setImageUrl("https://images.apollo247.in/pub/media/catalog/product/B/E/BEA0042_4-JULY23_1.jpg?tr=q-80,f-webp,w-400,dpr-6,c-at_max");
        beardOil.setPrice(349.00);
        beardOil.setCategory(beauty);

        Product lipBalm = new Product();
        lipBalm.setName("Lakme Lip Balm");
        lipBalm.setDescription("Strawberry moisturizing balm");
        lipBalm.setImageUrl("https://images-static.nykaa.com/media/catalog/product/c/3/c300f398901030713941_0.jpg");
        lipBalm.setPrice(149.00);
        lipBalm.setCategory(beauty);

        Product atta = new Product();
        atta.setName("Aashirvaad Atta 5kg");
        atta.setDescription("Whole wheat flour");
        atta.setImageUrl("https://www.bbassets.com/media/uploads/p/xl/126903_12-aashirvaad-atta-whole-wheat.jpg");
        atta.setPrice(269.00);
        atta.setCategory(grocery);

        Product butter = new Product();
        butter.setName("Amul Butter 500g");
        butter.setDescription("Delicious and creamy butter");
        butter.setImageUrl("https://www.bbassets.com/media/uploads/p/xl/104864_8-amul-butter-pasteurised.jpg");
        butter.setPrice(275.00);
        butter.setCategory(grocery);

        Product legoCar = new Product();
        legoCar.setName("LEGO Technic Car");
        legoCar.setDescription("Advanced kit for teens");
        legoCar.setImageUrl("https://m.media-amazon.com/images/I/816qbdD2V8L.jpg");
        legoCar.setPrice(6999.00);
        legoCar.setCategory(toys);

        Product rubiksCube = new Product();
        rubiksCube.setName("Rubik's Cube 3x3");
        rubiksCube.setDescription("Speed puzzle cube");
        rubiksCube.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQo8G2CENVfcllUza8QOaFRnSzuvq5crV81Vw&s");
        rubiksCube.setPrice(199.00);
        rubiksCube.setCategory(toys);

        Product geometryBox = new Product();
        geometryBox.setName("Camlin Geometry Box");
        geometryBox.setDescription("Complete math set for students");
        geometryBox.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTHoDJn1qtbVGsW7NM6IbBYMNvuxiYnsxnYQ&s");
        geometryBox.setPrice(149.00);
        geometryBox.setCategory(stationery);

        Product staedtlerPencils = new Product();
        staedtlerPencils.setName("Staedtler Pencils Set");
        staedtlerPencils.setDescription("12 graphite pencils for drawing");
        staedtlerPencils.setImageUrl("https://m.media-amazon.com/images/I/718k-d3dxOL._UF1000,1000_QL80_.jpg");
        staedtlerPencils.setPrice(239.00);
        staedtlerPencils.setCategory(stationery);


        Product cereal = new Product();
        cereal.setName("Kellogg’s Corn Flakes");
        cereal.setDescription("Breakfast cereal - 1kg family pack");
        cereal.setImageUrl("https://m.media-amazon.com/images/I/81EsCQ6QdCL.jpg");
        cereal.setPrice(299.00);
        cereal.setCategory(grocery);

        Product doll = new Product();
        doll.setName("Barbie Fashion Doll");
        doll.setDescription("Barbie doll with dress and accessories");
        doll.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQa_672wNzxDRanyCjbBol-8JUxFRQKN8IZJA&s");
        doll.setPrice(799.00);
        doll.setCategory(toys);

        Product diary = new Product();
        diary.setName("Classmate Spiral Diary");
        diary.setDescription("160 pages ruled diary");
        diary.setImageUrl("https://m.media-amazon.com/images/I/71hvNQi9GML.jpg");
        diary.setPrice(159.00);
        diary.setCategory(stationery);

        Product novel = new Product();
        novel.setName("It Ends With Us - Colleen Hoover");
        novel.setDescription("Top-selling romance novel");
        novel.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUysUYUFekhhd18zbEG7Z6uuJCNusLR3Ulfg&s");
        novel.setPrice(349.00);
        novel.setCategory(books);

        Product skippingRope = new Product();
        skippingRope.setName("Boldfit Skipping Rope");
        skippingRope.setDescription("Adjustable skipping rope for workouts");
        skippingRope.setImageUrl("https://m.media-amazon.com/images/I/71l2-gWOnpL.jpg");
        skippingRope.setPrice(299.00);
        skippingRope.setCategory(sports);

        Product airConditioner = new Product();
        airConditioner.setName("LG Split AC");
        airConditioner.setDescription("1.5 Ton 5 Star Inverter Split AC");
        airConditioner.setImageUrl("https://m.media-amazon.com/images/I/91KFobBnaDL._UF1000,1000_QL80_.jpg");
        airConditioner.setPrice(34999.00);
        airConditioner.setCategory(electronics);

        Product smartwatchBoat = new Product();
        smartwatchBoat.setName("boAt Xtend Smartwatch");
        smartwatchBoat.setDescription("Alexa built-in smartwatch with SpO2 monitoring");
        smartwatchBoat.setImageUrl("https://m.media-amazon.com/images/I/61IMRs+o0iL._UF1000,1000_QL80_.jpg");
        smartwatchBoat.setPrice(2499.00);
        smartwatchBoat.setCategory(electronics);

        Product blazer = new Product();
        blazer.setName("Peter England Men's Blazer");
        blazer.setDescription("Formal blue blazer for office & events");
        blazer.setImageUrl("https://imagescdn.peterengland.com/img/app/product/3/39625087-12868721.jpg?auto=format&w=390");
        blazer.setPrice(3999.00);
        blazer.setCategory(clothing);

        Product saree = new Product();
        saree.setName("Kanjivaram Silk Saree");
        saree.setDescription("Traditional festive saree");
        saree.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQurddcnh5Kgy0qS8InnhbUE2QlK8jxiVef2A&s");
        saree.setPrice(1999.00);
        saree.setCategory(clothing);

        Product curtain = new Product();
        curtain.setName("AmazonBasics Room Darkening Curtain");
        curtain.setDescription("Thermal insulated blackout curtain");
        curtain.setImageUrl("https://m.media-amazon.com/images/I/81ZQXAE1OVL.jpg");
        curtain.setPrice(899.00);
        curtain.setCategory(home);

        Product dinnerSet = new Product();
        dinnerSet.setName("LaOpala Dinner Set");
        dinnerSet.setDescription("35-piece dinner set for 6 people");
        dinnerSet.setImageUrl("https://m.media-amazon.com/images/I/7151kKSQXRL.jpg");
        dinnerSet.setPrice(1999.00);
        dinnerSet.setCategory(home);

        Product markers = new Product();
        markers.setName("Sharpie Permanent Markers");
        markers.setDescription("Pack of 12 assorted color markers");
        markers.setImageUrl("https://m.media-amazon.com/images/I/81wGuZOL1fL.jpg");
        markers.setPrice(599.00);
        markers.setCategory(stationery);

        Product glue = new Product();
        glue.setName("Fevicol MR Adhesive");
        glue.setDescription("Strong white glue for crafts");
        glue.setImageUrl("https://paperquirks.in/cdn/shop/files/Fevicol.jpg?v=1706099910&width=1024");
        glue.setPrice(49.00);
        glue.setCategory(stationery);

        Product chips = new Product();
        chips.setName("Lay's Classic Salted Chips");
        chips.setDescription("Potato chips 200g family pack");
        chips.setImageUrl("https://m.media-amazon.com/images/I/61e+UwnsWwL._UF1000,1000_QL80_.jpg");
        chips.setPrice(45.00);
        chips.setCategory(grocery);

        Product honey = new Product();
        honey.setName("Dabur Honey");
        honey.setDescription("100% Pure honey - 500g");
        honey.setImageUrl("https://m.media-amazon.com/images/I/71O4OnjaHVL.jpg");
        honey.setPrice(189.00);
        honey.setCategory(grocery);

        Product lipstick = new Product();
        lipstick.setName("Maybelline Matte Lipstick");
        lipstick.setDescription("Long-lasting lipstick - Cherry Chic");
        lipstick.setImageUrl("https://images-static.nykaa.com/media/catalog/product/a/0/a0959c56902395682806-z_6.jpg?tr=w-500");
        lipstick.setPrice(299.00);
        lipstick.setCategory(beauty);

        Product eyeliner = new Product();
        eyeliner.setName("Lakme Insta Eye Liner");
        eyeliner.setDescription("Water-resistant black eyeliner");
        eyeliner.setImageUrl("https://images-static.nykaa.com/media/catalog/product/0/0/0060d70LAK-new_8901030175046-new_3.jpg?tr=w-500");
        eyeliner.setPrice(120.00);
        eyeliner.setCategory(beauty);

        Product basketball = new Product();
        basketball.setName("Spalding NBA Basketball");
        basketball.setDescription("Official size rubber basketball");
        basketball.setImageUrl("https://images-cdn.ubuy.co.in/64cdb63b5ea7e16a0d67e516-spalding-nba-official-indoor-outdoor.jpg");
        basketball.setPrice(999.00);
        basketball.setCategory(sports);

        Product badminton = new Product();
        badminton.setName("Yonex GR 303 Badminton Racket");
        badminton.setDescription("Full graphite lightweight racket");
        badminton.setImageUrl("https://m.media-amazon.com/images/I/71ECwp15CPL._UF894,1000_QL80_.jpg");
        badminton.setPrice(799.00);
        badminton.setCategory(sports);

        Product chess = new Product();
        chess.setName("Magnetic Chess Board");
        chess.setDescription("Folding chess set for kids and adults");
        chess.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRPwRoufNBXaff5GYkW0rSZG-pNpEqGG6mmLQ&s");
        chess.setPrice(599.00);
        chess.setCategory(toys);

        Product puzzle = new Product();
        puzzle.setName("500-Piece Jigsaw Puzzle");
        puzzle.setDescription("Nature scenery puzzle game");
        puzzle.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-idhIG6D6UVt4REJawtEf2fV6KjQdxLbPKA&s");
        puzzle.setPrice(399.00);
        puzzle.setCategory(toys);

        Product storyBook = new Product();
        storyBook.setName("Panchatantra - Illustrated Stories");
        storyBook.setDescription("Indian fables for children");
        storyBook.setImageUrl("https://m.media-amazon.com/images/I/91SOUzj0xQL._UF1000,1000_QL80_.jpg");
        storyBook.setPrice(199.00);
        storyBook.setCategory(books);

        Product motivationBook = new Product();
        motivationBook.setName("The Power of Now");
        motivationBook.setDescription("Spiritual guide by Eckhart Tolle");
        motivationBook.setImageUrl("https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1545884080i/43369246.jpg");
        motivationBook.setPrice(399.00);
        motivationBook.setCategory(books);

        Product notebook = new Product();
        notebook.setName("Classmate Notebook");
        notebook.setDescription("400 pages ruled notebook");
        notebook.setImageUrl("https://topperskit.com/cdn/shop/files/13_3349afb0-aab4-43de-a115-c7c2bb8fd8a4.jpg?v=1717688056");
        notebook.setPrice(69.00);
        notebook.setCategory(stationery);

        Product toyCar = new Product();
        toyCar.setName("Hot Wheels Toy Car Set");
        toyCar.setDescription("Set of 5 metal cars");
        toyCar.setImageUrl("https://m.media-amazon.com/images/I/710x+nu3y2L._UF1000,1000_QL80_.jpg");
        toyCar.setPrice(499.00);
        toyCar.setCategory(toys);

        Product waterBottle = new Product();
        waterBottle.setName("Milton Thermosteel Bottle");
        waterBottle.setDescription("1000ml insulated stainless steel bottle");
        waterBottle.setImageUrl("https://m.media-amazon.com/images/I/81KrnHiiIHL.jpg");
        waterBottle.setPrice(799.00);
        waterBottle.setCategory(home);

        Product roomHeater = new Product();
        roomHeater.setName("Orpat Room Heater");
        roomHeater.setDescription("Fan heater for small rooms");
        roomHeater.setImageUrl("https://m.media-amazon.com/images/I/716o5sAQlGL.jpg");
        roomHeater.setPrice(1299.00);
        roomHeater.setCategory(home);

        Product ironBox = new Product();
        ironBox.setName("Philips Dry Iron");
        ironBox.setDescription("1000W lightweight iron");
        ironBox.setImageUrl("https://m.media-amazon.com/images/I/51YoZ-I6nuL.jpg");
        ironBox.setPrice(799.00);
        ironBox.setCategory(home);

        Product curryMasala = new Product();
        curryMasala.setName("Everest Kitchen King Masala");
        curryMasala.setDescription("100g spice blend");
        curryMasala.setImageUrl("https://m.media-amazon.com/images/I/81wqNnAA5IL._UF350,350_QL80_.jpg");
        curryMasala.setPrice(52.00);
        curryMasala.setCategory(grocery);

        Product greenTea = new Product();
        greenTea.setName("Lipton Green Tea Bags");
        greenTea.setDescription("100 tea bags with antioxidants");
        greenTea.setImageUrl("https://m.media-amazon.com/images/I/51JR9Xdae8L._AC_SY350_QL15_.jpg");
        greenTea.setPrice(299.00);
        greenTea.setCategory(grocery);

        Product sketchPens = new Product();
        sketchPens.setName("Camel Sketch Pens");
        sketchPens.setDescription("24 vibrant color markers");
        sketchPens.setImageUrl("https://www.jiomart.com/images/product/original/490011997/camlin-assorted-polypropylene-sketch-pens-12-shades-product-images-o490011997-p490011997-0-202406132200.jpg?im=Resize=(1000,1000)");
        sketchPens.setPrice(130.00);
        sketchPens.setCategory(stationery);

        Product planner = new Product();
        planner.setName("2025 Monthly Planner");
        planner.setDescription("Hardcover A5 planner with stickers");
        planner.setImageUrl("https://img.freepik.com/premium-vector/2025-monthly-planner-template-simple-minimal-design-start-week-monday-size-a4_1006685-105.jpg");
        planner.setPrice(349.00);
        planner.setCategory(stationery);

        Product smartwatchFireBoltt = new Product();
        smartwatchFireBoltt.setName("Fire-Boltt Ninja Call Pro");
        smartwatchFireBoltt.setDescription("Smartwatch with Bluetooth calling");
        smartwatchFireBoltt.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRPiH0gYRANM_k8a9DrAAnWDpJ7t1NLbW-lJg&s");
        smartwatchFireBoltt.setPrice(1599.00);
        smartwatchFireBoltt.setCategory(electronics);

        Product hairDryer = new Product();
        hairDryer.setName("Syska Hair Dryer");
        hairDryer.setDescription("Compact 1000W foldable hair dryer");
        hairDryer.setImageUrl("https://m.media-amazon.com/images/I/41Cb5lYoj2L.jpg");
        hairDryer.setPrice(749.00);
        hairDryer.setCategory(beauty);

        Product faceCream = new Product();
        faceCream.setName("Pond's Light Moisturizer");
        faceCream.setDescription("Non-oily freshness cream 150ml");
        faceCream.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR715UHoh6X92XGKAPhLapCsOk9uHYSn138dA&s");
        faceCream.setPrice(229.00);
        faceCream.setCategory(beauty);

        Product volleyBall = new Product();
        volleyBall.setName("Cosco Volleyball");
        volleyBall.setDescription("Standard size outdoor ball");
        volleyBall.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTuVYBGbUew5lm_cxHWI47RfEcJkhrotN53fw&s");
        volleyBall.setPrice(749.00);
        volleyBall.setCategory(sports);

        Product tableTennisBat = new Product();
        tableTennisBat.setName("Stag Table Tennis Bat");
        tableTennisBat.setDescription("Beginner racket with cover");
        tableTennisBat.setImageUrl("https://m.media-amazon.com/images/I/61Ovmi2bMWL.jpg");
        tableTennisBat.setPrice(399.00);
        tableTennisBat.setCategory(sports);

        Product kidsTent = new Product();
        kidsTent.setName("Playhut Tent House for Kids");
        kidsTent.setDescription("Indoor & outdoor play tent");
        kidsTent.setImageUrl("https://5.imimg.com/data5/SELLER/Default/2024/9/454122432/DJ/XH/PW/14274915/child-play-hut.jpeg");
        kidsTent.setPrice(999.00);
        kidsTent.setCategory(toys);

        Product puzzleBall = new Product();
        puzzleBall.setName("Magic Puzzle Ball");
        puzzleBall.setDescription("Color matching fidget toy");
        puzzleBall.setImageUrl("https://m.media-amazon.com/images/I/71IePYxxa6L.jpg");
        puzzleBall.setPrice(189.00);
        puzzleBall.setCategory(toys);

        Product encyclopaedia = new Product();
        encyclopaedia.setName("Children's Encyclopaedia");
        encyclopaedia.setDescription("Illustrated general knowledge book");
        encyclopaedia.setImageUrl("https://m.media-amazon.com/images/I/810z78CxwUL.jpg");
        encyclopaedia.setPrice(599.00);
        encyclopaedia.setCategory(books);

        Product businessBook = new Product();
        businessBook.setName("Rich Dad Poor Dad");
        businessBook.setDescription("Finance bestseller by Robert Kiyosaki");
        businessBook.setImageUrl("https://m.media-amazon.com/images/I/81BE7eeKzAL._UF1000,1000_QL80_.jpg");
        businessBook.setPrice(299.00);
        businessBook.setCategory(books);

        Product glitterPens = new Product();
        glitterPens.setName("Glitter Gel Pens (Pack of 10)");
        glitterPens.setDescription("Sparkling ink pens for art");
        glitterPens.setImageUrl("https://m.media-amazon.com/images/I/71TOdcf0KdL.jpg");
        glitterPens.setPrice(179.00);
        glitterPens.setCategory(stationery);

        Product extensionBoard = new Product();
        extensionBoard.setName("Havells Extension Board 4 Plug");
        extensionBoard.setDescription("Surge protected power strip");
        extensionBoard.setImageUrl("https://havells.com/media/catalog/product/cache/844a913d283fe95e56e39582c5f2767b/a/h/ahnkxxr000_1_1.jpg");
        extensionBoard.setPrice(699.00);
        extensionBoard.setCategory(electronics);

        Product incenseSticks = new Product();
        incenseSticks.setName("Cycle Three-in-One Agarbatti");
        incenseSticks.setDescription("Pack of 100 long incense sticks");
        incenseSticks.setImageUrl("https://cdn.zeptonow.com/production/tr:w-640,ar-720-720,pr-true,f-auto,q-80/cms/product_variant/1d0bd3db-7cc3-4a1c-9ac3-736bfebc192e.jpeg");
        incenseSticks.setPrice(95.00);
        incenseSticks.setCategory(home);

        Product mopSet = new Product();
        mopSet.setName("Scotch-Brite Spin Mop Set");
        mopSet.setDescription("360-degree easy spin bucket mop");
        mopSet.setImageUrl("https://m.media-amazon.com/images/I/71EreB+L92L._UF1000,1000_QL80_.jpg");
        mopSet.setPrice(1499.00);
        mopSet.setCategory(home);

        Product smartTV = new Product();
        smartTV.setName("Samsung 43\" Smart TV");
        smartTV.setDescription("4K Ultra HD LED Smart TV with Voice Assistant");
        smartTV.setImageUrl("https://images.samsung.com/is/image/samsung/p6pim/in/ua43t5410akxxl/gallery/in-fhd-t5310-ua43t5410akxxl-532972655?$684_547_PNG$");
        smartTV.setPrice(29999.00);
        smartTV.setCategory(electronics);

        Product jeans = new Product();
        jeans.setName("Levi's Men's Jeans");
        jeans.setDescription("Slim fit denim jeans");
        jeans.setImageUrl("https://m.media-amazon.com/images/I/71VDbV-56PL._UY1100_.jpg");
        jeans.setPrice(1999.00);
        jeans.setCategory(clothing);

        Product pressureCooker = new Product();
        pressureCooker.setName("Prestige Pressure Cooker");
        pressureCooker.setDescription("3L stainless steel pressure cooker");
        pressureCooker.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSfa13KO_O1VltCzZyNU87dVURUIzYFXXDsbA&s");
        pressureCooker.setPrice(1299.00);
        pressureCooker.setCategory(home);

        Product historyBook = new Product();
        historyBook.setName("Sapiens - Yuval Noah Harari");
        historyBook.setDescription("A brief history of humankind");
        historyBook.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQH12tHEgfa2jHGnZ_qYUKqpBSiFgMcm__ryw&s");
        historyBook.setPrice(499.00);
        historyBook.setCategory(books);

        Product dumbbells = new Product();
        dumbbells.setName("Rubber Coated Dumbbells");
        dumbbells.setDescription("Pair of 5kg dumbbells for fitness");
        dumbbells.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_mYAaCGEkl3etzTH44Fio7syjd2wqs6Ng0g&s");
        dumbbells.setPrice(999.00);
        dumbbells.setCategory(sports);

        Product foundation = new Product();
        foundation.setName("Lakme Foundation");
        foundation.setDescription("Long wear foundation - natural shade");
        foundation.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT89pOKnFn9GXn5kMp6-Sm-pjp9Pb9PMIqJYw&s");
        foundation.setPrice(299.00);
        foundation.setCategory(beauty);

        Product oats = new Product();
        oats.setName("Quaker Oats - 1kg");
        oats.setDescription("Healthy breakfast whole grain oats");
        oats.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSIwtxcNE6432JrrASuQt8BkgiEyYXVc-p4Sg&s");
        oats.setPrice(159.00);
        oats.setCategory(grocery);

        Product robotToy = new Product();
        robotToy.setName("RoboPet Smart Robot");
        robotToy.setDescription("Interactive robot toy with sensors");
        robotToy.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTQnYBVbVoqwiUeXG60SFFB392RMo_vAaN8Cg&s");
        robotToy.setPrice(1299.00);
        robotToy.setCategory(toys);

        Product stapler = new Product();
        stapler.setName("Kangaro Stapler");
        stapler.setDescription("Mini stapler with pins");
        stapler.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQD-eKL2S8EJnHFaYNsy7uWFFguzdv5XEx_vA&s");
        stapler.setPrice(79.00);
        stapler.setCategory(stationery);

        Product laptopStand = new Product();
        laptopStand.setName("AmazonBasics Laptop Stand");
        laptopStand.setDescription("Aluminum ventilated laptop stand");
        laptopStand.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRR8twDlRyALy8xjlOoY2bW3pM9CBbw2nGVbw&s");
        laptopStand.setPrice(1099.00);
        laptopStand.setCategory(electronics);

        Product jacket = new Product();
        jacket.setName("Wildcraft Men's Jacket");
        jacket.setDescription("Waterproof and windproof outdoor jacket");
        jacket.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7XFe4CBmKBO3_0sZ-3ASesuSHw-vU1abHzA&s");
        jacket.setPrice(2499.00);
        jacket.setCategory(clothing);

        Product wallClock = new Product();
        wallClock.setName("Ajanta Wall Clock");
        wallClock.setDescription("Silent sweep wall clock");
        wallClock.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLA3-hKCOxHeWGrQyADxdFpsM5p3OOjpYmzA&s");
        wallClock.setPrice(499.00);
        wallClock.setCategory(home);

        Product comicBook = new Product();
        comicBook.setName("Marvel Avengers Comic");
        comicBook.setDescription("Illustrated comic book for kids");
        comicBook.setImageUrl("https://m.media-amazon.com/images/I/71jXOJ-fTML.jpg");
        comicBook.setPrice(299.00);
        comicBook.setCategory(books);


        Product kajal = new Product();
        kajal.setName("Lakme Eyeconic Kajal");
        kajal.setDescription("Deep black 22hr smudge-proof kajal");
        kajal.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRAw-vFRZOTHGlImXatCaMRmnhI2zQdyTvd4w&s");
        kajal.setPrice(170.00);
        kajal.setCategory(beauty);

        Product sugar = new Product();
        sugar.setName("Patanjali Brown Sugar");
        sugar.setDescription("Organic 1kg brown sugar");
        sugar.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxQiUbAJwNrwz9HTaZkIOVblKERfJzbdV3Uw&s");
        sugar.setPrice(85.00);
        sugar.setCategory(grocery);

        Product teddyBear = new Product();
        teddyBear.setName("Cute Teddy Bear Plush");
        teddyBear.setDescription("Soft toy 30cm plush bear");
        teddyBear.setImageUrl("https://images-cdn.ubuy.co.in/67a64110fb4f4538e109b5e3-cute-plush-teddy-bear-stuffed-animal.jpg");
        teddyBear.setPrice(399.00);
        teddyBear.setCategory(toys);

        Product binderClips = new Product();
        binderClips.setName("Binder Clips Pack of 12");
        binderClips.setDescription("Office clips 19mm size");
        binderClips.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZ62ugybreuThoxxQ0qzaIzeJiTtrxoSBduQ&s");
        binderClips.setPrice(79.00);
        binderClips.setCategory(stationery);

        Product adapter = new Product();
        adapter.setName("Portronics USB Adapter");
        adapter.setDescription("Dual USB charging adapter");
        adapter.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYQtLk-VEIpS7H2bDQpuleyCGUhyBQWctgJw&s");
        adapter.setPrice(349.00);
        adapter.setCategory(electronics);

        // (20 more quickly listed below)

        Product socks = new Product(); socks.setName("Adidas Socks"); socks.setDescription("Cotton ankle socks pack"); socks.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSexOEnMvyyWESOLrZgme6udNZr510K8l5yxA&s"); socks.setPrice(399.00); socks.setCategory(clothing);
        Product peeler = new Product(); peeler.setName("Stainless Steel Peeler"); peeler.setDescription("Ergonomic vegetable peeler"); peeler.setImageUrl("https://m.media-amazon.com/images/I/71e955TMmNS._UF894,1000_QL80_.jpg"); peeler.setPrice(99.00); peeler.setCategory(home);
        Product travelBook = new Product(); travelBook.setName("Lonely Planet India"); travelBook.setDescription("Travel guide book for India"); travelBook.setImageUrl("https://m.media-amazon.com/images/I/71XKM7E6koL._UF1000,1000_QL80_.jpg"); travelBook.setPrice(999.00); travelBook.setCategory(books);
        Product skippingMat = new Product(); skippingMat.setName("Jump Rope Mat"); skippingMat.setDescription("Protects joints during skipping"); skippingMat.setImageUrl("https://images.meesho.com/images/products/386669595/laqnw_512.webp"); skippingMat.setPrice(799.00); skippingMat.setCategory(sports);
        Product compact = new Product(); compact.setName("Lakme Radiance Compact"); compact.setDescription("Daily wear face compact powder"); compact.setImageUrl("https://www.lakmeindia.com/cdn/shop/files/22498_S2-8901030992759_1000x.jpg?v=1710476814"); compact.setPrice(160.00); compact.setCategory(beauty);
        Product puzzleBlocks = new Product(); puzzleBlocks.setName("Wooden Puzzle Blocks"); puzzleBlocks.setDescription("Educational toy for toddlers"); puzzleBlocks.setImageUrl("https://www.indicinspirations.com/cdn/shop/collections/wooden-puzzles-468923.jpg?v=1601529076&width=807"); puzzleBlocks.setPrice(599.00); puzzleBlocks.setCategory(toys);
        Product notebookSet = new Product(); notebookSet.setName("Set of 5 Notebooks"); notebookSet.setDescription("Classmate notebooks combo"); notebookSet.setImageUrl("https://m.media-amazon.com/images/I/815l1fPVlWL.jpg"); notebookSet.setPrice(229.00); notebookSet.setCategory(stationery);
        Product earphones = new Product(); earphones.setName("boAt Bassheads 100"); earphones.setDescription("Wired earphones with mic"); earphones.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT43dzIBbvRsfZtw-Ueozf6Us8GAWpIlorz0Q&s"); earphones.setPrice(399.00); earphones.setCategory(electronics);
        Product hoodieWomen = new Product(); hoodieWomen.setName("Allen Solly Women's Hoodie"); hoodieWomen.setDescription("Cotton hoodie with zip"); hoodieWomen.setImageUrl("https://imagescdn.allensolly.com/img/app/product/7/769864-8853561.jpg?auto=format&w=390"); hoodieWomen.setPrice(1799.00); hoodieWomen.setCategory(clothing);
        Product kettle = new Product(); kettle.setName("Bajaj Electric Kettle"); kettle.setDescription("1.2L stainless steel kettle"); kettle.setImageUrl("https://m.media-amazon.com/images/I/717V4glGOsL.jpg"); kettle.setPrice(1199.00); kettle.setCategory(home);
        Product scienceBook = new Product(); scienceBook.setName("A Brief History of Time"); scienceBook.setDescription("Stephen Hawking’s science book"); scienceBook.setImageUrl("https://m.media-amazon.com/images/I/91ebghaV-eL._UF1000,1000_QL80_.jpg"); scienceBook.setPrice(399.00); scienceBook.setCategory(books);
        Product badmintonShuttle = new Product(); badmintonShuttle.setName("Yonex Mavis 350 Shuttle"); badmintonShuttle.setDescription("Pack of 6 nylon shuttlecocks"); badmintonShuttle.setImageUrl("https://kheladda.in/image/catalog/BADMINTON/Yonex%20Mavis%20350%20Nylon%20Yellow%20Shuttlecock(GREEN%20CAP).jpeg"); badmintonShuttle.setPrice(899.00); badmintonShuttle.setCategory(sports);
        Product faceSerum = new Product(); faceSerum.setName("Minimalist Face Serum"); faceSerum.setDescription("Niacinamide 10% serum"); faceSerum.setImageUrl("https://m.media-amazon.com/images/I/51fo5Cdx4YL._UF1000,1000_QL80_.jpg"); faceSerum.setPrice(599.00); faceSerum.setCategory(beauty);
        Product almonds = new Product(); almonds.setName("Happilo Premium Almonds"); almonds.setDescription("500g Californian almonds"); almonds.setImageUrl("https://m.media-amazon.com/images/I/71yjvVkZpaL.jpg"); almonds.setPrice(449.00); almonds.setCategory(grocery);
        Product trainToy = new Product(); trainToy.setName("Toy Train Set"); trainToy.setDescription("Battery-operated toy train with tracks"); trainToy.setImageUrl("https://m.media-amazon.com/images/I/41+2YbC6tOL._UF1000,1000_QL80_.jpg"); trainToy.setPrice(749.00); trainToy.setCategory(toys);
        Product stickyNotes = new Product(); stickyNotes.setName("Sticky Notes Pack"); stickyNotes.setDescription("Colorful sticky notes set"); stickyNotes.setImageUrl("https://m.media-amazon.com/images/I/71Sqp3OQSXL.jpg"); stickyNotes.setPrice(119.00); stickyNotes.setCategory(stationery);
        Product smartPlug = new Product(); smartPlug.setName("Wipro Smart Plug"); smartPlug.setDescription("WiFi smart plug for appliances"); smartPlug.setImageUrl("https://m.media-amazon.com/images/I/71+n1fGyJwL._UF350,350_QL80_.jpg"); smartPlug.setPrice(999.00); smartPlug.setCategory(electronics);
        Product trenchCoat = new Product(); trenchCoat.setName("Women’s Trench Coat"); trenchCoat.setDescription("Double-breasted stylish coat"); trenchCoat.setImageUrl("https://assets.ajio.com/medias/sys_master/root/20240625/Y2rB/667a125e1d763220fa17e416/-473Wx593H-466853268-brown-MODEL.jpg"); trenchCoat.setPrice(2999.00); trenchCoat.setCategory(clothing);

        Product airFryer = new Product();
        airFryer.setName("Philips Digital Air Fryer");
        airFryer.setDescription("Low oil usage, touch panel, 4.1L capacity");
        airFryer.setImageUrl("https://m.media-amazon.com/images/I/71ZJSl4lN2L._AC_UF894,1000_QL80_.jpg");
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