import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.StringTokenizer;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;


//VS4E -- DO NOT REMOVE THIS LINE!
public class mainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JComboBox jComboBox0;
	private JLabel jLabel0;
	private JLabel jLabel1;
	private JTextField jTextField0;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JTextArea jTextArea1;
	private JScrollPane jScrollPane1;
	private JTextArea jTextArea2;
	private JScrollPane jScrollPane2;
	private JTextArea jTextArea0;
	private JScrollPane jScrollPane0;
	private JLabel jLabel7;
	private JTextArea jTextArea3;
	private JScrollPane jScrollPane3;
	private JButton jButton0;
	private JButton jButton1;
	public mainFrame() {
		initComponents();
		this.setTitle("列志华快递有限公司专用配货软件");
	}

	private void initComponents() {
		setTitle("列志华快递有限公司专用配货软件");
		setLayout(new GroupLayout());
		add(getJLabel0(), new Constraints(new Leading(15, 12, 12), new Leading(19, 12, 12)));
		add(getJLabel1(), new Constraints(new Leading(15, 12, 12), new Leading(58, 10, 10)));
		add(getJTextField0(), new Constraints(new Leading(121, 61, 10, 10), new Leading(56, 12, 12)));
		add(getJLabel2(), new Constraints(new Leading(20, 94, 12, 12), new Leading(90, 12, 12)));
		add(getJComboBox0(), new Constraints(new Leading(60, 92, 10, 10), new Leading(15, 10, 10)));
		add(getJLabel5(), new Constraints(new Leading(219, 10, 10), new Leading(19, 12, 12)));
		add(getJLabel6(), new Constraints(new Leading(158, 12, 12), new Leading(19, 12, 12)));
		add(getJScrollPane1(), new Constraints(new Leading(94, 72, 12, 12), new Leading(116, 187, 10, 10)));
		add(getJLabel3(), new Constraints(new Leading(100, 12, 12), new Leading(88, 12, 12)));
		add(getJScrollPane2(), new Constraints(new Leading(179, 74, 12, 12), new Leading(117, 187, 10, 10)));
		add(getJScrollPane0(), new Constraints(new Leading(11, 70, 10, 10), new Leading(115, 189, 12, 12)));
		add(getJLabel4(), new Constraints(new Leading(184, 10, 10), new Leading(88, 12, 12)));
		add(getJScrollPane3(), new Constraints(new Leading(12, 242, 10, 10), new Leading(397, 80, 10, 10)));
		add(getJLabel7(), new Constraints(new Leading(15, 12, 12), new Leading(371, 10, 10)));
		add(getJButton1(), new Constraints(new Leading(172, 12, 12), new Leading(322, 12, 12)));
		add(getJButton0(), new Constraints(new Leading(100, 12, 12), new Leading(322, 12, 12)));
		add(getJLabel8(), new Constraints(new Leading(137, 12, 12), new Leading(371, 12, 12)));
		add(getJLabel11(), new Constraints(new Leading(202, 51, 12, 12), new Leading(371, 12, 12)));
		add(getJScrollPane6(), new Constraints(new Leading(283, 214, 10, 10), new Leading(314, 160, 10, 10)));
		add(getJScrollPane4(), new Constraints(new Leading(283, 100, 10, 10), new Leading(94, 158, 12, 12)));
		add(getJLabel12(), new Constraints(new Leading(273, 241, 10, 10), new Leading(65, 26, 10, 10)));
		add(getJButton3(), new Constraints(new Leading(422, 10, 10), new Leading(257, 12, 12)));
		add(getJButton2(), new Constraints(new Leading(356, 12, 12), new Leading(258, 12, 12)));
		add(getJLabel14(), new Constraints(new Leading(271, 10, 10), new Leading(12, 12, 12)));
		add(getJTextField1(), new Constraints(new Leading(271, 230, 12, 12), new Leading(36, 12, 12)));
		add(getJScrollPane5(), new Constraints(new Leading(400, 98, 12, 12), new Leading(93, 158, 10, 10)));
		add(getJButton4(), new Constraints(new Leading(449, 10, 10), new Leading(9, 24, 12, 12)));
		add(getJLabel13(), new Constraints(new Leading(283, 96, 10, 10), new Leading(290, 12, 12)));
		add(getJLabel15(), new Constraints(new Leading(459, 33, 10, 10), new Leading(290, 12, 12)));
		setSize(528, 496);
	}

	private JLabel getJLabel15() {
		if (jLabel15 == null) {
			jLabel15 = new JLabel();
			jLabel15.setText("0");
		}
		return jLabel15;
	}

	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setText("确定");
			jButton4.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton4MouseMouseClicked(event);
				}
			});
		}
		return jButton4;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
		}
		return jTextField1;
	}

	private JLabel getJLabel14() {
		if (jLabel14 == null) {
			jLabel14 = new JLabel();
			jLabel14.setText("请输入装车的快件对应的地址：");
		}
		return jLabel14;
	}

	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setText("清空");
			jButton3.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton3MouseMouseClicked(event);
				}
			});
		}
		return jButton3;
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("确定");
			jButton2.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton2MouseMouseClicked(event);
				}
			});
		}
		return jButton2;
	}

	private JScrollPane getJScrollPane6() {
		if (jScrollPane6 == null) {
			jScrollPane6 = new JScrollPane();
			jScrollPane6.setViewportView(getJTextArea6());
		}
		return jScrollPane6;
	}

	private JTextArea getJTextArea6() {
		if (jTextArea6 == null) {
			jTextArea6 = new JTextArea();
		}
		return jTextArea6;
	}

	private JLabel getJLabel13() {
		if (jLabel13 == null) {
			jLabel13 = new JLabel();
			jLabel13.setText("最佳送货路线：");
		}
		return jLabel13;
	}

	private JScrollPane getJScrollPane5() {
		if (jScrollPane5 == null) {
			jScrollPane5 = new JScrollPane();
			jScrollPane5.setViewportView(getJTextArea5());
		}
		return jScrollPane5;
	}

	private JTextArea getJTextArea5() {
		if (jTextArea5 == null) {
			jTextArea5 = new JTextArea();
		}
		return jTextArea5;
	}

	private JScrollPane getJScrollPane4() {
		if (jScrollPane4 == null) {
			jScrollPane4 = new JScrollPane();
			jScrollPane4.setViewportView(getJTextArea4());
		}
		return jScrollPane4;
	}

	private JTextArea getJTextArea4() {
		if (jTextArea4 == null) {
			jTextArea4 = new JTextArea();
		}
		return jTextArea4;
	}

	private JLabel getJLabel12() {
		if (jLabel12 == null) {
			jLabel12 = new JLabel();
			jLabel12.setText("请按照结点表提示输入邻接矩阵！！");
		}
		return jLabel12;
	}

	private JLabel getJLabel11() {
		if (jLabel11 == null) {
			jLabel11 = new JLabel();
			jLabel11.setText("0");
		}
		return jLabel11;
	}

	private JLabel getJLabel8() {
		if (jLabel8 == null) {
			jLabel8 = new JLabel();
			jLabel8.setText("最大价值：");
		}
		return jLabel8;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("清空");
			jButton1.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton1MouseMouseClicked(event);
				}
			});
		}
		return jButton1;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("确定");
			jButton0.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton0MouseMouseClicked(event);
				}
			});
		}
		return jButton0;
	}

	private JScrollPane getJScrollPane3() {
		if (jScrollPane3 == null) {
			jScrollPane3 = new JScrollPane();
			jScrollPane3.setViewportView(getJTextArea3());
		}
		return jScrollPane3;
	}

	private JTextArea getJTextArea3() {
		if (jTextArea3 == null) {
			jTextArea3 = new JTextArea();
		}
		return jTextArea3;
	}

	private JLabel getJLabel7() {
		if (jLabel7 == null) {
			jLabel7 = new JLabel();
			jLabel7.setText("放入的物品编号：");
		}
		return jLabel7;
	}

	private JScrollPane getJScrollPane0() {
		if (jScrollPane0 == null) {
			jScrollPane0 = new JScrollPane();
			jScrollPane0.setViewportView(getJTextArea0());
		}
		return jScrollPane0;
	}

	private JTextArea getJTextArea0() {
		if (jTextArea0 == null) {
			jTextArea0 = new JTextArea();
			jTextArea0.setBackground(Color.white);
		}
		return jTextArea0;
	}

	private JScrollPane getJScrollPane2() {
		if (jScrollPane2 == null) {
			jScrollPane2 = new JScrollPane();
			jScrollPane2.setViewportView(getJTextArea2());
		}
		return jScrollPane2;
	}

	private JTextArea getJTextArea2() {
		if (jTextArea2 == null) {
			jTextArea2 = new JTextArea();
		}
		return jTextArea2;
	}

	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setViewportView(getJTextArea1());
		}
		return jScrollPane1;
	}

	private JTextArea getJTextArea1() {
		if (jTextArea1 == null) {
			jTextArea1 = new JTextArea();
		}
		return jTextArea1;
	}

	private JLabel getJLabel6() {
		if (jLabel6 == null) {
			jLabel6 = new JLabel();
			jLabel6.setText("容量：");
		}
		return jLabel6;
	}

	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setText("0");
		}
		return jLabel5;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("物品重量");
		}
		return jLabel4;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("物品价值");
		}
		return jLabel3;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("物品编号");
		}
		return jLabel2;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
		}
		return jTextField0;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("请输入物品数量：");
		}
		return jLabel1;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("载具：");
		}
		return jLabel0;
	}

	private JComboBox getJComboBox0() {
		if (jComboBox0 == null) {
			jComboBox0 = new JComboBox();
			jComboBox0.setModel(new DefaultComboBoxModel(new Object[] { "无", "摩托车", "三轮车", "小型货车", "大型货车" }));
			jComboBox0.setDoubleBuffered(false);
			jComboBox0.setBorder(null);
			jComboBox0.addItemListener(new ItemListener() {
	
				public void itemStateChanged(ItemEvent event) {
					jComboBox0ItemItemStateChanged(event);
				}
			});
		}
		return jComboBox0;
	}

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
					+ " on this platform:" + e.getMessage());
		}
	}

	/**
	 * Main entry of the class.
	 * Note: This class is only created so that you can easily preview the result at runtime.
	 * It is not expected to be managed by the designer.
	 * You can modify it as you like.
	 */
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				mainFrame frame = new mainFrame();
				frame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
				frame.setTitle("mainFrame");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	
		int cap = 0;
		Package pack;
		String mNo;
		String mValue;
		String mWight;
		String[] s0 = new String[300];
		int valid = 0;
		private JLabel jLabel8;
		private JLabel jLabel9;
		private JLabel jLabel10;
		private JLabel jLabel11;
		private JLabel jLabel12;
		private JTextArea jTextArea4;
		private JScrollPane jScrollPane4;
		private JTextArea jTextArea5;
		private JScrollPane jScrollPane5;
		private JLabel jLabel13;
		private JTextArea jTextArea6;
		private JScrollPane jScrollPane6;
		private JButton jButton2;
		private JButton jButton3;
		private JLabel jLabel14;
		private JTextField jTextField1;
		private void jComboBox0ItemItemStateChanged(ItemEvent event) {
		Object ob = event.getItem();

		if(ob == "摩托车"){
			this.cap = 50;
		}else if(ob == "三轮车"){
			this.cap= 100;
		}else if(ob == "小型货车"){
			this.cap = 500;
		}else if(ob == "大型货车"){
			this.cap = 1000;
		}else{
			this.cap = 10;
		}
		jLabel5.setText(String.valueOf(cap));
	}

	private void jButton0MouseMouseClicked(MouseEvent event) {
		
		this.mNo = jTextArea0.getText();
		this.mValue = jTextArea1.getText();
		this.mWight = jTextArea2.getText();

		String jf = jTextField0.getText();
		StringTokenizer st0 = new StringTokenizer(this.mNo);
		for(int i=0 ;st0.hasMoreElements();i++){
			s0[i] = st0.nextToken();
		}
		int n = Integer.parseInt(jf);
		pack = new Package(mValue,mWight,n,cap);
		int[] state = new int[300];
		String st = "编号：";
		for(int i=0 ; i<n ; i++){
			state[i] = pack.getBe(i);
			if(pack.getBe(i) == 1){
				st = st +','+ s0[i];
				this.valid++;
			}
		}
		jTextArea3.setText(st);
		jLabel11.setText(String.valueOf(pack.getBestv()));
		isNumber();
		
	}
	
	void isNumber(){
		int n = Integer.valueOf(jTextField0.getText());
		StringTokenizer a = new StringTokenizer(jTextArea0.getText());
		StringTokenizer b = new StringTokenizer(jTextArea1.getText());
		StringTokenizer c = new StringTokenizer(jTextArea2.getText());
		int ca = a.countTokens();
		int cb = b.countTokens();
		int cc = c.countTokens();
		if(ca != n || cb != n || cc != n){
			JOptionPane.showMessageDialog(this, "输入的数据与输入物品数目不符！！！！\n请检查数据！！！");
		}
	}

	private void jButton1MouseMouseClicked(MouseEvent event) {
		int jop = JOptionPane.showConfirmDialog(jButton1, "你真的要清除所有信息吗？");
		if(jop == 0){
			jTextField0.setText("");
			jTextArea0.setText("");
			jTextArea1.setText("");
			jTextArea2.setText("");
			jTextArea3.setText("");
		}
		
	}
		
	boolean button4 = false;
	String mAdress;
	String[] nname;
	String mGraph;
	String mNode = "结点名称表：\n";
	Travel travel;
	private JButton jButton4;
	private JLabel jLabel15;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	private void jButton2MouseMouseClicked(MouseEvent event) {
		if(button4){
			travel = new Travel(valid);
			String aaa = "路线: ";
			mGraph = jTextArea4.getText();
			travel.mainTravel(mGraph);
			for(int i=0 ; i<valid ; i++){
				aaa = aaa + ','+nname[(int)travel.getBestx(i)];
			}
			jTextArea6.setText(aaa);
			jLabel15.setText(String.valueOf(travel.getBestc()));
		}else{
			JOptionPane.showMessageDialog(this, "未把物品地址确定！！！");
		}

	}

	private void jButton3MouseMouseClicked(MouseEvent event) {
		int jop = JOptionPane.showConfirmDialog(jButton1, "你真的要清除所有信息吗？");
		if(jop == 0){
			jTextField1.setText("");
			jTextArea4.setText("");
			jTextArea5.setText("");
			jTextArea6.setText("");
			button4 = false;
		}
	}

	private void jButton4MouseMouseClicked(MouseEvent event) {
				nname = new String[valid];
		this.mAdress = jTextField1.getText();
		StringTokenizer jf1 = new StringTokenizer(mAdress,",");
		for(int i=0 ;jf1.hasMoreElements(); i++){
			nname[i] = jf1.nextToken();
		}
		
		for(int i=0 ; i<valid ; i++){
			mNode = mNode + nname[i] + "--" + String.valueOf(i) + '\n';
		}
		jTextArea5.setText(mNode);
		button4 = true;
		
	}
	
	

}
