package diary.models;

import java.sql.Date;

public class Entry {
	private Integer id;
	private Date entryDate;
	private String authorName;
	private String entryText;
	
	//Standard constructor
	public Entry() {
		
	}
	
	public Entry(Integer id, Date entryDate, String authorName, String entryText) {
		this.id = id;
		this.entryDate = entryDate;
		this.authorName = authorName;
		this.entryText = entryText;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date date) {
		this.entryDate = date;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getEntryText() {
		return entryText;
	}

	public void setEntryText(String entryText) {
		this.entryText = entryText;
	}
	

	
	

}
