package com.newaphasiatalkhelper.AphasiaTalkHelperEng.models;

import android.content.Context;

import com.newaphasiatalkhelper.AphasiaTalkHelperEng.MainApplication;
import com.newaphasiatalkhelper.AphasiaTalkHelperEng.R;
import com.newaphasiatalkhelper.AphasiaTalkHelperEng.dao.ItemDao;

/**
 * Created by Tum on 11/19/2017 AD. datalayer
 */

public class WantListModel extends ListModel{

    private static WantListModel instance;

    public WantListModel(Context context) {
        super(context);
    }

    public static WantListModel getInstance(){
        if (instance==null){
            instance = new WantListModel(MainApplication.context);
        }
        return instance;
    }


    {
        data = new ItemDao[]{
                new ItemDao(1, "eat", R.mipmap.want_eat,1001),
                new ItemDao(2, "go", R.mipmap.want_go,1002),
                new ItemDao(3, "drink", R.mipmap.want_drink,1003),
                new ItemDao(4, "sleep", R.mipmap.want_sleep).speech("I want to sleep."),
                new ItemDao(5, "go to toilet", R.mipmap.want_toilet).speech("I want to go to toilet."),
                new ItemDao(6, "brush teeth", R.mipmap.want_teethbrush).speech("I want to brush my teeth."),
                new ItemDao(7, "shower", R.mipmap.want_shower).speech("I want to take a shower."),
                new ItemDao(8, "wash hair", R.mipmap.want_hairwash).speech("I want to wash my hair."),
                new ItemDao(9, "medicine", R.mipmap.want_medicine).speech("I want to take medicine."),
                new ItemDao(10, "sit", R.mipmap.want_sit).speech("I want to sit."),
                new ItemDao(11, "walk", R.mipmap.want_walk).speech("I want to walk."),
                new ItemDao(12, "talk", R.mipmap.want_talk).speech("I want to talk."),
                new ItemDao(13, "shopping", R.mipmap.want_shopping).speech("I want to shop."),
                new ItemDao(14, "watch TV", R.mipmap.want_watchtv).speech("I want to watch TV."),
                new ItemDao(15, "read a book", R.mipmap.want_read).speech("I want to read a book."),
                new ItemDao(16, "exercise", R.mipmap.want_exercise).speech("I want to exercise."),
                new ItemDao(17, "listen to music", R.mipmap.want_listenmusic).speech("I want to listen to music."),
                new ItemDao(18, "staff", R.mipmap.want_maitow).speech("I want a staff."),
                new ItemDao(19, "wheelchair", R.mipmap.want_wheelchair).speech("I want a wheelchair."),
                new ItemDao(20, "cut fingernails", R.mipmap.want_nailcut).speech("I want to cut nails."),
                new ItemDao(21, "comb", R.mipmap.want_comb).speech("I want to comb."),
                new ItemDao(22, null, null),
                new ItemDao(23, "powder", R.mipmap.want_powder).speech("I want to powder."),
                new ItemDao(24, null, null),
        };
        dataSub.put(1001,new ItemDao[]{
                new ItemDao(100101, "Main dish", R.mipmap.want_eat_main,1001001),
//                new ItemDao(100102, "ผัด", R.mipmap.want_eat_pud,1001002),
//                new ItemDao(100103, "แกงจืด"+"\n"+"และ แกงเผ็ด", R.mipmap.want_eat_kang,1001003),
//                new ItemDao(100104, "อบ และ นึ่ง", R.mipmap.want_eat_ob,1001004),
//                new ItemDao(100105, "ทอด, เผา"+"\n"+"และ ย่าง", R.mipmap.want_eat_tod_shellyang,1001005),
                new ItemDao(100102, "Dessert", R.mipmap.want_eat_sweet,1001006),
//                new ItemDao(100107, "ยำ, เครื่องจิ้ม"+"\n"+"และ สลัด", R.mipmap.want_eat_yum_yumsalmon,1001007),
                new ItemDao(100103, "Fruit", R.mipmap.want_eat_fruit,1001008),
                new ItemDao(100104, null, null),});

//Main dish
            dataSub.put(1001001,new ItemDao[]{
                    new ItemDao(100100101, "Beef steak", R.mipmap.want_eat_main_beefsteak).speech("I want to eat beef steak."),
                    new ItemDao(100100102, "Pizza", R.mipmap.want_eat_main_pizza).speech("I want to eat pizza."),
                    new ItemDao(100100103, "Pork steak", R.mipmap.want_eat_main_porksteak).speech("I want to eat pork steak."),
                    new ItemDao(100100104, "Frankfurter", R.mipmap.want_eat_main_germansausage).speech("I want to eat frankfurter."),
                    new ItemDao(100100105, "Meat burger", R.mipmap.want_eat_main_beefburger).speech("I want to eat meat burger."),
//                    new ItemDao(100100106, "บะหมี่หมูแดง", R.mipmap.want_eat_main_bameemoodang).speech("ฉันต้องการกินบะหมี่หมูแดง"),
                    new ItemDao(100100106, "Pork burger", R.mipmap.want_eat_main_porkburger).speech("I want to eat pork burger."),
//                    new ItemDao(100100108, "บะหมี่หมูกรอบ", R.mipmap.want_eat_main_bameemoookrob).speech("ฉันต้องการกินบะหมี่หมูกรอบ"),
                    new ItemDao(100100107, "Instant noodle", R.mipmap.want_eat_main_mama).speech("I want to eat instant noodle."),
//                    new ItemDao(100100110, "ราเมน", R.mipmap.want_eat_main_ramen).speech("ฉันต้องการกินราเมน"),
                    new ItemDao(100100108, "Pasta", R.mipmap.want_eat_main_pasta).speech("I want to eat pasta."),
//                    new ItemDao(100100112, "เฝอ", R.mipmap.want_eat_main_fer).speech("ฉันต้องการกินเฝอ"),
//                    new ItemDao(100100113, "แหนมเนือง", R.mipmap.want_eat_main_nhamnueng).speech("ฉันต้องการกินแหนมเนือง"),
//                    new ItemDao(100100114, "ลักซา", R.mipmap.want_eat_main_laksa).speech("ฉันต้องการกินลักซา"),
                    new ItemDao(100100109, "Kebab", R.mipmap.want_eat_main_kebab).speech("I want to eat kebab."),
//                    new ItemDao(100100116, "โกยซีหมี่", R.mipmap.want_eat_main_koaysemee).speech("ฉันต้องการกินโกยซีหมี่"),
//                    new ItemDao(100100117, "ขนมจีน", R.mipmap.want_eat_main_kanomjean).speech("ฉันต้องการกินขนมจีน"),
//                    new ItemDao(100100118, "ผัดไท", R.mipmap.want_eat_main_pudthai).speech("ฉันต้องการกินผัดไท"),
//                    new ItemDao(100100119, "ผัดหมี่", R.mipmap.want_eat_main_pudmhee).speech("ฉันต้องการกินผัดหมี่"),
//                    new ItemDao(100100120, "ผัดมาม่า", R.mipmap.want_eat_main_pudmama).speech("ฉันต้องการกินผัดมาม่า"),
//                    new ItemDao(100100121, "ผัดซีอิ๊ว", R.mipmap.want_eat_main_pudseaew).speech("ฉันต้องการกินผัดซีอิ๊ว"),
                    new ItemDao(100100110, "Noodle", R.mipmap.want_eat_main_noodle).speech("I want to eat noodle."),
//                    new ItemDao(100100123, "ก๋วยเตี๋ยวคั่วไก่", R.mipmap.want_eat_main_kuakai).speech("ฉันต้องการกินก๋วยเตี๋ยวคั่วไก่"),
//                    new ItemDao(100100124, "ก๋วยเตี๋ยวน้ำตก", R.mipmap.want_eat_main_numtok).speech("ฉันต้องการกินก๋วยเตี๋ยวน้ำตก"),
//                    new ItemDao(100100125, "ก๋วยเตี๋ยวไก่", R.mipmap.want_eat_main_chickennoodle).speech("ฉันต้องการกินก๋วยเตี๋ยวไก่"),
//                    new ItemDao(100100126, "ข้าวเหนียวหมูปิ้ง", R.mipmap.want_eat_main_kaoneawmooping).speech("ฉันต้องการกินข้าวเหนียวหมูปิ้ง"),
//                    new ItemDao(100100127, "ก๋วยเตี๋ยวต้มยำ", R.mipmap.want_eat_main_teawtomyum).speech("ฉันต้องการกินก๋วยเตี๋ยวต้มยำ"),
//                    new ItemDao(100100111, "ข้าวไข่ข้นกุ้ง", R.mipmap.want_eat_main_kaokaikonkung).speech("ฉันต้องการกินข้าวไข่ข้นกุ้ง"),
                    new ItemDao(100100111, "Omelet", R.mipmap.want_eat_main_kaokaijeaw).speech("I want to eat omelet."),
//                    new ItemDao(100100130, "ข้าวขาหมู", R.mipmap.want_eat_main_kaokhamhoo).speech("ฉันต้องการกินข้าวขาหมู"),
//                    new ItemDao(100100131, "ข้าวคลุกกะปิ", R.mipmap.want_eat_main_kaokookkapi).speech("ฉันต้องการกินข้าวคลุกกะปิ"),
                    new ItemDao(100100112, "Roast chicken", R.mipmap.want_eat_main_kaokaiyang).speech("I want to eat rice with roast chicken."),
//                    new ItemDao(100100133, "ข้าวมันไก่", R.mipmap.want_eat_main_kaomunkai).speech("ฉันต้องการกินข้าวมันไก่"),
                    new ItemDao(100100113, "Fried rice with pork", R.mipmap.want_eat_main_kaopadmhoo).speech("I want to eat Fried rice with pork."),
//                    new ItemDao(100100135, "ข้าวหน้าเป็ด", R.mipmap.want_eat_main_kaonhaped).speech("ฉันต้องการกินข้าวหน้าเป็ด"),
                    new ItemDao(100100114, "Fried rice with crab", R.mipmap.want_eat_main_kaopudpoo).speech("I want to eat fried rice with crab."),
                    new ItemDao(100100115, "Fried rice with shrimps", R.mipmap.want_eat_main_kaopudkung).speech("I want to eat fried rice with shrimps."),
//                    new ItemDao(100100138, "ข้าวผัดแกงเขียวหวาน", R.mipmap.want_eat_main_kaopudkangkeawwan).speech("ฉันต้องการกินข้าวผัดแกงเขียวหวาน"),
//                    new ItemDao(100100139, "ข้าวผัดสับปะรด", R.mipmap.want_eat_main_kaopudsubparod).speech("ฉันต้องการกินข้าวผัดสับปะรด"),
//                    new ItemDao(100100140, "ข้าวราดกะเพรา", R.mipmap.want_eat_main_kaoradkrapaokaidao).speech("ฉันต้องการกินข้าวราดกะเพรา"),
//                    new ItemDao(100100141, "ข้าวหมูทอดราดไข่", R.mipmap.want_eat_main_kaomootodradkai).speech("ฉันต้องการกินข้าวหมูทอดราดไข่"),
//                    new ItemDao(100100142, "ข้าวหน้าหมูซีอิ๊ว", R.mipmap.want_eat_main_kaonhamooseaew).speech("ฉันต้องการกินข้าวหน้าหมูซีอิ๊ว"),
                    new ItemDao(100100116, "Yellow curry with fried pork", R.mipmap.want_eat_main_kaonhakangkarimhutod).speech("I want to eat yellow curry with fried pork."),
//                    new ItemDao(100100144, "ข้าวหน้าปลาดิบรวม", R.mipmap.want_eat_main_kaonhapladib).speech("ฉันต้องการกินข้าวหน้าปลาดิบรวม"),
//                    new ItemDao(100100145, "ข้าวหน้าปลาไหล", R.mipmap.want_eat_main_kaonhaplalai).speech("ฉันต้องการกินข้าวหน้าปลาไหล"),
                    new ItemDao(100100117, "Porridge with fish", R.mipmap.want_eat_main_kaotompla).speech("I want to eat porridge with fish."),
//                    new ItemDao(100100119, "", R.mipmap.want_eat_main_kaonhasalmon).speech("ฉันต้องการกินข้าวหน้าปลาแซลมอน"),
                    new ItemDao(100100118, "Porridge with pork", R.mipmap.want_eat_main_kaotommoo).speech("I want to eat Porridge with pork."),
                    new ItemDao(100100119, "Congee", R.mipmap.want_eat_main_joke).speech("I want to eat congee."),
                    new ItemDao(100100120, "Sashimi", R.mipmap.want_eat_main_sashimi).speech("I want to eat sashimi."),
                    new ItemDao(100100121, "Sushi", R.mipmap.want_eat_main_sushi).speech("I want to eat sushi."),
                    new ItemDao(100100122, "Seafood", R.mipmap.want_eat_main_seafoodyen).speech("I want to eat seafood."),
                    new ItemDao(100100123, "Mushroom soup", R.mipmap.want_eat_kang_mushroomsoup).speech("I want to eat mushroom soup."),
                    new ItemDao(100100124, "Chicken soup", R.mipmap.want_eat_kang_soupkai).speech("I want to eat chicken soup."),
                    new ItemDao(100100125, "Baked Mussel", R.mipmap.want_eat_ob_hoymangpooob).speech("I want to eat baked mussel."),
//                    new ItemDao(100100412, "หอยแมลงภู่อบเนยกระเทียม", R.mipmap.want_eat_ob_hoymangpoogarlic).speech("ฉันต้องการกินหอยแมลงภู่อบเนยกระเทียม"),
                    new ItemDao(100100126, "Spinach with cheese", R.mipmap.want_eat_ob_spinach).speech("I want to eat spinach with cheese."),

                    new ItemDao(100100127, "Fried egg", R.mipmap.want_eat_tod_kaidao).speech("I want to eat fried egg."),
                    new ItemDao(100100128, "Fried chicken", R.mipmap.want_eat_tod_kaitod).speech("I want to eat fried chicken."),
                    new ItemDao(100100129, "Fried fish", R.mipmap.want_eat_tod_platod).speech("I want to eat fried fish."),
                    new ItemDao(100100130, "Chicken nuggets", R.mipmap.want_eat_tod_nugget).speech("I want to eat chicken nuggets."),
                    new ItemDao(100100131, "Grilled Chicken", R.mipmap.want_eat_tod_kaiyang).speech("I want to eat grilled chicken."),
                    new ItemDao(100100132, "Fried bacon", R.mipmap.want_eat_tod_bacontod).speech("I want to eat fried bacon."),
                    new ItemDao(100100133, "Grilled shrimp", R.mipmap.want_eat_tod_koongpao).speech("I want to eat grilled shrimp."),
                    new ItemDao(100100134, "Scallops with butter", R.mipmap.want_eat_tod_shellyang).speech("I want to eat scallops with butter."),
//                    new ItemDao(100100703, "ยำปลาแซลมอน", R.mipmap.want_eat_yum_yumsalmon).speech("ฉันต้องการกินยำปลาแซลมอน"),
                    new ItemDao(100100135, "Salad", R.mipmap.want_eat_yum_saladpuk).speech("I want to eat salad."),
                    new ItemDao(100100136, "Salad with Chicken breast", R.mipmap.want_eat_yum_saladchick).speech("I want to eat salad with Chicken breast."),
                    new ItemDao(100100137, "Salad with Fried fish", R.mipmap.want_eat_yum_saladplatod).speech("I want to eat salad with Fried fish."),
                    new ItemDao(100100138, null, null),
                    new ItemDao(100100139, null, null),
                    new ItemDao(100100140, null, null),});
//Main dish ขอบล่าง

//            dataSub.put(1001002,new ItemDao[]{
//
//                    new ItemDao(100100201, "ผัดวุ้นเส้น", R.mipmap.want_eat_pud_pudwoonsen).speech("ฉันต้องการกินผัดวุ้นเส้น"),
//                    new ItemDao(100100202, "ผัดถั่วหมู", R.mipmap.want_eat_pud_pudtuamoo).speech("ฉันต้องการกินผัดถั่วหมู"),
//                    new ItemDao(100100203, "หมูผัดน้ำมันหอย", R.mipmap.want_eat_pud_moopudnummunhoi).speech("ฉันต้องการกินหมูผัดน้ำมันหอย"),
//                    new ItemDao(100100204, "หมูผัดขิง", R.mipmap.want_eat_pud_moopudking).speech("ฉันต้องการกินหมูผัดขิง"),
//                    new ItemDao(100100205, "ไก่ผัดขิง", R.mipmap.want_eat_pud_kaipudking).speech("ฉันต้องการกินไก่ผัดขิง"),
//                    new ItemDao(100100206, "ไก่ผัดหน่อไม้", R.mipmap.want_eat_pud_kaipudnormai).speech("ฉันต้องการกินไก่ผัดหน่อไม้"),
//                    new ItemDao(100100207, "เต้าหู้ผัดซอสพริก", R.mipmap.want_eat_pud_tofusoayprik).speech("ฉันต้องการกินเต้าหู้ผัดซอสพริก"),
//                    new ItemDao(100100208, "ผัดกะเพราหมูสับ", R.mipmap.want_eat_pud_krapaomoosub).speech("ฉันต้องการกินผัดกะเพราหมูสับ"),
//                    new ItemDao(100100209, "หอยเชลล์ผัดซอสพริก", R.mipmap.want_eat_pud_shellradprik).speech("ฉันต้องการกินหอยเชลล์ผัดซอสพริก"),
//                    new ItemDao(100100210, "หอยเชลล์ผัดพริกไทยดำ", R.mipmap.want_eat_pud_shellkratiam).speech("ฉันต้องการกินหอยเชลล์ผัดพริกไทยดำ"),
//                    new ItemDao(100100211, "ผัดผัก", R.mipmap.want_eat_pud_pudpak).speech("ฉันต้องการกินผัดผัก"),
//                    new ItemDao(100100212, "ผัดผักคะน้า", R.mipmap.want_eat_pud_pudkana).speech("ฉันต้องการกินผัดผักคะน้า"),
//                    new ItemDao(100100213, "ผัดผักบุ้ง", R.mipmap.want_eat_pud_padpukbung).speech("ฉันต้องการกินผัดผักบุ้ง"),
//                    new ItemDao(100100214, "ผัดผักกะหล่ำปลี", R.mipmap.want_eat_pud_pudpakkarumpee).speech("ฉันต้องการกินผัดผักกะหล่ำปลี"),
//                    new ItemDao(100100215, "ปลาราดพริก", R.mipmap.want_eat_pud_plaradprik).speech("ฉันต้องการกินปลาราดพริก"),
//                    new ItemDao(100100216, "ปลาดุกฟูผัดพริกขิง", R.mipmap.want_eat_pud_pladukfoo).speech("ฉันต้องการกินปลาดุกฟูผัดพริกขิง"),
//                    new ItemDao(100100217, "ทะเลผัดผงกะหรี่", R.mipmap.want_eat_pud_pudpongkari).speech("ฉันต้องการกินทะเลผัดผงกะหรี่"),
//                    new ItemDao(100100218, null, null),
//                    new ItemDao(100100219, "ทะเลผัดฉ่า", R.mipmap.want_eat_pud_pudcha).speech("ฉันต้องการกินทะเลผัดฉ่า"),
//                    new ItemDao(100100220, null, null),});

//            dataSub.put(1001003,new ItemDao[]{

//                    new ItemDao(100100301, "ซุปเห็ด", R.mipmap.want_eat_kang_mushroomsoup).speech("ฉันต้องการกินซุปเห็ด"),
//                    new ItemDao(100100302, "แกงมะระ", R.mipmap.want_eat_kang_kangmara).speech("ฉันต้องการกินแกงมะระ"),
//                    new ItemDao(100100303, "ซุปไก่", R.mipmap.want_eat_kang_soupkai).speech("ฉันต้องการกินซุปไก่"),
//                    new ItemDao(100100304, "แกงจืดเต้าหู้", R.mipmap.want_eat_kang_kangjerdtaohoo).speech("ฉันต้องการกินแกงจืดเต้าหู้"),
//                    new ItemDao(100100305, "ต้มจับฉ่าย", R.mipmap.want_eat_kang_jubchai).speech("ฉันต้องการกินต้มจับฉ่าย"),
//                    new ItemDao(100100306, "แกงเขียวหวาน", R.mipmap.want_eat_kang_kangkaewwann).speech("ฉันต้องการกินแกงเขียวหวาน"),
//                    new ItemDao(100100307, "ต้มยำกุ้ง", R.mipmap.want_eat_kang_tomyumkung).speech("ฉันต้องการกินต้มยำกุ้ง"),
//                    new ItemDao(100100308, "ต้มแซ่บ", R.mipmap.want_eat_kang_tomzab).speech("ฉันต้องการกินต้มแซ่บ"),
//                    new ItemDao(100100309, "ต้มโป๊ะแตก", R.mipmap.want_eat_kang_potak).speech("ฉันต้องการกินต้มโป๊ะแตก"),
//                    new ItemDao(100100310, "แกงส้มชะอม", R.mipmap.want_eat_kang_kangsonchaom).speech("ฉันต้องการกินแกงส้มชะอม"),
//                    new ItemDao(100100311, "มัสมั่น", R.mipmap.want_eat_kang_masaman).speech("ฉันต้องการกินมัสมั่น"),
//                    new ItemDao(100100312, "พะแนงหมู", R.mipmap.want_eat_kang_panangmhoo).speech("ฉันต้องการกินพะแนงหมู"),
//                    new ItemDao(100100313, "ไข่พะโล้", R.mipmap.want_eat_kang_khaipalo).speech("ฉันต้องการกินไข่พะโล้"),
//                    new ItemDao(100100314, null, null),
//                    new ItemDao(100100315, "เกาเหลาเลือดหมู", R.mipmap.want_eat_kang_kaolaolerdmoo).speech("ฉันต้องการกินเกาเหลาเลือดหมู"),
//                    new ItemDao(100100316, null, null),});


//            dataSub.put(1001004,new ItemDao[]{

//                    new ItemDao(100100401, "ขนมจีบ", R.mipmap.want_eat_ob_kanomjeeb).speech("ฉันต้องการกินขนมจีบ"),
//                    new ItemDao(100100402, "ซาลาเปา", R.mipmap.want_eat_ob_salapao).speech("ฉันต้องการกินซาลาเปา"),
//                    new ItemDao(100100403, "ฮะเก๋า", R.mipmap.want_eat_ob_hakao).speech("ฉันต้องการกินฮะเก๋า"),
//                    new ItemDao(100100404, "ก๋วยเตี๋ยวหลอด", R.mipmap.want_eat_ob_kuayteawlord).speech("ฉันต้องการกินก๋วยเตี๋ยวหลอด"),
//                    new ItemDao(100100405, "กุ๋ยช่าย", R.mipmap.want_eat_ob_kuichai).speech("ฉันต้องการกินกุ๋ยช่าย"),
//                    new ItemDao(100100406, "ปูนึ่ง", R.mipmap.want_eat_ob_poonueng).speech("ฉันต้องการกินปูนึ่ง"),
//                    new ItemDao(100100407, "ไก่ตอน", R.mipmap.want_eat_ob_kaitorn).speech("ฉันต้องการกินไก่ตอน"),
//                    new ItemDao(100100408, "หอยแมลงภู่อบ", R.mipmap.want_eat_ob_hoymangpooob).speech("ฉันต้องการกินหอยแมลงภู่อบ"),
//                    new ItemDao(100100409, "ปลานึ่งซีอิ๊ว", R.mipmap.want_eat_ob_planuengseeaew).speech("ฉันต้องการกินปลานึ่งซีอิ๊ว"),
//                    new ItemDao(100100410, "ไก่แช่เหล้า", R.mipmap.want_eat_ob_kaichalao).speech("ฉันต้องการกินไก่แช่เหล้า"),
//                    new ItemDao(100100411, "ห่อหมกมะพร้าวอ่อน", R.mipmap.want_eat_ob_hormok).speech("ฉันต้องการกินห่อหมกมะพร้าวอ่อน"),
//                    new ItemDao(100100412, "หอยแมลงภู่อบเนยกระเทียม", R.mipmap.want_eat_ob_hoymangpoogarlic).speech("ฉันต้องการกินหอยแมลงภู่อบเนยกระเทียม"),
//                    new ItemDao(100100413, "ผักโขมกับชีส", R.mipmap.want_eat_ob_spinach).speech("ฉันต้องการกินผักโขมกับชีส"),
//                    new ItemDao(100100414, null, null),
//                    new ItemDao(100100415, null, null),
//                    new ItemDao(100100416, null, null),});

//        dataSub.put(1001005,new ItemDao[]{

//                new ItemDao(100100501, "ไข่เจียว", R.mipmap.want_eat_tod_kaijaew).speech("ฉันต้องการกินไข่เจียว"),
//                new ItemDao(100100502, "ไข่นกกระทาทอด", R.mipmap.want_eat_tod_kainoktod).speech("ฉันต้องการกินไข่นกกระทาทอด"),
//                new ItemDao(100100503, "ไข่ดาว", R.mipmap.want_eat_tod_kaidao).speech("ฉันต้องการกินไข่ดาว"),
//                new ItemDao(100100504, "เกี๊ยวทอด", R.mipmap.want_eat_tod_kaewtod).speech("ฉันต้องการกินเกี๊ยวทอด"),
//                new ItemDao(100100505, "เกี๊ยวซ่า", R.mipmap.want_eat_tod_kaewzaa).speech("ฉันต้องการกินเกี๊ยวซ่า"),
//                new ItemDao(100100506, "ทอดมัน", R.mipmap.want_eat_tod_todmun).speech("ฉันต้องการกินทอดมัน"),
//                new ItemDao(100100507, "หอยจ๊อ", R.mipmap.want_eat_tod_hoijor).speech("ฉันต้องการกินหอยจ๊อ"),
//                new ItemDao(100100508, "ไก่ทอด", R.mipmap.want_eat_tod_kaitod).speech("ฉันต้องการกินไก่ทอด"),
//                new ItemDao(100100509, "ปลาทอด", R.mipmap.want_eat_tod_platod).speech("ฉันต้องการกินปลาทอด"),
//                new ItemDao(100100510, "ปลาหมึกชุบแป้งทอด", R.mipmap.want_eat_tod_muektod).speech("ฉันต้องการกินปลาหมึกชุบแป้งทอด"),
//                new ItemDao(100100511, "ไก่นักเก็ต", R.mipmap.want_eat_tod_nugget).speech("ฉันต้องการกินไก่นักเก็ต"),
//                new ItemDao(100100512, "ไก่ย่าง", R.mipmap.want_eat_tod_kaiyang).speech("ฉันต้องการกินไก่ย่าง"),
//                new ItemDao(100100513, "คอหมูย่าง", R.mipmap.want_eat_tod_kormooyang).speech("ฉันต้องการกินคอหมูย่าง"),
//                new ItemDao(100100514, "เบคอนทอด", R.mipmap.want_eat_tod_bacontod).speech("ฉันต้องการกินเบคอนทอด"),
//                new ItemDao(100100515, "เสือร้องไห้", R.mipmap.want_eat_tod_tigercry).speech("ฉันต้องการกินเสือร้องไห้"),
//                new ItemDao(100100516, "กุ้งเผา", R.mipmap.want_eat_tod_koongpao).speech("ฉันต้องการกินกุ้งเผา"),
//                new ItemDao(100100517, "หอยเชลล์ย่างเนย", R.mipmap.want_eat_tod_shellyang).speech("ฉันต้องการกินหอยเชลล์ย่างเนย"),
//                new ItemDao(100100518, null, null),
//                new ItemDao(100100519, null, null),
//                new ItemDao(100100520, null, null),});


            dataSub.put(1001006,new ItemDao[]{
                    new ItemDao(100100601, "Beef pie", R.mipmap.want_eat_sweet_beefpie).speech("I want to eat beef pie."),
                    new ItemDao(100100602, "Bingsu", R.mipmap.want_eat_sweet_bingsu).speech("I want to eat bingsu."),
                    new ItemDao(100100603, "Blueberry cheese tart", R.mipmap.want_eat_sweet_blueberrycheesetart).speech("I want to eat blueberry cheese tart."),
                    new ItemDao(100100604, "Chicken pie", R.mipmap.want_eat_sweet_chickenpie).speech("I want to eat chicken pie."),
                    new ItemDao(100100605, "Chocolate Lava", R.mipmap.want_eat_sweet_chickenpie).speech("I want to eat chocolate Lava."),
                    new ItemDao(100100606, "Croissant", R.mipmap.want_eat_sweet_croissant).speech("I want to eat croissant."),
                    new ItemDao(100100607, "Crepe", R.mipmap.want_eat_sweet_crepe).speech("I want to eat crepe."),
                    new ItemDao(100100608, "Cookie", R.mipmap.want_eat_sweet_cookie).speech("I want to eat cookie."),
                    new ItemDao(100100609, "Chocolate", R.mipmap.want_eat_sweet_chocolate).speech("I want to eat chocolate."),
                    new ItemDao(100100610, "French fries", R.mipmap.want_eat_sweet_frenchfries).speech("I want to eat french fries."),
                    new ItemDao(100100611, "Hot dog", R.mipmap.want_eat_sweet_hotdog).speech("I want to eat hot dog."),
                    new ItemDao(100100612, "Ice cream", R.mipmap.want_eat_sweet_icecream).speech("I want to eat ice cream."),
                    new ItemDao(100100613, "Popcorn", R.mipmap.want_eat_sweet_popcorn).speech("I want to eat popcorn."),
                    new ItemDao(100100614, "Roti", R.mipmap.want_eat_sweet_roti).speech("I want to eat roti."),
                    new ItemDao(100100615, "Scone", R.mipmap.want_eat_sweet_scone).speech("I want to eat scone."),
                    new ItemDao(100100616, "Strawberry tart", R.mipmap.want_eat_sweet_strawberrytart).speech("I want to eat strawberry tart."),
                    new ItemDao(100100617, "Waffle", R.mipmap.want_eat_sweet_waffle).speech("I want to eat waffle."),
                    new ItemDao(100100618, null, null),
                    new ItemDao(100100619, null, null),
                    new ItemDao(100100620, null, null),});

//        dataSub.put(1001007,new ItemDao[]{

//                new ItemDao(100100701, "กุ้งแช่น้ำปลา", R.mipmap.want_eat_yum_koongnumpla).speech("ฉันต้องการกินกุ้งแช่น้ำปลา"),
//                new ItemDao(100100702, "หมูมะนาว", R.mipmap.want_eat_yum_moomanow).speech("ฉันต้องการกินหมูมะนาว"),
//                new ItemDao(100100703, "ยำปลาแซลมอน", R.mipmap.want_eat_yum_yumsalmon).speech("ฉันต้องการกินยำปลาแซลมอน"),
//                new ItemDao(100100704, "ปลาลวกจิ้ม", R.mipmap.want_eat_yum_plaluak).speech("ฉันต้องการกินปลาลวกจิ้ม"),
//                new ItemDao(100100705, "ยำวุ้นเส้น", R.mipmap.want_eat_yum_yumwoonsen).speech("ฉันต้องการกินยำวุ้นเส้น"),
//                new ItemDao(100100706, "ลาบหมู", R.mipmap.want_eat_yum_larbmoo).speech("ฉันต้องการกินลาบหมู"),
//                new ItemDao(100100707, "ยำมะระกุ้งสด", R.mipmap.want_eat_yum_yummarakoong).speech("ฉันต้องการกินยำมะระกุ้งสด"),
//                new ItemDao(100100708, "น้ำตกหมู", R.mipmap.want_eat_yum_numtokmoo).speech("ฉันต้องการกินน้ำตกหมู"),
//                new ItemDao(100100709, "ตับหวาน", R.mipmap.want_eat_yum_tubwarn).speech("ฉันต้องการกินตับหวาน"),
//                new ItemDao(100100710, "ส้มตำปลาร้า", R.mipmap.want_eat_yum_tumplara).speech("ฉันต้องการกินส้มตำปลาร้า"),
//                new ItemDao(100100711, "ตำไทย", R.mipmap.want_eat_yum_tumthai).speech("ฉันต้องการกินตำไทย"),
//                new ItemDao(100100712, "ตำข้าวโพด", R.mipmap.want_eat_yum_tumkaopod).speech("ฉันต้องการกินตำข้าวโพด"),
//                new ItemDao(100100713, "น้ำพริกปลาทู", R.mipmap.want_eat_yum_namprikplatoo).speech("ฉันต้องการกินน้ำพริกปลาทู"),
//                new ItemDao(100100714, "น้ำพริกกะปิ", R.mipmap.want_eat_yum_namprikkapi).speech("ฉันต้องการกินน้ำพริกกะปิ"),
//                new ItemDao(100100715, "น้ำพริกไข่ปู", R.mipmap.want_eat_yum_numpikkaipoo).speech("ฉันต้องการกินน้ำพริกไข่ปู"),
//                new ItemDao(100100716, "สลัดผัก", R.mipmap.want_eat_yum_saladpuk).speech("ฉันต้องการกินสลัดผัก"),
//                new ItemDao(100100717, "สลัดอกไก่", R.mipmap.want_eat_yum_saladchick).speech("ฉันต้องการกินสลัดอกไก่"),
//                new ItemDao(100100718, null, null),
//                new ItemDao(100100719, "สลัดปลาทอด", R.mipmap.want_eat_yum_saladplatod).speech("ฉันต้องการกินสลัดปลาทอด"),
//                new ItemDao(100100720, null, null),});


            dataSub.put(1001008,new ItemDao[]{
                    new ItemDao(100100801, "Apple", R.mipmap.want_eat_fruit_apple).speech("I want to eat an apple."),
                    new ItemDao(100100802, "Cantaloupe", R.mipmap.want_eat_fruit_cantaloop).speech("I want to eat a cantaloupe."),
                    new ItemDao(100100803, "Rose apple", R.mipmap.want_eat_fruit_chompoo).speech("I want to eat a rose apple."),
                    new ItemDao(100100804, "Dragon fruit", R.mipmap.want_eat_fruit_dragonfruit).speech("I want to eat a dragon fruit."),
                    new ItemDao(100100805, "Durian", R.mipmap.want_eat_fruit_durian).speech("I want to eat durian."),
                    new ItemDao(100100806, "Guava", R.mipmap.want_eat_fruit_farang).speech("I want to eat guava."),
                    new ItemDao(100100807, "Pumpkin", R.mipmap.want_eat_fruit_fucktong).speech("I want to eat pumpkin."),
                    new ItemDao(100100808, "Grape", R.mipmap.want_eat_fruit_grape).speech("I want to eat a grape."),
                    new ItemDao(100100809, "Jackfruit\n", R.mipmap.want_eat_fruit_kanun).speech("I want to eat jackfruit."),
                    new ItemDao(100100810, "Banana", R.mipmap.want_eat_fruit_kuy).speech("I want to eat a banana."),
                    new ItemDao(100100811, "Logan", R.mipmap.want_eat_fruit_lamyai).speech("I want to eat logan."),
                    new ItemDao(100100812, "Lychee", R.mipmap.want_eat_fruit_linji).speech("I want to eat lychee."),
                    new ItemDao(100100813, "Long Kong", R.mipmap.want_eat_fruit_longgong).speech("I want to eat Long Kong."),
                    new ItemDao(100100814, "Papaya", R.mipmap.want_eat_fruit_malako).speech("I want to eat papaya."),
                    new ItemDao(100100815, "Mango", R.mipmap.want_eat_fruit_mango).speech("I want to eat a mango."),
                    new ItemDao(100100816, "Mangosteen", R.mipmap.want_eat_fruit_mungkud).speech("I want to eat mangosteen."),
                    new ItemDao(100100817, "Rambutan", R.mipmap.want_eat_fruit_ngo).speech("I want to eat a rambutan."),
                    new ItemDao(100100818, "Custard apple", R.mipmap.want_eat_fruit_nhoina).speech("I want to eat a custard apple."),
                    new ItemDao(100100819, "Pineapple", R.mipmap.want_eat_fruit_pineapple).speech("I want to eat pineapple."),
                    new ItemDao(100100820, "Orange", R.mipmap.want_eat_fruit_som).speech("I want to eat an orange."),
                    new ItemDao(100100821, "Strawberry", R.mipmap.want_eat_fruit_strawberry).speech("I want to eat strawberry."),
                    new ItemDao(100100822, "Tamarind", R.mipmap.want_eat_fruit_tamarind).speech("I want to eat tamarind."),
                    new ItemDao(100100823, "Watermelon", R.mipmap.want_eat_fruit_tangmo).speech("I want to eat watermelon."),
                    new ItemDao(100100824, "Taro", R.mipmap.want_eat_fruit_taro).speech("I want to eat Taro."),});


        dataSub.put(1003,new ItemDao[]{
                new ItemDao(100301, "Hot drink", R.mipmap.want_drink_hot,1003001),
                new ItemDao(100302, "Frappe drink", R.mipmap.want_drink_frappe,1003002),
                new ItemDao(100303, "Cold drink", R.mipmap.want_drink_cold,1003003),
                new ItemDao(100304, null, null),});

            dataSub.put(1003001,new ItemDao[]{
                    new ItemDao(100300101, "Warm water", R.mipmap.want_drink_hot_namplao).speech("I want to drink warm water."),
                    new ItemDao(100300102, "Hot coffee", R.mipmap.want_drink_hot_kafaeron).speech("I want to drink hot coffee."),
                    new ItemDao(100300103, "Chrysanthemum water", R.mipmap.want_drink_hot_kekhuy).speech("I want to drink chrysanthemum water."),
                    new ItemDao(100300104, "Hot lemon juice", R.mipmap.want_drink_hot_manowron).speech("I want to drink hot lemon juice."),
                    new ItemDao(100300105, "Hot pandan juice", R.mipmap.want_drink_hot_nambaitoey).speech("I want to drink hot pandan juice."),
                    new ItemDao(100300106, "Hot tea", R.mipmap.want_drink_hot_namcha).speech("I want to drink hot tea."),
                    new ItemDao(100300107, "Hot Green tea", R.mipmap.want_drink_hot_chakeawron).speech("I want to drink hot green tea."),
                    new ItemDao(100300108, "Tofu", R.mipmap.want_drink_hot_namtaohuu).speech("I want to drink tofu.")});



            dataSub.put(1003002,new ItemDao[]{
                    new ItemDao(100300201, "Apple smoothie", R.mipmap.want_drink_frappe_applefrappe).speech("I want to drink apple smoothie."),
                    new ItemDao(100300202, "Banana smoothie", R.mipmap.want_drink_frappe_bananfrappe).speech("I want to drink banana smoothie."),
                    new ItemDao(100300203, "Green tea frappe", R.mipmap.want_drink_frappe_chakeawpun).speech("I want to drink green tea frappe."),
                    new ItemDao(100300204, "Coco frappe", R.mipmap.want_drink_frappe_cocoafrappe).speech("I want to drink coco frappe."),
                    new ItemDao(100300205, "Coffee frappe", R.mipmap.want_drink_frappe_coffeefrappe).speech("I want to drink coffee frappe."),
                    new ItemDao(100300206, "Milk shake", R.mipmap.want_drink_frappe_milkshake).speech("I want to drink milk shake."),
                    new ItemDao(100300207, "Mixed fruit smoothie", R.mipmap.want_drink_frappe_mixfruitfrappe).speech("I want to drink mixed fruit smoothie."),
                    new ItemDao(100300208, "Pineapple smoothie", R.mipmap.want_drink_frappe_pineapplefrappe).speech("I want to drink pineapple smoothie."),
                    new ItemDao(100300209, "Strawberry smoothie", R.mipmap.want_drink_frappe_strawberrypun).speech("I want to drink strawberry smoothie."),
                    new ItemDao(100300210, "Watermelon smoothie", R.mipmap.want_drink_frappe_tangmopun).speech("I want to drink watermelon smoothie."),
                    new ItemDao(100300211, "Milk tea smoothie", R.mipmap.want_drink_frappe_thaiteafrappe).speech("I want to drink milk tea smoothie."),
                    new ItemDao(100300212, "Mixed veggie smoothie", R.mipmap.want_drink_frappe_vegetablefrappe).speech("I want to drink mixed veggie smoothie.")});

            dataSub.put(1003003,new ItemDao[]{
                    new ItemDao(100300301, "Cold water", R.mipmap.want_drink_cold_namplao).speech("I want to drink cold water."),
                    new ItemDao(100300302, "Iced green tea", R.mipmap.want_drink_cold_chakeawyen).speech("I want to drink iced green tea."),
                    new ItemDao(100300303, "Sparkling water", R.mipmap.want_drink_cold_coke).speech("I want to drink sparkling water."),
                    new ItemDao(100300304, "Iced coffee", R.mipmap.want_drink_cold_kafaeyen).speech("I want to drink iced coffee."),
                    new ItemDao(100300305, "Cold chrysanthemum", R.mipmap.want_drink_cold_kekhuy).speech("I want to drink cold chrysanthemum."),
                    new ItemDao(100300306, "Asiatic water", R.mipmap.want_drink_cold_nambaibuabok).speech("I want to drink an asiatic water."),
                    new ItemDao(100300307, "Roselle juice", R.mipmap.want_drink_cold_namkrajeab).speech("I want to drink roselle juice."),
                    new ItemDao(100300308, "Cool lemonade", R.mipmap.want_drink_cold_nammanow).speech("I want to drink cool lemonade."),
                    new ItemDao(100300309, "Coconut juice", R.mipmap.want_drink_cold_nammaprao).speech("I want to drink coconut juice."),
                    new ItemDao(100300310, "Lemon honey", R.mipmap.want_drink_cold_nampungmanow).speech("I want to drink lemon honey."),
                    new ItemDao(100300311, "Orange juice", R.mipmap.want_drink_cold_namsom).speech("I want to drink orange juice."),
                    new ItemDao(100300312, "Iced pink milk", R.mipmap.want_drink_cold_nomyen).speech("I want to drink iced pink milk."),
                    new ItemDao(100300313, "Thai Traditional Iced Black Coffee", R.mipmap.want_drink_cold_oleang).speech("I want to drink Thai Traditional Iced Black Coffee."),
                    new ItemDao(100300314, null, null),
                    new ItemDao(100300315, "Thai Traditional Iced Milk Tea", R.mipmap.want_drink_cold_chayen).speech("I want to drink Thai Traditional Iced Milk Tea."),
                    new ItemDao(100300316, null, null),});

        dataSub.put(1002,new ItemDao[]{
                new ItemDao(100201, "hospital", R.mipmap.want_go_hospital).speech("I want to go to hospital."),
                new ItemDao(100202, "mall", R.mipmap.want_go_mall).speech("I want to go to the mall."),
                new ItemDao(100203, "market", R.mipmap.want_go_market).speech("I want to go to the market."),
                new ItemDao(100204, "park", R.mipmap.want_go_park).speech("I want to go to the park."),
                new ItemDao(100205, "mini mart", R.mipmap.want_go_seven).speech("I want to go to mini mart."),
                new ItemDao(100206, null, null),
                new ItemDao(100207, "church", R.mipmap.want_go_temple).speech("I want to go to church."),
                new ItemDao(100208, null, null),});
    }


}
