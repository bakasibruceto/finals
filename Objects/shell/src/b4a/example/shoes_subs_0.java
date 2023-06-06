package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class shoes_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (shoes) ","shoes",3,shoes.mostCurrent.activityBA,shoes.mostCurrent,40);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="Activity.LoadLayout(\"layshoes2\")";
Debug.ShouldStop(256);
shoes.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layshoes2")),shoes.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="tabshoes.AddTab(\"Heels\", \"layheels.bal\")";
Debug.ShouldStop(512);
shoes.mostCurrent._tabshoes.runVoidMethodAndSync ("AddTab",shoes.mostCurrent.activityBA,(Object)(BA.ObjectToString("Heels")),(Object)(RemoteObject.createImmutable("layheels.bal")));
 BA.debugLineNum = 43;BA.debugLine="spinheels.Add(\"Select Heels\")";
Debug.ShouldStop(1024);
shoes.mostCurrent._spinheels.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Select Heels")));
 BA.debugLineNum = 44;BA.debugLine="spinheels.Add(\"Heels 1 = 100\")";
Debug.ShouldStop(2048);
shoes.mostCurrent._spinheels.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Heels 1 = 100")));
 BA.debugLineNum = 45;BA.debugLine="spinheels.Add(\"Heels 2 = 120\")";
Debug.ShouldStop(4096);
shoes.mostCurrent._spinheels.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Heels 2 = 120")));
 BA.debugLineNum = 46;BA.debugLine="spinheels.Add(\"Heels 3 = 140\")";
Debug.ShouldStop(8192);
shoes.mostCurrent._spinheels.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Heels 3 = 140")));
 BA.debugLineNum = 48;BA.debugLine="tabshoes.AddTab(\"Wedges\", \"laywedges.bal\")";
Debug.ShouldStop(32768);
shoes.mostCurrent._tabshoes.runVoidMethodAndSync ("AddTab",shoes.mostCurrent.activityBA,(Object)(BA.ObjectToString("Wedges")),(Object)(RemoteObject.createImmutable("laywedges.bal")));
 BA.debugLineNum = 49;BA.debugLine="spinwedges.Add(\"Select Wedges\")";
Debug.ShouldStop(65536);
shoes.mostCurrent._spinwedges.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Select Wedges")));
 BA.debugLineNum = 50;BA.debugLine="spinwedges.Add(\"Wedges1 = 160\")";
Debug.ShouldStop(131072);
shoes.mostCurrent._spinwedges.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Wedges1 = 160")));
 BA.debugLineNum = 51;BA.debugLine="spinwedges.Add(\"Wedges2 = 180\")";
Debug.ShouldStop(262144);
shoes.mostCurrent._spinwedges.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Wedges2 = 180")));
 BA.debugLineNum = 52;BA.debugLine="spinwedges.Add(\"Wedges3 = 200\")";
Debug.ShouldStop(524288);
shoes.mostCurrent._spinwedges.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Wedges3 = 200")));
 BA.debugLineNum = 54;BA.debugLine="tabshoes.AddTab(\"Loafers\", \"layloafers.bal\")";
Debug.ShouldStop(2097152);
shoes.mostCurrent._tabshoes.runVoidMethodAndSync ("AddTab",shoes.mostCurrent.activityBA,(Object)(BA.ObjectToString("Loafers")),(Object)(RemoteObject.createImmutable("layloafers.bal")));
 BA.debugLineNum = 55;BA.debugLine="listloafers1.SingleLineLayout.ItemHeight = 15dip";
Debug.ShouldStop(4194304);
shoes.mostCurrent._listloafers1.runMethod(false,"getSingleLineLayout").runMethod(true,"setItemHeight",shoes.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15))));
 BA.debugLineNum = 56;BA.debugLine="listloafers1.SingleLineLayout.Label.TextSize = 12";
Debug.ShouldStop(8388608);
shoes.mostCurrent._listloafers1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 12));
 BA.debugLineNum = 57;BA.debugLine="listloafers1.SingleLineLayout.Label.Color = Color";
Debug.ShouldStop(16777216);
shoes.mostCurrent._listloafers1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runVoidMethod ("setColor",shoes.mostCurrent.__c.getField(false,"Colors").getField(true,"Cyan"));
 BA.debugLineNum = 58;BA.debugLine="listloafers1.SingleLineLayout.Label.TextColor = C";
