
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class shoes implements IRemote{
	public static shoes mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public shoes() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("shoes"), "b4a.example.shoes");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, shoes.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _tabshoes = RemoteObject.declareNull("anywheresoftware.b4a.objects.TabHostWrapper");
public static RemoteObject _spinheels = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _imgheels = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _listheels = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _inpdlg = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog");
public static RemoteObject _myitem = RemoteObject.createImmutable("");
public static RemoteObject _price1 = RemoteObject.createImmutable("");
public static RemoteObject _txtheelsprice = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _spinwedges = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _listwedges = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _txtwedgesprice = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtwedgesquan = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _imgwedges = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _listloafers1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _listloafers2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _txtloafersprice = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _inpdlg2 = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog");
public static RemoteObject _selecteditem = RemoteObject.createImmutable(0);
public static RemoteObject _selecteditem2 = RemoteObject.createImmutable(0);
public static RemoteObject _txtshoestot = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.clothes _clothes = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",shoes.mostCurrent._activity,"Clothes",Debug.moduleToString(b4a.example.clothes.class),"imgheels",shoes.mostCurrent._imgheels,"imgwedges",shoes.mostCurrent._imgwedges,"inpdlg",shoes.mostCurrent._inpdlg,"inpdlg2",shoes.mostCurrent._inpdlg2,"listheels",shoes.mostCurrent._listheels,"listloafers1",shoes.mostCurrent._listloafers1,"listloafers2",shoes.mostCurrent._listloafers2,"listwedges",shoes.mostCurrent._listwedges,"Main",Debug.moduleToString(b4a.example.main.class),"myitem",shoes.mostCurrent._myitem,"price1",shoes.mostCurrent._price1,"SelectedItem",shoes._selecteditem,"SelectedItem2",shoes._selecteditem2,"spinheels",shoes.mostCurrent._spinheels,"spinwedges",shoes.mostCurrent._spinwedges,"Starter",Debug.moduleToString(b4a.example.starter.class),"tabshoes",shoes.mostCurrent._tabshoes,"txtheelsprice",shoes.mostCurrent._txtheelsprice,"txtloafersprice",shoes.mostCurrent._txtloafersprice,"txtshoestot",shoes.mostCurrent._txtshoestot,"txtwedgesprice",shoes.mostCurrent._txtwedgesprice,"txtwedgesquan",shoes.mostCurrent._txtwedgesquan};
}
}