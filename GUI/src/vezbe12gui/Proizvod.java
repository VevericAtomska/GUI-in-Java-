
package vezbe12gui;


public class Proizvod { 
    
    String proizvod, sifra, domaci, tip; 

    public Proizvod(String proizvod, String sifra, String domaci, String tip) {
        this.proizvod = proizvod;
        this.sifra = sifra;
        this.domaci = domaci;
        this.tip = tip;
    }
    
    @Override
    public String toString() {
        return "Proizvod {" + "Proizvod " + proizvod 
                + " sifra" + sifra + " domaci " + domaci + " tip" + tip;
    
    }
    
}
