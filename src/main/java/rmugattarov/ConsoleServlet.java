package rmugattarov;

import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by rmugattarov on 19.01.2016.
 */
@WebServlet("/Console")
public class ConsoleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("rowCount", 13000);
        writer.print(jsonObject);
        writer.flush();
    }
}
