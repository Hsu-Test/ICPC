package KattisProblems;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.StringTokenizer;
public class Calculate extends JFrame implements ActionListener{
java.net.URL url1 = ClassLoader.getSystemResource("HospitalSystemJava/Plus1.jpg");
JLabel l1,l2,l3,l4;
JTextField f1,f2,f3;
JButton b1,b2,b3;
JPanel cal,main;
static String s1;
String url="jdbc:mysql://localhost:3306/Hospital?autoReconnect=true&useSSL=false";
String username="root";
String password="rootroot";
public Calculate(){
	setTitle("Calculating Medicine");
	setSize(200,200);
	
	l1=new JLabel("Medicine");
	l2=new JLabel("Quantity");
	l3=new JLabel("Price");
	l4=new JLabel();
	
	f1=new JTextField();
	f2=new JTextField();
	f3=new JTextField();
	
	b1=new JButton("Calculate");
	//b2=new JButton("Insert");
	//b3=new JButton("Clear");
	
	cal=new JPanel();
	main=new JPanel();
	main.setLayout(new BorderLayout());
	cal.setLayout(new GridLayout(4,2));
	cal.add(l1);cal.add(f1);
	cal.add(l2);cal.add(f2);
	cal.add(l3);cal.add(f3);
	cal.add(b1);cal.add(l4);
//	cal.add(b2);cal.add(b3);
	
	b1.addActionListener(this);
//	b2.addActionListener(this);
//	b3.addActionListener(this);
		
	Toolkit kit = Toolkit.getDefaultToolkit();
	Image img = kit.createImage(url1);
	
	JTabbedPane tab=new JTabbedPane();
	tab.addTab("Calculating Medicine",cal);
	
	main.add(tab);
	main.setSize(200,200);
	setSize(400,300);
	setLocation(0,450);
	setContentPane(main);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	setResizable(true);
	setIconImage(img);
}
public void actionPerformed(ActionEvent e){
	if(e.getSource()==b1){
		//setVisible(true);
		String a=f2.getText();
		String b=f2.getText();
		String c=f3.getText();
		s1=String.valueOf(checking(a,b,c));
	//	System.out.print(s1);
		l4.setText("="+s1);
		setS1(s1);
		getS1();
	}
	}

private double checking(String name,String quantity,String price) {
	{
		String []names=new String[20];
		String []q =new String[20];
		Integer []qValue = new Integer[]{};
		String []p=new String[20];
		Double []pValue = new Double[]{};
		
		double calculate=0.0;
		double b=0.0;
		int qcount=0,pcount=0;
		int n=0;
		StringTokenizer strrName=new StringTokenizer(quantity,"+");
		while( strrName.hasMoreTokens()){
			names[n]=strrName.nextToken();
			//qValue[i]=Double.parseDouble(q[i]);
			n++;
		}
		StringTokenizer st1=new StringTokenizer(quantity,"+");
		while( st1.hasMoreTokens()){
			q[qcount]=st1.nextToken();
			//qValue[i]=Double.parseDouble(q[i]);
			qcount++;
		}
		qValue=new Integer[qcount];
		for(int j=0;j<qcount;j++){
			
			qValue[j]=Integer.parseInt(q[j]);
		}
		StringTokenizer st2=new StringTokenizer(price,"+");
		while( st2.hasMoreTokens()){
			p[pcount]=st2.nextToken();
			//pValue[i]=Double.parseDouble(p[i]);
			pcount++;
		}
		pValue=new Double[pcount];
		for(int j=0;j<pcount;j++){
			
			pValue[j]=Double.parseDouble(p[j]);
		}
		for (int k=0;k<qcount;k++){
			b=qValue[k]*pValue[k];
			calculate+=b;
		}
		return calculate;
	}
	}
public static void main(String args[]){
	new Calculate();
}
public String getS1() {
	return s1;
}
public void setS1(String s1) {
	Calculate.s1 = s1;
}

}
