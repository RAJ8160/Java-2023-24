interface EventListener{

	 public void performEvent();
}
interface MouseListener extends EventListener{
     public  void mouseClicked();
     public  void mousePressed();
     public  void mouseReleased();
    public  void mouseMoved();
     public  void mouseDragged();
}
interface KeyListener extends EventListener{
	public  void keyPressed();
   public  void keyReleased();
}
 class EventDemo2 implements MouseListener,KeyListener{
 	public  void mouseClicked(){
 		System.out.println("Mouse Click Event Perform");
 	}
    public  void mousePressed(){
     	System.out.println("Mouse Pressed Event Perform");
     }
    public  void mouseReleased(){
     	System.out.println("Mouse Released Event Perform");
     }
    public  void mouseMoved(){
    	System.out.println("Mouse Moved Event Perform");
    }
    public  void mouseDragged(){
      	System.out.println("Mouse Dragged Event Perform");
    }
    public  void keyPressed(){
    	System.out.println("Key Press Event Perform");
    }
    public  void keyReleased(){
    	System.out.println("Key Released Event Perform");
    }
     public void performEvent(){
     	System.out.println("Event perform");
     }
  }
public class EventDemo{
	public static void main(String[] args) {
           EventDemo2 ed=new EventDemo2();
           ed.mouseClicked();
           ed.mouseClicked();
           ed.mousePressed();
           ed.mouseReleased();
           ed.mouseMoved();
           ed.mouseDragged();
           ed.keyPressed();
           ed.keyReleased();
	}
}