Debug.ShouldStop(33554432);
shoes.mostCurrent._listloafers1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",shoes.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 59;BA.debugLine="listloafers1.AddSingleLine(\"Loafer1\" & \" \" & \"220";
Debug.ShouldStop(67108864);
shoes.mostCurrent._listloafers1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Loafer1"),RemoteObject.createImmutable(" "),RemoteObject.createImmutable("220")))));
 BA.debugLineNum = 60;BA.debugLine="listloafers1.AddSingleLine(\"Loafer2\" & \" \" & \"240";
Debug.ShouldStop(134217728);
shoes.mostCurrent._listloafers1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Loafer2"),RemoteObject.createImmutable(" "),RemoteObject.createImmutable("240")))));
 BA.debugLineNum = 61;BA.debugLine="listloafers1.AddSingleLine(\"Loafer3\" & \" \" & \"260";
Debug.ShouldStop(268435456);
shoes.mostCurrent._listloafers1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Loafer3"),RemoteObject.createImmutable(" "),RemoteObject.createImmutable("260")))));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (shoes) ","shoes",3,shoes.mostCurrent.activityBA,shoes.mostCurrent,68);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 68;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (shoes) ","shoes",3,shoes.mostCurrent.activityBA,shoes.mostCurrent,64);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","activity_resume");}
 BA.debugLineNum = 64;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndel_click() throws Exception{
try {
		Debug.PushSubsStack("btndel_Click (shoes) ","shoes",3,shoes.mostCurrent.activityBA,shoes.mostCurrent,215);
if (RapidSub.canDelegate("btndel_click")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","btndel_click");}
 BA.debugLineNum = 215;BA.debugLine="Sub btndel_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 216;BA.debugLine="listloafers2.Enabled = True";
Debug.ShouldStop(8388608);
shoes.mostCurrent._listloafers2.runMethod(true,"setEnabled",shoes.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 217;BA.debugLine="ToastMessageShow(\"List Item Enabled, Long Click i";
Debug.ShouldStop(16777216);
shoes.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("List Item Enabled, Long Click in List Item to remove from the list")),(Object)(shoes.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnheelsaccept_click() throws Exception{
try {
		Debug.PushSubsStack("btnheelsaccept_Click (shoes) ","shoes",3,shoes.mostCurrent.activityBA,shoes.mostCurrent,242);
if (RapidSub.canDelegate("btnheelsaccept_click")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","btnheelsaccept_click");}
 BA.debugLineNum = 242;BA.debugLine="Sub btnheelsaccept_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 243;BA.debugLine="txtshoestot.Text = txtheelsprice.Text + txtwedges";
Debug.ShouldStop(262144);
shoes.mostCurrent._txtshoestot.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtheelsprice.runMethod(true,"getText")),BA.numberCast(double.class, shoes.mostCurrent._txtwedgesprice.runMethod(true,"getText")),BA.numberCast(double.class, shoes.mostCurrent._txtloafersprice.runMethod(true,"getText"))}, "++",2, 0)));
 BA.debugLineNum = 244;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnheelsclear_click() throws Exception{
try {
		Debug.PushSubsStack("btnheelsclear_Click (shoes) ","shoes",3,shoes.mostCurrent.activityBA,shoes.mostCurrent,125);
if (RapidSub.canDelegate("btnheelsclear_click")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","btnheelsclear_click");}
 BA.debugLineNum = 125;BA.debugLine="Sub btnheelsclear_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="listheels.Clear";
Debug.ShouldStop(536870912);
shoes.mostCurrent._listheels.runVoidMethod ("Clear");
 BA.debugLineNum = 127;BA.debugLine="txtheelsprice.Text = 0";
Debug.ShouldStop(1073741824);
shoes.mostCurrent._txtheelsprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 128;BA.debugLine="spinheels.SelectedIndex = 0";
Debug.ShouldStop(-2147483648);
shoes.mostCurrent._spinheels.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 129;BA.debugLine="imgheels.Bitmap = LoadBitmap(File.DirAssets, \"whi";
Debug.ShouldStop(1);
shoes.mostCurrent._imgheels.runMethod(false,"setBitmap",(shoes.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(shoes.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("white.jpg"))).getObject()));
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnloafersaccept_click() throws Exception{
try {
		Debug.PushSubsStack("btnloafersaccept_Click (shoes) ","shoes",3,shoes.mostCurrent.activityBA,shoes.mostCurrent,250);
if (RapidSub.canDelegate("btnloafersaccept_click")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","btnloafersaccept_click");}
 BA.debugLineNum = 250;BA.debugLine="Sub btnloafersaccept_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 251;BA.debugLine="txtshoestot.Text = txtheelsprice.Text + txtwedges";
Debug.ShouldStop(67108864);
shoes.mostCurrent._txtshoestot.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtheelsprice.runMethod(true,"getText")),BA.numberCast(double.class, shoes.mostCurrent._txtwedgesprice.runMethod(true,"getText")),BA.numberCast(double.class, shoes.mostCurrent._txtloafersprice.runMethod(true,"getText"))}, "++",2, 0)));
 BA.debugLineNum = 252;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnloafersclear_click() throws Exception{
try {
		Debug.PushSubsStack("btnloafersclear_Click (shoes) ","shoes",3,shoes.mostCurrent.activityBA,shoes.mostCurrent,205);
if (RapidSub.canDelegate("btnloafersclear_click")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","btnloafersclear_click");}
 BA.debugLineNum = 205;BA.debugLine="Sub btnloafersclear_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 206;BA.debugLine="listloafers2.Clear";
Debug.ShouldStop(8192);
shoes.mostCurrent._listloafers2.runVoidMethod ("Clear");
 BA.debugLineNum = 207;BA.debugLine="txtloafersprice.Text = 0";
Debug.ShouldStop(16384);
shoes.mostCurrent._txtloafersprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 208;BA.debugLine="listloafers2.Enabled = False";
Debug.ShouldStop(32768);
shoes.mostCurrent._listloafers2.runMethod(true,"setEnabled",shoes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnshoesaccept_click() throws Exception{
try {
		Debug.PushSubsStack("btnshoesaccept_Click (shoes) ","shoes",3,shoes.mostCurrent.activityBA,shoes.mostCurrent,274);
if (RapidSub.canDelegate("btnshoesaccept_click")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","btnshoesaccept_click");}
RemoteObject _acc = RemoteObject.createImmutable(0);
 BA.debugLineNum = 274;BA.debugLine="Sub btnshoesaccept_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 275;BA.debugLine="Dim acc As Int";
Debug.ShouldStop(262144);
_acc = RemoteObject.createImmutable(0);Debug.locals.put("acc", _acc);
 BA.debugLineNum = 276;BA.debugLine="acc = Msgbox2(\"Are You Sure to Accept?\",\"\",\"Yes\",";
Debug.ShouldStop(524288);
_acc = shoes.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Are You Sure to Accept?")),(Object)(BA.ObjectToCharSequence("")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((shoes.mostCurrent.__c.getField(false,"Null"))),shoes.mostCurrent.activityBA);Debug.locals.put("acc", _acc);
 BA.debugLineNum = 277;BA.debugLine="If acc = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_acc,BA.numberCast(double.class, shoes.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 278;BA.debugLine="Main.totshoes = txtshoestot.Text";
Debug.ShouldStop(2097152);
shoes.mostCurrent._main._totshoes /*RemoteObject*/  = shoes.mostCurrent._txtshoestot.runMethod(true,"getText");
 };
 BA.debugLineNum = 280;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnshoesclear_click() throws Exception{
try {
		Debug.PushSubsStack("btnshoesclear_Click (shoes) ","shoes",3,shoes.mostCurrent.activityBA,shoes.mostCurrent,254);
if (RapidSub.canDelegate("btnshoesclear_click")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","btnshoesclear_click");}
RemoteObject _clr = RemoteObject.createImmutable(0);
 BA.debugLineNum = 254;BA.debugLine="Sub btnshoesclear_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 255;BA.debugLine="Dim clr As Int";
Debug.ShouldStop(1073741824);
_clr = RemoteObject.createImmutable(0);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 256;BA.debugLine="clr = Msgbox2(\"Are You Sure to Close?\",\"\",\"Yes\",\"";
Debug.ShouldStop(-2147483648);
_clr = shoes.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Are You Sure to Close?")),(Object)(BA.ObjectToCharSequence("")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((shoes.mostCurrent.__c.getField(false,"Null"))),shoes.mostCurrent.activityBA);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 257;BA.debugLine="If clr = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_clr,BA.numberCast(double.class, shoes.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 258;BA.debugLine="listheels.Clear";
Debug.ShouldStop(2);
shoes.mostCurrent._listheels.runVoidMethod ("Clear");
 BA.debugLineNum = 259;BA.debugLine="txtheelsprice.Text = 0";
Debug.ShouldStop(4);
shoes.mostCurrent._txtheelsprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 260;BA.debugLine="spinheels.SelectedIndex = 0";
Debug.ShouldStop(8);
shoes.mostCurrent._spinheels.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 261;BA.debugLine="imgheels.Bitmap = LoadBitmap(File.DirAssets, \"wh";
Debug.ShouldStop(16);
shoes.mostCurrent._imgheels.runMethod(false,"setBitmap",(shoes.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(shoes.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("white.jpg"))).getObject()));
 BA.debugLineNum = 262;BA.debugLine="listwedges.Clear";
Debug.ShouldStop(32);
shoes.mostCurrent._listwedges.runVoidMethod ("Clear");
 BA.debugLineNum = 263;BA.debugLine="txtwedgesquan.Text = 1";
Debug.ShouldStop(64);
shoes.mostCurrent._txtwedgesquan.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(1));
 BA.debugLineNum = 264;BA.debugLine="txtwedgesprice.Text = 0";
Debug.ShouldStop(128);
shoes.mostCurrent._txtwedgesprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 265;BA.debugLine="spinwedges.SelectedIndex = 0";
Debug.ShouldStop(256);
shoes.mostCurrent._spinwedges.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 266;BA.debugLine="imgwedges.Bitmap = LoadBitmap(File.DirAssets, \"w";
Debug.ShouldStop(512);
shoes.mostCurrent._imgwedges.runMethod(false,"setBitmap",(shoes.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(shoes.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("white.jpg"))).getObject()));
 BA.debugLineNum = 267;BA.debugLine="listloafers2.Clear";
Debug.ShouldStop(1024);
shoes.mostCurrent._listloafers2.runVoidMethod ("Clear");
 BA.debugLineNum = 268;BA.debugLine="txtloafersprice.Text = 0";
Debug.ShouldStop(2048);
shoes.mostCurrent._txtloafersprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 269;BA.debugLine="listloafers2.Enabled = False";
Debug.ShouldStop(4096);
shoes.mostCurrent._listloafers2.runMethod(true,"setEnabled",shoes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 270;BA.debugLine="txtshoestot.Text = 0";
Debug.ShouldStop(8192);
shoes.mostCurrent._txtshoestot.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 };
 BA.debugLineNum = 272;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnshoesclose_click() throws Exception{
try {
		Debug.PushSubsStack("btnshoesclose_Click (shoes) ","shoes",3,shoes.mostCurrent.activityBA,shoes.mostCurrent,282);
if (RapidSub.canDelegate("btnshoesclose_click")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","btnshoesclose_click");}
RemoteObject _cls = RemoteObject.createImmutable(0);
 BA.debugLineNum = 282;BA.debugLine="Sub btnshoesclose_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 283;BA.debugLine="Dim cls As Int";
Debug.ShouldStop(67108864);
_cls = RemoteObject.createImmutable(0);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 284;BA.debugLine="cls = Msgbox2(\"Are You Sure to Close?\",\"\",\"Yes\",\"";
Debug.ShouldStop(134217728);
_cls = shoes.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Are You Sure to Close?")),(Object)(BA.ObjectToCharSequence("")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((shoes.mostCurrent.__c.getField(false,"Null"))),shoes.mostCurrent.activityBA);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 285;BA.debugLine="If cls = DialogResponse.POSITIVE Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_cls,BA.numberCast(double.class, shoes.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 286;BA.debugLine="Activity.Finish";
Debug.ShouldStop(536870912);
shoes.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 288;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnwedgesaccept_click() throws Exception{
try {
		Debug.PushSubsStack("btnwedgesaccept_Click (shoes) ","shoes",3,shoes.mostCurrent.activityBA,shoes.mostCurrent,246);
if (RapidSub.canDelegate("btnwedgesaccept_click")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","btnwedgesaccept_click");}
 BA.debugLineNum = 246;BA.debugLine="Sub btnwedgesaccept_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 247;BA.debugLine="txtshoestot.Text = txtheelsprice.Text + txtwedges";
Debug.ShouldStop(4194304);
shoes.mostCurrent._txtshoestot.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtheelsprice.runMethod(true,"getText")),BA.numberCast(double.class, shoes.mostCurrent._txtwedgesprice.runMethod(true,"getText")),BA.numberCast(double.class, shoes.mostCurrent._txtloafersprice.runMethod(true,"getText"))}, "++",2, 0)));
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnwedgesclear_click() throws Exception{
try {
		Debug.PushSubsStack("btnwedgesclear_Click (shoes) ","shoes",3,shoes.mostCurrent.activityBA,shoes.mostCurrent,160);
if (RapidSub.canDelegate("btnwedgesclear_click")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","btnwedgesclear_click");}
 BA.debugLineNum = 160;BA.debugLine="Sub btnwedgesclear_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 161;BA.debugLine="listwedges.Clear";
Debug.ShouldStop(1);
shoes.mostCurrent._listwedges.runVoidMethod ("Clear");
 BA.debugLineNum = 162;BA.debugLine="txtwedgesquan.Text = 1";
Debug.ShouldStop(2);
shoes.mostCurrent._txtwedgesquan.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(1));
 BA.debugLineNum = 163;BA.debugLine="txtwedgesprice.Text = 0";
Debug.ShouldStop(4);
shoes.mostCurrent._txtwedgesprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 164;BA.debugLine="spinwedges.SelectedIndex = 0";
Debug.ShouldStop(8);
shoes.mostCurrent._spinwedges.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 165;BA.debugLine="imgwedges.Bitmap = LoadBitmap(File.DirAssets, \"wh";
Debug.ShouldStop(16);
shoes.mostCurrent._imgwedges.runMethod(false,"setBitmap",(shoes.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(shoes.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("white.jpg"))).getObject()));
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _compute() throws Exception{
try {
		Debug.PushSubsStack("compute (shoes) ","shoes",3,shoes.mostCurrent.activityBA,shoes.mostCurrent,95);
if (RapidSub.canDelegate("compute")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","compute");}
RemoteObject _inpquan = RemoteObject.createImmutable("");
RemoteObject _squan = RemoteObject.createImmutable("");
RemoteObject _subtotal = RemoteObject.createImmutable(0);
RemoteObject _dprice = RemoteObject.createImmutable(0);
RemoteObject _dquan = RemoteObject.createImmutable(0);
 BA.debugLineNum = 95;BA.debugLine="Sub compute()";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="inpdlg.InputType = inpdlg.INPUT_TYPE_NUMBERS";
Debug.ShouldStop(-2147483648);
shoes.mostCurrent._inpdlg.runMethod(true,"setInputType",shoes.mostCurrent._inpdlg.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 97;BA.debugLine="inpdlg.Input=\"1\"";
Debug.ShouldStop(1);
shoes.mostCurrent._inpdlg.runMethod(true,"setInput",BA.ObjectToString("1"));
 BA.debugLineNum = 98;BA.debugLine="inpdlg.Hint = \"Enter Quantity\"";
Debug.ShouldStop(2);
shoes.mostCurrent._inpdlg.runMethod(true,"setHint",BA.ObjectToString("Enter Quantity"));
 BA.debugLineNum = 99;BA.debugLine="inpdlg.HintColor = Colors.Gray";
Debug.ShouldStop(4);
shoes.mostCurrent._inpdlg.runMethod(true,"setHintColor",shoes.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 101;BA.debugLine="Dim inpquan As String";
Debug.ShouldStop(16);
_inpquan = RemoteObject.createImmutable("");Debug.locals.put("inpquan", _inpquan);
 BA.debugLineNum = 102;BA.debugLine="inpquan = inpdlg.Show (\"Quantity\",myitem,\"OK\",\"Ca";
Debug.ShouldStop(32);
_inpquan = BA.NumberToString(shoes.mostCurrent._inpdlg.runMethodAndSync(true,"Show",(Object)(BA.ObjectToString("Quantity")),(Object)(shoes.mostCurrent._myitem),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),shoes.mostCurrent.activityBA,(Object)((shoes.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("inpquan", _inpquan);
 BA.debugLineNum = 103;BA.debugLine="If inpquan = DialogResponse.POSITIVE Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_inpquan,BA.NumberToString(shoes.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 104;BA.debugLine="If inpdlg.Input = \"\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",shoes.mostCurrent._inpdlg.runMethod(true,"getInput"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 105;BA.debugLine="Msgbox(\"Please Enter Value\",\"\")";
Debug.ShouldStop(256);
shoes.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please Enter Value")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),shoes.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 107;BA.debugLine="Dim squan As String";
Debug.ShouldStop(1024);
_squan = RemoteObject.createImmutable("");Debug.locals.put("squan", _squan);
 BA.debugLineNum = 108;BA.debugLine="squan = inpdlg.Input";
Debug.ShouldStop(2048);
_squan = shoes.mostCurrent._inpdlg.runMethod(true,"getInput");Debug.locals.put("squan", _squan);
 BA.debugLineNum = 110;BA.debugLine="Dim  subtotal As Double";
Debug.ShouldStop(8192);
_subtotal = RemoteObject.createImmutable(0);Debug.locals.put("subtotal", _subtotal);
 BA.debugLineNum = 111;BA.debugLine="Dim dprice As Double : dprice = price1";
Debug.ShouldStop(16384);
_dprice = RemoteObject.createImmutable(0);Debug.locals.put("dprice", _dprice);
 BA.debugLineNum = 111;BA.debugLine="Dim dprice As Double : dprice = price1";
Debug.ShouldStop(16384);
_dprice = BA.numberCast(double.class, shoes.mostCurrent._price1);Debug.locals.put("dprice", _dprice);
 BA.debugLineNum = 112;BA.debugLine="Dim dquan As Double : dquan = squan";
Debug.ShouldStop(32768);
_dquan = RemoteObject.createImmutable(0);Debug.locals.put("dquan", _dquan);
 BA.debugLineNum = 112;BA.debugLine="Dim dquan As Double : dquan = squan";
Debug.ShouldStop(32768);
_dquan = BA.numberCast(double.class, _squan);Debug.locals.put("dquan", _dquan);
 BA.debugLineNum = 113;BA.debugLine="subtotal = dprice * dquan";
Debug.ShouldStop(65536);
_subtotal = RemoteObject.solve(new RemoteObject[] {_dprice,_dquan}, "*",0, 0);Debug.locals.put("subtotal", _subtotal);
 BA.debugLineNum = 115;BA.debugLine="listheels.SingleLineLayout.ItemHeight = 15dip";
Debug.ShouldStop(262144);
shoes.mostCurrent._listheels.runMethod(false,"getSingleLineLayout").runMethod(true,"setItemHeight",shoes.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15))));
 BA.debugLineNum = 116;BA.debugLine="listheels.SingleLineLayout.Label.TextSize = 12";
Debug.ShouldStop(524288);
shoes.mostCurrent._listheels.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 12));
 BA.debugLineNum = 117;BA.debugLine="listheels.SingleLineLayout.Label.Color = Colors";
Debug.ShouldStop(1048576);
shoes.mostCurrent._listheels.runMethod(false,"getSingleLineLayout").getField(false,"Label").runVoidMethod ("setColor",shoes.mostCurrent.__c.getField(false,"Colors").getField(true,"Cyan"));
 BA.debugLineNum = 118;BA.debugLine="listheels.SingleLineLayout.Label.TextColor = Co";
Debug.ShouldStop(2097152);
shoes.mostCurrent._listheels.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",shoes.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 119;BA.debugLine="listheels.AddSingleLine(myitem & \"\" & \"(\" & squ";
Debug.ShouldStop(4194304);
shoes.mostCurrent._listheels.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(shoes.mostCurrent._myitem,RemoteObject.createImmutable(""),RemoteObject.createImmutable("("),_squan,RemoteObject.createImmutable(")"),_subtotal))));
 BA.debugLineNum = 120;BA.debugLine="txtheelsprice.Text = txtheelsprice.Text + subto";
Debug.ShouldStop(8388608);
shoes.mostCurrent._txtheelsprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtheelsprice.runMethod(true,"getText")),_subtotal}, "+",1, 0)));
 };
 };
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private tabshoes As TabHost";
shoes.mostCurrent._tabshoes = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabHostWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private spinheels As Spinner";
shoes.mostCurrent._spinheels = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private imgheels As ImageView";
shoes.mostCurrent._imgheels = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private listheels As ListView";
shoes.mostCurrent._listheels = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim inpdlg As InputDialog";
shoes.mostCurrent._inpdlg = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog");
 //BA.debugLineNum = 21;BA.debugLine="Dim myitem As String";
shoes.mostCurrent._myitem = RemoteObject.createImmutable("");
 //BA.debugLineNum = 22;BA.debugLine="Dim price1 As String";
shoes.mostCurrent._price1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Private txtheelsprice As EditText";
shoes.mostCurrent._txtheelsprice = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private spinwedges As Spinner";
shoes.mostCurrent._spinwedges = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private listwedges As ListView";
shoes.mostCurrent._listwedges = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private txtwedgesprice As EditText";
shoes.mostCurrent._txtwedgesprice = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private txtwedgesquan As EditText";
shoes.mostCurrent._txtwedgesquan = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private imgwedges As ImageView";
shoes.mostCurrent._imgwedges = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private listloafers1 As ListView";
shoes.mostCurrent._listloafers1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private listloafers2 As ListView";
shoes.mostCurrent._listloafers2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private txtloafersprice As EditText";
shoes.mostCurrent._txtloafersprice = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Dim inpdlg2 As InputDialog";
shoes.mostCurrent._inpdlg2 = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog");
 //BA.debugLineNum = 35;BA.debugLine="Dim SelectedItem As Int :SelectedItem = -1";
shoes._selecteditem = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 35;BA.debugLine="Dim SelectedItem As Int :SelectedItem = -1";
shoes._selecteditem = BA.numberCast(int.class, -(double) (0 + 1));
 //BA.debugLineNum = 36;BA.debugLine="Dim SelectedItem2 As Int :SelectedItem2 = -1";
shoes._selecteditem2 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 36;BA.debugLine="Dim SelectedItem2 As Int :SelectedItem2 = -1";
shoes._selecteditem2 = BA.numberCast(int.class, -(double) (0 + 1));
 //BA.debugLineNum = 37;BA.debugLine="Private txtshoestot As EditText";
shoes.mostCurrent._txtshoestot = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _listloafers1_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("listloafers1_ItemClick (shoes) ","shoes",3,shoes.mostCurrent.activityBA,shoes.mostCurrent,168);
if (RapidSub.canDelegate("listloafers1_itemclick")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","listloafers1_itemclick", _position, _value);}
RemoteObject _mysel = null;
RemoteObject _mylist = RemoteObject.createImmutable("");
RemoteObject _myprice = RemoteObject.createImmutable("");
RemoteObject _ret = RemoteObject.createImmutable("");
RemoteObject _quan = RemoteObject.createImmutable("");
RemoteObject _subtot3 = RemoteObject.createImmutable(0);
RemoteObject _dquan = RemoteObject.createImmutable(0);
RemoteObject _dpr = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 168;BA.debugLine="Sub listloafers1_ItemClick (Position As Int, Value";
Debug.ShouldStop(128);
 BA.debugLineNum = 169;BA.debugLine="Dim mysel() As String";
Debug.ShouldStop(256);
_mysel = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("mysel", _mysel);
 BA.debugLineNum = 170;BA.debugLine="Dim mylist As String";
Debug.ShouldStop(512);
_mylist = RemoteObject.createImmutable("");Debug.locals.put("mylist", _mylist);
 BA.debugLineNum = 171;BA.debugLine="Dim myprice As String";
Debug.ShouldStop(1024);
_myprice = RemoteObject.createImmutable("");Debug.locals.put("myprice", _myprice);
 BA.debugLineNum = 172;BA.debugLine="SelectedItem = Position";
Debug.ShouldStop(2048);
shoes._selecteditem = _position;
 BA.debugLineNum = 173;BA.debugLine="mylist = listloafers1.GetItem(SelectedItem)";
Debug.ShouldStop(4096);
_mylist = BA.ObjectToString(shoes.mostCurrent._listloafers1.runMethod(false,"GetItem",(Object)(shoes._selecteditem)));Debug.locals.put("mylist", _mylist);
 BA.debugLineNum = 174;BA.debugLine="mysel = Regex.Split(\" \",mylist)";
Debug.ShouldStop(8192);
_mysel = shoes.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(" ")),(Object)(_mylist));Debug.locals.put("mysel", _mysel);
 BA.debugLineNum = 175;BA.debugLine="listloafers2.SingleLineLayout.ItemHeight = 15dip";
Debug.ShouldStop(16384);
shoes.mostCurrent._listloafers2.runMethod(false,"getSingleLineLayout").runMethod(true,"setItemHeight",shoes.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15))));
 BA.debugLineNum = 176;BA.debugLine="listloafers2.SingleLineLayout.Label.TextSize = 12";
Debug.ShouldStop(32768);
shoes.mostCurrent._listloafers2.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 12));
 BA.debugLineNum = 177;BA.debugLine="listloafers2.SingleLineLayout.Label.Color = Color";
Debug.ShouldStop(65536);
shoes.mostCurrent._listloafers2.runMethod(false,"getSingleLineLayout").getField(false,"Label").runVoidMethod ("setColor",shoes.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 178;BA.debugLine="listloafers2.SingleLineLayout.Label.TextColor = C";
Debug.ShouldStop(131072);
shoes.mostCurrent._listloafers2.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",shoes.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 179;BA.debugLine="myprice = mysel(1)";
Debug.ShouldStop(262144);
_myprice = _mysel.getArrayElement(true,BA.numberCast(int.class, 1));Debug.locals.put("myprice", _myprice);
 BA.debugLineNum = 181;BA.debugLine="Dim ret As String";
Debug.ShouldStop(1048576);
_ret = RemoteObject.createImmutable("");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 182;BA.debugLine="inpdlg2.InputType = inpdlg2.INPUT_TYPE_NUMBERS";
Debug.ShouldStop(2097152);
shoes.mostCurrent._inpdlg2.runMethod(true,"setInputType",shoes.mostCurrent._inpdlg2.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 183;BA.debugLine="inpdlg2.Input = \"\"";
Debug.ShouldStop(4194304);
shoes.mostCurrent._inpdlg2.runMethod(true,"setInput",BA.ObjectToString(""));
 BA.debugLineNum = 184;BA.debugLine="inpdlg2.Hint = \"Enter Quantity\"";
Debug.ShouldStop(8388608);
shoes.mostCurrent._inpdlg2.runMethod(true,"setHint",BA.ObjectToString("Enter Quantity"));
 BA.debugLineNum = 185;BA.debugLine="inpdlg2.HintColor = Colors.Gray";
Debug.ShouldStop(16777216);
shoes.mostCurrent._inpdlg2.runMethod(true,"setHintColor",shoes.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 186;BA.debugLine="ret = inpdlg2.Show(\"Quantity\",mylist,\"OK\",\"Cancel";
Debug.ShouldStop(33554432);
_ret = BA.NumberToString(shoes.mostCurrent._inpdlg2.runMethodAndSync(true,"Show",(Object)(BA.ObjectToString("Quantity")),(Object)(_mylist),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),shoes.mostCurrent.activityBA,(Object)((shoes.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 187;BA.debugLine="If ret = DialogResponse.POSITIVE Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_ret,BA.NumberToString(shoes.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 188;BA.debugLine="If inpdlg2.Input = \"\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",shoes.mostCurrent._inpdlg2.runMethod(true,"getInput"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 189;BA.debugLine="Msgbox(\"Please enter value\",\"\")";
Debug.ShouldStop(268435456);
shoes.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please enter value")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),shoes.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 191;BA.debugLine="inpdlg2.InputType = inpdlg2.INPUT_TYPE_NUMBERS";
Debug.ShouldStop(1073741824);
shoes.mostCurrent._inpdlg2.runMethod(true,"setInputType",shoes.mostCurrent._inpdlg2.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 192;BA.debugLine="Dim quan As String";
Debug.ShouldStop(-2147483648);
_quan = RemoteObject.createImmutable("");Debug.locals.put("quan", _quan);
 BA.debugLineNum = 193;BA.debugLine="quan = inpdlg2.Input";
Debug.ShouldStop(1);
_quan = shoes.mostCurrent._inpdlg2.runMethod(true,"getInput");Debug.locals.put("quan", _quan);
 BA.debugLineNum = 194;BA.debugLine="Dim subtot3 As Double";
Debug.ShouldStop(2);
_subtot3 = RemoteObject.createImmutable(0);Debug.locals.put("subtot3", _subtot3);
 BA.debugLineNum = 195;BA.debugLine="Dim dquan As Double : dquan = quan";
Debug.ShouldStop(4);
_dquan = RemoteObject.createImmutable(0);Debug.locals.put("dquan", _dquan);
 BA.debugLineNum = 195;BA.debugLine="Dim dquan As Double : dquan = quan";
Debug.ShouldStop(4);
_dquan = BA.numberCast(double.class, _quan);Debug.locals.put("dquan", _dquan);
 BA.debugLineNum = 196;BA.debugLine="Dim dpr As Double : dpr = myprice";
Debug.ShouldStop(8);
_dpr = RemoteObject.createImmutable(0);Debug.locals.put("dpr", _dpr);
 BA.debugLineNum = 196;BA.debugLine="Dim dpr As Double : dpr = myprice";
Debug.ShouldStop(8);
_dpr = BA.numberCast(double.class, _myprice);Debug.locals.put("dpr", _dpr);
 BA.debugLineNum = 197;BA.debugLine="subtot3 = dquan * dpr";
Debug.ShouldStop(16);
_subtot3 = RemoteObject.solve(new RemoteObject[] {_dquan,_dpr}, "*",0, 0);Debug.locals.put("subtot3", _subtot3);
 BA.debugLineNum = 198;BA.debugLine="txtloafersprice.Text = txtloafersprice.Text + s";
Debug.ShouldStop(32);
shoes.mostCurrent._txtloafersprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtloafersprice.runMethod(true,"getText")),_subtot3}, "+",1, 0)));
 BA.debugLineNum = 199;BA.debugLine="listloafers2.AddSingleLine(mylist & \" \" & \"(\" &";
Debug.ShouldStop(64);
shoes.mostCurrent._listloafers2.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_mylist,RemoteObject.createImmutable(" "),RemoteObject.createImmutable("("),_quan,RemoteObject.createImmutable(")"),RemoteObject.createImmutable(" "),_subtot3))));
 };
 };
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listloafers2_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("listloafers2_ItemClick (shoes) ","shoes",3,shoes.mostCurrent.activityBA,shoes.mostCurrent,211);
if (RapidSub.canDelegate("listloafers2_itemclick")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","listloafers2_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 211;BA.debugLine="Sub listloafers2_ItemClick (Position As Int, Value";
Debug.ShouldStop(262144);
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listloafers2_itemlongclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("listloafers2_ItemLongClick (shoes) ","shoes",3,shoes.mostCurrent.activityBA,shoes.mostCurrent,220);
if (RapidSub.canDelegate("listloafers2_itemlongclick")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","listloafers2_itemlongclick", _position, _value);}
RemoteObject _mysel = null;
RemoteObject _mydel = RemoteObject.createImmutable("");
RemoteObject _subdel = RemoteObject.createImmutable("");
RemoteObject _ques = RemoteObject.createImmutable(0);
RemoteObject _dsubdel = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 220;BA.debugLine="Sub listloafers2_ItemLongClick (Position As Int, V";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 221;BA.debugLine="If SelectedItem<0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("<",shoes._selecteditem,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 222;BA.debugLine="Msgbox(\"Please choose among the list first\",\"\")";
Debug.ShouldStop(536870912);
shoes.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please choose among the list first")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),shoes.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 224;BA.debugLine="Dim mysel() As String";
Debug.ShouldStop(-2147483648);
_mysel = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("mysel", _mysel);
 BA.debugLineNum = 225;BA.debugLine="Dim mydel As String";
Debug.ShouldStop(1);
_mydel = RemoteObject.createImmutable("");Debug.locals.put("mydel", _mydel);
 BA.debugLineNum = 226;BA.debugLine="Dim subdel As String";
Debug.ShouldStop(2);
_subdel = RemoteObject.createImmutable("");Debug.locals.put("subdel", _subdel);
 BA.debugLineNum = 227;BA.debugLine="SelectedItem2 = Position";
Debug.ShouldStop(4);
shoes._selecteditem2 = _position;
 BA.debugLineNum = 228;BA.debugLine="mydel = listloafers2.GetItem(SelectedItem2)";
Debug.ShouldStop(8);
_mydel = BA.ObjectToString(shoes.mostCurrent._listloafers2.runMethod(false,"GetItem",(Object)(shoes._selecteditem2)));Debug.locals.put("mydel", _mydel);
 BA.debugLineNum = 229;BA.debugLine="mysel = Regex.Split(\" \",mydel)";
Debug.ShouldStop(16);
_mysel = shoes.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(" ")),(Object)(_mydel));Debug.locals.put("mysel", _mysel);
 BA.debugLineNum = 230;BA.debugLine="subdel = mysel(3)";
Debug.ShouldStop(32);
_subdel = _mysel.getArrayElement(true,BA.numberCast(int.class, 3));Debug.locals.put("subdel", _subdel);
 BA.debugLineNum = 231;BA.debugLine="Dim ques As Int";
Debug.ShouldStop(64);
_ques = RemoteObject.createImmutable(0);Debug.locals.put("ques", _ques);
 BA.debugLineNum = 232;BA.debugLine="ques = Msgbox2(\"Delete\" & mydel,\"Remove Item\",\"O";
Debug.ShouldStop(128);
_ques = shoes.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Delete"),_mydel))),(Object)(BA.ObjectToCharSequence("Remove Item")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((shoes.mostCurrent.__c.getField(false,"Null"))),shoes.mostCurrent.activityBA);Debug.locals.put("ques", _ques);
 BA.debugLineNum = 233;BA.debugLine="If ques = DialogResponse.POSITIVE Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_ques,BA.numberCast(double.class, shoes.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 234;BA.debugLine="listloafers2.RemoveAt(SelectedItem2)";
Debug.ShouldStop(512);
shoes.mostCurrent._listloafers2.runVoidMethod ("RemoveAt",(Object)(shoes._selecteditem2));
 BA.debugLineNum = 235;BA.debugLine="Dim SelectedItem2 As Int : SelectedItem2 = -1";
Debug.ShouldStop(1024);
shoes._selecteditem2 = RemoteObject.createImmutable(0);
 BA.debugLineNum = 235;BA.debugLine="Dim SelectedItem2 As Int : SelectedItem2 = -1";
Debug.ShouldStop(1024);
shoes._selecteditem2 = BA.numberCast(int.class, -(double) (0 + 1));
 BA.debugLineNum = 236;BA.debugLine="Dim dsubdel As Double : dsubdel = subdel";
Debug.ShouldStop(2048);
_dsubdel = RemoteObject.createImmutable(0);Debug.locals.put("dsubdel", _dsubdel);
 BA.debugLineNum = 236;BA.debugLine="Dim dsubdel As Double : dsubdel = subdel";
Debug.ShouldStop(2048);
_dsubdel = BA.numberCast(double.class, _subdel);Debug.locals.put("dsubdel", _dsubdel);
 BA.debugLineNum = 237;BA.debugLine="txtloafersprice.Text = txtloafersprice.Text - d";
Debug.ShouldStop(4096);
shoes.mostCurrent._txtloafersprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtloafersprice.runMethod(true,"getText")),_dsubdel}, "-",1, 0)));
 };
 };
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _spinheels_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spinheels_ItemClick (shoes) ","shoes",3,shoes.mostCurrent.activityBA,shoes.mostCurrent,73);
if (RapidSub.canDelegate("spinheels_itemclick")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","spinheels_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 73;BA.debugLine="Sub spinheels_ItemClick (Position As Int, Value As";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="If spinheels.SelectedIndex = 1 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",shoes.mostCurrent._spinheels.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 75;BA.debugLine="imgheels.Bitmap = LoadBitmap(File.DirAssets, \"he";
Debug.ShouldStop(1024);
shoes.mostCurrent._imgheels.runMethod(false,"setBitmap",(shoes.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(shoes.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("heels1.jpg"))).getObject()));
 BA.debugLineNum = 76;BA.debugLine="myitem = \"Heels 1=100\"";
