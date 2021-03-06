import javax.swing.JFrame;
import javax.swing.JPanel;

import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;

public class pdf_view {
	String filePath = "somefilepath/myfile.pdf";

	// build a controller
	SwingController controller = new SwingController();

	// Build a SwingViewFactory configured with the controller
	SwingViewBuilder factory = new SwingViewBuilder(controller);

	// Use the factory to build a JPanel that is pre-configured
	//with a complete, active Viewer UI.
	JPanel viewerComponentPanel = factory.buildViewerPanel();

	// add copy keyboard command
	

	// Create a JFrame to display the panel in
	JFrame window = new JFrame("Using the Viewer Component");
	
	

	// Open a PDF document to view
	controller.openDocument(filePath);
}
