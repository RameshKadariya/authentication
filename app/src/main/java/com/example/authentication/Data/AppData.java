package com.example.authentication.Data;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import com.example.authentication.Constants.MyConstants;
import com.example.authentication.Database.RoomDB;
import com.example.authentication.Models.Items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AppData extends Application {
    RoomDB database;
    String category;
    Context context;

    public static final String LAST_VERSION = "LAST_VERSION";
    public static final int NEW_VERSION = 1;

    public AppData(RoomDB database) {
        this.database = database;
    }

    public AppData(RoomDB database, Context context) {
        this.database = database;
        this.context = context;
    }

    public List<Items> getBasicData() {
        category = "BasicNeeds";
        List<Items> basicItem = new ArrayList<>();

        basicItem.clear();

        basicItem.add(new Items("Visa", category, false));
        basicItem.add(new Items("Passport", category, false));
        basicItem.add(new Items("Tickets", category, false));
        basicItem.add(new Items("Wallet", category, false));
        basicItem.add(new Items("Currency", category, false));
        basicItem.add(new Items("House Key", category, false));
        basicItem.add(new Items("Book", category, false));
        basicItem.add(new Items("Travel Pillow", category, false));
        basicItem.add(new Items("Eye Patch", category, false));
        basicItem.add(new Items("Umbrella", category, false));
        basicItem.add(new Items("Note Book", category, false));
        basicItem.add(new Items("Notebook", category, false));
        basicItem.add(new Items("Charger", category, false));
        basicItem.add(new Items("Power Bank", category, false));
        basicItem.add(new Items("Sunglasses", category, false));
        basicItem.add(new Items("Hand Sanitizer", category, false));
        basicItem.add(new Items("Pen", category, false));
        basicItem.add(new Items("Travel Adapter", category, false));
        basicItem.add(new Items("Map", category, false));
        basicItem.add(new Items("Emergency Contact List", category, false));
        basicItem.add(new Items("Travel Insurance", category, false));
        basicItem.add(new Items("Laundry Bag", category, false));
        basicItem.add(new Items("Reusable Water Bottle", category, false));
        basicItem.add(new Items("Camera", category, false));
        basicItem.add(new Items("Snacks", category, false));
        basicItem.add(new Items("Portable Fan", category, false));
        basicItem.add(new Items("Travel Laundry Detergent", category, false));

        return basicItem;
    }

    ;

    public List<Items> getPersonalCareData() {
        String[] data = {
                "Toothbrush", "Toothpaste", "Floss", "Mouthwash",
                "Shaving Cream", "Razor Blade", "Soap",
                "Fiber", "Shampoo", "Hair Conditioner",
                "Brush", "Comb", "Hair Dryer",
                "Curling Iron", "Deodorant", "Face Wash",
                "Lotion", "Sunscreen", "Nail Clipper",
                "Cotton Swabs", "Tweezers", "Makeup Kit", "Hair Gel",
                "Body Wash", "Face Cream", "Foot Cream",
                "Shaving Kit", "Nail Polish", "Hand Cream", "Facial Tissues"
        };
        return prepareItemsList(MyConstants.PERSONAL_CARE_CAMEL_CASE, data);
    }

    public List<Items> getClothingData() {
        String[] data = {
                "Stockings", "Underwear", "Pajamas", "T-Shirts",
                "Casual Dress", "Evening Dress", "Coat",
                "Rain Coat", "Gloves", "Heeled Shoes",
                "Sports Wear", "Sneakers", "Socks",
                "Swimwear", "Hat", "Scarf",
                "Sweater", "Leggings", "Shorts", "Jeans",
                "Jacket", "Vest", "Dress Shoes", "Belts",
                "Sleepwear", "Slippers", "Boots", "Cardigan"
        };
        return prepareItemsList(MyConstants.CLOTHING_CAMEL_CASE, data);
    }

    public List<Items> getBabyNeedsData() {
        String[] data = {
                "Diapers", "Baby Wipes", "Baby Food", "Milk Bottles",
                "Pacifier", "Baby Blanket", "Baby Clothes",
                "Baby Lotion", "Baby Powder", "Baby Shampoo",
                "Baby Toys", "Stroller", "Car Seat",
                "Changing Pad", "Burp Cloths", "Baby Monitor",
                "Baby Bibs", "Baby Hat", "Baby Socks", "Swaddle Blanket",
                "Baby Bath Tub", "Nursing Pillow", "Baby Carrier", "Feeding Bottles"
        };
        return prepareItemsList(MyConstants.BABY_NEEDS_CAMEL_CASE, data);
    }

    public List<Items> getHealthData() {
        String[] data = {
                "First Aid Kit", "Prescription Medications", "Pain Relievers", "Vitamins",
                "Hand Sanitizer", "Thermometer", "Band-Aids",
                "Antibiotic Ointment", "Eye Drops", "Cough Drops",
                "Face Masks", "Gloves", "Disinfectant Wipes",
                "Inhaler", "Allergy Medicine", "Blood Pressure Monitor",
                "Antiseptic", "Anti-Itch Cream", "Cold Pack", "Heat Pack",
                "Hydrocortisone Cream", "Anti-Nausea Medication", "Anti-Diarrheal Medication",
                "Tweezers", "Ear Thermometer", "Emergency Medication", "Travel Sickness Tablets"
        };
        return prepareItemsList(MyConstants.HEALTH_CAMEL_CASE, data);
    }

    public List<Items> getTechnologyData() {
        String[] data = {
                "Laptop", "Tablet", "Smartphone", "Charger",
                "Power Bank", "USB Cable", "Headphones",
                "Portable Speaker", "Camera", "Memory Card",
                "Smartwatch", "Mouse", "Keyboard",
                "External Hard Drive", "Portable Wi-Fi Hotspot", "HDMI Cable",
                "Laptop Sleeve", "Car Charger", "Flash Drive", "Bluetooth Earbuds",
                "Travel Router", "Charging Dock", "Ethernet Cable", "Laptop Stand"
        };
        return prepareItemsList(MyConstants.TECHNOLOGY_CAMEL_CASE, data);
    }

    public List<Items> getFoodData() {
        String[] data = {
                "Snacks", "Bottled Water", "Instant Noodles", "Canned Food",
                "Fruits", "Vegetables", "Bread",
                "Cheese", "Cookies", "Juice Boxes",
                "Energy Bars", "Sandwiches", "Nuts",
                "Chocolates", "Yogurt", "Dried Fruits",
                "Granola Bars", "Trail Mix", "Peanut Butter", "Jam",
                "Instant Coffee", "Tea Bags", "Crackers", "Canned Soup",
                "Instant Oatmeal", "Protein Bars", "Powdered Drink Mix", "Canned Vegetables"
        };
        return prepareItemsList(MyConstants.FOOD_CAMEL_CASE, data);
    }

    public List<Items> getBeachSuppliesData() {
        String[] data = {
                "Swimsuit", "Beach Towel", "Sunscreen", "Beach Umbrella",
                "Sandals", "Beach Bag", "Sunglasses",
                "Hat", "Water Bottle", "Snorkel Gear",
                "Beach Toys", "Cooler", "Beach Chair",
                "Book", "Portable Speaker", "Beach Mat",
                "Beach Blanket", "Waterproof Phone Case", "Beach Hat", "Beach Shoes",
                "Sun Hat", "Beach Cooler Bag", "Beach Volleyball", "Travel Beach Tent",
                "Beach Shade", "Tote Bag", "Wet Wipes", "Cooling Towel"
        };
        return prepareItemsList(MyConstants.BEACH_SUPPLIES_CAMEL_CASE, data);
    }

    public List<Items> getCarSuppliesData() {
        String[] data = {
                "Spare Tire", "Car Jack", "Jumper Cables", "Tire Pressure Gauge",
                "Flashlight", "Car Charger", "First Aid Kit",
                "Roadside Assistance Kit", "Car Manual", "Windshield Washer Fluid",
                "Motor Oil", "Tool Kit", "Emergency Flares",
                "Blanket", "Ice Scraper", "Emergency Poncho",
                "Windshield Sun Shade", "Tire Repair Kit", "Battery Booster", "Car Cover",
                "Emergency Kit", "Portable Air Compressor", "Tow Rope", "Reflective Warning Triangle",
                "Fire Extinguisher", "Car Cleaning Supplies", "Phone Mount", "Jump Start Kit"
        };
        return prepareItemsList(MyConstants.CAR_SUPPLIES_CAMEL_CASE, data);
    }

    public List<Items> getNeedsData() {
        String[] data = {
                "Visa", "Passport", "Tickets", "Wallet",
                "Driving License", "Currency", "House Key",
                "Book", "Travel Pillow", "Eye Patch",
                "Umbrella", "Notebook", "Charger",
                "Power Bank", "Sunglasses", "Hand Sanitizer",
                "Pen", "Travel Adapter", "Map", "Emergency Contact List",
                "Travel Insurance", "Laundry Bag", "Reusable Water Bottle",
                "Camera", "Snacks", "Portable Fan", "Travel Laundry Detergent",
                "Travel Mug", "Keychain", "Luggage Tag", "Emergency Kit",
                "Portable Hand Warmer", "Compact Flashlight", "Travel Blanket"
        };

        return prepareItemsList(MyConstants.NEEDS_CAMEL_CASE, data);
    }


    public List<Items> prepareItemsList(String category, String[] data) {
        List<String> list = Arrays.asList(data);
        List<Items> dataList = new ArrayList<>();
        dataList.clear();

        for (int i = 0; i < list.size(); i++) {
            dataList.add(new Items(list.get(i), category, false));
        }
        return dataList;

    }

    public List<List<Items>> getAllData() {
        List<List<Items>> listofAllItems = new ArrayList<>();
        listofAllItems.clear();
        listofAllItems.add(getBasicData());
        listofAllItems.add(getClothingData());
        listofAllItems.add(getPersonalCareData());
        listofAllItems.add(getBabyNeedsData());
        listofAllItems.add(getHealthData());
        listofAllItems.add(getTechnologyData());
        listofAllItems.add(getBeachSuppliesData());
        listofAllItems.add(getCarSuppliesData());
        listofAllItems.add(getNeedsData());
        listofAllItems.add(getFoodData());
        return listofAllItems;
    }

    public void persistAllData() {
        List<List<Items>> listOfAllItems = getAllData();
        for (List<Items> list : listOfAllItems) {
            for (Items items : list) {
                database.mainDao().saveItem(items);
            }
        }
        System.out.println("New Data Has Been Added Sucessfully");
    }

    public void persistDataByCategory(String category, Boolean onlyDelete) {
        try {
            List<Items> list = deleteAndGetListByCategory(category, onlyDelete);
            if (!onlyDelete) {
                for (Items item : list) {
                    database.mainDao().saveItem(item);
                }
                Toast.makeText(this, "Reset Successfully", Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(this, "Reset Successfully", Toast.LENGTH_SHORT).show();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            Toast.makeText(this, "Something Went Wrong", Toast.LENGTH_SHORT).show();

        }
    }

    private List<Items> deleteAndGetListByCategory(String category, Boolean onlyDelete) {
        if (onlyDelete) {
            database.mainDao().deleteAllByCategoryAndAddedBy(category, MyConstants.SYSTEM_SMALL);
        } else {
            database.mainDao().deleteAllByCategory(category);
        }
        switch (category) {
            case MyConstants.BASIC_NEEDS_CAMEL_CASE:
                return getBasicData();

            case MyConstants.CLOTHING_CAMEL_CASE:
                return getClothingData();

            case MyConstants.PERSONAL_CARE_CAMEL_CASE:
                return getPersonalCareData();

            case MyConstants.BABY_NEEDS_CAMEL_CASE:
                return getBabyNeedsData();

            case MyConstants.HEALTH_CAMEL_CASE:
                return getHealthData();

            case MyConstants.TECHNOLOGY_CAMEL_CASE:
                return getTechnologyData();

            case MyConstants.BEACH_SUPPLIES_CAMEL_CASE:
                return getBeachSuppliesData();

            case MyConstants.CAR_SUPPLIES_CAMEL_CASE:
                return getCarSuppliesData();

            case MyConstants.FOOD_CAMEL_CASE:
                return getFoodData();
            case MyConstants.NEEDS_CAMEL_CASE:
                return getNeedsData();
            default:
                return new ArrayList<>();
        }

    }
}