Debug.ShouldStop(2048);
shoes.mostCurrent._myitem = BA.ObjectToString("Heels 1=100");
 BA.debugLineNum = 77;BA.debugLine="price1 = 100";
Debug.ShouldStop(4096);
shoes.mostCurrent._price1 = BA.NumberToString(100);
 BA.debugLineNum = 78;BA.debugLine="spinheels.SelectedIndex = 0";
Debug.ShouldStop(8192);
shoes.mostCurrent._spinheels.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 79;BA.debugLine="compute";
Debug.ShouldStop(16384);
_compute();
 }else 
{ BA.debugLineNum = 80;BA.debugLine="Else If spinheels.SelectedIndex = 2 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",shoes.mostCurrent._spinheels.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 81;BA.debugLine="imgheels.Bitmap = LoadBitmap(File.DirAssets, \"he";
Debug.ShouldStop(65536);
shoes.mostCurrent._imgheels.runMethod(false,"setBitmap",(shoes.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(shoes.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("heels2.jpg"))).getObject()));
 BA.debugLineNum = 82;BA.debugLine="myitem = \"Heels 2=120\"";
Debug.ShouldStop(131072);
shoes.mostCurrent._myitem = BA.ObjectToString("Heels 2=120");
 BA.debugLineNum = 83;BA.debugLine="price1 = 120";
