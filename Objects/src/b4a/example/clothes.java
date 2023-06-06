package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class clothes extends Activity implements B4AActivity{
	public static clothes mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.clothes");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (clothes).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.clothes");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.clothes", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (clothes) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (clothes) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return clothes.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (clothes) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (clothes) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            clothes mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (clothes) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.TabHostWrapper _tabclothes = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chkblouse1 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chkblouse2 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chkblouse3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtblouseprice = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnblouseclear = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rdbpants1 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rdbpants2 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rdbpants3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtpantsprice = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chkshorts1 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chkshorts2 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chkshorts3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtshortsprice = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtclothestot = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.shoes _shoes = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Activity.LoadLayout(\"layclothes\")";
mostCurrent._activity.LoadLayout("layclothes",mostCurrent.activityBA);
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="tabclothes.AddTab(\"Blouse\", \"layblouse.bal\")";
mostCurrent._tabclothes.AddTab(mostCurrent.activityBA,"Blouse","layblouse.bal");
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="tabclothes.AddTab(\"Pants\", \"laypants.bal\")";
mostCurrent._tabclothes.AddTab(mostCurrent.activityBA,"Pants","laypants.bal");
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="tabclothes.AddTab(\"Shorts\", \"layshorts.bal\")";
mostCurrent._tabclothes.AddTab(mostCurrent.activityBA,"Shorts","layshorts.bal");
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="clothes";
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return "";
}
public static String  _btnblouseaccept_click() throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnblouseaccept_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnblouseaccept_click", null));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub btnblouseaccept_Click";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="txtclothestot.Text = txtblouseprice.Text + txtpan";
mostCurrent._txtclothestot.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtblouseprice.getText()))+(double)(Double.parseDouble(mostCurrent._txtpantsprice.getText()))+(double)(Double.parseDouble(mostCurrent._txtshortsprice.getText()))));
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public static String  _btnblouseclear_click() throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnblouseclear_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnblouseclear_click", null));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub btnblouseclear_Click";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="chkblouse1.Checked = False";
mostCurrent._chkblouse1.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="chkblouse2.Checked = False";
mostCurrent._chkblouse2.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="chkblouse3.Checked = False";
mostCurrent._chkblouse3.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="txtblouseprice.Text = 0";
mostCurrent._txtblouseprice.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="End Sub";
return "";
}
public static String  _btnclothesaccept_click() throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnclothesaccept_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnclothesaccept_click", null));}
int _acc = 0;
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub btnclothesaccept_Click";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim acc As Int";
_acc = 0;
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="acc = Msgbox2(\"Are You Sure to Accept?\",\"\",\"Yes\",";
_acc = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Are You Sure to Accept?"),BA.ObjectToCharSequence(""),"Yes","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="If acc = DialogResponse.POSITIVE Then";
if (_acc==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="Main.totclothes = txtclothestot.Text";
mostCurrent._main._totclothes /*String*/  = mostCurrent._txtclothestot.getText();
 };
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="End Sub";
return "";
}
public static String  _btnclothesclear_click() throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnclothesclear_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnclothesclear_click", null));}
int _clear = 0;
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub btnclothesclear_Click";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Dim clear As Int";
_clear = 0;
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="clear = Msgbox2(\"Are You Sure to Clear?\",\"\",\"Yes\"";
_clear = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Are You Sure to Clear?"),BA.ObjectToCharSequence(""),"Yes","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="If clear = DialogResponse.POSITIVE Then";
if (_clear==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="chkblouse1.Checked = False";
mostCurrent._chkblouse1.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="chkblouse2.Checked = False";
mostCurrent._chkblouse2.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="chkblouse3.Checked = False";
mostCurrent._chkblouse3.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="txtblouseprice.Text = 0";
mostCurrent._txtblouseprice.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="rdbpants1.Checked = False";
mostCurrent._rdbpants1.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="rdbpants2.Checked = False";
mostCurrent._rdbpants2.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="rdbpants3.Checked = False";
mostCurrent._rdbpants3.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2424843;
 //BA.debugLineNum = 2424843;BA.debugLine="txtpantsprice.Text = 0";
mostCurrent._txtpantsprice.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="chkshorts1.Checked = False";
mostCurrent._chkshorts1.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2424845;
 //BA.debugLineNum = 2424845;BA.debugLine="chkshorts2.Checked = False";
mostCurrent._chkshorts2.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2424846;
 //BA.debugLineNum = 2424846;BA.debugLine="chkshorts3.Checked = False";
mostCurrent._chkshorts3.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2424847;
 //BA.debugLineNum = 2424847;BA.debugLine="txtshortsprice.Text = 0";
mostCurrent._txtshortsprice.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=2424848;
 //BA.debugLineNum = 2424848;BA.debugLine="txtclothestot.Text = 0";
mostCurrent._txtclothestot.setText(BA.ObjectToCharSequence(0));
 };
RDebugUtils.currentLine=2424850;
 //BA.debugLineNum = 2424850;BA.debugLine="End Sub";
