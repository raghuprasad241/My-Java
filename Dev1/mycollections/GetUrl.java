package mycollections;

public class GetUrl {

	public static void main(String[] args) {
		UrlLibrary myurl = new UrlLibrary();
		
		for (String html: myurl)
		{
			System.out.println(html.length());
		}

	}

}
