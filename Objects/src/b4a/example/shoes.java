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

public class shoes extends Activity implements B4AActivity{
	public static shoes mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.shoes");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (shoes).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.shoes");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.shoes", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (shoes) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (shoes) Resume **");
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
		return shoes.class;
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
            BA.LogInfo("** Activity (shoes) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (shoes) Pause event (activity is not paused). **");
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
            shoes mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (shoes) Resume **");
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
public anywheresoftware.b4a.objects.TabHostWrapper _tabshoes = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinheels = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgheels = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listheels = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog _inpdlg = null;
public static String _myitem = "";
public static String _price1 = "";
public anywheresoftware.b4a.objects.EditTextWrapper _txtheelsprice = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinwedges = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listwedges = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtwedgesprice = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtwedgesquan = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgwedges = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listloafers1 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listloafers2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtloafersprice = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog _inpdlg2 = null;
public static int _selecteditem = 0;
public static int _selecteditem2 = 0;
public anywheresoftware.b4a.objects.EditTextWrapper _txtshoestot = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.clothes _clothes = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Activity.LoadLayout(\"layshoes2\")";
mostCurrent._activity.LoadLayout("layshoes2",mostCurrent.activityBA);
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="tabshoes.AddTab(\"Heels\", \"layheels.bal\")";
mostCurrent._tabshoes.AddTab(mostCurrent.activityBA,"Heels","layheels.bal");
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="spinheels.Add(\"Select Heels\")";
mostCurrent._spinheels.Add("Select Heels");
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="spinheels.Add(\"Heels 1 = 100\")";
mostCurrent._spinheels.Add("Heels 1 = 100");
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="spinheels.Add(\"Heels 2 = 120\")";
mostCurrent._spinheels.Add("Heels 2 = 120");
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="spinheels.Add(\"Heels 3 = 140\")";
mostCurrent._spinheels.Add("Heels 3 = 140");
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="tabshoes.AddTab(\"Wedges\", \"laywedges.bal\")";
mostCurrent._tabshoes.AddTab(mostCurrent.activityBA,"Wedges","laywedges.bal");
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="spinwedges.Add(\"Select Wedges\")";
mostCurrent._spinwedges.Add("Select Wedges");
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="spinwedges.Add(\"Wedges1 = 160\")";
mostCurrent._spinwedges.Add("Wedges1 = 160");
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="spinwedges.Add(\"Wedges2 = 180\")";
mostCurrent._spinwedges.Add("Wedges2 = 180");
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="spinwedges.Add(\"Wedges3 = 200\")";
mostCurrent._spinwedges.Add("Wedges3 = 200");
RDebugUtils.currentLine=2752526;
 //BA.debugLineNum = 2752526;BA.debugLine="tabshoes.AddTab(\"Loafers\", \"layloafers.bal\")";
mostCurrent._tabshoes.AddTab(mostCurrent.activityBA,"Loafers","layloafers.bal");
RDebugUtils.currentLine=2752527;
 //BA.debugLineNum = 2752527;BA.debugLine="listloafers1.SingleLineLayout.ItemHeight = 15dip";
mostCurrent._listloafers1.getSingleLineLayout().setItemHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (15)));
RDebugUtils.currentLine=2752528;
 //BA.debugLineNum = 2752528;BA.debugLine="listloafers1.SingleLineLayout.Label.TextSize = 12";
mostCurrent._listloafers1.getSingleLineLayout().Label.setTextSize((float) (12));
RDebugUtils.currentLine=2752529;
 //BA.debugLineNum = 2752529;BA.debugLine="listloafers1.SingleLineLayout.Label.Color = Color";
mostCurrent._listloafers1.getSingleLineLayout().Label.setColor(anywheresoftware.b4a.keywords.Common.Colors.Cyan);
RDebugUtils.currentLine=2752530;
 //BA.debugLineNum = 2752530;BA.debugLine="listloafers1.SingleLineLayout.Label.TextColor = C";
mostCurrent._listloafers1.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=2752531;
 //BA.debugLineNum = 2752531;BA.debugLine="listloafers1.AddSingleLine(\"Loafer1\" & \" \" & \"220";
mostCurrent._listloafers1.AddSingleLine(BA.ObjectToCharSequence("Loafer1"+" "+"220"));
RDebugUtils.currentLine=2752532;
 //BA.debugLineNum = 2752532;BA.debugLine="listloafers1.AddSingleLine(\"Loafer2\" & \" \" & \"240";
