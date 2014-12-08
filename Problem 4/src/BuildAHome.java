import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.ToolBar;


public class BuildAHome {

	protected Shell shell;
	private Text txtTypeMonthlyDebt;
	private Text txtTypeInterestRate;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BuildAHome window = new BuildAHome();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 473);
		shell.setText("SWT Application");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(45, 45, 118, 15);
		lblNewLabel.setText("Total Gross Income:");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(45, 111, 135, 15);
		lblNewLabel_2.setText("Mortgage Interest Rate:");
		
		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		lblNewLabel_3.setBounds(45, 177, 118, 15);
		lblNewLabel_3.setText("Term (Optional):");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(45, 79, 118, 15);
		lblNewLabel_1.setText("Total Monthly debt:");
		
		Label lblNewLabel_4 = new Label(shell, SWT.NONE);
		lblNewLabel_4.setBounds(45, 143, 107, 15);
		lblNewLabel_4.setText("Down payment :");
		
		txtTypeMonthlyDebt = new Text(shell, SWT.BORDER);
		txtTypeMonthlyDebt.setBounds(234, 76, 125, 21);
		
		txtTypeInterestRate = new Text(shell, SWT.BORDER);
		txtTypeInterestRate.setBounds(234, 108, 125, 21);
		
		Combo combo = new Combo(shell, SWT.NONE);
		combo.setItems(new String[] {"10", "15", "30"});
		combo.setBounds(234, 140, 125, 23);
		combo.setText("Number of Years");
		
		text = new Text(shell, SWT.BORDER);
		text.setText("0");
		text.setBounds(234, 171, 125, 21);
		
		Label lblNewLabel_5 = new Label(shell, SWT.NONE);
		lblNewLabel_5.setBounds(45, 239, 251, 15);
		lblNewLabel_5.setText("Housing payment only (18% of gross income):");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(234, 45, 75, 25);
		btnNewButton.setText("New Button");

	}
}