return "";
}
public static String  _btnclothesclose_click() throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnclothesclose_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnclothesclose_click", null));}
int _cls = 0;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub btnclothesclose_Click";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Dim cls As Int";
_cls = 0;
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="cls = Msgbox2(\"Are You Sure to Close?\",\"\",\"Yes\",\"";
_cls = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Are You Sure to Close?"),BA.ObjectToCharSequence(""),"Yes","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="If cls = DialogResponse.POSITIVE Then";
if (_cls==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="End Sub";
return "";
}
public static String  _btnpantsaccept_click() throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnpantsaccept_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnpantsaccept_click", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub btnpantsaccept_Click";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="txtclothestot.Text = txtblouseprice.Text + txtpan";
mostCurrent._txtclothestot.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtblouseprice.getText()))+(double)(Double.parseDouble(mostCurrent._txtpantsprice.getText()))+(double)(Double.parseDouble(mostCurrent._txtshortsprice.getText()))));
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return "";
}
public static String  _btnpantsclear_click() throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnpantsclear_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnpantsclear_click", null));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub btnpantsclear_Click";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="rdbpants1.Checked = False";
mostCurrent._rdbpants1.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="rdbpants2.Checked = False";
mostCurrent._rdbpants2.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="rdbpants3.Checked = False";
mostCurrent._rdbpants3.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="txtpantsprice.Text = 0";
mostCurrent._txtpantsprice.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="End Sub";
return "";
}
public static String  _btnshortsaccept_click() throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnshortsaccept_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnshortsaccept_click", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub btnshortsaccept_Click";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="txtclothestot.Text = txtblouseprice.Text + txtpan";
mostCurrent._txtclothestot.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtblouseprice.getText()))+(double)(Double.parseDouble(mostCurrent._txtpantsprice.getText()))+(double)(Double.parseDouble(mostCurrent._txtshortsprice.getText()))));
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="End Sub";
return "";
}
public static String  _btnshortsclear_click() throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnshortsclear_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnshortsclear_click", null));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub btnshortsclear_Click";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="chkshorts1.Checked = False";
mostCurrent._chkshorts1.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="chkshorts2.Checked = False";
mostCurrent._chkshorts2.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="chkshorts3.Checked = False";
mostCurrent._chkshorts3.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="txtshortsprice.Text = 0";
mostCurrent._txtshortsprice.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="End Sub";
return "";
}
public static String  _chkblouse1_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "chkblouse1_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "chkblouse1_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub chkblouse1_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="If chkblouse1.Checked = True Then";
if (mostCurrent._chkblouse1.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="txtblouseprice.Text = txtblouseprice.Text + 200";
mostCurrent._txtblouseprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtblouseprice.getText()))+200));
 }else {
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="txtblouseprice.Text = txtblouseprice.Text - 200";
mostCurrent._txtblouseprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtblouseprice.getText()))-200));
 };
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="End Sub";
return "";
}
public static String  _chkblouse2_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "chkblouse2_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "chkblouse2_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub chkblouse2_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="If chkblouse2.Checked = True Then";
if (mostCurrent._chkblouse2.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="txtblouseprice.Text = txtblouseprice.Text + 250";
mostCurrent._txtblouseprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtblouseprice.getText()))+250));
 }else {
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="txtblouseprice.Text = txtblouseprice.Text - 250";
mostCurrent._txtblouseprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtblouseprice.getText()))-250));
 };
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="End Sub";
return "";
}
public static String  _chkblouse3_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "chkblouse3_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "chkblouse3_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub chkblouse3_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="If chkblouse3.Checked = True Then";
if (mostCurrent._chkblouse3.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="txtblouseprice.Text = txtblouseprice.Text + 300";
mostCurrent._txtblouseprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtblouseprice.getText()))+300));
 }else {
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="txtblouseprice.Text = txtblouseprice.Text - 300";
mostCurrent._txtblouseprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtblouseprice.getText()))-300));
 };
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="End Sub";
return "";
}
public static String  _chkshorts1_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "chkshorts1_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "chkshorts1_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub chkshorts1_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="If chkshorts1.Checked = True Then";
if (mostCurrent._chkshorts1.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="txtshortsprice.Text = txtshortsprice.Text + 500";
mostCurrent._txtshortsprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtshortsprice.getText()))+500));
 }else {
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="txtshortsprice.Text = txtshortsprice.Text - 500";
mostCurrent._txtshortsprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtshortsprice.getText()))-500));
 };
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="End Sub";
return "";
}
public static String  _chkshorts2_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "chkshorts2_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "chkshorts2_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub chkshorts2_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="If chkshorts2.Checked = True Then";
if (mostCurrent._chkshorts2.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="txtshortsprice.Text = txtshortsprice.Text + 550";
mostCurrent._txtshortsprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtshortsprice.getText()))+550));
 }else {
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="txtshortsprice.Text = txtshortsprice.Text - 550";
mostCurrent._txtshortsprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtshortsprice.getText()))-550));
 };
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="End Sub";
return "";
}
public static String  _chkshorts3_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "chkshorts3_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "chkshorts3_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub chkshorts3_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="If chkshorts3.Checked = True Then";
if (mostCurrent._chkshorts3.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="txtshortsprice.Text = txtshortsprice.Text + 600";
mostCurrent._txtshortsprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtshortsprice.getText()))+600));
 }else {
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="txtshortsprice.Text = txtshortsprice.Text - 600";
mostCurrent._txtshortsprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtshortsprice.getText()))-600));
 };
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="End Sub";
return "";
}
public static String  _rdbpants1_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "rdbpants1_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "rdbpants1_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub rdbpants1_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="txtpantsprice.Text = 350";
mostCurrent._txtpantsprice.setText(BA.ObjectToCharSequence(350));
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return "";
}
public static String  _rdbpants2_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "rdbpants2_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "rdbpants2_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub rdbpants2_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="txtpantsprice.Text = 400";
mostCurrent._txtpantsprice.setText(BA.ObjectToCharSequence(400));
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
public static String  _rdbpants3_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="clothes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "rdbpants3_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "rdbpants3_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub rdbpants3_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="txtpantsprice.Text = 450";
mostCurrent._txtpantsprice.setText(BA.ObjectToCharSequence(450));
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
}