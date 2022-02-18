package edu.jsu.mcis.cs310;

import org.json.simple.*;

public class Main {

    public static void main(String[] args) {
        
        Database db = new Database("cs310_p2_user", "P2!user", "localhost");
        
        if (db.isConnected()) {
            
            System.err.println("Connected Successfully!");
            
            int result = db.register(1, 1, 22574);
            String section = db.getSectionsAsJSON(1, "CS", "310");
            String list = db.getScheduleAsJSON(1, 1);
            
            System.err.println(result);
            System.err.println(section);
            System.err.println(list);
            
        }
        
        
    }
    
}