Debug.ShouldStop(262144);
shoes.mostCurrent._price1 = BA.NumberToString(120);
 BA.debugLineNum = 84;BA.debugLine="spinheels.SelectedIndex = 0";
Debug.ShouldStop(524288);
shoes.mostCurrent._spinheels.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 85;BA.debugLine="compute";
Debug.ShouldStop(1048576);
_compute();
 }else 
{ BA.debugLineNum = 86;BA.debugLine="Else If spinheels.SelectedIndex = 3 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",shoes.mostCurrent._spinheels.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 87;BA.debugLine="imgheels.Bitmap = LoadBitmap(File.DirAssets, \"he";
Debug.ShouldStop(4194304);
shoes.mostCurrent._imgheels.runMethod(false,"setBitmap",(shoes.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(shoes.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("heels3.jpg"))).getObject()));
 BA.debugLineNum = 88;BA.debugLine="myitem = \"Heels 3=140\"";
Debug.ShouldStop(8388608);
shoes.mostCurrent._myitem = BA.ObjectToString("Heels 3=140");
 BA.debugLineNum = 89;BA.debugLine="price1 = 140";
Debug.ShouldStop(16777216);
shoes.mostCurrent._price1 = BA.NumberToString(140);
 BA.debugLineNum = 90;BA.debugLine="spinheels.SelectedIndex = 0";
