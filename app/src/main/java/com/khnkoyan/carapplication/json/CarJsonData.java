package com.khnkoyan.carapplication.json;

import org.json.JSONArray;

import java.util.*;

public class CarJsonData {
    public static String getJsonArray() {
        List<Object> objectList = new ArrayList<>();// jsonArray above
        Map<String, Object> carMap = new HashMap<>();
        List<Object> makeList = new ArrayList<>();
        Map<String, Object> makeMap = new HashMap<>();
        List<Object> imageList = new ArrayList<>();
        imageList.add("http://www.newoldcar.co.uk/images/Featured_Cars/Icons/526%202000%20mercedes%20e240%20elegance%20auto%20black%20icon.jpg");
        imageList.add("http://www.cars-directory.net/pics/mercedes/e240/1996/mercedes_e240_2487402.jpg");
        imageList.add("https://www.japan-partner.com/images/54d92bb8dd/--f2a82493c5_t.jpg");
        makeMap.put("տեսակ", "Mercedes-Benz");
        makeMap.put("տարի", 2006);
        makeMap.put("ղեկ", "Աջ");
        makeMap.put("մոդել", "E240");
        makeMap.put("փոխանցման տուփը", "Ավտոմատ");
        makeMap.put("գինը", "$5650");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);
        //////////////////////////////////
        makeMap = new HashMap<>();
        imageList = new ArrayList<>();
        imageList.add("https://s.aolcdn.com/dims-global/dims3/GLOB/legacy_thumbnail/788x525/quality/85/https://s.aolcdn.com/commerce/autodata/images/CAB80MBC682A0101.jpg");
        imageList.add("https://s.aolcdn.com/dims-global/dims3/GLOB/legacy_thumbnail/788x525/quality/85/https://s.aolcdn.com/commerce/autodata/images/CAB60MBC511A0101.jpg");
        imageList.add("https://s.aolcdn.com/dims-global/dims3/GLOB/thumbnail/700x525/quality/85/https://s.aolcdn.com/commerce/autodata/images/CAB80MBC682A0101.jpg");
        imageList.add("https://s.aolcdn.com/dims-global/dims3/GLOB/legacy_thumbnail/788x525/quality/85/https://s.aolcdn.com/commerce/autodata/images/CAB80MBC682A0102.jpg");
        makeMap.put("տեսակ", "Mercedes-Benz");
        makeMap.put("տարի", 2009);
        makeMap.put("ղեկ", "Ձախ");
        makeMap.put("մոդել", "E350");
        makeMap.put("փոխանցման տուփը", "Մեխանիկական");
        makeMap.put("գինը", "$7200");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);
        ////////////////////////////////////
        makeMap = new HashMap<>();
        imageList = new ArrayList<>();
        imageList.add("https://img.tradingpost.com.au/XV9QNBHG/8L3CWG/3S87-Boxed640x480.jpg");
        imageList.add("https://img.tradingpost.com.au/XV9QNBHG/8L3CWG/3VLQ-Boxed640x480.jpg");
        makeMap.put("տեսակ", "Mercedes-Benz");
        makeMap.put("տարի", 1996);
        makeMap.put("ղեկ", "Ձախ");
        makeMap.put("մոդել", "W210");
        makeMap.put("փոխանցման տուփը", "Ավտոմատ");
        makeMap.put("գինը", "$3250");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);
        ////////////////////////////
        makeMap = new HashMap<>();
        imageList = new ArrayList<>();
        imageList.add("https://i.pinimg.com/originals/58/25/40/5825407765bb2acede3a0230b5848fda.jpg");
        imageList.add("http://img1.latauto.tvnet.lv/images/anns/autoplius/42/26343/85/mercedes-benz-e-klases-rezerves-dalas-e63-amg-w211-paketa_2506556_big.jpg");
        makeMap.put("տեսակ", "Mercedes-Benz");
        makeMap.put("տարի", 2003);
        makeMap.put("ղեկ", "Աջ");
        makeMap.put("մոդել", "E63");
        makeMap.put("փոխանցման տուփը", "Ավտոմատ");
        makeMap.put("գինը", "$5550");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);
        /////////////////////////////
        makeMap = new HashMap<>();
        imageList = new ArrayList<>();
        imageList.add("https://icdn5.digitaltrends.com/image/concept_s_class_coupe___11_-640x427-c.jpg?ver=1");
        imageList.add("http://cdn3.spiegel.de/images/image-656402-galleryV9-luvr-656402.jpg");
        makeMap.put("տեսակ", "Mercedes-Benz");
        makeMap.put("տարի", 2013);
        makeMap.put("ղեկ", "Աջ");
        makeMap.put("մոդել", "S-Class Coupe");
        makeMap.put("փոխանցման տուփը", "Մեխանիկական");
        makeMap.put("գինը", "$13250");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);
        /////////////////////////

        makeMap = new HashMap<>();
        imageList = new ArrayList<>();
        imageList.add("https://assets.mbusa.com/vcm/MB/DigitalAssets/Vehicles/Models/2018/C-Sedans/All/Features/2018-C-C43-AMG-SEDAN-009-MCFO.jpg");
        imageList.add("https://images.dealer.com/ddc/vehicles/2015/Mercedes-Benz/E-Class/Sedan/trim_Base_abc495/color/Polar%20White-149-227%2C228%2C232-640-en_US.jpg");
        imageList.add("http://cloud.leparking.fr/2017/07/13/13/04/mercedes-classe-c-coupe-mercedes-c-180-coupe-fascination-amg-gtie-24m-voitures-alpes-maritimes-blanc_5756103529.jpg");
        makeMap.put("տեսակ", "Mercedes-Benz");
        makeMap.put("տարի", 2008);
        makeMap.put("ղեկ", "Ձախ");
        makeMap.put("մոդել", "AMG C43 SEDAN");
        makeMap.put("փոխանցման տուփը", "Մեխանիկական");
        makeMap.put("գինը", "$9950");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);
        //////////////////////////

        makeMap = new HashMap<>();
        imageList = new ArrayList<>();
        imageList.add("https://www.mbwestminster.com/assets/inventory/vehicles/wddwf4kb5jr319914/ip/10.jpg");
        imageList.add("http://193dc3ce6ca923a132dd-c1c0a5c49f9f17962d926dc2a78c3cc6.r66.cf1.rackcdn.com/WDDWJ6EB9JF603795/6fa554f14f9fc6433d290a59290b22f3.jpg");
        makeMap.put("տեսակ", "Mercedes-Benz");
        makeMap.put("տարի", 2001);
        makeMap.put("ղեկ", "Աջ");
        makeMap.put("մոդել", "C 300");
        makeMap.put("փոխանցման տուփը", "Ավտոմատ");
        makeMap.put("գինը", "$6750");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);
        carMap.put("պատկեր", "http://www.abbeyroweautoglass.com/wp-content/uploads/2015/03/Mercedes_Benz.jpg");
        carMap.put("ավտոմեքենաներ", makeList);
        objectList.add(carMap);
        ///////////////////////
        ///////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        carMap = new HashMap<>();
        makeList = new ArrayList<>();
        makeMap = new HashMap<>();
        imageList = new ArrayList<>();
        imageList.add("https://cms.kelleybluebookimages.com/content/dam/kbb-editorial/make/bmw/x5/2015/380x228-2015-bmw-x5-front-action-guide.jpg/_jcr_content/renditions/cq5dam.web.1280.1280.jpeg");
        imageList.add("https://cms.kelleybluebookimages.com/content/dam/kbb-editorial/make/bmw/x5/2015/2015-bmw-x5-front-action-guide.jpg");
        imageList.add("https://cms.kelleybluebookimages.com/content/dam/kbb-editorial/make/bmw/x3/2015/01-2015-bmw-x3.jpg");
        makeMap.put("տեսակ", "BMW");
        makeMap.put("տարի", 2003);
        makeMap.put("ղեկ", "Աջ");
        makeMap.put("մոդել", "X5");
        makeMap.put("փոխանցման տուփը", "Ավտոմատ");
        makeMap.put("գինը", "$5000");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);

        //////////////////////////////////

        makeMap = new HashMap<>();
        imageList = new ArrayList<>();
        imageList.add("http://www.automobili10.it/wp-content/uploads/2010/05/bmw-x6-m-schitzer-4-300x170.jpg");
        imageList.add("https://offshoremallorca.com/media/k2/items/cache/eb9b7452cdc806568d2312ea5614a301_L.jpg");
        imageList.add("https://png.pngtree.com/element_origin_min_pic/17/10/03/0123d0cf3ef4c34d1a038f43f7243b57.jpg");
        makeMap.put("տեսակ", "BMW");
        makeMap.put("տարի", 2009);
        makeMap.put("ղեկ", "Ձախ");
        makeMap.put("մոդել", "X6");
        makeMap.put("փոխանցման տուփը", "Ավտոմատ");
        makeMap.put("գինը", "$7550");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);
        ////////////////////////////
        makeMap = new HashMap<>();
        imageList = new ArrayList<>();
        imageList.add("http://autoretail.by/images/kolesa/S81%20e39/style%2081%20e39%20autoretail.by.jpg");
        imageList.add("https://http2.mlstatic.com/bmw-e39-escape-spo-528-530-D_NQ_NP_994021-MLA20700356659_052016-O.jpg");
        makeMap.put("տեսակ", "BMW");
        makeMap.put("տարի", 2002);
        makeMap.put("ղեկ", "Աջ");
        makeMap.put("մոդել", "E39");
        makeMap.put("փոխանցման տուփը", "Մեխանիկական");
        makeMap.put("գինը", "$3700");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);
        ///////////////////////////
        makeMap = new HashMap<>();
        imageList = new ArrayList<>();
        imageList.add("http://realcars.su/uploads/posts/2016-12/medium/1481210034_3066_95564404.jpg.jpg");
        imageList.add("https://a.d-cd.net/436a418s-960.jpg");
        makeMap.put("տեսակ", "BMW");
        makeMap.put("տարի", 2002);
        makeMap.put("ղեկ", "Ձախ");
        makeMap.put("մոդել", "750i");
        makeMap.put("փոխանցման տուփը", "Մեխանիկական");
        makeMap.put("գինը", "$3000");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);

        ///////////////////////////

        makeMap = new HashMap<>();
        imageList = new ArrayList<>();
        imageList.add("http://cdn.motorpage.ru/Photos/800/BMW4_1.jpg");
        imageList.add("http://povozcar.ru/wp-content/uploads/BMW-4-Series-Coupe-Concept-2013.jpg");
        imageList.add("http://www.carsapa.ru/files/images/autos/bmw/20144_series_gran_coupe/bmw_2014_4_series_gran_coupe_02.jpg");
        imageList.add("https://img.drive.ru/i/0/50c03c1ab72142960b000065.jpg");
        makeMap.put("տեսակ", "BMW");
        imageList.add("http://www.hybrid.cz/i/auto/bmw-i8-plug-in-hybrid-visions-03.jpg");
        makeMap.put("տարի", 2011);
        makeMap.put("ղեկ", "Աջ");
        makeMap.put("մոդել", "4 series");
        makeMap.put("փոխանցման տուփը", "Ավտոմատ");
        makeMap.put("գինը", "$11000");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);
        ////////////////////////
        carMap.put("պատկեր", "http://www.cyl6.com/img/p/8/1/3/8/8138-large_default.jpg");
        carMap.put("ավտոմեքենաներ", makeList);
        objectList.add(carMap);
        ///////////////////////////////
        ////////////////////////
        ///////////////////////

        makeList = new ArrayList<>();
        makeMap = new HashMap<>();
        imageList = new ArrayList<>();
        imageList.add("https://upload.wikimedia.org/wikipedia/commons/d/d0/Audi_TT-RS.jpg");
        imageList.add("https://i.kinja-img.com/gawker-media/image/upload/s--SeL-5V6p--/c_scale,fl_progressive,q_80,w_800/18ncmob6gozktjpg.jpg");
        imageList.add("https://hips.hearstapps.com/amv-prod-cad-assets.s3.amazonaws.com/images/media/267456/2010-audi-tt-rs-photo-261560-s-original.jpg");
        imageList.add("https://secure.i.telegraph.co.uk/multimedia/archive/01361/Audittrs_1361736c.jpg");
        makeMap.put("տեսակ", "Audi");
        makeMap.put("տարի", 2000);
        makeMap.put("ղեկ", "Ձախ");
        makeMap.put("մոդել", "TT RS");
        makeMap.put("փոխանցման տուփը", "Մեխանիկական");
        makeMap.put("գինը", "$6900");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);
