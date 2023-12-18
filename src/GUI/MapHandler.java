package GUI;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MapHandler {
    private final ImageIcon map1 = new ImageIcon("src/IconImages/map2.jpg");
    private final ImageIcon map2 = new ImageIcon("src/IconImages/desertmap.jpg");
    private final ImageIcon map3 = new ImageIcon("src/IconImages/forestmap.jpg");
    private final ImageIcon map4 = new ImageIcon("src/IconImages/nestmap.jpg");
    List<Icon> mapList = new ArrayList<>();

    public MapHandler() {
        mapList.add(map1);
        mapList.add(map2);
        mapList.add(map3);
        mapList.add(map4);
    }

    public Icon getNewMap(){
        Collections.shuffle(mapList);
        return mapList.get(0);
    }
}
