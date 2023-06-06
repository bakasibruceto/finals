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

	Private tabshoes As TabHost
	Private spinheels As Spinner
	Private imgheels As ImageView
	Private listheels As ListView
	Dim inpdlg As InputDialog
	Dim myitem As String
	Dim price1 As String
	Private txtheelsprice As EditText
	
	Private spinwedges As Spinner
	Private listwedges As ListView
	Private txtwedgesprice As EditText
	Private txtwedgesquan As EditText
	Private imgwedges As ImageView
	
	Private listloafers1 As ListView
	Private listloafers2 As ListView
	Private txtloafersprice As EditText
	Dim inpdlg2 As InputDialog
	Dim SelectedItem As Int :SelectedItem = -1
	Dim SelectedItem2 As Int :SelectedItem2 = -1
	Private txtshoestot As EditText
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("layshoes2")
	tabshoes.AddTab("Heels", "layheels.bal")
	spinheels.Add("Select Heels")
	spinheels.Add("Heels 1 = 100")
	spinheels.Add("Heels 2 = 120")
	spinheels.Add("Heels 3 = 140")
	
	tabshoes.AddTab("Wedges", "laywedges.bal")
	spinwedges.Add("Select Wedges")
	spinwedges.Add("Wedges1 = 160")
	spinwedges.Add("Wedges2 = 180")
	spinwedges.Add("Wedges3 = 200")
	
	tabshoes.AddTab("Loafers", "layloafers.bal")
	listloafers1.SingleLineLayout.ItemHeight = 15dip
	listloafers1.SingleLineLayout.Label.TextSize = 12
	listloafers1.SingleLineLayout.Label.Color = Colors.Cyan
	listloafers1.SingleLineLayout.Label.TextColor = Colors.Blue
	listloafers1.AddSingleLine("Loafer1" & " " & "220")
	listloafers1.AddSingleLine("Loafer2" & " " & "240")
	listloafers1.AddSingleLine("Loafer3" & " " & "260")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub spinheels_ItemClick (Position As Int, Value As Object)
	If spinheels.SelectedIndex = 1 Then
		imgheels.Bitmap = LoadBitmap(File.DirAssets, "heels1.jpg")
		myitem = "Heels 1=100"
		price1 = 100
		spinheels.SelectedIndex = 0
		compute
	Else If spinheels.SelectedIndex = 2 Then
		imgheels.Bitmap = LoadBitmap(File.DirAssets, "heels2.jpg")
		myitem = "Heels 2=120"
		price1 = 120
		spinheels.SelectedIndex = 0
		compute
	Else If spinheels.SelectedIndex = 3 Then
		imgheels.Bitmap = LoadBitmap(File.DirAssets, "heels3.jpg")
		myitem = "Heels 3=140"
		price1 = 140
		spinheels.SelectedIndex = 0
		compute
	End If
End Sub

Sub compute()
	inpdlg.InputType = inpdlg.INPUT_TYPE_NUMBERS
	inpdlg.Input="1"
	inpdlg.Hint = "Enter Quantity"
	inpdlg.HintColor = Colors.Gray
	
	Dim inpquan As String
	inpquan = inpdlg.Show ("Quantity",myitem,"OK","Cancel","",Null)
	If inpquan = DialogResponse.POSITIVE Then
		If inpdlg.Input = "" Then
			Msgbox("Please Enter Value","")
		Else
			Dim squan As String
			squan = inpdlg.Input
			
			Dim  subtotal As Double
			Dim dprice As Double : dprice = price1
			Dim dquan As Double : dquan = squan
			subtotal = dprice * dquan
			
			listheels.SingleLineLayout.ItemHeight = 15dip
			listheels.SingleLineLayout.Label.TextSize = 12
			listheels.SingleLineLayout.Label.Color = Colors.Cyan
			listheels.SingleLineLayout.Label.TextColor = Colors.Blue
			listheels.AddSingleLine(myitem & "" & "(" & squan & ")" & subtotal)
			txtheelsprice.Text = txtheelsprice.Text + subtotal
		End If
	End If
End Sub

Sub btnheelsclear_Click
	listheels.Clear
	txtheelsprice.Text = 0
	spinheels.SelectedIndex = 0
	imgheels.Bitmap = LoadBitmap(File.DirAssets, "white.jpg")
End Sub

Sub spinwedges_ItemClick (Position As Int, Value As Object)
	Dim wedges As String
	Dim price2, total2 As Double
	
	If spinwedges.SelectedIndex = 1 Then
		imgwedges.Bitmap = LoadBitmap(File.DirAssets, "wedges1.jpg")
		wedges = "Wedges 1 =160"
		price2 = 160
	Else If spinwedges.SelectedIndex = 2 Then
		imgwedges.Bitmap = LoadBitmap(File.DirAssets, "wedges2.jpg")
		wedges = "Wedges 2 =180"
		price2 = 180
	Else If spinwedges.SelectedIndex = 3 Then
		imgwedges.Bitmap = LoadBitmap(File.DirAssets, "wedges3.jpg")
		wedges = "Wedges 3 =200"
		price2 = 200
	End If
	total2 = price2 * txtwedgesquan.Text
	txtwedgesprice.Text = txtwedgesprice.Text + total2
	listwedges.SingleLineLayout.ItemHeight = 15dip
	listwedges.SingleLineLayout.Label.TextSize = 12
	listwedges.SingleLineLayout.Label.Color = Colors.Cyan
	listwedges.SingleLineLayout.Label.TextColor = Colors.Blue
	listwedges.AddSingleLine(wedges & "" & " (" & txtwedgesquan.Text & ") " & total2)
	spinwedges.SelectedIndex = 0
	txtwedgesquan.Text = "1"
