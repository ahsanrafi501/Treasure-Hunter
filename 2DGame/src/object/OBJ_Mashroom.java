package object;

import javax.imageio.ImageIO;

public class OBJ_Mashroom extends SuperObject {
    public OBJ_Mashroom(){
        name = "Mashroom";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/object/mashroom.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