mostCurrent._listloafers1.AddSingleLine(BA.ObjectToCharSequence("Loafer2"+" "+"240"));
RDebugUtils.currentLine=2752533;
 //BA.debugLineNum = 2752533;BA.debugLine="listloafers1.AddSingleLine(\"Loafer3\" & \" \" & \"260";
mostCurrent._listloafers1.AddSingleLine(BA.ObjectToCharSequence("Loafer3"+" "+"260"));
RDebugUtils.currentLine=2752534;
 //BA.debugLineNum = 2752534;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="shoes";
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="End Sub";
return "";
}
public static String  _btndel_click() throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btndel_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btndel_click", null));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub btndel_Click";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="listloafers2.Enabled = True";
mostCurrent._listloafers2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="ToastMessageShow(\"List Item Enabled, Long Click i";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("List Item Enabled, Long Click in List Item to remove from the list"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="End Sub";
return "";
}
public static String  _btnheelsaccept_click() throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnheelsaccept_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnheelsaccept_click", null));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub btnheelsaccept_Click";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="txtshoestot.Text = txtheelsprice.Text + txtwedges";
mostCurrent._txtshoestot.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtheelsprice.getText()))+(double)(Double.parseDouble(mostCurrent._txtwedgesprice.getText()))+(double)(Double.parseDouble(mostCurrent._txtloafersprice.getText()))));
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="End Sub";
return "";
}
public static String  _btnheelsclear_click() throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnheelsclear_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnheelsclear_click", null));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub btnheelsclear_Click";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="listheels.Clear";
mostCurrent._listheels.Clear();
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="txtheelsprice.Text = 0";
mostCurrent._txtheelsprice.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="spinheels.SelectedIndex = 0";
mostCurrent._spinheels.setSelectedIndex((int) (0));
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="imgheels.Bitmap = LoadBitmap(File.DirAssets, \"whi";
mostCurrent._imgheels.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"white.jpg").getObject()));
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="End Sub";
return "";
}
public static String  _btnloafersaccept_click() throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnloafersaccept_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnloafersaccept_click", null));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub btnloafersaccept_Click";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="txtshoestot.Text = txtheelsprice.Text + txtwedges";
mostCurrent._txtshoestot.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtheelsprice.getText()))+(double)(Double.parseDouble(mostCurrent._txtwedgesprice.getText()))+(double)(Double.parseDouble(mostCurrent._txtloafersprice.getText()))));
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="End Sub";
return "";
}
public static String  _btnloafersclear_click() throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnloafersclear_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnloafersclear_click", null));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub btnloafersclear_Click";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="listloafers2.Clear";
mostCurrent._listloafers2.Clear();
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="txtloafersprice.Text = 0";
mostCurrent._txtloafersprice.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="listloafers2.Enabled = False";
mostCurrent._listloafers2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="End Sub";
return "";
}
public static String  _btnshoesaccept_click() throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnshoesaccept_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnshoesaccept_click", null));}
int _acc = 0;
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub btnshoesaccept_Click";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="Dim acc As Int";
_acc = 0;
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="acc = Msgbox2(\"Are You Sure to Accept?\",\"\",\"Yes\",";
_acc = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Are You Sure to Accept?"),BA.ObjectToCharSequence(""),"Yes","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="If acc = DialogResponse.POSITIVE Then";
if (_acc==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="Main.totshoes = txtshoestot.Text";
mostCurrent._main._totshoes /*String*/  = mostCurrent._txtshoestot.getText();
 };
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="End Sub";
return "";
}
public static String  _btnshoesclear_click() throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnshoesclear_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnshoesclear_click", null));}
int _clr = 0;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub btnshoesclear_Click";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Dim clr As Int";
_clr = 0;
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="clr = Msgbox2(\"Are You Sure to Close?\",\"\",\"Yes\",\"";
_clr = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Are You Sure to Close?"),BA.ObjectToCharSequence(""),"Yes","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="If clr = DialogResponse.POSITIVE Then";
if (_clr==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="listheels.Clear";
mostCurrent._listheels.Clear();
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="txtheelsprice.Text = 0";
mostCurrent._txtheelsprice.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="spinheels.SelectedIndex = 0";
mostCurrent._spinheels.setSelectedIndex((int) (0));
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="imgheels.Bitmap = LoadBitmap(File.DirAssets, \"wh";
mostCurrent._imgheels.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"white.jpg").getObject()));
RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="listwedges.Clear";
mostCurrent._listwedges.Clear();
RDebugUtils.currentLine=3801097;
 //BA.debugLineNum = 3801097;BA.debugLine="txtwedgesquan.Text = 1";
