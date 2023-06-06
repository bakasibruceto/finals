package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clothes_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (clothes) ","clothes",2,clothes.mostCurrent.activityBA,clothes.mostCurrent,33);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.clothes.remoteMe.runUserSub(false, "clothes","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="Activity.LoadLayout(\"layclothes\")";
Debug.ShouldStop(2);
clothes.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layclothes")),clothes.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="tabclothes.AddTab(\"Blouse\", \"layblouse.bal\")";
Debug.ShouldStop(4);
clothes.mostCurrent._tabclothes.runVoidMethodAndSync ("AddTab",clothes.mostCurrent.activityBA,(Object)(BA.ObjectToString("Blouse")),(Object)(RemoteObject.createImmutable("layblouse.bal")));
 BA.debugLineNum = 36;BA.debugLine="tabclothes.AddTab(\"Pants\", \"laypants.bal\")";
Debug.ShouldStop(8);
clothes.mostCurrent._tabclothes.runVoidMethodAndSync ("AddTab",clothes.mostCurrent.activityBA,(Object)(BA.ObjectToString("Pants")),(Object)(RemoteObject.createImmutable("laypants.bal")));
 BA.debugLineNum = 37;BA.debugLine="tabclothes.AddTab(\"Shorts\", \"layshorts.bal\")";
Debug.ShouldStop(16);
clothes.mostCurrent._tabclothes.runVoidMethodAndSync ("AddTab",clothes.mostCurrent.activityBA,(Object)(BA.ObjectToString("Shorts")),(Object)(RemoteObject.createImmutable("layshorts.bal")));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Pause (clothes) ","clothes",2,clothes.mostCurrent.activityBA,clothes.mostCurrent,44);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.clothes.remoteMe.runUserSub(false, "clothes","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 44;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Activity_Resume (clothes) ","clothes",2,clothes.mostCurrent.activityBA,clothes.mostCurrent,40);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.clothes.remoteMe.runUserSub(false, "clothes","activity_resume");}
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnblouseaccept_click() throws Exception{
try {
		Debug.PushSubsStack("btnblouseaccept_Click (clothes) ","clothes",2,clothes.mostCurrent.activityBA,clothes.mostCurrent,129);
if (RapidSub.canDelegate("btnblouseaccept_click")) { return b4a.example.clothes.remoteMe.runUserSub(false, "clothes","btnblouseaccept_click");}
 BA.debugLineNum = 129;BA.debugLine="Sub btnblouseaccept_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="txtclothestot.Text = txtblouseprice.Text + txtpan";
Debug.ShouldStop(2);
clothes.mostCurrent._txtclothestot.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, clothes.mostCurrent._txtblouseprice.runMethod(true,"getText")),BA.numberCast(double.class, clothes.mostCurrent._txtpantsprice.runMethod(true,"getText")),BA.numberCast(double.class, clothes.mostCurrent._txtshortsprice.runMethod(true,"getText"))}, "++",2, 0)));
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnblouseclear_click() throws Exception{
try {
		Debug.PushSubsStack("btnblouseclear_Click (clothes) ","clothes",2,clothes.mostCurrent.activityBA,clothes.mostCurrent,108);
if (RapidSub.canDelegate("btnblouseclear_click")) { return b4a.example.clothes.remoteMe.runUserSub(false, "clothes","btnblouseclear_click");}
 BA.debugLineNum = 108;BA.debugLine="Sub btnblouseclear_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="chkblouse1.Checked = False";
Debug.ShouldStop(4096);
clothes.mostCurrent._chkblouse1.runMethodAndSync(true,"setChecked",clothes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 110;BA.debugLine="chkblouse2.Checked = False";
Debug.ShouldStop(8192);
clothes.mostCurrent._chkblouse2.runMethodAndSync(true,"setChecked",clothes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 111;BA.debugLine="chkblouse3.Checked = False";
Debug.ShouldStop(16384);
clothes.mostCurrent._chkblouse3.runMethodAndSync(true,"setChecked",clothes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 112;BA.debugLine="txtblouseprice.Text = 0";
Debug.ShouldStop(32768);
clothes.mostCurrent._txtblouseprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnclothesaccept_click() throws Exception{
try {
		Debug.PushSubsStack("btnclothesaccept_Click (clothes) ","clothes",2,clothes.mostCurrent.activityBA,clothes.mostCurrent,161);
if (RapidSub.canDelegate("btnclothesaccept_click")) { return b4a.example.clothes.remoteMe.runUserSub(false, "clothes","btnclothesaccept_click");}
RemoteObject _acc = RemoteObject.createImmutable(0);
 BA.debugLineNum = 161;BA.debugLine="Sub btnclothesaccept_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="Dim acc As Int";
Debug.ShouldStop(2);
_acc = RemoteObject.createImmutable(0);Debug.locals.put("acc", _acc);
 BA.debugLineNum = 163;BA.debugLine="acc = Msgbox2(\"Are You Sure to Accept?\",\"\",\"Yes\",";
Debug.ShouldStop(4);
_acc = clothes.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Are You Sure to Accept?")),(Object)(BA.ObjectToCharSequence("")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((clothes.mostCurrent.__c.getField(false,"Null"))),clothes.mostCurrent.activityBA);Debug.locals.put("acc", _acc);
 BA.debugLineNum = 164;BA.debugLine="If acc = DialogResponse.POSITIVE Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_acc,BA.numberCast(double.class, clothes.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 165;BA.debugLine="Main.totclothes = txtclothestot.Text";
Debug.ShouldStop(16);
clothes.mostCurrent._main._totclothes /*RemoteObject*/  = clothes.mostCurrent._txtclothestot.runMethod(true,"getText");
 };
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnclothesclear_click() throws Exception{
try {
		Debug.PushSubsStack("btnclothesclear_Click (clothes) ","clothes",2,clothes.mostCurrent.activityBA,clothes.mostCurrent,141);
if (RapidSub.canDelegate("btnclothesclear_click")) { return b4a.example.clothes.remoteMe.runUserSub(false, "clothes","btnclothesclear_click");}
RemoteObject _clear = RemoteObject.createImmutable(0);
 BA.debugLineNum = 141;BA.debugLine="Sub btnclothesclear_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="Dim clear As Int";
Debug.ShouldStop(8192);
_clear = RemoteObject.createImmutable(0);Debug.locals.put("clear", _clear);
 BA.debugLineNum = 143;BA.debugLine="clear = Msgbox2(\"Are You Sure to Clear?\",\"\",\"Yes\"";
Debug.ShouldStop(16384);
_clear = clothes.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Are You Sure to Clear?")),(Object)(BA.ObjectToCharSequence("")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((clothes.mostCurrent.__c.getField(false,"Null"))),clothes.mostCurrent.activityBA);Debug.locals.put("clear", _clear);
 BA.debugLineNum = 144;BA.debugLine="If clear = DialogResponse.POSITIVE Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_clear,BA.numberCast(double.class, clothes.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 145;BA.debugLine="chkblouse1.Checked = False";
Debug.ShouldStop(65536);
clothes.mostCurrent._chkblouse1.runMethodAndSync(true,"setChecked",clothes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 146;BA.debugLine="chkblouse2.Checked = False";
Debug.ShouldStop(131072);
clothes.mostCurrent._chkblouse2.runMethodAndSync(true,"setChecked",clothes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 147;BA.debugLine="chkblouse3.Checked = False";
Debug.ShouldStop(262144);
clothes.mostCurrent._chkblouse3.runMethodAndSync(true,"setChecked",clothes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 148;BA.debugLine="txtblouseprice.Text = 0";
Debug.ShouldStop(524288);
clothes.mostCurrent._txtblouseprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 149;BA.debugLine="rdbpants1.Checked = False";
Debug.ShouldStop(1048576);
clothes.mostCurrent._rdbpants1.runMethodAndSync(true,"setChecked",clothes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 150;BA.debugLine="rdbpants2.Checked = False";
Debug.ShouldStop(2097152);
clothes.mostCurrent._rdbpants2.runMethodAndSync(true,"setChecked",clothes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 151;BA.debugLine="rdbpants3.Checked = False";
Debug.ShouldStop(4194304);
clothes.mostCurrent._rdbpants3.runMethodAndSync(true,"setChecked",clothes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 152;BA.debugLine="txtpantsprice.Text = 0";
Debug.ShouldStop(8388608);
clothes.mostCurrent._txtpantsprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 153;BA.debugLine="chkshorts1.Checked = False";
Debug.ShouldStop(16777216);
clothes.mostCurrent._chkshorts1.runMethodAndSync(true,"setChecked",clothes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 154;BA.debugLine="chkshorts2.Checked = False";
Debug.ShouldStop(33554432);
clothes.mostCurrent._chkshorts2.runMethodAndSync(true,"setChecked",clothes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 155;BA.debugLine="chkshorts3.Checked = False";
Debug.ShouldStop(67108864);
clothes.mostCurrent._chkshorts3.runMethodAndSync(true,"setChecked",clothes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 156;BA.debugLine="txtshortsprice.Text = 0";
Debug.ShouldStop(134217728);
clothes.mostCurrent._txtshortsprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 157;BA.debugLine="txtclothestot.Text = 0";
Debug.ShouldStop(268435456);
clothes.mostCurrent._txtclothestot.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 };
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnclothesclose_click() throws Exception{
try {
		Debug.PushSubsStack("btnclothesclose_Click (clothes) ","clothes",2,clothes.mostCurrent.activityBA,clothes.mostCurrent,169);
if (RapidSub.canDelegate("btnclothesclose_click")) { return b4a.example.clothes.remoteMe.runUserSub(false, "clothes","btnclothesclose_click");}
RemoteObject _cls = RemoteObject.createImmutable(0);
 BA.debugLineNum = 169;BA.debugLine="Sub btnclothesclose_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="Dim cls As Int";
Debug.ShouldStop(512);
_cls = RemoteObject.createImmutable(0);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 171;BA.debugLine="cls = Msgbox2(\"Are You Sure to Close?\",\"\",\"Yes\",\"";
Debug.ShouldStop(1024);
_cls = clothes.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Are You Sure to Close?")),(Object)(BA.ObjectToCharSequence("")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((clothes.mostCurrent.__c.getField(false,"Null"))),clothes.mostCurrent.activityBA);Debug.locals.put("cls", _cls);
 BA.debugLineNum = 172;BA.debugLine="If cls = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_cls,BA.numberCast(double.class, clothes.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 173;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
clothes.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnpantsaccept_click() throws Exception{
try {
		Debug.PushSubsStack("btnpantsaccept_Click (clothes) ","clothes",2,clothes.mostCurrent.activityBA,clothes.mostCurrent,133);
if (RapidSub.canDelegate("btnpantsaccept_click")) { return b4a.example.clothes.remoteMe.runUserSub(false, "clothes","btnpantsaccept_click");}
 BA.debugLineNum = 133;BA.debugLine="Sub btnpantsaccept_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 134;BA.debugLine="txtclothestot.Text = txtblouseprice.Text + txtpan";
Debug.ShouldStop(32);
clothes.mostCurrent._txtclothestot.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, clothes.mostCurrent._txtblouseprice.runMethod(true,"getText")),BA.numberCast(double.class, clothes.mostCurrent._txtpantsprice.runMethod(true,"getText")),BA.numberCast(double.class, clothes.mostCurrent._txtshortsprice.runMethod(true,"getText"))}, "++",2, 0)));
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnpantsclear_click() throws Exception{
try {
		Debug.PushSubsStack("btnpantsclear_Click (clothes) ","clothes",2,clothes.mostCurrent.activityBA,clothes.mostCurrent,115);
if (RapidSub.canDelegate("btnpantsclear_click")) { return b4a.example.clothes.remoteMe.runUserSub(false, "clothes","btnpantsclear_click");}
 BA.debugLineNum = 115;BA.debugLine="Sub btnpantsclear_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="rdbpants1.Checked = False";
Debug.ShouldStop(524288);
clothes.mostCurrent._rdbpants1.runMethodAndSync(true,"setChecked",clothes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 117;BA.debugLine="rdbpants2.Checked = False";
Debug.ShouldStop(1048576);
clothes.mostCurrent._rdbpants2.runMethodAndSync(true,"setChecked",clothes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 118;BA.debugLine="rdbpants3.Checked = False";
Debug.ShouldStop(2097152);
clothes.mostCurrent._rdbpants3.runMethodAndSync(true,"setChecked",clothes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 119;BA.debugLine="txtpantsprice.Text = 0";
Debug.ShouldStop(4194304);
clothes.mostCurrent._txtpantsprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnshortsaccept_click() throws Exception{
try {
		Debug.PushSubsStack("btnshortsaccept_Click (clothes) ","clothes",2,clothes.mostCurrent.activityBA,clothes.mostCurrent,137);
if (RapidSub.canDelegate("btnshortsaccept_click")) { return b4a.example.clothes.remoteMe.runUserSub(false, "clothes","btnshortsaccept_click");}
 BA.debugLineNum = 137;BA.debugLine="Sub btnshortsaccept_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 138;BA.debugLine="txtclothestot.Text = txtblouseprice.Text + txtpan";
Debug.ShouldStop(512);
clothes.mostCurrent._txtclothestot.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, clothes.mostCurrent._txtblouseprice.runMethod(true,"getText")),BA.numberCast(double.class, clothes.mostCurrent._txtpantsprice.runMethod(true,"getText")),BA.numberCast(double.class, clothes.mostCurrent._txtshortsprice.runMethod(true,"getText"))}, "++",2, 0)));
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnshortsclear_click() throws Exception{
try {
		Debug.PushSubsStack("btnshortsclear_Click (clothes) ","clothes",2,clothes.mostCurrent.activityBA,clothes.mostCurrent,122);
if (RapidSub.canDelegate("btnshortsclear_click")) { return b4a.example.clothes.remoteMe.runUserSub(false, "clothes","btnshortsclear_click");}
 BA.debugLineNum = 122;BA.debugLine="Sub btnshortsclear_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="chkshorts1.Checked = False";
Debug.ShouldStop(67108864);
clothes.mostCurrent._chkshorts1.runMethodAndSync(true,"setChecked",clothes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 124;BA.debugLine="chkshorts2.Checked = False";
Debug.ShouldStop(134217728);
clothes.mostCurrent._chkshorts2.runMethodAndSync(true,"setChecked",clothes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 125;BA.debugLine="chkshorts3.Checked = False";
Debug.ShouldStop(268435456);
clothes.mostCurrent._chkshorts3.runMethodAndSync(true,"setChecked",clothes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 126;BA.debugLine="txtshortsprice.Text = 0";
Debug.ShouldStop(536870912);
clothes.mostCurrent._txtshortsprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chkblouse1_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkblouse1_CheckedChange (clothes) ","clothes",2,clothes.mostCurrent.activityBA,clothes.mostCurrent,48);
if (RapidSub.canDelegate("chkblouse1_checkedchange")) { return b4a.example.clothes.remoteMe.runUserSub(false, "clothes","chkblouse1_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 48;BA.debugLine="Sub chkblouse1_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="If chkblouse1.Checked = True Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",clothes.mostCurrent._chkblouse1.runMethod(true,"getChecked"),clothes.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 50;BA.debugLine="txtblouseprice.Text = txtblouseprice.Text + 200";
Debug.ShouldStop(131072);
clothes.mostCurrent._txtblouseprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, clothes.mostCurrent._txtblouseprice.runMethod(true,"getText")),RemoteObject.createImmutable(200)}, "+",1, 0)));
 }else {
 BA.debugLineNum = 52;BA.debugLine="txtblouseprice.Text = txtblouseprice.Text - 200";
Debug.ShouldStop(524288);
clothes.mostCurrent._txtblouseprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, clothes.mostCurrent._txtblouseprice.runMethod(true,"getText")),RemoteObject.createImmutable(200)}, "-",1, 0)));
 };
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chkblouse2_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkblouse2_CheckedChange (clothes) ","clothes",2,clothes.mostCurrent.activityBA,clothes.mostCurrent,56);
if (RapidSub.canDelegate("chkblouse2_checkedchange")) { return b4a.example.clothes.remoteMe.runUserSub(false, "clothes","chkblouse2_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 56;BA.debugLine="Sub chkblouse2_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="If chkblouse2.Checked = True Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",clothes.mostCurrent._chkblouse2.runMethod(true,"getChecked"),clothes.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 58;BA.debugLine="txtblouseprice.Text = txtblouseprice.Text + 250";
Debug.ShouldStop(33554432);
clothes.mostCurrent._txtblouseprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, clothes.mostCurrent._txtblouseprice.runMethod(true,"getText")),RemoteObject.createImmutable(250)}, "+",1, 0)));
 }else {
 BA.debugLineNum = 60;BA.debugLine="txtblouseprice.Text = txtblouseprice.Text - 250";
Debug.ShouldStop(134217728);
clothes.mostCurrent._txtblouseprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, clothes.mostCurrent._txtblouseprice.runMethod(true,"getText")),RemoteObject.createImmutable(250)}, "-",1, 0)));
 };
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
public static RemoteObject  _chkblouse3_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkblouse3_CheckedChange (clothes) ","clothes",2,clothes.mostCurrent.activityBA,clothes.mostCurrent,64);
if (RapidSub.canDelegate("chkblouse3_checkedchange")) { return b4a.example.clothes.remoteMe.runUserSub(false, "clothes","chkblouse3_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 64;BA.debugLine="Sub chkblouse3_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="If chkblouse3.Checked = True Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",clothes.mostCurrent._chkblouse3.runMethod(true,"getChecked"),clothes.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 66;BA.debugLine="txtblouseprice.Text = txtblouseprice.Text + 300";
Debug.ShouldStop(2);
clothes.mostCurrent._txtblouseprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, clothes.mostCurrent._txtblouseprice.runMethod(true,"getText")),RemoteObject.createImmutable(300)}, "+",1, 0)));
 }else {
 BA.debugLineNum = 68;BA.debugLine="txtblouseprice.Text = txtblouseprice.Text - 300";
Debug.ShouldStop(8);
clothes.mostCurrent._txtblouseprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, clothes.mostCurrent._txtblouseprice.runMethod(true,"getText")),RemoteObject.createImmutable(300)}, "-",1, 0)));
 };
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
public static RemoteObject  _chkshorts1_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkshorts1_CheckedChange (clothes) ","clothes",2,clothes.mostCurrent.activityBA,clothes.mostCurrent,84);
if (RapidSub.canDelegate("chkshorts1_checkedchange")) { return b4a.example.clothes.remoteMe.runUserSub(false, "clothes","chkshorts1_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 84;BA.debugLine="Sub chkshorts1_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="If chkshorts1.Checked = True Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",clothes.mostCurrent._chkshorts1.runMethod(true,"getChecked"),clothes.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 86;BA.debugLine="txtshortsprice.Text = txtshortsprice.Text + 500";
Debug.ShouldStop(2097152);
clothes.mostCurrent._txtshortsprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, clothes.mostCurrent._txtshortsprice.runMethod(true,"getText")),RemoteObject.createImmutable(500)}, "+",1, 0)));
 }else {
 BA.debugLineNum = 88;BA.debugLine="txtshortsprice.Text = txtshortsprice.Text - 500";
Debug.ShouldStop(8388608);
clothes.mostCurrent._txtshortsprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, clothes.mostCurrent._txtshortsprice.runMethod(true,"getText")),RemoteObject.createImmutable(500)}, "-",1, 0)));
 };
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chkshorts2_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkshorts2_CheckedChange (clothes) ","clothes",2,clothes.mostCurrent.activityBA,clothes.mostCurrent,92);
if (RapidSub.canDelegate("chkshorts2_checkedchange")) { return b4a.example.clothes.remoteMe.runUserSub(false, "clothes","chkshorts2_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 92;BA.debugLine="Sub chkshorts2_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="If chkshorts2.Checked = True Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",clothes.mostCurrent._chkshorts2.runMethod(true,"getChecked"),clothes.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 94;BA.debugLine="txtshortsprice.Text = txtshortsprice.Text + 550";
Debug.ShouldStop(536870912);
clothes.mostCurrent._txtshortsprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, clothes.mostCurrent._txtshortsprice.runMethod(true,"getText")),RemoteObject.createImmutable(550)}, "+",1, 0)));
 }else {
 BA.debugLineNum = 96;BA.debugLine="txtshortsprice.Text = txtshortsprice.Text - 550";
Debug.ShouldStop(-2147483648);
clothes.mostCurrent._txtshortsprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, clothes.mostCurrent._txtshortsprice.runMethod(true,"getText")),RemoteObject.createImmutable(550)}, "-",1, 0)));
 };
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chkshorts3_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkshorts3_CheckedChange (clothes) ","clothes",2,clothes.mostCurrent.activityBA,clothes.mostCurrent,100);
if (RapidSub.canDelegate("chkshorts3_checkedchange")) { return b4a.example.clothes.remoteMe.runUserSub(false, "clothes","chkshorts3_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 100;BA.debugLine="Sub chkshorts3_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="If chkshorts3.Checked = True Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",clothes.mostCurrent._chkshorts3.runMethod(true,"getChecked"),clothes.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 102;BA.debugLine="txtshortsprice.Text = txtshortsprice.Text + 600";
Debug.ShouldStop(32);
clothes.mostCurrent._txtshortsprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, clothes.mostCurrent._txtshortsprice.runMethod(true,"getText")),RemoteObject.createImmutable(600)}, "+",1, 0)));
 }else {
 BA.debugLineNum = 104;BA.debugLine="txtshortsprice.Text = txtshortsprice.Text - 600";
Debug.ShouldStop(128);
clothes.mostCurrent._txtshortsprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, clothes.mostCurrent._txtshortsprice.runMethod(true,"getText")),RemoteObject.createImmutable(600)}, "-",1, 0)));
 };
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
 //BA.debugLineNum = 16;BA.debugLine="Private tabclothes As TabHost";