////////////////////////////////////////////

        makeMap = new HashMap<>();
        imageList = new ArrayList<>();
        imageList.add("http://prostoauto.com/wp-content/uploads/2012/02/Audi-A4.jpg");
        imageList.add("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/2009_Audi_A4_%288K_MY10%29_2.0_TDI_sedan_%282015-07-09%29_01.jpg/280px-2009_Audi_A4_%288K_MY10%29_2.0_TDI_sedan_%282015-07-09%29_01.jpg");
        makeMap.put("տեսակ", "Audi");
        makeMap.put("տարի", 2007);
        makeMap.put("ղեկ", "Աջ");
        makeMap.put("մոդել", "A4");
        makeMap.put("փոխանցման տուփը", "Ավտոմատ");
        makeMap.put("գինը", "$5800");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);
///////////////////////////////////////////

        makeMap = new HashMap<>();
        imageList = new ArrayList<>();
        imageList.add("https://audi-kiev.com.ua/content/uploads/rs-4-avant.jpg");
        imageList.add("https://a.d-cd.net/e57946as-960.jpg");
        imageList.add("http://i1.ytimg.com/vi/Fic8WoLL0Rw/hqdefault.jpg");
        makeMap.put("տեսակ", "Audi");
        makeMap.put("տարի", 2007);
        makeMap.put("ղեկ", "Ձախ");
        makeMap.put("մոդել", "A8");
        makeMap.put("փոխանցման տուփը", "Ավտոմատ");
        makeMap.put("գինը", "$7500");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);
        //////////////////////////////////////

        makeMap = new HashMap<>();
        imageList = new ArrayList<>();
        imageList.add("https://www.bookyourcar.co.in/uploads/models/113/audi-a6.jpg");
        imageList.add("http://i.wp.pl/a/f/jpeg/28088/a6_c7.jpeg");
        imageList.add("http://www.highcliffemotorco.co.uk/files/cache/wm_1c4a7de78ad6d8218a43acde892dd8fd.jpg");
        makeMap.put("տեսակ", "Audi");
        makeMap.put("տարի", 2009);
        makeMap.put("ղեկ", "Ձախ");
        makeMap.put("մոդել", "A6");
        makeMap.put("փոխանցման տուփը", "Մեխանիկական");
        makeMap.put("գինը", "$8500");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);

        //////////////////////////////////////////

        makeMap = new HashMap<>();
        imageList = new ArrayList<>();
        imageList.add("https://www.audi.ca/content/dam/nemo/ca/Models/a5-family-overview/audi-a5-coupe.jpg");
        imageList.add("https://www.cstatic-images.com/car-pictures/xl/usc80auc194a021001.png");
        imageList.add("https://carstobtc.com/static/uploads/cars-luxury/audi-a7.jpg");
        makeMap.put("տեսակ", "Audi");
        makeMap.put("տարի", 2015);
        makeMap.put("ղեկ", "Աջ");
        makeMap.put("մոդել", "A5");
        makeMap.put("փոխանցման տուփը", "Ավտոմատ");
        makeMap.put("գինը", "$11000");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);