mostCurrent._txtwedgesquan.setText(BA.ObjectToCharSequence(1));
RDebugUtils.currentLine=3801098;
 //BA.debugLineNum = 3801098;BA.debugLine="txtwedgesprice.Text = 0";
mostCurrent._txtwedgesprice.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=3801099;
 //BA.debugLineNum = 3801099;BA.debugLine="spinwedges.SelectedIndex = 0";
mostCurrent._spinwedges.setSelectedIndex((int) (0));
RDebugUtils.currentLine=3801100;
 //BA.debugLineNum = 3801100;BA.debugLine="imgwedges.Bitmap = LoadBitmap(File.DirAssets, \"w";
mostCurrent._imgwedges.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"white.jpg").getObject()));
RDebugUtils.currentLine=3801101;
 //BA.debugLineNum = 3801101;BA.debugLine="listloafers2.Clear";
mostCurrent._listloafers2.Clear();
RDebugUtils.currentLine=3801102;
 //BA.debugLineNum = 3801102;BA.debugLine="txtloafersprice.Text = 0";
mostCurrent._txtloafersprice.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=3801103;
 //BA.debugLineNum = 3801103;BA.debugLine="listloafers2.Enabled = False";
mostCurrent._listloafers2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3801104;
 //BA.debugLineNum = 3801104;BA.debugLine="txtshoestot.Text = 0";
mostCurrent._txtshoestot.setText(BA.ObjectToCharSequence(0));
 };
RDebugUtils.currentLine=3801106;
 //BA.debugLineNum = 3801106;BA.debugLine="End Sub";
