package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layclothes{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[layclothes/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="Panel1.SetLeftAndRight(0,100%x)"[layclothes/General script]
views.get("panel1").vw.setLeft((int)(0d));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 4;BA.debugLine="Panel1.SetTopAndBottom(0,100%y)"[layclothes/General script]
views.get("panel1").vw.setTop((int)(0d));
views.get("panel1").vw.setHeight((int)((100d / 100 * height) - (0d)));
//BA.debugLineNum = 6;BA.debugLine="tabclothes.HorizontalCenter = Panel1.Width/2"[layclothes/General script]
views.get("tabclothes").vw.setLeft((int)((views.get("panel1").vw.getWidth())/2d - (views.get("tabclothes").vw.getWidth() / 2)));
//BA.debugLineNum = 7;BA.debugLine="tabclothes.VerticalCenter = Panel1.Height/3"[layclothes/General script]
views.get("tabclothes").vw.setTop((int)((views.get("panel1").vw.getHeight())/3d - (views.get("tabclothes").vw.getHeight() / 2)));
//BA.debugLineNum = 9;BA.debugLine="Panel22.HorizontalCenter = Panel1.Width/2"[layclothes/General script]
views.get("panel22").vw.setLeft((int)((views.get("panel1").vw.getWidth())/2d - (views.get("panel22").vw.getWidth() / 2)));
//BA.debugLineNum = 10;BA.debugLine="Panel22.VerticalCenter = Panel1.Height/1.3"[layclothes/General script]
views.get("panel22").vw.setTop((int)((views.get("panel1").vw.getHeight())/1.3d - (views.get("panel22").vw.getHeight() / 2)));

}
}