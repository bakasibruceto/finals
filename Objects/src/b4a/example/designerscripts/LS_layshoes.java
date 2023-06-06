package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layshoes{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panel1").vw.setLeft((int)(0d));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panel1").vw.setTop((int)(0d));
views.get("panel1").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("tabshoes").vw.setLeft((int)((views.get("panel1").vw.getWidth())/2d - (views.get("tabshoes").vw.getWidth() / 2)));
views.get("tabshoes").vw.setTop((int)((views.get("panel1").vw.getHeight())/3d - (views.get("tabshoes").vw.getHeight() / 2)));
views.get("panel22").vw.setLeft((int)((views.get("panel1").vw.getWidth())/2d - (views.get("panel22").vw.getWidth() / 2)));
views.get("panel22").vw.setTop((int)((views.get("panel1").vw.getHeight())/1.3d - (views.get("panel22").vw.getHeight() / 2)));

}
}