return "";
}
public static String  _btnshoesclose_click() throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnshoesclose_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnshoesclose_click", null));}
int _cls = 0;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub btnshoesclose_Click";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Dim cls As Int";
_cls = 0;
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="cls = Msgbox2(\"Are You Sure to Close?\",\"\",\"Yes\",\"";
_cls = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Are You Sure to Close?"),BA.ObjectToCharSequence(""),"Yes","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="If cls = DialogResponse.POSITIVE Then";
if (_cls==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="End Sub";
return "";
}
public static String  _btnwedgesaccept_click() throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnwedgesaccept_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnwedgesaccept_click", null));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub btnwedgesaccept_Click";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="txtshoestot.Text = txtheelsprice.Text + txtwedges";
mostCurrent._txtshoestot.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtheelsprice.getText()))+(double)(Double.parseDouble(mostCurrent._txtwedgesprice.getText()))+(double)(Double.parseDouble(mostCurrent._txtloafersprice.getText()))));
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="End Sub";
return "";
}
public static String  _btnwedgesclear_click() throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnwedgesclear_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnwedgesclear_click", null));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub btnwedgesclear_Click";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="listwedges.Clear";
mostCurrent._listwedges.Clear();
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="txtwedgesquan.Text = 1";
mostCurrent._txtwedgesquan.setText(BA.ObjectToCharSequence(1));
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="txtwedgesprice.Text = 0";
mostCurrent._txtwedgesprice.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="spinwedges.SelectedIndex = 0";
mostCurrent._spinwedges.setSelectedIndex((int) (0));
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="imgwedges.Bitmap = LoadBitmap(File.DirAssets, \"wh";
mostCurrent._imgwedges.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"white.jpg").getObject()));
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="End Sub";
return "";
}
public static String  _compute() throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "compute", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "compute", null));}
String _inpquan = "";
String _squan = "";
double _subtotal = 0;
double _dprice = 0;
double _dquan = 0;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub compute()";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="inpdlg.InputType = inpdlg.INPUT_TYPE_NUMBERS";
mostCurrent._inpdlg.setInputType(mostCurrent._inpdlg.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="inpdlg.Input=\"1\"";
mostCurrent._inpdlg.setInput("1");
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="inpdlg.Hint = \"Enter Quantity\"";
mostCurrent._inpdlg.setHint("Enter Quantity");
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="inpdlg.HintColor = Colors.Gray";
mostCurrent._inpdlg.setHintColor(anywheresoftware.b4a.keywords.Common.Colors.Gray);
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="Dim inpquan As String";
_inpquan = "";
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="inpquan = inpdlg.Show (\"Quantity\",myitem,\"OK\",\"Ca";
_inpquan = BA.NumberToString(mostCurrent._inpdlg.Show("Quantity",mostCurrent._myitem,"OK","Cancel","",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="If inpquan = DialogResponse.POSITIVE Then";
if ((_inpquan).equals(BA.NumberToString(anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE))) { 
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="If inpdlg.Input = \"\" Then";
if ((mostCurrent._inpdlg.getInput()).equals("")) { 
RDebugUtils.currentLine=3014666;
 //BA.debugLineNum = 3014666;BA.debugLine="Msgbox(\"Please Enter Value\",\"\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please Enter Value"),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3014668;
 //BA.debugLineNum = 3014668;BA.debugLine="Dim squan As String";
_squan = "";
RDebugUtils.currentLine=3014669;
 //BA.debugLineNum = 3014669;BA.debugLine="squan = inpdlg.Input";
_squan = mostCurrent._inpdlg.getInput();
RDebugUtils.currentLine=3014671;
 //BA.debugLineNum = 3014671;BA.debugLine="Dim  subtotal As Double";
_subtotal = 0;
RDebugUtils.currentLine=3014672;
 //BA.debugLineNum = 3014672;BA.debugLine="Dim dprice As Double : dprice = price1";
_dprice = 0;
RDebugUtils.currentLine=3014672;
 //BA.debugLineNum = 3014672;BA.debugLine="Dim dprice As Double : dprice = price1";
_dprice = (double)(Double.parseDouble(mostCurrent._price1));
RDebugUtils.currentLine=3014673;
 //BA.debugLineNum = 3014673;BA.debugLine="Dim dquan As Double : dquan = squan";
_dquan = 0;
RDebugUtils.currentLine=3014673;
 //BA.debugLineNum = 3014673;BA.debugLine="Dim dquan As Double : dquan = squan";
_dquan = (double)(Double.parseDouble(_squan));
RDebugUtils.currentLine=3014674;
 //BA.debugLineNum = 3014674;BA.debugLine="subtotal = dprice * dquan";
_subtotal = _dprice*_dquan;
RDebugUtils.currentLine=3014676;
 //BA.debugLineNum = 3014676;BA.debugLine="listheels.SingleLineLayout.ItemHeight = 15dip";
mostCurrent._listheels.getSingleLineLayout().setItemHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (15)));
RDebugUtils.currentLine=3014677;
 //BA.debugLineNum = 3014677;BA.debugLine="listheels.SingleLineLayout.Label.TextSize = 12";
mostCurrent._listheels.getSingleLineLayout().Label.setTextSize((float) (12));
RDebugUtils.currentLine=3014678;
 //BA.debugLineNum = 3014678;BA.debugLine="listheels.SingleLineLayout.Label.Color = Colors";
mostCurrent._listheels.getSingleLineLayout().Label.setColor(anywheresoftware.b4a.keywords.Common.Colors.Cyan);
RDebugUtils.currentLine=3014679;
 //BA.debugLineNum = 3014679;BA.debugLine="listheels.SingleLineLayout.Label.TextColor = Co";
mostCurrent._listheels.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=3014680;
 //BA.debugLineNum = 3014680;BA.debugLine="listheels.AddSingleLine(myitem & \"\" & \"(\" & squ";
mostCurrent._listheels.AddSingleLine(BA.ObjectToCharSequence(mostCurrent._myitem+""+"("+_squan+")"+BA.NumberToString(_subtotal)));
RDebugUtils.currentLine=3014681;
 //BA.debugLineNum = 3014681;BA.debugLine="txtheelsprice.Text = txtheelsprice.Text + subto";
mostCurrent._txtheelsprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtheelsprice.getText()))+_subtotal));
 };
 };
RDebugUtils.currentLine=3014684;
 //BA.debugLineNum = 3014684;BA.debugLine="End Sub";
