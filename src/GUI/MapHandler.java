package GUI;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MapHandler {
    private final List<ImageIcon> mapList = new ArrayList<>();

    public MapHandler() {
        ImageIcon map1 = new ImageIcon("src/IconImages/map2.jpg");
        mapList.add(map1);
        ImageIcon map2 = new ImageIcon("src/IconImages/desertmap.jpg");
        mapList.add(map2);
        ImageIcon map3 = new ImageIcon("src/IconImages/forestmap.jpg");
        mapList.add(map3);
        ImageIcon map4 = new ImageIcon("src/IconImages/nestmap.jpg");
        mapList.add(map4);
    }

    public ImageIcon getNewMap(){
        Collections.shuffle(mapList);
        return mapList.get(0);
    }
}
