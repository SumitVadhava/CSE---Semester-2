interface EventListener {
    public void performEvent();
 }
 interface MouseListener extends EventListener{
    public void mouseClicked();
    public void mousePressed();
    public void mouseReleased();
    public void mouseMoved();
    public void mouseDragged();

}
interface KeyListener extends EventListener{
    public void keyPressed();
    public void keyReleased();
}

class EventDemo implements MouseListener,KeyListener{
    @Override
    public void performEvent() {
        System.out.println("Performing event...");
    }

    @Override
    public void mouseClicked() {
        System.out.println("Mouse Clicked");
    }

    @Override
    public void mousePressed() {
        System.out.println("Mouse Pressed");
    }

    @Override
    public void mouseReleased() {
        System.out.println("Mouse Released");
    }

    @Override
    public void mouseMoved() {
        System.out.println("Mouse Moved");
    }

    @Override
    public void mouseDragged() {
        System.out.println("Mouse Dragged");
    }

    @Override
    public void keyPressed() {
        System.out.println("Key Pressed");
    }

    @Override
    public void keyReleased() {
        System.out.println("Key Released");
    }
}
 public class L74{
   public static void main(String[] args) {
    EventDemo Ed1= new EventDemo();
    Ed1.performEvent();
    Ed1.mouseClicked();
    Ed1.mousePressed();
    Ed1.mouseReleased();
    Ed1.mouseMoved();
    Ed1.mouseDragged();
    Ed1.keyPressed();
    Ed1.keyReleased();
   }
}