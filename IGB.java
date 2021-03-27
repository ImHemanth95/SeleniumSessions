package SeleniumSession;

public class IGB {

	public static void main(String[] args) {
		BrowserDriverUnit Br =  new BrowserDriverUnit();
		Br.init_broswer("chrome");
		Br.launchURL("https://igb.panoplyerp.com/");
		String title = Br.getPagetitle();
		System.out.println("your page tilte is="+title);
        if(title.contains("Panoply II")) {
        	System.out.println("This is proper title");
        }
        else {
        	System.out.println("this is not an proper title");
        }
        System.out.println(Br.PageURL());
        Br.closebrowser();

	}

}