Debug.ShouldStop(33554432);
shoes.mostCurrent._spinheels.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 91;BA.debugLine="compute";
Debug.ShouldStop(67108864);
_compute();
 }}}
;
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinwedges_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spinwedges_ItemClick (shoes) ","shoes",3,shoes.mostCurrent.activityBA,shoes.mostCurrent,132);
if (RapidSub.canDelegate("spinwedges_itemclick")) { return b4a.example.shoes.remoteMe.runUserSub(false, "shoes","spinwedges_itemclick", _position, _value);}
RemoteObject _wedges = RemoteObject.createImmutable("");
RemoteObject _price2 = RemoteObject.createImmutable(0);
RemoteObject _total2 = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 132;BA.debugLine="Sub spinwedges_ItemClick (Position As Int, Value A";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="Dim wedges As String";
Debug.ShouldStop(16);
_wedges = RemoteObject.createImmutable("");Debug.locals.put("wedges", _wedges);
 BA.debugLineNum = 134;BA.debugLine="Dim price2, total2 As Double";
Debug.ShouldStop(32);
_price2 = RemoteObject.createImmutable(0);Debug.locals.put("price2", _price2);
_total2 = RemoteObject.createImmutable(0);Debug.locals.put("total2", _total2);
 BA.debugLineNum = 136;BA.debugLine="If spinwedges.SelectedIndex = 1 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",shoes.mostCurrent._spinwedges.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 137;BA.debugLine="imgwedges.Bitmap = LoadBitmap(File.DirAssets, \"w";
