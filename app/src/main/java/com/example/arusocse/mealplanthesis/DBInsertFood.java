package com.example.arusocse.mealplanthesis;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.widget.Toast;



public class DBInsertFood {

    /* Variables */
    private final Context context;

    /* Public Class ------------------------------------------------------ */
    public DBInsertFood(Context ctx){
        this.context = ctx;
    }



    /* Setup Insert To Categories ----------------------------------------- */
    // To insert to category table
    public void setupInsertToCategories(String values){
        try{
            DBAdapter db = new DBAdapter(context);
            db.open();
            db.insert("categories",
                    "_id, category_name, category_parent_id, category_icon, category_note",
                    values);
            db.close();
        }
        catch (SQLiteException e){
            // Toast.makeText(context, "Error; Could not insert categories.", Toast.LENGTH_SHORT).show();
        }
    }
    public void insertAllCategories() {
        setupInsertToCategories("NULL, 'Categories (Test)', '0', '', NULL");
        setupInsertToCategories("NULL, 'CategoriesSub1 (Test)', '1', '', NULL");
        setupInsertToCategories("NULL, 'CategoriesSub2(Test)', '1', '', NULL");
        setupInsertToCategories("NULL, 'CategoriesSub3 (Test)', '1', '', NULL");
        setupInsertToCategories("NULL, 'CategoriesSub4 (Test)', '1', '', NULL");
    }




    /* Setup Insert To Food ----------------------------------------------- */
    // To insert food to food table
    public void setupInsertToFood(String values){

        try {
            DBAdapter db = new DBAdapter(context);
            db.open();
            db.insert("food",
                    "_id, food_name, food_manufactor_name, food_serving_size_gram, food_serving_size_gram_mesurment, food_serving_size_pcs, food_serving_size_pcs_mesurment, food_energy, food_proteins, food_carbohydrates, food_fat, food_energy_calculated, food_proteins_calculated, food_carbohydrates_calculated, food_fat_calculated, food_user_id, food_category_id, food_notes",
                    values);
            db.close();
        }
        catch (SQLiteException e){
            // Toast.makeText(context, "Error; Could not insert food.", Toast.LENGTH_SHORT).show();
        }
    }


