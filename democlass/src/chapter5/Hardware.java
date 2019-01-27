package chapter5;

public class Hardware
{
	 private String Auth_name;
	    private int Price;
     private String title;
     private String hard_cat;
     private String Publish;
     private int no_pages;
     
	    public String getM_name() {
	        return Auth_name;
	    }

	    public void setM_name(String Auth_name) {
	    	System.out.println("  ");
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
	    public String getM_hard_cat() {
	        return hard_cat;
	    }

	    public void setM_soft_ver(String soft_ver) {
	        this.hard_cat = soft_ver;
	    }
	    public String getM_Publish() {
	        return Publish;
	    }

	    public void setM_soft_name(String soft_name) {
	        this.Publish = soft_name;
	    }
     
	    public int getM_no_pages() {
	     
	        return no_pages;
	               
	    }

	    public void setM_no_pages(int no_pages) {
	        this.no_pages = no_pages;
	    }
	    public Hardware(String Auth_name, int Price, String title, String hard_cat,String Publish,int no_pages) {
	        this.Auth_name = Auth_name;
	        this.Price = Price;
	        this.title = title;
	        this.hard_cat = hard_cat;
	        this.Publish=Publish;
	        this.no_pages=no_pages;
	    }
}