Debug.ShouldStop(256);
shoes.mostCurrent._imgwedges.runMethod(false,"setBitmap",(shoes.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(shoes.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("wedges1.jpg"))).getObject()));
 BA.debugLineNum = 138;BA.debugLine="wedges = \"Wedges 1 =160\"";
Debug.ShouldStop(512);
_wedges = BA.ObjectToString("Wedges 1 =160");Debug.locals.put("wedges", _wedges);
 BA.debugLineNum = 139;BA.debugLine="price2 = 160";
Debug.ShouldStop(1024);
_price2 = BA.numberCast(double.class, 160);Debug.locals.put("price2", _price2);
 }else 
{ BA.debugLineNum = 140;BA.debugLine="Else If spinwedges.SelectedIndex = 2 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",shoes.mostCurrent._spinwedges.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 141;BA.debugLine="imgwedges.Bitmap = LoadBitmap(File.DirAssets, \"w";
Debug.ShouldStop(4096);
shoes.mostCurrent._imgwedges.runMethod(false,"setBitmap",(shoes.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(shoes.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("wedges2.jpg"))).getObject()));
 BA.debugLineNum = 142;BA.debugLine="wedges = \"Wedges 2 =180\"";
Debug.ShouldStop(8192);
_wedges = BA.ObjectToString("Wedges 2 =180");Debug.locals.put("wedges", _wedges);
 BA.debugLineNum = 143;BA.debugLine="price2 = 180";
