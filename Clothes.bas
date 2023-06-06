B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=10.2
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private tabclothes As TabHost
	Private chkblouse1 As CheckBox
	Private chkblouse2 As CheckBox
	Private chkblouse3 As CheckBox
	Private txtblouseprice As EditText
	Private btnblouseclear As Button
	Private rdbpants1 As RadioButton
	Private rdbpants2 As RadioButton
	Private rdbpants3 As RadioButton
	Private txtpantsprice As EditText
	Private chkshorts1 As CheckBox
	Private chkshorts2 As CheckBox
	Private chkshorts3 As CheckBox
	Private txtshortsprice As EditText
	Private txtclothestot As EditText
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("layclothes")
	tabclothes.AddTab("Blouse", "layblouse.bal")
	tabclothes.AddTab("Pants", "laypants.bal")
	tabclothes.AddTab("Shorts", "layshorts.bal")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)
	
End Sub

Sub chkblouse1_CheckedChange(Checked As Boolean)
	If chkblouse1.Checked = True Then
		txtblouseprice.Text = txtblouseprice.Text + 200
	Else
		txtblouseprice.Text = txtblouseprice.Text - 200
	End If
End Sub

Sub chkblouse2_CheckedChange(Checked As Boolean)
	If chkblouse2.Checked = True Then
		txtblouseprice.Text = txtblouseprice.Text + 250
	Else
		txtblouseprice.Text = txtblouseprice.Text - 250
	End If
End Sub

Sub chkblouse3_CheckedChange(Checked As Boolean)
	If chkblouse3.Checked = True Then
		txtblouseprice.Text = txtblouseprice.Text + 300
	Else
		txtblouseprice.Text = txtblouseprice.Text - 300
	End If
End Sub

Sub rdbpants1_CheckedChange(Checked As Boolean)
	txtpantsprice.Text = 350
End Sub

Sub rdbpants2_CheckedChange(Checked As Boolean)
	txtpantsprice.Text = 400
End Sub

Sub rdbpants3_CheckedChange(Checked As Boolean)
	txtpantsprice.Text = 450
End Sub

Sub chkshorts1_CheckedChange(Checked As Boolean)
	If chkshorts1.Checked = True Then
		txtshortsprice.Text = txtshortsprice.Text + 500
	Else
		txtshortsprice.Text = txtshortsprice.Text - 500
	End If
End Sub

Sub chkshorts2_CheckedChange(Checked As Boolean)
	If chkshorts2.Checked = True Then
		txtshortsprice.Text = txtshortsprice.Text + 550
	Else
		txtshortsprice.Text = txtshortsprice.Text - 550
	End If
End Sub

Sub chkshorts3_CheckedChange(Checked As Boolean)
	If chkshorts3.Checked = True Then
		txtshortsprice.Text = txtshortsprice.Text + 600
	Else
		txtshortsprice.Text = txtshortsprice.Text - 600
	End If
End Sub

Sub btnblouseclear_Click
	chkblouse1.Checked = False
	chkblouse2.Checked = False
	chkblouse3.Checked = False
	txtblouseprice.Text = 0
End Sub

Sub btnpantsclear_Click
	rdbpants1.Checked = False
	rdbpants2.Checked = False
	rdbpants3.Checked = False
	txtpantsprice.Text = 0
End Sub

Sub btnshortsclear_Click
	chkshorts1.Checked = False
	chkshorts2.Checked = False
	chkshorts3.Checked = False
	txtshortsprice.Text = 0
End Sub

Sub btnblouseaccept_Click
	txtclothestot.Text = txtblouseprice.Text + txtpantsprice.Text + txtshortsprice.Text
End Sub

Sub btnpantsaccept_Click
	txtclothestot.Text = txtblouseprice.Text + txtpantsprice.Text + txtshortsprice.Text
End Sub

Sub btnshortsaccept_Click
	txtclothestot.Text = txtblouseprice.Text + txtpantsprice.Text + txtshortsprice.Text
End Sub

Sub btnclothesclear_Click
	Dim clear As Int
	clear = Msgbox2("Are You Sure to Clear?","","Yes","","No",Null)
	If clear = DialogResponse.POSITIVE Then
		chkblouse1.Checked = False
		chkblouse2.Checked = False
		chkblouse3.Checked = False
		txtblouseprice.Text = 0
		rdbpants1.Checked = False
		rdbpants2.Checked = False
		rdbpants3.Checked = False
		txtpantsprice.Text = 0
		chkshorts1.Checked = False
		chkshorts2.Checked = False
		chkshorts3.Checked = False
		txtshortsprice.Text = 0
		txtclothestot.Text = 0
	End If
End Sub

Sub btnclothesaccept_Click
	Dim acc As Int
	acc = Msgbox2("Are You Sure to Accept?","","Yes","","No",Null)
	If acc = DialogResponse.POSITIVE Then
		Main.totclothes = txtclothestot.Text
	End If
End Sub

Sub btnclothesclose_Click
	Dim cls As Int
	cls = Msgbox2("Are You Sure to Close?","","Yes","","No",Null)
	If cls = DialogResponse.POSITIVE Then
		Activity.Finish
	End If
End Sub