package BasicsOfJava;

import org.junit.Test;

import java.util.HashMap;

public class AT12_HashMap {
    @Test
    public void test16(){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Sophy",13);
        map.put("Ricky",11);
        map.put("Bianca",8);

        System.out.println("print map on console : "+map); //3

        int mapsize=map.size();
        System.out.println("hasmap size is : "+mapsize);

        if(map.containsKey("Bianca")){
            int KeyVal=map.get("Bianca");
            System.out.println(" Key value for "+" Bianca is "+KeyVal); //8
        }

    }
}
