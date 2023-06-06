package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_laymain{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panel1").vw.setLeft((int)(0d));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panel1").vw.setTop((int)(0d));
views.get("panel1").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("btnclothes").vw.setLeft((int)((views.get("panel1").vw.getWidth())/3.75d - (views.get("btnclothes").vw.getWidth() / 2)));
views.get("btnclothes").vw.setTop((int)((views.get("panel1").vw.getHeight())/6.5d - (views.get("btnclothes").vw.getHeight() / 2)));
views.get("txtclothes").vw.setLeft((int)((views.get("panel1").vw.getWidth())/1.5d - (views.get("txtclothes").vw.getWidth() / 2)));
//BA.debugLineNum = 11;BA.debugLine="txtclothes.VerticalCenter = Panel1.Height/6.5"[laymain/General script]
views.get("txtclothes").vw.setTop((int)((views.get("panel1").vw.getHeight())/6.5d - (views.get("txtclothes").vw.getHeight() / 2)));
//BA.debugLineNum = 13;BA.debugLine="btnshoes.HorizontalCenter = Panel1.Width/3.75"[laymain/General script]
views.get("btnshoes").vw.setLeft((int)((views.get("panel1").vw.getWidth())/3.75d - (views.get("btnshoes").vw.getWidth() / 2)));
//BA.debugLineNum = 14;BA.debugLine="btnshoes.VerticalCenter = Panel1.Height/3.5"[laymain/General script]
views.get("btnshoes").vw.setTop((int)((views.get("panel1").vw.getHeight())/3.5d - (views.get("btnshoes").vw.getHeight() / 2)));
//BA.debugLineNum = 16;BA.debugLine="txtshoes.HorizontalCenter = Panel1.Width/1.5"[laymain/General script]
views.get("txtshoes").vw.setLeft((int)((views.get("panel1").vw.getWidth())/1.5d - (views.get("txtshoes").vw.getWidth() / 2)));
//BA.debugLineNum = 17;BA.debugLine="txtshoes.VerticalCenter = Panel1.Height/3.5"[laymain/General script]
views.get("txtshoes").vw.setTop((int)((views.get("panel1").vw.getHeight())/3.5d - (views.get("txtshoes").vw.getHeight() / 2)));
//BA.debugLineNum = 19;BA.debugLine="btntotal.HorizontalCenter = Panel1.Width/3.75"[laymain/General script]
views.get("btntotal").vw.setLeft((int)((views.get("panel1").vw.getWidth())/3.75d - (views.get("btntotal").vw.getWidth() / 2)));
//BA.debugLineNum = 20;BA.debugLine="btntotal.VerticalCenter = Panel1.Height/2.45"[laymain/General script]
views.get("btntotal").vw.setTop((int)((views.get("panel1").vw.getHeight())/2.45d - (views.get("btntotal").vw.getHeight() / 2)));
//BA.debugLineNum = 22;BA.debugLine="txttotal.HorizontalCenter = Panel1.Width/1.5"[laymain/General script]
views.get("txttotal").vw.setLeft((int)((views.get("panel1").vw.getWidth())/1.5d - (views.get("txttotal").vw.getWidth() / 2)));
//BA.debugLineNum = 23;BA.debugLine="txttotal.VerticalCenter = Panel1.Height/2.45"[laymain/General script]
views.get("txttotal").vw.setTop((int)((views.get("panel1").vw.getHeight())/2.45d - (views.get("txttotal").vw.getHeight() / 2)));
//BA.debugLineNum = 25;BA.debugLine="btnclear.HorizontalCenter = Panel1.Width/3.75"[laymain/General script]
views.get("btnclear").vw.setLeft((int)((views.get("panel1").vw.getWidth())/3.75d - (views.get("btnclear").vw.getWidth() / 2)));
//BA.debugLineNum = 26;BA.debugLine="btnclear.VerticalCenter = Panel1.Height/1.5"[laymain/General script]
views.get("btnclear").vw.setTop((int)((views.get("panel1").vw.getHeight())/1.5d - (views.get("btnclear").vw.getHeight() / 2)));
//BA.debugLineNum = 28;BA.debugLine="btnexit.HorizontalCenter = Panel1.Width/1.5"[laymain/General script]
views.get("btnexit").vw.setLeft((int)((views.get("panel1").vw.getWidth())/1.5d - (views.get("btnexit").vw.getWidth() / 2)));
//BA.debugLineNum = 29;BA.debugLine="btnexit.VerticalCenter = Panel1.Height/1.5"[laymain/General script]
views.get("btnexit").vw.setTop((int)((views.get("panel1").vw.getHeight())/1.5d - (views.get("btnexit").vw.getHeight() / 2)));

}
}