return "";
}
public static String  _listloafers1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listloafers1_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listloafers1_itemclick", new Object[] {_position,_value}));}
String[] _mysel = null;
String _mylist = "";
String _myprice = "";
String _ret = "";
String _quan = "";
double _subtot3 = 0;
double _dquan = 0;
double _dpr = 0;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub listloafers1_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Dim mysel() As String";
_mysel = new String[(int) (0)];
java.util.Arrays.fill(_mysel,"");
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Dim mylist As String";
_mylist = "";
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="Dim myprice As String";
_myprice = "";
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="SelectedItem = Position";
_selecteditem = _position;
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="mylist = listloafers1.GetItem(SelectedItem)";
_mylist = BA.ObjectToString(mostCurrent._listloafers1.GetItem(_selecteditem));
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="mysel = Regex.Split(\" \",mylist)";
_mysel = anywheresoftware.b4a.keywords.Common.Regex.Split(" ",_mylist);
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="listloafers2.SingleLineLayout.ItemHeight = 15dip";
mostCurrent._listloafers2.getSingleLineLayout().setItemHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (15)));
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="listloafers2.SingleLineLayout.Label.TextSize = 12";
mostCurrent._listloafers2.getSingleLineLayout().Label.setTextSize((float) (12));
RDebugUtils.currentLine=3276809;
 //BA.debugLineNum = 3276809;BA.debugLine="listloafers2.SingleLineLayout.Label.Color = Color";
mostCurrent._listloafers2.getSingleLineLayout().Label.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=3276810;
 //BA.debugLineNum = 3276810;BA.debugLine="listloafers2.SingleLineLayout.Label.TextColor = C";
mostCurrent._listloafers2.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Green);
RDebugUtils.currentLine=3276811;
 //BA.debugLineNum = 3276811;BA.debugLine="myprice = mysel(1)";
_myprice = _mysel[(int) (1)];
RDebugUtils.currentLine=3276813;
 //BA.debugLineNum = 3276813;BA.debugLine="Dim ret As String";
_ret = "";
RDebugUtils.currentLine=3276814;
 //BA.debugLineNum = 3276814;BA.debugLine="inpdlg2.InputType = inpdlg2.INPUT_TYPE_NUMBERS";
mostCurrent._inpdlg2.setInputType(mostCurrent._inpdlg2.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=3276815;
 //BA.debugLineNum = 3276815;BA.debugLine="inpdlg2.Input = \"\"";
mostCurrent._inpdlg2.setInput("");
RDebugUtils.currentLine=3276816;
 //BA.debugLineNum = 3276816;BA.debugLine="inpdlg2.Hint = \"Enter Quantity\"";
mostCurrent._inpdlg2.setHint("Enter Quantity");
RDebugUtils.currentLine=3276817;
 //BA.debugLineNum = 3276817;BA.debugLine="inpdlg2.HintColor = Colors.Gray";
mostCurrent._inpdlg2.setHintColor(anywheresoftware.b4a.keywords.Common.Colors.Gray);
RDebugUtils.currentLine=3276818;
 //BA.debugLineNum = 3276818;BA.debugLine="ret = inpdlg2.Show(\"Quantity\",mylist,\"OK\",\"Cancel";
_ret = BA.NumberToString(mostCurrent._inpdlg2.Show("Quantity",_mylist,"OK","Cancel","",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=3276819;
 //BA.debugLineNum = 3276819;BA.debugLine="If ret = DialogResponse.POSITIVE Then";
if ((_ret).equals(BA.NumberToString(anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE))) { 
RDebugUtils.currentLine=3276820;
 //BA.debugLineNum = 3276820;BA.debugLine="If inpdlg2.Input = \"\" Then";
if ((mostCurrent._inpdlg2.getInput()).equals("")) { 
RDebugUtils.currentLine=3276821;
 //BA.debugLineNum = 3276821;BA.debugLine="Msgbox(\"Please enter value\",\"\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please enter value"),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3276823;
 //BA.debugLineNum = 3276823;BA.debugLine="inpdlg2.InputType = inpdlg2.INPUT_TYPE_NUMBERS";
mostCurrent._inpdlg2.setInputType(mostCurrent._inpdlg2.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=3276824;
 //BA.debugLineNum = 3276824;BA.debugLine="Dim quan As String";
_quan = "";
RDebugUtils.currentLine=3276825;
 //BA.debugLineNum = 3276825;BA.debugLine="quan = inpdlg2.Input";
_quan = mostCurrent._inpdlg2.getInput();
RDebugUtils.currentLine=3276826;
 //BA.debugLineNum = 3276826;BA.debugLine="Dim subtot3 As Double";
_subtot3 = 0;
RDebugUtils.currentLine=3276827;
 //BA.debugLineNum = 3276827;BA.debugLine="Dim dquan As Double : dquan = quan";
_dquan = 0;
RDebugUtils.currentLine=3276827;
 //BA.debugLineNum = 3276827;BA.debugLine="Dim dquan As Double : dquan = quan";
_dquan = (double)(Double.parseDouble(_quan));
RDebugUtils.currentLine=3276828;
 //BA.debugLineNum = 3276828;BA.debugLine="Dim dpr As Double : dpr = myprice";
_dpr = 0;
RDebugUtils.currentLine=3276828;
 //BA.debugLineNum = 3276828;BA.debugLine="Dim dpr As Double : dpr = myprice";
_dpr = (double)(Double.parseDouble(_myprice));
RDebugUtils.currentLine=3276829;
 //BA.debugLineNum = 3276829;BA.debugLine="subtot3 = dquan * dpr";
_subtot3 = _dquan*_dpr;
RDebugUtils.currentLine=3276830;
 //BA.debugLineNum = 3276830;BA.debugLine="txtloafersprice.Text = txtloafersprice.Text + s";
mostCurrent._txtloafersprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtloafersprice.getText()))+_subtot3));
RDebugUtils.currentLine=3276831;
 //BA.debugLineNum = 3276831;BA.debugLine="listloafers2.AddSingleLine(mylist & \" \" & \"(\" &";
mostCurrent._listloafers2.AddSingleLine(BA.ObjectToCharSequence(_mylist+" "+"("+_quan+")"+" "+BA.NumberToString(_subtot3)));
 };
 };
