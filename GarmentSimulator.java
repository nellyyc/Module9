public class GarmentSimulator {
    private Top top;
    private Pants pants;
    private Shoes shoes;

    public GarmentSimulator(GarmentFactory factory) {
        top = factory.createTop();
        pants = factory.createPants();
        shoes = factory.createShoes();
    }

    public void wearOutfit() {
        top.wear();
        pants.wear();
        shoes.wear();
    }

    public static void main(String[] args) {
        GarmentFactory professionalFactory = new ProfessionalFactory();
        GarmentSimulator professionalOutfit = new GarmentSimulator(professionalFactory);
        System.out.println("Professional Outfit:");
        professionalOutfit.wearOutfit();

        GarmentFactory casualFactory = new CasualFactory();
        GarmentSimulator casualOutfit = new GarmentSimulator(casualFactory);
        System.out.println("Casual Outfit:");
        casualOutfit.wearOutfit();

        GarmentFactory partyFactory = new PartyFactory();
        GarmentSimulator partyOutfit = new GarmentSimulator(partyFactory);
        System.out.println("Party Outfit:");
        partyOutfit.wearOutfit();
    }
}
