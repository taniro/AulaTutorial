import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/HelloServlet", "/Aula"})
public class HelloServlet extends HttpServlet {

	public HelloServlet() {
		System.out.println("CONSTRUTOR");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("INIT");
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("DESTROY");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.service(req, resp);
		System.out.println("SERVICE");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//int i = 0;
		//resp.getWriter().println(i++);
		//resp.addCookie(new Cookie("aula", "web"));
		//resp.setStatus(201);

		String cliente = req.getParameter("nome");
		resp.getWriter().println("Ola, " + cliente);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("Hello World");
	}

}