RDebugUtils.currentLine=3276835;
 //BA.debugLineNum = 3276835;BA.debugLine="End Sub";
return "";
}
public static String  _listloafers2_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listloafers2_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listloafers2_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub listloafers2_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return "";
}
public static String  _listloafers2_itemlongclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listloafers2_itemlongclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listloafers2_itemlongclick", new Object[] {_position,_value}));}
String[] _mysel = null;
String _mydel = "";
String _subdel = "";
int _ques = 0;
double _dsubdel = 0;
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub listloafers2_ItemLongClick (Position As Int, V";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="If SelectedItem<0 Then";
if (_selecteditem<0) { 
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="Msgbox(\"Please choose among the list first\",\"\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please choose among the list first"),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="Dim mysel() As String";
_mysel = new String[(int) (0)];
java.util.Arrays.fill(_mysel,"");
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="Dim mydel As String";
_mydel = "";
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="Dim subdel As String";
_subdel = "";
RDebugUtils.currentLine=3538951;
 //BA.debugLineNum = 3538951;BA.debugLine="SelectedItem2 = Position";
_selecteditem2 = _position;
RDebugUtils.currentLine=3538952;
 //BA.debugLineNum = 3538952;BA.debugLine="mydel = listloafers2.GetItem(SelectedItem2)";
_mydel = BA.ObjectToString(mostCurrent._listloafers2.GetItem(_selecteditem2));
RDebugUtils.currentLine=3538953;
 //BA.debugLineNum = 3538953;BA.debugLine="mysel = Regex.Split(\" \",mydel)";
_mysel = anywheresoftware.b4a.keywords.Common.Regex.Split(" ",_mydel);
RDebugUtils.currentLine=3538954;
 //BA.debugLineNum = 3538954;BA.debugLine="subdel = mysel(3)";
_subdel = _mysel[(int) (3)];
RDebugUtils.currentLine=3538955;
 //BA.debugLineNum = 3538955;BA.debugLine="Dim ques As Int";
_ques = 0;
RDebugUtils.currentLine=3538956;
 //BA.debugLineNum = 3538956;BA.debugLine="ques = Msgbox2(\"Delete\" & mydel,\"Remove Item\",\"O";
_ques = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Delete"+_mydel),BA.ObjectToCharSequence("Remove Item"),"OK","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=3538957;
 //BA.debugLineNum = 3538957;BA.debugLine="If ques = DialogResponse.POSITIVE Then";
if (_ques==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=3538958;
 //BA.debugLineNum = 3538958;BA.debugLine="listloafers2.RemoveAt(SelectedItem2)";
mostCurrent._listloafers2.RemoveAt(_selecteditem2);
RDebugUtils.currentLine=3538959;
 //BA.debugLineNum = 3538959;BA.debugLine="Dim SelectedItem2 As Int : SelectedItem2 = -1";
_selecteditem2 = 0;
RDebugUtils.currentLine=3538959;
 //BA.debugLineNum = 3538959;BA.debugLine="Dim SelectedItem2 As Int : SelectedItem2 = -1";
_selecteditem2 = (int) (-1);
RDebugUtils.currentLine=3538960;
 //BA.debugLineNum = 3538960;BA.debugLine="Dim dsubdel As Double : dsubdel = subdel";
_dsubdel = 0;
RDebugUtils.currentLine=3538960;
 //BA.debugLineNum = 3538960;BA.debugLine="Dim dsubdel As Double : dsubdel = subdel";
_dsubdel = (double)(Double.parseDouble(_subdel));
RDebugUtils.currentLine=3538961;
 //BA.debugLineNum = 3538961;BA.debugLine="txtloafersprice.Text = txtloafersprice.Text - d";
mostCurrent._txtloafersprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtloafersprice.getText()))-_dsubdel));
 };
 };