End Sub

Sub btnwedgesclear_Click
	listwedges.Clear
	txtwedgesquan.Text = 1
	txtwedgesprice.Text = 0
	spinwedges.SelectedIndex = 0
	imgwedges.Bitmap = LoadBitmap(File.DirAssets, "white.jpg")
End Sub

Sub listloafers1_ItemClick (Position As Int, Value As Object)
	Dim mysel() As String
	Dim mylist As String
	Dim myprice As String
	SelectedItem = Position
	mylist = listloafers1.GetItem(SelectedItem)
	mysel = Regex.Split(" ",mylist)
	listloafers2.SingleLineLayout.ItemHeight = 15dip
	listloafers2.SingleLineLayout.Label.TextSize = 12
	listloafers2.SingleLineLayout.Label.Color = Colors.White
	listloafers2.SingleLineLayout.Label.TextColor = Colors.Green
	myprice = mysel(1)
	
	Dim ret As String
	inpdlg2.InputType = inpdlg2.INPUT_TYPE_NUMBERS
	inpdlg2.Input = ""
	inpdlg2.Hint = "Enter Quantity"
	inpdlg2.HintColor = Colors.Gray
	ret = inpdlg2.Show("Quantity",mylist,"OK","Cancel","",Null)
	If ret = DialogResponse.POSITIVE Then
		If inpdlg2.Input = "" Then
			Msgbox("Please enter value","")
		Else
			inpdlg2.InputType = inpdlg2.INPUT_TYPE_NUMBERS
			Dim quan As String
			quan = inpdlg2.Input
			Dim subtot3 As Double
			Dim dquan As Double : dquan = quan
			Dim dpr As Double : dpr = myprice
			subtot3 = dquan * dpr
			txtloafersprice.Text = txtloafersprice.Text + subtot3
			listloafers2.AddSingleLine(mylist & " " & "(" & quan & ")" & " " & subtot3)
		End If
	End If

End Sub

Sub btnloafersclear_Click
	listloafers2.Clear
	txtloafersprice.Text = 0
	listloafers2.Enabled = False
End Sub

Sub listloafers2_ItemClick (Position As Int, Value As Object)
	
End Sub

Sub btndel_Click
	listloafers2.Enabled = True
	ToastMessageShow("List Item Enabled, Long Click in List Item to remove from the list", False)
End Sub

Sub listloafers2_ItemLongClick (Position As Int, Value As Object)
	If SelectedItem<0 Then
		Msgbox("Please choose among the list first","")
	Else
		Dim mysel() As String
		Dim mydel As String
		Dim subdel As String
		SelectedItem2 = Position
		mydel = listloafers2.GetItem(SelectedItem2)
		mysel = Regex.Split(" ",mydel)
		subdel = mysel(3)
		Dim ques As Int
		ques = Msgbox2("Delete" & mydel,"Remove Item","OK","","No",Null)
		If ques = DialogResponse.POSITIVE Then
			listloafers2.RemoveAt(SelectedItem2)
			Dim SelectedItem2 As Int : SelectedItem2 = -1
			Dim dsubdel As Double : dsubdel = subdel
			txtloafersprice.Text = txtloafersprice.Text - dsubdel
		End If
	End If
End Sub

Sub btnheelsaccept_Click
	txtshoestot.Text = txtheelsprice.Text + txtwedgesprice.Text + txtloafersprice.Text
End Sub

Sub btnwedgesaccept_Click
	txtshoestot.Text = txtheelsprice.Text + txtwedgesprice.Text + txtloafersprice.Text
End Sub

Sub btnloafersaccept_Click
	txtshoestot.Text = txtheelsprice.Text + txtwedgesprice.Text + txtloafersprice.Text
End Sub

Sub btnshoesclear_Click
	Dim clr As Int
	clr = Msgbox2("Are You Sure to Close?","","Yes","","No",Null)
	If clr = DialogResponse.POSITIVE Then
		listheels.Clear
		txtheelsprice.Text = 0
		spinheels.SelectedIndex = 0
		imgheels.Bitmap = LoadBitmap(File.DirAssets, "white.jpg")
		listwedges.Clear
		txtwedgesquan.Text = 1
		txtwedgesprice.Text = 0
		spinwedges.SelectedIndex = 0
		imgwedges.Bitmap = LoadBitmap(File.DirAssets, "white.jpg")
		listloafers2.Clear
		txtloafersprice.Text = 0
		listloafers2.Enabled = False
		txtshoestot.Text = 0
	End If
End Sub

Sub btnshoesaccept_Click
	Dim acc As Int
	acc = Msgbox2("Are You Sure to Accept?","","Yes","","No",Null)
	If acc = DialogResponse.POSITIVE Then
		Main.totshoes = txtshoestot.Text
	End If
End Sub

Sub btnshoesclose_Click
	Dim cls As Int
	cls = Msgbox2("Are You Sure to Close?","","Yes","","No",Null)
	If cls = DialogResponse.POSITIVE Then
		Activity.Finish
	End If
End Sub