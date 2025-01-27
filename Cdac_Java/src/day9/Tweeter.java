package day9;

import java.util.Set;

public class Tweeter {
	private String subject;
	private Date date;
	private long views;
	private Set<String> hashtags;
	
	
	
	public Tweeter(String subject, Date date, long views, Set<String> hashtags) {
		this.subject = subject;
		this.date = date;
		this.views = views;
		this.hashtags = hashtags;
	}
	@Override
	public String toString() {
		return "[subject=" + subject + ", date=" + date + ", views=" + views + ", hashtags=" + hashtags + "]";
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getViews() {
		return views;
	}
	public void setViews(long views) {
		this.views = views;
	}
	public Set<String> getHashtags() {
		return hashtags;
	}
	public void setHashtags(Set<String> hashtags) {
		this.hashtags = hashtags;
	}
	
	
	
	
	

}