Debug.ShouldStop(16384);
_price2 = BA.numberCast(double.class, 180);Debug.locals.put("price2", _price2);
 }else 
{ BA.debugLineNum = 144;BA.debugLine="Else If spinwedges.SelectedIndex = 3 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",shoes.mostCurrent._spinwedges.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 145;BA.debugLine="imgwedges.Bitmap = LoadBitmap(File.DirAssets, \"w";
Debug.ShouldStop(65536);
shoes.mostCurrent._imgwedges.runMethod(false,"setBitmap",(shoes.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(shoes.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("wedges3.jpg"))).getObject()));
 BA.debugLineNum = 146;BA.debugLine="wedges = \"Wedges 3 =200\"";
Debug.ShouldStop(131072);
_wedges = BA.ObjectToString("Wedges 3 =200");Debug.locals.put("wedges", _wedges);
 BA.debugLineNum = 147;BA.debugLine="price2 = 200";
Debug.ShouldStop(262144);
_price2 = BA.numberCast(double.class, 200);Debug.locals.put("price2", _price2);
 }}}
;
 BA.debugLineNum = 149;BA.debugLine="total2 = price2 * txtwedgesquan.Text";
Debug.ShouldStop(1048576);
_total2 = RemoteObject.solve(new RemoteObject[] {_price2,BA.numberCast(double.class, shoes.mostCurrent._txtwedgesquan.runMethod(true,"getText"))}, "*",0, 0);Debug.locals.put("total2", _total2);
 BA.debugLineNum = 150;BA.debugLine="txtwedgesprice.Text = txtwedgesprice.Text + total";
