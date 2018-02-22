

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Servlet2 extends HttpServlet {

    public void init() {
        doHeavyProcessing();
    }



    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        parseRequest();
        calculateResponse();
        Servlet2CustomCode();
        sendResponse();
    }

    private void doHeavyProcessing() {

    }

    private void Servlet2CustomCode() {

    }

    private void sendResponse() {

    }

    private void calculateResponse() {

    }

    private void parseRequest() {

    }

}
