import javax.swing.*;
import java.awt.event.*;
import java .awt.*;

class project{
	project(){
		JFrame f= new JFrame("Diet Recommender");
		JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
		JTextField t1,t2,t3,t4;
		
		l = new JLabel("DIET PLANNER");		//title label
		l.setFont(new Font("Algerian",Font.BOLD,37));
		l.setForeground(Color.WHITE);
		l.setBounds(475,0,400,70);
		f.add(l);
		
		Font font1 = new Font("SansSerif", Font.PLAIN, 20);
		Font font2 = new Font("Berlin Sans FB Demi",Font.PLAIN,25);
		
		l1 = new JLabel("NAME: ");
		l1.setFont(font2);
		l1.setForeground(Color.WHITE);
		l1.setBounds(30,80,120,30);
		f.add(l1);
		t1 = new JTextField();
		t1.setBounds(145,80,240,30);
		t1.setFont(font1);
		f.add(t1);
		
		l2 = new JLabel("AGE: ");
		l2.setFont(font2);
		l2.setForeground(Color.WHITE);
		l2.setBounds(30,140,120,30);
		f.add(l2);
		t2 = new JTextField();
		t2.setBounds(145,140,240,30);
		t2.setFont(font1);
		f.add(t2);
		
		l3 = new JLabel("GENDER: ");
		l3.setFont(font2);
		l3.setForeground(Color.WHITE);
		l3.setBounds(30,200,140,30);
		f.add(l3);
		JRadioButton r1,r2;
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		r1.setFont(font1);
		r2.setFont(font1);
		r1.setBounds(145,200,110,30);
		r2.setBounds(256,200,120,30);
		ButtonGroup bg= new ButtonGroup();
		f.add(r1);f.add(r2);		//this is also needed for display purpose
		bg.add(r1);		//to ensure only one option is selected
		bg.add(r2);
		
		l4 = new JLabel("HEIGHT: ");
		l4.setFont(font2);
		l4.setForeground(Color.WHITE);
		l4.setBounds(30,260,120,30);
		f.add(l4);
		t3 = new JTextField();
		t3.setBounds(145,260,240,30);
		t3.setFont(font1);
		f.add(t3);
		l9 = new JLabel(" 'Height in cms' ");
		l9.setForeground(Color.WHITE);
		l9.setBounds(180,290,100,20);
		f.add(l9);
		
		l6 = new JLabel("WEIGHT: ");
		l6.setFont(font2);
		l6.setForeground(Color.WHITE);
		l6.setBounds(30,340,120,30);
		f.add(l6);
		t4 = new JTextField();
		t4.setBounds(145,340,240,30);
		t4.setFont(font1);
		f.add(t4);
		
		l8 = new JLabel("FOOD CHOICE :");
		l8.setForeground(Color.WHITE);
		l8.setFont(font2);
		l8.setBounds(30,410,180,30);
		f.add(l8);
		String ch[]={"Vegetarian","Non-Vegetarian"};
		JComboBox cb1 = new JComboBox(ch);
		cb1.setBounds(145,450,250,30);
		f.add(cb1);
				
		JMenuBar mb = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		JMenuItem a1 = new JMenuItem("AboutUs");
		JMenuItem a2 = new JMenuItem("Concepts Used");
		menu.add(a1);
		menu.add(a2);
		mb.add(menu);
		f.setJMenuBar(mb);
		a1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if (ae.getSource()==a1)
					JOptionPane.showMessageDialog(f, "We Bhuvan and Shreya has worked on various fields\n" + " to give you an Excellant Diet planner",
					"AboutUs",JOptionPane.INFORMATION_MESSAGE);
		}});
		a2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae1){
				if (ae1.getSource()==a2)
					JOptionPane.showMessageDialog(f,"We have made use of the following concepts\n"+"1.JFrame  2.JLabel  3.JTextField\n"+"4.JRadioButton  5.JScrollPane  6.JMenuBar\n"+
									"7.JButton  8.JComboBox  9.JOptionPane\n"+"10.MultiThreading","Concepts Used",JOptionPane.INFORMATION_MESSAGE);
		}});							

		JButton b= new JButton("Submit");
		b.setBounds(200,540,100,30);
		f.add(b);
		
		String uvm[][] = {{"Milk","250 ml"},{"Banana","1"},{"Idli/Chappathi","3"},{"",""},{"",""}};
		String uvl[][] = {{"Chappathi","4"},{"Vegetable","1 cup"},{"Rice","1 bowl"},{"Dal","1 cup"},{"",""}};
		String uvs[][] = {{"Pulses/sprouts","1 bowl"},{"raisens","15 grams"},{"",""},{"",""},{"",""}};
		String uvd[][] = {{"Poori/Chapathi","4"},{"Soya beans","30 grams"},{"Salad","1 bowl"},{"",""},{"",""}};
		
		String unvm[][] = {{"Milk","250 ml"},{"Eggs","2"},{"Banana","1"},{"Avacado toast/idly","3"},{"Raspberry shake","1 Glass"}};
		String unvl[][] = {{"Rice","1 Bowl"},{"Fish/Meat","2 Piece"},{"Yoghurt","1 Cup"},{"",""}};
		String unvs[][] = {{"Pulses/Sprouts","1 Bowl"},{"Raisens","25 grams"},{"",""},{"",""}};
		String unvd[][] = {{"Chapathi","3 /4"},{"Meat/Soya chunks","1 Bowl"},{"Salad","1 Bowl"},{"",""}};

		String ovm[][] = {{"Hot Water With Honey","1 Glass"},{"Vegetable Soup","1 Bowl"},{"Broccoli With Wheat Bread Toast","2"},{"",""},{"",""}};
		String ovl[][] = {{"Dhal","1 Bowl"},{"Rice Along With Green Vegetables","1 Bowl"},{"",""},{"",""},{"",""}};
		String ovs[][] = {{"Apple","1"},{"Corn","1 Cup"},{"Whole Grains","25 Grams"},{"",""},{"",""}};
		String ovd[][] = {{"Chapathi","2"},{"Tofu/Soya Beans","1 Bowl"},{"Green Tea","1 Cup"},{"",""},{"",""}};
		
		String onvm[][] = {{"Hot Water With Honey","1 Glass"},{"omelete/Bread Toast","2"},{"Nuts","25 Grams"},{"",""},{"",""}};
		String onvl[][] = {{"Rice","1 Bowl"},{"Dhal","1 Bowl"},{"Salmon Fish","1 Piece"},{"",""},{"",""},{"",""}};
		String onvs[][] = {{"Hard Boiled Eggs","2"},{"Apple","1"},{"Almonds & Grains","15 Grams"},{"",""},{"",""}};
		String onvd[][] = {{"Meat Soup","1 Bowl"},{"Chapathi/Vegetable Sandwitch","2"},{"Green Tea","1 Cup"},{"",""},{"",""}};
		
		b.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e){
				String s1 = t3.getText();
				String s2 = t4.getText();
				String s3 = cb1.getSelectedItem().toString();
				String s4 = "Vegetarian";
				String s5 = t1.getText();
				String s6 = s5.toUpperCase();	
				float i1,i2,i3,i4;
				i1 = Float.parseFloat(s1);
				i2 = Float.parseFloat(s2);
				i3 = (i1*i1)/10000;
				i4 = i2/i3;
				String s7 = "Hi! "+s6+" Your BMI is "+i4;
					JLabel b1 = new JLabel("Breakfast");
					b1.setFont(font2);
					b1.setBounds(250,60,200,35);
					JLabel b2 = new JLabel("Lunch");
					b2.setFont(font2);
					b2.setBounds(750,60,200,35);
					JLabel b3 = new JLabel("Snacks");
					b3.setFont(font2);
					b3.setBounds(250,250,200,35);
					JLabel b4 = new JLabel("Dinner");
					b4.setFont(font2);
					b4.setBounds(750,250,200,35);
					JLabel b5 = new JLabel();
					b5.setFont(font1);
					b5.setBounds(150,500,800,40);
					JLabel b6 = new JLabel();
					b6.setFont(font1);
					b6.setBounds(150,550,900,40);
				if(i4<18){
					JFrame f1 = new JFrame("Underweight");
					if(s3.equals(s4)){
					String column[]={"Item","Quantity"};

					f1.add(b1);	
					JTable jt1=new JTable(uvm,column); 
					JScrollPane sp1 = new JScrollPane(jt1);
					sp1.setBounds(100,100,400,100);
					f1.add(sp1);
					
					f1.add(b2);
					JTable jt2=new JTable(uvl,column); 
					JScrollPane sp2 = new JScrollPane(jt2);
					sp2.setBounds(580,100,400,100);
					f1.add(sp2);
					
					f1.add(b3);
					JTable jt3=new JTable(uvs,column);
					JScrollPane sp3 = new JScrollPane(jt3);
					sp3.setBounds(100,300,400,100);
					f1.add(sp3);
									
					f1.add(b4);
					JTable jt4=new JTable(uvd,column);
					JScrollPane sp4 = new JScrollPane(jt4);
					sp4.setBounds(580,300,400,100);
					f1.add(sp4);
					
					String s8 = "Since you are an Underweighed Vegetarian,"+" We recommend you to take on the above diet...";
					b5.setText(s7);
					f1.add(b5);
					b6.setText(s8);
					f1.add(b6);
					}
					else{
					String column[]={"Item","Quantity"};
					f1.add(b1);	
					JTable jt1=new JTable(unvm,column); 
					JScrollPane sp1 = new JScrollPane(jt1);
					sp1.setBounds(100,100,400,100);
					f1.add(sp1);
					
					f1.add(b2);
					JTable jt2=new JTable(unvl,column); 
					JScrollPane sp2 = new JScrollPane(jt2);
					sp2.setBounds(580,100,400,100);
					f1.add(sp2);
					
					f1.add(b3);
					JTable jt3=new JTable(unvs,column);
					JScrollPane sp3 = new JScrollPane(jt3);
					sp3.setBounds(100,300,400,100);
					f1.add(sp3);
					
					f1.add(b4);
					JTable jt4=new JTable(unvd,column);
					JScrollPane sp4 = new JScrollPane(jt4);
					sp4.setBounds(580,300,400,100);
					f1.add(sp4);
					
					String s8 = "Since you are an Underweighed Non-Vegetarian,"+" We recommend you to take on the above diet...";
					b5.setText(s7);
					f1.add(b5);
					b6.setText(s8);
					f1.add(b6);	
					}
					f1.setSize(1200,800);
					f1.setLayout(null);
					f1.setVisible(true);
					 Color c1 = new Color(204,204,204); 
					f1.getContentPane().setBackground(c1);
					}
				else if(i4>22){
					JFrame f1 = new JFrame("Obesity");
					if(s3.equals(s4)){
					String column[]={"Item","Quantity"};				
					f1.add(b1);	
					JTable jt1=new JTable(ovm,column); 
					JScrollPane sp1 = new JScrollPane(jt1);
					sp1.setBounds(100,100,400,100);
					f1.add(sp1);
					
					f1.add(b2);
					JTable jt2=new JTable(ovl,column); 
					JScrollPane sp2 = new JScrollPane(jt2);
					sp2.setBounds(580,100,400,100);
					f1.add(sp2);
					
					f1.add(b3);
					JTable jt3=new JTable(ovs,column);
					JScrollPane sp3 = new JScrollPane(jt3);
					sp3.setBounds(100,300,400,100);
					f1.add(sp3);
					
					f1.add(b4);
					JTable jt4=new JTable(ovd,column);
					JScrollPane sp4 = new JScrollPane(jt4);
					sp4.setBounds(580,300,400,100);
					f1.add(sp4);
					
					String s8 = "Since you are an Overweighed Vegetarian,"+" We recommend you to take on the above diet...";
					b5.setText(s7);
					f1.add(b5);
					b6.setText(s8);
					f1.add(b6);
					}
					else{
					String column[]={"Item","Quantity"};

					f1.add(b1);	
					JTable jt1=new JTable(onvm,column); 
					JScrollPane sp1 = new JScrollPane(jt1);
					sp1.setBounds(100,100,400,100);
					f1.add(sp1);
					
					f1.add(b2);
					JTable jt2=new JTable(onvl,column); 
					JScrollPane sp2 = new JScrollPane(jt2);
					sp2.setBounds(580,100,400,100);
					f1.add(sp2);

					f1.add(b3);
					JTable jt3=new JTable(onvs,column);
					JScrollPane sp3 = new JScrollPane(jt3);
					sp3.setBounds(100,300,400,100);
					f1.add(sp3);
					
					f1.add(b4);
					JTable jt4=new JTable(onvd,column);
					JScrollPane sp4 = new JScrollPane(jt4);
					sp4.setBounds(580,300,400,100);
					f1.add(sp4);

					String s8 = "Since you are an Overweighed Non-Vegetarian,"+" We recommend you to take on the above diet...";
					b5.setText(s7);
					f1.add(b5);
					b6.setText(s8);
					f1.add(b6);	
					}
					f1.setSize(1200,800);
					f1.setLayout(null);
					f1.setVisible(true);
					 Color c1 = new Color(204,204,204); 
					f1.getContentPane().setBackground(c1);
					}
				else{
					JOptionPane.showMessageDialog(f, "Your BMI is : "+i4 + "\n You are Physically fit");
				}			
		}});
		
		f.setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("veg.jpg"));
        f.add(background);
        background.setLayout(new FlowLayout());
		f.setSize(1200,750);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}	
		
public class bhsh{
		public static void main(String[] args){
			SwingUtilities.invokeLater(new Runnable(){
			public void run(){	
			project p1 = new project();
			}});
		}
}
			