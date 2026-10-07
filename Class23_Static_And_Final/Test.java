class TV{
    String cname;
    int scrsize;
    TV(String cname, int scrsize){
        this.cname = cname;
        this.scrsize = scrsize;
    }
}

class ColorTV extends TV{
    boolean TVType;
    ColorTV(String cname, int scrsize, boolean TVType){
        super(cname, scrsize);
        this.TVType = TVType;
    }
    void showdat(){
        System.out.println("Company name = " + cname);
        System.out.println("Screen Size = " + scrsize);
        System.out.println("TV Type = " + TVType);
    }
}

class BWTV extends TV{
    boolean TVType;
    BWTV(String cname, int scrsize, boolean TVType){
        super(cname, scrsize);
        this.TVType = TVType;
    }
    void showdat(){
        System.out.println("Company name = " + cname);
        System.out.println("Screen Size = " + scrsize);
        System.out.println("TV Type = " + TVType);
    }
}

public class Test {
    public static void main(String[] args) {
        ColorTV CTV = new ColorTV("TV", 80, false);
        BWTV BTV = new BWTV("TV", 100, true);
        CTV.showdat();
        BTV.showdat();
    }
}
