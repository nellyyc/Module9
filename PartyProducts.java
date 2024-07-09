public class PartyTop implements Top {
    @Override
    public void wear() {
        System.out.println("Wearing Party Top");
    }
}

public class PartyPants implements Pants {
    @Override
    public void wear() {
        System.out.println("Wearing Party Pants");
    }
}

public class PartyShoes implements Shoes {
    @Override
    public void wear() {
        System.out.println("Wearing Party Shoes");
    }
}
