package chapter5;

public class LibraryManage 
{
	 private String Auth_name;
	    private int Price;
        private String title;
        private String soft_ver;
        private String soft_name;
        private int no_pages;
        
	    public String getM_name() {
	        return Auth_name;
	    }

	    public void setM_name(String Auth_name) {
	    	System.out.println(" ");
	        this.Auth_name = Auth_name;
	    }

	    public int getM_Price() {
	        return Price;
	    }

	    public void setM_Price(int Price) {
	        this.Price = Price;
	    }

	    public String getM_title() {
	        return title;
	    }

	    public void setM_title(String title) {
	        this.title = title;
	    }
	    public String getM_soft_ver() {
	        return soft_ver;
	    }

	    public void setM_soft_ver(String soft_ver) {
	        this.soft_ver = soft_ver;
	    }
	    public String getM_soft_name() {
	        return soft_name;
	    }

	    public void setM_soft_name(String soft_name) {
	        this.soft_name = soft_name;
	    }
        
	    public int getM_no_pages() {
	        return no_pages;
	    }

	    public void setM_no_pages(int no_pages) {
	        this.no_pages = no_pages;
	    }
	    public LibraryManage(String Auth_name, int Price, String title, String soft_ver,String soft_name,int no_pages) {
	        this.Auth_name = Auth_name;
	        this.Price = Price;
	        this.title = title;
	        this.soft_ver = soft_ver;
	        this.soft_name=soft_name;
	        this.no_pages=no_pages;
	    }
	    

}
