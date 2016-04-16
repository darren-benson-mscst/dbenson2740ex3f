package ex3f;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class EmployeeForm extends JFrame {

	private JPanel contentPane;
	private JTextField empIDTextField;
	private JTextField empNameTextField;
	private JTextField positionTextField;
	private JList employeeList;
	private DefaultListModel employeeListModel;
	private JComboBox deptComboBox;
	private JButton btnNoArg;
	private JButton btnTwoArg;
	private JButton btnFourArg;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeForm frame = new EmployeeForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EmployeeForm() {
		setTitle("Exercise 3F: Overloaded Constructors");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 134);
		contentPane.add(scrollPane);
		
		employeeListModel = new DefaultListModel();
		employeeList = new JList(employeeListModel);
		scrollPane.setViewportView(employeeList);
		
		JLabel lblEmployeeId = new JLabel("Employee ID:");
		lblEmployeeId.setBounds(10, 163, 100, 14);
		contentPane.add(lblEmployeeId);
		
		empIDTextField = new JTextField();
		empIDTextField.setText("101");
		lblEmployeeId.setLabelFor(empIDTextField);
		empIDTextField.setBounds(120, 160, 86, 20);
		contentPane.add(empIDTextField);
		empIDTextField.setColumns(10);
		
		JLabel lblEmployeeName = new JLabel("Employee name:");
		lblEmployeeName.setBounds(10, 188, 100, 14);
		contentPane.add(lblEmployeeName);
		
		empNameTextField = new JTextField();
		empNameTextField.setText("Darren Benson");
		lblEmployeeName.setLabelFor(empNameTextField);
		empNameTextField.setBounds(120, 185, 135, 20);
		contentPane.add(empNameTextField);
		empNameTextField.setColumns(10);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setBounds(10, 213, 100, 14);
		contentPane.add(lblDepartment);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setBounds(10, 236, 64, 14);
		contentPane.add(lblPosition);
		
		deptComboBox = new JComboBox();
		deptComboBox.setModel(new DefaultComboBoxModel(new String[] {"Business Office", "Human Resources", "Manufacturing", "Shipping", "Maintenance"}));
		lblDepartment.setLabelFor(deptComboBox);
		deptComboBox.setBounds(120, 210, 185, 20);
		contentPane.add(deptComboBox);
		
		positionTextField = new JTextField();
		positionTextField.setText("Software Engineer");
		lblPosition.setLabelFor(positionTextField);
		positionTextField.setBounds(120, 233, 135, 20);
		contentPane.add(positionTextField);
		positionTextField.setColumns(10);
		
		btnNoArg = new JButton("No Arg");
		btnNoArg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnNoArg_actionPerformed(arg0);
			}
		});
		btnNoArg.setBounds(57, 263, 89, 23);
		contentPane.add(btnNoArg);
		
		btnTwoArg = new JButton("2 Arg");
		btnTwoArg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnTwoArg_actionPerformed(e);
			}
		});
		btnTwoArg.setBounds(156, 264, 89, 23);
		contentPane.add(btnTwoArg);
		
		btnFourArg = new JButton("4 Arg");
		btnFourArg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnFourArg_actionPerformed(e);
			}
		});
		btnFourArg.setBounds(255, 264, 89, 23);
		contentPane.add(btnFourArg);
	}
	protected void do_btnNoArg_actionPerformed(ActionEvent arg0) {
		
		Employee emp = new Employee();
		employeeListModel.addElement(emp);
		
	}
	protected void do_btnTwoArg_actionPerformed(ActionEvent e) {
		
		int empID;
		
		empID = Integer.parseInt(empIDTextField.getText());
		Employee emp2 = new Employee(empID, empNameTextField.getText());
		employeeListModel.addElement(emp2);
		
	}
	protected void do_btnFourArg_actionPerformed(ActionEvent e) {
		int empID;
		
		empID = Integer.parseInt(empIDTextField.getText());
		String dept = (String) deptComboBox.getSelectedItem();
		Employee emp3 = new Employee(empID, empNameTextField.getText(), dept, positionTextField.getText());
		employeeListModel.addElement(emp3);
		
	}
}
