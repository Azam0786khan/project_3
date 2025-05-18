/*
package in.co.rays.project_3.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.impl.SessionImpl;

import in.co.rays.project_3.dto.UserDTO;
import in.co.rays.project_3.util.HibDataSource;
import in.co.rays.project_3.util.JDBCDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

/**
 * Jasper functionality Controller. Performs operation for Print pdf of
 * MarksheetMeriteList
 *
 * @author Azam Khan
 */
/*
@WebServlet(name = "JasperCtl", urlPatterns = { "/ctl/JasperCtl" })
public class JasperCtl extends BaseCtl {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.project_3.bundle.system");
			String jasper = rb.getString("jasper");

			// Compile jrxml to JasperReport object
			JasperReport jasperReport = JasperCompileManager.compileReport(jasper);

			// Get user from session
			HttpSession session = request.getSession(true);
			UserDTO dto = (UserDTO) session.getAttribute("user");
			dto.getFirstName();
			dto.getLastName();

			// Report parameters
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("ID", 1l);
			java.sql.Connection conn = null;

			// Determine datasource type
			String Database = rb.getString("DATABASE");

			if ("Hibernate".equalsIgnoreCase(Database)) {
				conn = ((SessionImpl) HibDataSource.getSession()).connection();
			}

			if ("JDBC".equalsIgnoreCase(Database)) {
				conn = JDBCDataSource.getConnection();
			}

			// Fill report with data
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map, conn);

			// Export report to PDF and write to response
			byte[] pdf = JasperExportManager.exportReportToPdf(jasperPrint);
			response.setContentType("application/pdf");
			response.getOutputStream().write(pdf);
			response.getOutputStream().flush();
		} catch (Exception e) {
			// You can optionally log the error here
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Not used
	}

	@Override
	protected String getView() {
		return null;
	}
}
*/