////////////////////////////////////////////////
        /////////////////////////////////////////////
        ///////////////////////////////////////////
        carMap = new HashMap<>();
        carMap.put("պատկեր", "http://www.rezmoto.com/blog/wp-content/uploads/2016/06/icon-audi.png");
        carMap.put("ավտոմեքենաներ", makeList);
        objectList.add(carMap);
///////////////////////////////////////////////////////
        carMap = new HashMap<>();
        makeList=new ArrayList<>();
        makeMap = new HashMap<>();
        makeMap.put("տեսակ", "Toyota");
        makeMap.put("ղեկ", "Աջ");
        makeMap.put("մոդել", "A5");
        makeMap.put("փոխանցման տուփը", "Ավտոմատ");
        makeMap.put("գինը", "$11000");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);
        carMap.put("պատկեր", "http://reviews.carreview.com/files/2007/12/toyota_logo.jpg");
        carMap.put("ավտոմեքենաներ", makeList);
        objectList.add(carMap);
//        //////////////////////////////////////
        carMap = new HashMap<>();
        makeList=new ArrayList<>();
        makeMap = new HashMap<>();
        makeMap.put("տեսակ", "Mitsubishi");
        makeMap.put("ղեկ", "Աջ");
        makeMap.put("մոդել", "A5");
        makeMap.put("փոխանցման տուփը", "Ավտոմատ");
        makeMap.put("գինը", "$11000");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);
        carMap.put("պատկեր", "http://www.ianmarc.cl/wp-content/uploads/2015/07/repuestos-mitsubishi-logo.png");
        carMap.put("ավտոմեքենաներ", makeList);
        objectList.add(carMap);
        /////////////////////////////////
        carMap = new HashMap<>();
        makeList=new ArrayList<>();
        makeMap = new HashMap<>();
        makeMap.put("տեսակ", "Lexus");
        makeMap.put("ղեկ", "Աջ");
        makeMap.put("մոդել", "A5");
        makeMap.put("փոխանցման տուփը", "Ավտոմատ");
        makeMap.put("գինը", "$11000");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);
        carMap.put("պատկեր", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSSo3UeCdSyLIYkUjFMvIHIh1Q6YhNRobaGJs2l_lse1Z_MtJlfyw");
        carMap.put("ավտոմեքենաներ", makeList);
        objectList.add(carMap);
        /////////////////////////////////////////
        carMap = new HashMap<>();
        makeList=new ArrayList<>();
        makeMap = new HashMap<>();
        makeMap.put("տեսակ", "Mazda");
        makeMap.put("ղեկ", "Աջ");
        makeMap.put("մոդել", "A5");
        makeMap.put("փոխանցման տուփը", "Ավտոմատ");
        makeMap.put("գինը", "$11000");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);
        carMap.put("պատկեր", "https://www.tunisienumerique.com/wp-content/uploads/images279.jpg");
        carMap.put("ավտոմեքենաներ", makeList);
        objectList.add(carMap);