RDebugUtils.currentLine=3538964;
 //BA.debugLineNum = 3538964;BA.debugLine="End Sub";
return "";
}
public static String  _spinheels_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinheels_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinheels_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub spinheels_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="If spinheels.SelectedIndex = 1 Then";
if (mostCurrent._spinheels.getSelectedIndex()==1) { 
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="imgheels.Bitmap = LoadBitmap(File.DirAssets, \"he";
mostCurrent._imgheels.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"heels1.jpg").getObject()));
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="myitem = \"Heels 1=100\"";
mostCurrent._myitem = "Heels 1=100";
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="price1 = 100";
mostCurrent._price1 = BA.NumberToString(100);
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="spinheels.SelectedIndex = 0";
mostCurrent._spinheels.setSelectedIndex((int) (0));
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="compute";
_compute();
 }else 
{RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="Else If spinheels.SelectedIndex = 2 Then";
if (mostCurrent._spinheels.getSelectedIndex()==2) { 
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="imgheels.Bitmap = LoadBitmap(File.DirAssets, \"he";
mostCurrent._imgheels.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"heels2.jpg").getObject()));
RDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="myitem = \"Heels 2=120\"";
mostCurrent._myitem = "Heels 2=120";
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="price1 = 120";
mostCurrent._price1 = BA.NumberToString(120);
RDebugUtils.currentLine=2949131;
 //BA.debugLineNum = 2949131;BA.debugLine="spinheels.SelectedIndex = 0";
mostCurrent._spinheels.setSelectedIndex((int) (0));
RDebugUtils.currentLine=2949132;
 //BA.debugLineNum = 2949132;BA.debugLine="compute";
_compute();
 }else 
{RDebugUtils.currentLine=2949133;
 //BA.debugLineNum = 2949133;BA.debugLine="Else If spinheels.SelectedIndex = 3 Then";
if (mostCurrent._spinheels.getSelectedIndex()==3) { 
RDebugUtils.currentLine=2949134;
 //BA.debugLineNum = 2949134;BA.debugLine="imgheels.Bitmap = LoadBitmap(File.DirAssets, \"he";
mostCurrent._imgheels.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"heels3.jpg").getObject()));
RDebugUtils.currentLine=2949135;
 //BA.debugLineNum = 2949135;BA.debugLine="myitem = \"Heels 3=140\"";
mostCurrent._myitem = "Heels 3=140";
RDebugUtils.currentLine=2949136;
 //BA.debugLineNum = 2949136;BA.debugLine="price1 = 140";
mostCurrent._price1 = BA.NumberToString(140);
RDebugUtils.currentLine=2949137;
 //BA.debugLineNum = 2949137;BA.debugLine="spinheels.SelectedIndex = 0";
mostCurrent._spinheels.setSelectedIndex((int) (0));
RDebugUtils.currentLine=2949138;
 //BA.debugLineNum = 2949138;BA.debugLine="compute";
_compute();
 }}}
;
RDebugUtils.currentLine=2949140;
 //BA.debugLineNum = 2949140;BA.debugLine="End Sub";
