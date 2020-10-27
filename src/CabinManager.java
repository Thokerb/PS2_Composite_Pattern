public class CabinManager {

    public static void main(String[] args) {
        CabinLayout businessClass = new CabinLayout("Business Class");

        CabinLayout entertainment = new CabinLayout("Entertainment");
        entertainment.add(new CabinItem("Touchscreen"));
        entertainment.add(new CabinItem("Bosekopfhörer",19.99));

        CabinLayout nightcare = new CabinLayout("Nightcare");
        nightcare.add(new CabinItem("Hausschuhe"));
        nightcare.add(new CabinItem("Kuscheldecke"));
        nightcare.add(new CabinItem("Schlummertrunk",100));

        CabinLayout business = new CabinLayout("Business");
        business.add(new CabinItem("Wifi",4.99));
        business.add(new CabinItem("Telefon"));

        businessClass.add(entertainment);
        businessClass.add(nightcare);
        businessClass.add(business);

        System.out.println(businessClass.getPremiumCabinElements());



    }
}