Debug.ShouldStop(2097152);
shoes.mostCurrent._txtwedgesprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, shoes.mostCurrent._txtwedgesprice.runMethod(true,"getText")),_total2}, "+",1, 0)));
 BA.debugLineNum = 151;BA.debugLine="listwedges.SingleLineLayout.ItemHeight = 15dip";
Debug.ShouldStop(4194304);
shoes.mostCurrent._listwedges.runMethod(false,"getSingleLineLayout").runMethod(true,"setItemHeight",shoes.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15))));
 BA.debugLineNum = 152;BA.debugLine="listwedges.SingleLineLayout.Label.TextSize = 12";
Debug.ShouldStop(8388608);
shoes.mostCurrent._listwedges.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 12));
 BA.debugLineNum = 153;BA.debugLine="listwedges.SingleLineLayout.Label.Color = Colors.";
Debug.ShouldStop(16777216);
shoes.mostCurrent._listwedges.runMethod(false,"getSingleLineLayout").getField(false,"Label").runVoidMethod ("setColor",shoes.mostCurrent.__c.getField(false,"Colors").getField(true,"Cyan"));
 BA.debugLineNum = 154;BA.debugLine="listwedges.SingleLineLayout.Label.TextColor = Col";
Debug.ShouldStop(33554432);
shoes.mostCurrent._listwedges.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",shoes.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 155;BA.debugLine="listwedges.AddSingleLine(wedges & \"\" & \" (\" & txt";
Debug.ShouldStop(67108864);
shoes.mostCurrent._listwedges.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_wedges,RemoteObject.createImmutable(""),RemoteObject.createImmutable(" ("),shoes.mostCurrent._txtwedgesquan.runMethod(true,"getText"),RemoteObject.createImmutable(") "),_total2))));
 BA.debugLineNum = 156;BA.debugLine="spinwedges.SelectedIndex = 0";
Debug.ShouldStop(134217728);
shoes.mostCurrent._spinwedges.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 157;BA.debugLine="txtwedgesquan.Text = \"1\"";
Debug.ShouldStop(268435456);
shoes.mostCurrent._txtwedgesquan.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("1"));
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}