return "";
}
public static String  _spinwedges_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="shoes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinwedges_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinwedges_itemclick", new Object[] {_position,_value}));}
String _wedges = "";
double _price2 = 0;
double _total2 = 0;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub spinwedges_ItemClick (Position As Int, Value A";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim wedges As String";
_wedges = "";
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Dim price2, total2 As Double";
_price2 = 0;
_total2 = 0;
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="If spinwedges.SelectedIndex = 1 Then";
if (mostCurrent._spinwedges.getSelectedIndex()==1) { 
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="imgwedges.Bitmap = LoadBitmap(File.DirAssets, \"w";
mostCurrent._imgwedges.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"wedges1.jpg").getObject()));
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="wedges = \"Wedges 1 =160\"";
_wedges = "Wedges 1 =160";
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="price2 = 160";
_price2 = 160;
 }else 
{RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="Else If spinwedges.SelectedIndex = 2 Then";
if (mostCurrent._spinwedges.getSelectedIndex()==2) { 
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="imgwedges.Bitmap = LoadBitmap(File.DirAssets, \"w";
mostCurrent._imgwedges.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"wedges2.jpg").getObject()));
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="wedges = \"Wedges 2 =180\"";
_wedges = "Wedges 2 =180";
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="price2 = 180";
_price2 = 180;
 }else 
{RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="Else If spinwedges.SelectedIndex = 3 Then";
if (mostCurrent._spinwedges.getSelectedIndex()==3) { 
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="imgwedges.Bitmap = LoadBitmap(File.DirAssets, \"w";
mostCurrent._imgwedges.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"wedges3.jpg").getObject()));
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="wedges = \"Wedges 3 =200\"";
_wedges = "Wedges 3 =200";
RDebugUtils.currentLine=3145743;
 //BA.debugLineNum = 3145743;BA.debugLine="price2 = 200";
_price2 = 200;
 }}}
;
RDebugUtils.currentLine=3145745;
 //BA.debugLineNum = 3145745;BA.debugLine="total2 = price2 * txtwedgesquan.Text";
_total2 = _price2*(double)(Double.parseDouble(mostCurrent._txtwedgesquan.getText()));
RDebugUtils.currentLine=3145746;
 //BA.debugLineNum = 3145746;BA.debugLine="txtwedgesprice.Text = txtwedgesprice.Text + total";
mostCurrent._txtwedgesprice.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtwedgesprice.getText()))+_total2));
RDebugUtils.currentLine=3145747;
 //BA.debugLineNum = 3145747;BA.debugLine="listwedges.SingleLineLayout.ItemHeight = 15dip";
mostCurrent._listwedges.getSingleLineLayout().setItemHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (15)));
RDebugUtils.currentLine=3145748;
 //BA.debugLineNum = 3145748;BA.debugLine="listwedges.SingleLineLayout.Label.TextSize = 12";
mostCurrent._listwedges.getSingleLineLayout().Label.setTextSize((float) (12));
RDebugUtils.currentLine=3145749;
 //BA.debugLineNum = 3145749;BA.debugLine="listwedges.SingleLineLayout.Label.Color = Colors.";
mostCurrent._listwedges.getSingleLineLayout().Label.setColor(anywheresoftware.b4a.keywords.Common.Colors.Cyan);
RDebugUtils.currentLine=3145750;
 //BA.debugLineNum = 3145750;BA.debugLine="listwedges.SingleLineLayout.Label.TextColor = Col";
mostCurrent._listwedges.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=3145751;
 //BA.debugLineNum = 3145751;BA.debugLine="listwedges.AddSingleLine(wedges & \"\" & \" (\" & txt";
mostCurrent._listwedges.AddSingleLine(BA.ObjectToCharSequence(_wedges+""+" ("+mostCurrent._txtwedgesquan.getText()+") "+BA.NumberToString(_total2)));
RDebugUtils.currentLine=3145752;
 //BA.debugLineNum = 3145752;BA.debugLine="spinwedges.SelectedIndex = 0";
mostCurrent._spinwedges.setSelectedIndex((int) (0));
RDebugUtils.currentLine=3145753;
 //BA.debugLineNum = 3145753;BA.debugLine="txtwedgesquan.Text = \"1\"";
mostCurrent._txtwedgesquan.setText(BA.ObjectToCharSequence("1"));
RDebugUtils.currentLine=3145754;
 //BA.debugLineNum = 3145754;BA.debugLine="End Sub";
return "";
}
}