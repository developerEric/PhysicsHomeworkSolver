import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextPane;


public class SolverGui {

	private JFrame HomeworkSolver;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField vi1;
	private JTextField vi2;
	private JTextField m1;
	private JTextField m2;
	private JTextField vf2;
	private JTextField vf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SolverGui window = new SolverGui();
					window.HomeworkSolver.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SolverGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		HomeworkSolver = new JFrame();
		HomeworkSolver.setBounds(100, 100, 615, 502);
		HomeworkSolver.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HomeworkSolver.getContentPane().setLayout(null);
		
		JLabel lblHomeworkCollision = new JLabel("Eric's Elastic Collisions Solver build_1.3 mk2");
		lblHomeworkCollision.setForeground(Color.GRAY);
		lblHomeworkCollision.setBounds(0, 0, 599, 17);
		lblHomeworkCollision.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblHomeworkCollision.setToolTipText("Solves Collision Homework");
		HomeworkSolver.getContentPane().add(lblHomeworkCollision);
		
		JLabel lblPleaseFillOut = new JLabel("Please fill out the following fields coresponding with your solving selections");
		lblPleaseFillOut.setForeground(Color.GRAY);
		lblPleaseFillOut.setBounds(198, 44, 391, 14);
		HomeworkSolver.getContentPane().add(lblPleaseFillOut);
		
		JLabel lblVelocity = new JLabel("Velocity (in m/s)");
		lblVelocity.setForeground(Color.RED);
		lblVelocity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVelocity.setBounds(153, 115, 117, 14);
		HomeworkSolver.getContentPane().add(lblVelocity);
		
		vi1 = new JTextField();
		vi1.setToolTipText("Enter Vi 1");
		vi1.setBounds(184, 140, 114, 20);
		HomeworkSolver.getContentPane().add(vi1);
		vi1.setColumns(10);
		
		vi2 = new JTextField();
		vi2.setToolTipText("Enter Vi 2");
		vi2.setColumns(10);
		vi2.setBounds(184, 166, 114, 20);
		HomeworkSolver.getContentPane().add(vi2);
		
		JLabel lblMass = new JLabel("Mass (in Kg)");
		lblMass.setForeground(Color.RED);
		lblMass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMass.setBounds(10, 115, 109, 20);
		HomeworkSolver.getContentPane().add(lblMass);
		
		m1 = new JTextField();
		m1.setColumns(10);
		m1.setBounds(30, 140, 89, 20);
		HomeworkSolver.getContentPane().add(m1);
		
		m2 = new JTextField();
		m2.setColumns(10);
		m2.setBounds(30, 163, 89, 20);
		HomeworkSolver.getContentPane().add(m2);
		
		JLabel lblAnswers = new JLabel("Answer: (rounded)");
		lblAnswers.setForeground(Color.MAGENTA);
		lblAnswers.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAnswers.setBounds(363, 212, 156, 14);
		HomeworkSolver.getContentPane().add(lblAnswers);
		
		JComboBox dir1 = new JComboBox();
		dir1.setModel(new DefaultComboBoxModel(Directions.Compass.values()));
		dir1.setBounds(404, 140, 148, 20);
		HomeworkSolver.getContentPane().add(dir1);
		
		JLabel lblDirectionsOfMotion = new JLabel("Directions of Motion");
		lblDirectionsOfMotion.setForeground(Color.RED);
		lblDirectionsOfMotion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDirectionsOfMotion.setBounds(330, 115, 142, 14);
		HomeworkSolver.getContentPane().add(lblDirectionsOfMotion);
		
		JComboBox dir2 = new JComboBox();
		dir2.setModel(new DefaultComboBoxModel(Directions.Compass.values()));
		dir2.setMaximumRowCount(4);
		dir2.setBounds(404, 166, 148, 20);
		HomeworkSolver.getContentPane().add(dir2);
		
		JLabel ans = new JLabel("(not calculated)");
		ans.setForeground(Color.MAGENTA);
		ans.setFont(new Font("Calibri", Font.PLAIN, 16));
		ans.setBounds(363, 237, 212, 17);
		HomeworkSolver.getContentPane().add(ans);
		
		JLabel lblVi = new JLabel("Vi_1");
		lblVi.setForeground(Color.BLUE);
		lblVi.setBounds(153, 144, 30, 14);
		HomeworkSolver.getContentPane().add(lblVi);
		
		JLabel lblVi_1 = new JLabel("Vi_2");
		lblVi_1.setForeground(Color.BLUE);
		lblVi_1.setBounds(153, 170, 30, 14);
		HomeworkSolver.getContentPane().add(lblVi_1);
		
		JLabel lblM_1 = new JLabel("M2");
		lblM_1.setForeground(Color.BLUE);
		lblM_1.setBounds(6, 166, 28, 14);
		HomeworkSolver.getContentPane().add(lblM_1);
		
		JLabel lblM = new JLabel("M1");
		lblM.setForeground(Color.BLUE);
		lblM.setBounds(6, 140, 28, 14);
		HomeworkSolver.getContentPane().add(lblM);
		
		JButton go = new JButton("Solve");
		go.setFont(new Font("Arial Black", Font.PLAIN, 15));
		go.setForeground(Color.RED);
		go.setBounds(141, 265, 314, 31);
		HomeworkSolver.getContentPane().add(go);
		
		JComboBox solvefor = new JComboBox();
		solvefor.setModel(new DefaultComboBoxModel(Calculate.SolveFor.values()));
		solvefor.setBounds(9, 69, 123, 20);
		HomeworkSolver.getContentPane().add(solvefor);
		