clothes.mostCurrent._tabclothes = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabHostWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private chkblouse1 As CheckBox";
clothes.mostCurrent._chkblouse1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private chkblouse2 As CheckBox";
clothes.mostCurrent._chkblouse2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private chkblouse3 As CheckBox";
clothes.mostCurrent._chkblouse3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private txtblouseprice As EditText";
clothes.mostCurrent._txtblouseprice = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private btnblouseclear As Button";
clothes.mostCurrent._btnblouseclear = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private rdbpants1 As RadioButton";
clothes.mostCurrent._rdbpants1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private rdbpants2 As RadioButton";
clothes.mostCurrent._rdbpants2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private rdbpants3 As RadioButton";
clothes.mostCurrent._rdbpants3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private txtpantsprice As EditText";
clothes.mostCurrent._txtpantsprice = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private chkshorts1 As CheckBox";
clothes.mostCurrent._chkshorts1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private chkshorts2 As CheckBox";
clothes.mostCurrent._chkshorts2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private chkshorts3 As CheckBox";
clothes.mostCurrent._chkshorts3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private txtshortsprice As EditText";
clothes.mostCurrent._txtshortsprice = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private txtclothestot As EditText";
clothes.mostCurrent._txtclothestot = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _rdbpants1_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("rdbpants1_CheckedChange (clothes) ","clothes",2,clothes.mostCurrent.activityBA,clothes.mostCurrent,72);
if (RapidSub.canDelegate("rdbpants1_checkedchange")) { return b4a.example.clothes.remoteMe.runUserSub(false, "clothes","rdbpants1_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 72;BA.debugLine="Sub rdbpants1_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="txtpantsprice.Text = 350";
Debug.ShouldStop(256);
clothes.mostCurrent._txtpantsprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(350));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rdbpants2_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("rdbpants2_CheckedChange (clothes) ","clothes",2,clothes.mostCurrent.activityBA,clothes.mostCurrent,76);
if (RapidSub.canDelegate("rdbpants2_checkedchange")) { return b4a.example.clothes.remoteMe.runUserSub(false, "clothes","rdbpants2_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 76;BA.debugLine="Sub rdbpants2_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="txtpantsprice.Text = 400";
Debug.ShouldStop(4096);
clothes.mostCurrent._txtpantsprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(400));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rdbpants3_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("rdbpants3_CheckedChange (clothes) ","clothes",2,clothes.mostCurrent.activityBA,clothes.mostCurrent,80);
if (RapidSub.canDelegate("rdbpants3_checkedchange")) { return b4a.example.clothes.remoteMe.runUserSub(false, "clothes","rdbpants3_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 80;BA.debugLine="Sub rdbpants3_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="txtpantsprice.Text = 450";
Debug.ShouldStop(65536);
clothes.mostCurrent._txtpantsprice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(450));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}