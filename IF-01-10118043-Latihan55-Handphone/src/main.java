/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android a = new Android("Samsung", "Android", "Grand", 3000000);
        a.setKeyStore("234ibasjk23");        
        a.displayProduct();
        System.out.println("Key Store   "+a.getKeyStore()+"\n");
        BlackBerry bb = new BlackBerry("Black", "RIM", "Curve", 2000000);
        bb.setPinBB("BHS49");
        bb.displayProduct();
        System.out.println("Key Store   "+bb.getPinBB()+"\n");
        WindowsPhone wp = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        wp.setWpKeyStore("UUUQIJWORJ");
        wp.displayProduct();
        System.out.println("Key Store   "+wp.getWpKeyStore()+"\n");
        
        
    }
    
}
