package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="Activity.LoadLayout(\"laymain\")";
Debug.ShouldStop(1073741824);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("laymain")),main.mostCurrent.activityBA);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,57);
if (RapidSub.canDelegate("activity_keypress")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_keypress", _keycode);}
RemoteObject _ans = RemoteObject.createImmutable(0);
RemoteObject _txt = RemoteObject.createImmutable("");
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 57;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Dim ans As Int";
Debug.ShouldStop(33554432);
_ans = RemoteObject.createImmutable(0);Debug.locals.put("ans", _ans);
 BA.debugLineNum = 59;BA.debugLine="Dim txt As String";
Debug.ShouldStop(67108864);
_txt = RemoteObject.createImmutable("");Debug.locals.put("txt", _txt);
 BA.debugLineNum = 60;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 61;BA.debugLine="txt = \"Do you really want to quit the program?\"";
Debug.ShouldStop(268435456);
_txt = BA.ObjectToString("Do you really want to quit the program?");Debug.locals.put("txt", _txt);
 BA.debugLineNum = 62;BA.debugLine="ans = Msgbox2(txt, \"\",\"Yes\",\"\",\"No\",Null)";
Debug.ShouldStop(536870912);
_ans = main.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(_txt)),(Object)(BA.ObjectToCharSequence("")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((main.mostCurrent.__c.getField(false,"Null"))),main.mostCurrent.activityBA);Debug.locals.put("ans", _ans);
 BA.debugLineNum = 63;BA.debugLine="If ans = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_ans,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 64;BA.debugLine="Return False";
Debug.ShouldStop(-2147483648);
if (true) return main.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 66;BA.debugLine="Return True";
Debug.ShouldStop(2);
if (true) return main.mostCurrent.__c.getField(true,"True");
 };
 };
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,39);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,34);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="txtclothes.Text = totclothes";
Debug.ShouldStop(4);
main.mostCurrent._txtclothes.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(main._totclothes));
 BA.debugLineNum = 36;BA.debugLine="txtshoes.Text = totshoes";
Debug.ShouldStop(8);
main.mostCurrent._txtshoes.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(main._totshoes));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnclear_click() throws Exception{
try {
		Debug.PushSubsStack("btnclear_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,81);
if (RapidSub.canDelegate("btnclear_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnclear_click");}
RemoteObject _clr = RemoteObject.createImmutable(0);
 BA.debugLineNum = 81;BA.debugLine="Sub btnclear_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="Dim clr As Int";
Debug.ShouldStop(131072);
_clr = RemoteObject.createImmutable(0);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 83;BA.debugLine="clr = Msgbox2(\"Are You Sure to Clear?\",\"Clear\",\"Y";
Debug.ShouldStop(262144);
_clr = main.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Are You Sure to Clear?")),(Object)(BA.ObjectToCharSequence("Clear")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((main.mostCurrent.__c.getField(false,"Null"))),main.mostCurrent.activityBA);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 84;BA.debugLine="If clr = DialogResponse.POSITIVE Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_clr,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 85;BA.debugLine="txtclothes.Text = 0";
Debug.ShouldStop(1048576);
main.mostCurrent._txtclothes.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 86;BA.debugLine="txtshoes.Text = 0";
Debug.ShouldStop(2097152);
main.mostCurrent._txtshoes.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 87;BA.debugLine="txttotal.Text = 0";
Debug.ShouldStop(4194304);
main.mostCurrent._txttotal.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 88;BA.debugLine="totshoes = 0";
Debug.ShouldStop(8388608);
main._totshoes = BA.NumberToString(0);
 BA.debugLineNum = 89;BA.debugLine="totclothes = 0";
Debug.ShouldStop(16777216);
main._totclothes = BA.NumberToString(0);
 };
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnclothes_click() throws Exception{
try {
		Debug.PushSubsStack("btnclothes_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,43);
if (RapidSub.canDelegate("btnclothes_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnclothes_click");}
 BA.debugLineNum = 43;BA.debugLine="Sub btnclothes_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="StartActivity(Clothes)";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._clothes.getObject())));
 BA.debugLineNum = 45;BA.debugLine="ToastMessageShow(\"Select Clothes\", False)";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Select Clothes")),(Object)(main.mostCurrent.__c.getField(true,"False")));
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
public static RemoteObject  _btnexit_click() throws Exception{
try {
		Debug.PushSubsStack("btnexit_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,73);
if (RapidSub.canDelegate("btnexit_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnexit_click");}
RemoteObject _xt = RemoteObject.createImmutable(0);
 BA.debugLineNum = 73;BA.debugLine="Sub btnexit_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="Dim xt As Int";
Debug.ShouldStop(512);
_xt = RemoteObject.createImmutable(0);Debug.locals.put("xt", _xt);
 BA.debugLineNum = 75;BA.debugLine="xt = Msgbox2(\"Are You Sure to Exit?\",\"\",\"Yes\",\"\",";
Debug.ShouldStop(1024);
_xt = main.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Are You Sure to Exit?")),(Object)(BA.ObjectToCharSequence("")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((main.mostCurrent.__c.getField(false,"Null"))),main.mostCurrent.activityBA);Debug.locals.put("xt", _xt);
 BA.debugLineNum = 76;BA.debugLine="If xt = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_xt,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 77;BA.debugLine="ExitApplication";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("ExitApplication");
 };
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnshoes_click() throws Exception{
try {
		Debug.PushSubsStack("btnshoes_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,48);
if (RapidSub.canDelegate("btnshoes_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnshoes_click");}
 BA.debugLineNum = 48;BA.debugLine="Sub btnshoes_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="StartActivity(Shoes)";
Debug.ShouldStop(65536);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._shoes.getObject())));
 BA.debugLineNum = 50;BA.debugLine="ToastMessageShow(\"Select Shoes\", False)";
Debug.ShouldStop(131072);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Select Shoes")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btntotal_click() throws Exception{
try {
		Debug.PushSubsStack("btntotal_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,53);
if (RapidSub.canDelegate("btntotal_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btntotal_click");}
 BA.debugLineNum = 53;BA.debugLine="Sub btntotal_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="txttotal.Text = txtclothes.Text + txtshoes.Text";
Debug.ShouldStop(2097152);
main.mostCurrent._txttotal.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, main.mostCurrent._txtclothes.runMethod(true,"getText")),BA.numberCast(double.class, main.mostCurrent._txtshoes.runMethod(true,"getText"))}, "+",1, 0)));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="Private txtclothes As EditText";
main.mostCurrent._txtclothes = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private txtshoes As EditText";
main.mostCurrent._txtshoes = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private txttotal As EditText";
main.mostCurrent._txttotal = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
clothes_subs_0._process_globals();
shoes_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
clothes.myClass = BA.getDeviceClass ("b4a.example.clothes");
shoes.myClass = BA.getDeviceClass ("b4a.example.shoes");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 19;BA.debugLine="Dim totclothes As String :totclothes=0";
main._totclothes = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Dim totclothes As String :totclothes=0";
main._totclothes = BA.NumberToString(0);
 //BA.debugLineNum = 20;BA.debugLine="Dim totshoes As String: totshoes=0";
main._totshoes = RemoteObject.createImmutable("");
 //BA.debugLineNum = 20;BA.debugLine="Dim totshoes As String: totshoes=0";
main._totshoes = BA.NumberToString(0);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}