    // Insert all food into food database
    public void insertAllFood(){
        setupInsertToFood("NULL, 'MC Spicy', 'McDonalds', '100', 'gram', '1', 'serving', '335', '17', '45', '15', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Bigas na Malagkit', '', '100', 'grams', '1', 'serving', '210', '4.4', '47.9', '0.1', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Red Rice', '', '100', 'grams', '1', 'serving', '358', '7.5', '80.0', '0.9', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Brown Rice', '', '100', 'grams', '1', 'serving', '371', '10.0', '76.5', '2.8', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'White Rice', '', '100', 'grams', '1', 'serving', '356', '7.4', '80.4', '0.5', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Bicho Bicho', '', '100', 'grams', '1', 'serving', '276', '7.4', '55.2', '14.0', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Cocohoney Biscuit', '', '100', 'grams', '1', 'serving', '453', '7.0', '73.2', '14.7', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Spanish Bread', '', '100', 'grams', '1', 'serving', '371', '9.3', '55.5', '12.4', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Brown Bread', '', '100', 'grams', '1', 'serving', '313', '12.1', '64.1', '0.9', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Cheese Roll', '', '100', 'grams', '1', 'serving', '342', '10.1', '45.1', '13.5', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Cinnamon Roll', '', '100', 'grams', '1', 'serving', '387', '9.1', '58.1', '13.1', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Hotdog Roll', '', '100', 'grams', '1', 'serving', '320', '10.2', '61.3', '3.8', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Melba Toast', '', '100', 'grams', '1', 'serving', '412', '9.3', '77.1', '7.4', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Patatas', '', '100', 'grams', '1', 'serving', '78', '2.4', '16.8', '0.1', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Nilagang Patatas', '', '100', 'grams', '1', 'serving', '62', '1.7', '13.7', '0.1', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Kamote Murado', '', '100', 'grams', '1', 'serving', '125', '0.6', '29.8', '0.4', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Puting Kamote', '', '100', 'grams', '1', 'serving', '104', '0.7', '24.3', '0.5', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Dilaw na Kamote', '', '100', 'grams', '1', 'serving', '135', '1.1', '3.8', '0.4', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Gabi', '', '100', 'grams', '1', 'serving', '141', '2.3', '32.6', '0.2', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Ube', '', '100', 'grams', '1', 'serving', '97', '1.7', '22.2', '0.4', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'French Fries', '', '100', 'grams', '1', 'serving', '328', '3.7', '40.5', '16.8', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Bibingka', '', '100', 'grams', '1', 'serving', '181', '0.4', '44.1', '0.3', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Kamoteng Kahon na Suman', '', '100', 'grams', '1', 'serving', '210', '0.5', '48.9', '1.8', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Cheese Potato Chips', '', '100', 'grams', '1', 'serving', '556', '6.2', '51.8', '36.0', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Kasoy', '', '100', 'grams', '1', 'serving', '603', '19.2', '24.8', '47.8', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Garbansos', '', '100', 'grams', '1', 'serving', '377', '19.2', '61.2', '6.2', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Niyog', '', '100', 'grams', '1', 'serving', '319', '3.9', '17.2', '26.1', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Buko', '', '100', 'grams', '1', 'serving', '102', '1.4', '12.1', '5.3', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Makapuno', '', '100', 'grams', '1', 'serving', '226', '2.4', '14.5', '17.6', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Berde Munggo', '', '100', 'grams', '1', 'serving', '363', '24.4', '64.2', '1.0', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Pula Munggo', '', '100', 'grams', '1', 'serving', '150', '6.9', '28.9', '0.7', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Peanut with Shell', '', '100', 'grams', '1', 'serving', '401', '17.4', '22.9', '26.6', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Peanut without skin', '', '100', 'grams', '1', 'serving', '617', '25.8', '17.1', '49.5', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Pili Nut', '', '100', 'grams', '1', 'serving', '699', '14.2', '6.4', '68.5', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Sesame', '', '100', 'grams', '1', 'serving', '642', '25.1', '15.1', '53.5', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Peanut Butter', '', '100', 'grams', '1', 'serving', '616', '25.4', '26.4', '45.4', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Tofu', '', '100', 'grams', '1', 'serving', '89', '8.1', '2.0', '5.4', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Tokwa', '', '100', 'grams', '1', 'serving', '123', '12.9', '2.0', '7.0', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Ampalaya', '', '100', 'grams', '1', 'serving', '25', '0.9', '0.4', '4.5', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Upo', '', '100', 'grams', '1', 'serving', '18', '0.5', '3.8', '0.1', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Repolyo', '', '100', 'grams', '1', 'serving', '28', '1.4', '4.8', '0.3', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Cauliflower', '', '100', 'grams', '1', 'serving', '32', '2.1', '5.2', '0.3', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Baguio Celery', '', '100', 'grams', '1', 'serving', '25', '1.2', '5.1', '0', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Kinchay', '', '100', 'grams', '1', 'serving', '37', '2.4', '5.4', '0.6', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Sayote', '', '100', 'grams', '1', 'serving', '24', '0.4', '4.6', '0.1', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Pechay Baguio', '', '100', 'grams', '1', 'serving', '21', '1.7', '2.9', '0.3', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Niyog', '', '100', 'grams', '1', 'serving', '47', '4.3', '5.7', '8.0', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Pipino', '', '100', 'grams', '1', 'serving', '16', '0.6', '2.9', '0.2', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Talong', '', '100', 'grams', '1', 'serving', '29', '1.0', '8.8', '0.2', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Bawang', '', '100', 'grams', '1', 'serving', '129', '7.0', '24.6', '0.3', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Sibuyas', '', '100', 'grams', '1', 'serving', '52', '1.7', '10.5', '0.3', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Siling Labuyo', '', '100', 'grams', '1', 'serving', '75', '4.8', '9.0', '2.2', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Labanos', '', '100', 'grams', '1', 'serving', '24', '0.6', '5.2', '0.1', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Kamatis', '', '100', 'grams', '1', 'serving', '27', '0.9', '5.2', '0.3', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Pulang Mansanas', '', '100', 'grams', '1', 'serving', '67', '0.7', '15.8', '0.1', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Berdeng Mansanas', '', '100', 'grams', '1', 'serving', '62', '0.5', '14.9', '0.1', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Avocado', '', '100', 'grams', '1', 'serving', '100', '0.9', '7.0', '7.6', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Lakatan na Saging', '', '100', 'grams', '1', 'serving', '126', '1.4', '29.6', '0.2', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Kalamansi', '', '100', 'grams', '1', 'serving', '44', '0.4', '8.3', '1.0', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Ubas', '', '100', 'grams', '1', 'serving', '83', '0.4', '19.7', '0.3', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Bayabas', '', '100', 'grams', '1', 'serving', '70', '0.8', '16.0', '0.3', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Lansones', '', '100', 'grams', '1', 'serving', '64', '1.0', '14.2', '0.3', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Indian Mango', '', '100', 'grams', '1', 'serving', '53', '0.3', '12.5', '0.2', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Melon', '', '100', 'grams', '1', 'serving', '22', '0.3', '4.4', '0.4', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Pakwan', '', '100', 'grams', '1', 'serving', '31', '0.1', '7.2', '0.2', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Papaya', '', '100', 'grams', '1', 'serving', '53', '0.7', '12.0', '0.2', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Pinya', '', '100', 'grams', '1', 'serving', '55', '0.4', '13.0', '0.2', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Baka Tadyang', '', '100', 'grams', '1', 'serving', '203', '18.2', '0.0', '14.4', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Baka Dila', '', '100', 'grams', '1', 'serving', '214', '14.8', '4.4', '15.2', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Manok Pitso', '', '100', 'grams', '1', 'serving', '131', '21.6', '0.0', '5.0', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Manok Hita', '', '100', 'grams', '1', 'serving', '103', '19.6', '0.0', '2.7', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Manok Pakpak', '', '100', 'grams', '1', 'serving', '144', '24.4', '0.0', '5.2', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Baboy Liempo', '', '100', 'grams', '1', 'serving', '307', '17.3', '0.2', '26.3', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Baboy Pigi', '', '100', 'grams', '1', 'serving', '298', '16.3', '0.1', '25.8', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Baboy Atay', '', '100', 'grams', '1', 'serving', '119', '18.0', '5.5', '2.8', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Baboy Kasim', '', '100', 'grams', '1', 'serving', '387', '13.4', '0.0', '37.0', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Dilis', '', '100', 'grams', '1', 'serving', '77', '14.1', '1.9', '1.4', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Dalagang Bikid', '', '100', 'grams', '1', 'serving', '128', '21.5', '0.0', '4.7', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Hito', '', '100', 'grams', '1', 'serving', '80', '18.7', '0.0', '0.6', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Alimango Alige', '', '100', 'grams', '1', 'serving', '188', '26.0', '8.5', '5.6', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Talangka', '', '100', 'grams', '1', 'serving', '122', '13.8', '8.1', '3.8', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Lapu-Lapu', '', '100', 'grams', '1', 'serving', '63', '14.9', '0.0', '0.4', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Bangus', '', '100', 'grams', '1', 'serving', '136', '19.8', '0.0', '6.4', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Dalag', '', '100', 'grams', '1', 'serving', '99', '21.2', '0.0', '1.6', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Tahong', '', '100', 'grams', '1', 'serving', '166', '7.5', '11.1', '7.5', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Pugita', '', '100', 'grams', '1', 'serving', '29', '13.3', '0.6', '0.0', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Talaba', '', '100', 'grams', '1', 'serving', '119', '23.3', '3.3', '1.4', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Salmon', '', '100', 'grams', '1', 'serving', '85', '19.6', '0.0', '0.7', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Galungong', '', '100', 'grams', '1', 'serving', '100', '20.4', '0.0', '2.1', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Puting Hipon', '', '100', 'grams', '1', 'serving', '91', '19.0', '2.0', '0.8', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Pusit', '', '100', 'grams', '1', 'serving', '80', '17.4', '0.0', '12', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Puting Itlog ng Manok', '', '100', 'grams', '1', 'serving', '61', '12.7', '2.0', '0.2', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Kesong Puti', '', '100', 'grams', '1', 'serving', '299', '13.2', '5.3', '25.0', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Sorbetes', '', '100', 'grams', '1', 'serving', '157', '4.2', '13.7', '9.5', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Buttermilk', '', '100', 'grams', '1', 'serving', '43', '3.5', '6.2', '0.5', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Evaporadang Gatas', '', '100', 'grams', '1', 'serving', '148', '7.7', '11.7', '7.8', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Gatas ng Ina', '', '100', 'grams', '1', 'serving', '56', '1.0', '5.7', '3.2', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Yoghurt', '', '100', 'grams', '1', 'serving', '83', '5.3', '5.4', '4.5', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Mantekilya', '', '100', 'grams', '1', 'serving', '772', '0.5', '0.0', '85.5', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Margarine', '', '100', 'grams', '1', 'serving', '832', '0.0', '1.1', '91.9', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Polvoron', '', '100', 'grams', '1', 'serving', '469', '6.8', '73.6', '16.4', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Banana Catsup', '', '100', 'grams', '1', 'serving', '221', '0.7', '54.0', '0.2', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Tomato Catsup', '', '100', 'grams', '1', 'serving', '131', '1.6', '29.8', '0.6', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Patis', '', '100', 'grams', '1', 'serving', '49', '10.6', '0.9', '0.3', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Toyo', '', '100', 'grams', '1', 'serving', '75', '3.5', '15.0', '0.1', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Sukang Niyog', '', '100', 'grams', '1', 'serving', '7', '0', '1.4', '0.1', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Tuba', '', '100', 'grams', '1', 'serving', '35', '0.2', '7.9', '0.3', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, 'Rum', '', '100', 'grams', '1', 'serving', '1', '0', '0.2', '0.0', '', '', '', '', NULL, '2', NULL");
        setupInsertToFood("NULL, '3in1 Coffee', '', '17', 'grams', '1', 'sachet', '392', '3.6', '92.5', '0.8', '', '', '', '', NULL, '2', NULL");
    }
}