		JLabel lblSolveForField = new JLabel("Solve for Field");
		lblSolveForField.setForeground(Color.RED);
		lblSolveForField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSolveForField.setBounds(9, 44, 142, 14);
		HomeworkSolver.getContentPane().add(lblSolveForField);
		
		JLabel lblViOrF = new JLabel("Vf1 or Vi1");
		lblViOrF.setForeground(Color.BLUE);
		lblViOrF.setBounds(330, 146, 65, 14);
		HomeworkSolver.getContentPane().add(lblViOrF);
		
		JLabel lblVfOrVi = new JLabel("Vf2 or Vi2");
		lblVfOrVi.setForeground(Color.BLUE);
		lblVfOrVi.setBounds(330, 172, 65, 14);
		HomeworkSolver.getContentPane().add(lblVfOrVi);
		
		JButton expapp = new JButton("Explosive Collison Solver");
		expapp.setBounds(391, 71, 156, 33);
		HomeworkSolver.getContentPane().add(expapp);
		
		vf2 = new JTextField();
		vf2.setToolTipText("Enter Vi 2");
		vf2.setColumns(10);
		vf2.setBounds(184, 223, 114, 20);
		HomeworkSolver.getContentPane().add(vf2);
		
		vf1 = new JTextField();
		vf1.setToolTipText("Enter Vi 1");
		vf1.setColumns(10);
		vf1.setBounds(184, 197, 114, 20);
		HomeworkSolver.getContentPane().add(vf1);
		
		JLabel lblVf = new JLabel("Vf_1");
		lblVf.setForeground(Color.BLUE);
		lblVf.setBounds(153, 201, 30, 14);
		HomeworkSolver.getContentPane().add(lblVf);
		
		JLabel lblVf_1 = new JLabel("Vf_2");
		lblVf_1.setForeground(Color.BLUE);
		lblVf_1.setBounds(153, 227, 30, 14);
		HomeworkSolver.getContentPane().add(lblVf_1);
		
		JLabel lblSteps = new JLabel("Steps:");
		lblSteps.setForeground(Color.MAGENTA);
		lblSteps.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSteps.setBounds(27, 307, 156, 17);
		HomeworkSolver.getContentPane().add(lblSteps);
		
		JTextPane steps = new JTextPane();
		steps.setForeground(Color.BLUE);
		steps.setBackground(Color.GRAY);
		steps.setEditable(false);
		steps.setBounds(30, 335, 522, 118);
		HomeworkSolver.getContentPane().add(steps);
		
		
		go.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((Calculate.SolveFor)solvefor.getSelectedItem() == Calculate.SolveFor.Vf_1) {
					
					String[] stuff = Calculate.solveFinalv1(Double.parseDouble(vi1.getText()), Double.parseDouble(vi2.getText()), 
							Double.parseDouble(m1.getText()), Double.parseDouble(m2.getText()), 
							(Directions.Compass)dir1.getSelectedItem(), (Directions.Compass)dir2.getSelectedItem());
					ans.setText("Vf1 = " + stuff[0] + "m/s [" + (Directions.Compass)dir1.getSelectedItem() + "]");
					steps.setText(stuff[1]);
					
				} else if ((Calculate.SolveFor)solvefor.getSelectedItem() == Calculate.SolveFor.Vf_2) {
					
					String[] stuff = Calculate.solveFinalv2(Double.parseDouble(vi1.getText()), Double.parseDouble(vi2.getText()), 
							Double.parseDouble(m1.getText()), Double.parseDouble(m2.getText()), 
							(Directions.Compass)dir1.getSelectedItem(), (Directions.Compass)dir2.getSelectedItem());
					ans.setText("Vf2 = " + stuff[0] + "m/s [" + (Directions.Compass)dir1.getSelectedItem() + "]");
					steps.setText(stuff[1]);
					
				} else if ((Calculate.SolveFor)solvefor.getSelectedItem() == Calculate.SolveFor.Vi1) {
					
					String vi = Calculate.solveInitialV1(Double.parseDouble(vf1.getText()), Double.parseDouble(vi2.getText()),
							Double.parseDouble(m1.getText()), Double.parseDouble(m2.getText()));
					ans.setText("Vi1 = " + vi + "m/s");
					
				} else if ((Calculate.SolveFor)solvefor.getSelectedItem() == Calculate.SolveFor.Vi2) {
				
					String vi = Calculate.solveInitialV1(Double.parseDouble(vf2.getText()), Double.parseDouble(vi1.getText()),
							Double.parseDouble(m1.getText()), Double.parseDouble(m2.getText()));
					ans.setText("Vi2 = " + vi + "m/s");
				
				} else if ((Calculate.SolveFor)solvefor.getSelectedItem() == Calculate.SolveFor.m1) {

					String mass = Calculate.solveMass1(Double.parseDouble(vf1.getText()), Double.parseDouble(m2.getText()), 
							Double.parseDouble(vi1.getText()), Double.parseDouble(vi2.getText()));
					
					ans.setText("M1 = " + mass + "Kg");
					
				} else if ((Calculate.SolveFor)solvefor.getSelectedItem() == Calculate.SolveFor.m2) {
					
					String mass = Calculate.solveMass2(Double.parseDouble(vf2.getText()), Double.parseDouble(m1.getText()), 
							Double.parseDouble(vi1.getText()), Double.parseDouble(vi2.getText()));
					
					ans.setText("M2 = " + mass + "Kg");
					
				} else {
					ans.setText("0 m/s [North]");
					vi1.setText("");
					vi2.setText("");
					vf1.setText("");
					vf2.setText("");
					m1.setText("");
					m2.setText("");
					steps.setText("");
				}
			}
		});
	}
}