////////////////////////////////////////////////////
        carMap = new HashMap<>();
        makeList=new ArrayList<>();
        makeMap = new HashMap<>();
        makeMap.put("տեսակ", "Land Rover");
        makeMap.put("ղեկ", "Աջ");
        makeMap.put("մոդել", "A5");
        makeMap.put("փոխանցման տուփը", "Ավտոմատ");
        makeMap.put("գինը", "$11000");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);
        carMap.put("պատկեր", "http://www.autorizzuti.it/wp-content/uploads/2016/06/logo-land-rover.png");
        carMap.put("ավտոմեքենաներ", makeList);
        objectList.add(carMap);
        ////////////////////////////////////////
        carMap = new HashMap<>();
        makeList=new ArrayList<>();
        makeMap = new HashMap<>();
        makeMap.put("տեսակ", "Volkswagen");
        makeMap.put("ղեկ", "Աջ");
        makeMap.put("մոդել", "A5");
        makeMap.put("փոխանցման տուփը", "Ավտոմատ");
        makeMap.put("գինը", "$11000");
        makeMap.put("պատկերներ", imageList);
        makeList.add(makeMap);
        carMap.put("պատկեր", "http://www.freelogovectors.net/wp-content/uploads/2011/12/volkswagen-logo.jpg");
        carMap.put("ավտոմեքենաներ", makeList);
        objectList.add(carMap);
        ////////////////////////////////////
        JSONArray jsonArray = new JSONArray(objectList);
        return jsonArray.toString();
    }
}
