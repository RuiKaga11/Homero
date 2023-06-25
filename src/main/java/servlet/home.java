package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GetMutterListDAO;
import model.Mutter;
import model.User;

@WebServlet("/home")
public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ログインチェック
		Http.session session = request.getSession();
		User loginUser = (User) session.getAttribute("lohinUser");
		
		// ログインしてない
		if(loginUser == null) {
			// リダイレクト
			response.sendRedirect("/Homero/");
		}
		// ログイン済
		else {
			// カテゴリーソート確認
			String sort = request.getParameter("sort");
			
			// つぶやきリスト作成
			GetMutterListDAO getML = new GetMutterDAO();
			List<Mutter> mutterList;
			
			// カテゴリーソートなし
			if(sort == null) {
				// つぶやきリスト取得
				mutterList = getML.execute();
			}
			// カテゴリーソートあり
			else {
				// sortを日本語に変更
				if(sort.equals("1")) { sort = "スポーツ"; }
				if(sort.equals("2")) { sort = "勉強"; }
				if(sort.equals("3")) { sort = "仕事"; }
				if(sort.equals("4")) { sort = "家事"; }
				if(sort.equals("99")) { sort = "その他"; }
				
				// つぶやきリストを取得
				mutterList = getML.sortListFind(sort);
			}
			// つぶやき
			request.setAttribute("mutterList", mutterList);
			
			// フォワード
			RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/home.jsp");
			d.forward(request, response);
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("IT WAS POSTTED.");
	}

}
