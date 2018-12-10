package fi.projekti.LinkList.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Links {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private long Id;
	private String link;
	
	protected Links() {}
	
	public Links(String link) {
		super();
		this.link = link;
	}
	
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}
	
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "Links [Id=" + Id + ", link=" + link + "]";
	}

}

