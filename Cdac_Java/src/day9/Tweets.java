package day9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class Tweets {
	
	public static void main(String[] args) {
		List<Tweeter> Tweets=new ArrayList<Tweeter>();
		 Set<String> tweet1 = new TreeSet<>();
	        tweet1.add("#modi");
	        tweet1.add("#votebank");
		Tweets.add(new Tweeter("Modi 3.0",new Date(12,"June",2024),2525,tweet1));
		 Set<String> tweet2 = new TreeSet<>();
	        tweet2.add("#floods");
	        tweet2.add("#watercrises");
		Tweets.add(new Tweeter("Flood in Ganga",new Date(1,"Feb",2022),255,tweet2));
		 Set<String> tweet3 = new TreeSet<>();
	        tweet3.add("#Chara");
	        tweet3.add("#corruption");
		Tweets.add(new Tweeter("Chara Ghotala",new Date(23,"Jan",2019),25555,tweet3));
		 Set<String> tweet4 = new TreeSet<>();
	        tweet4.add("#riots");
	        tweet4.add("#bloodbath");
		Tweets.add(new Tweeter("Riots in WB",new Date(2,"June",2024),8725,tweet4));
		 Set<String> tweet5 = new TreeSet<>();
	        tweet5.add("#blockbuster");
	        tweet5.add("#200cr");
		Tweets.add(new Tweeter("Devara",new Date(1,"Oct",2024),1225,tweet5));
		
		
		//Listing toys using streams
		 System.out.println("Listing Tweets : ");
		 List<Tweeter> tweets = Tweets.stream().collect(Collectors.toList());
		 System.out.println(tweets);
		 System.out.println(" ");
		 
		// Get current month and year
			LocalDate now = LocalDate.now();
			int currentMonth = now.getMonthValue();
			int currentYear = now.getYear();
			System.out.println(" ");

			// Filter and list tweets posted in the current month
			List<Tweeter> currentMonthTweets = Tweets.stream().filter(tweet -> tweet.getDate().getMonthAsNumber() == currentMonth && tweet.getDate().getYear() == currentYear).collect(Collectors.toList());

			// Display the current month tweets
			System.out.println("Listing Tweets from Current Month: ");
			System.out.println(currentMonthTweets);
			System.out.println(" ");
			
			  // List tweets for a specific hashtag
	        String hashtagToSearch = "#modi";  // Change this to the desired hashtag
	        System.out.println("Listing Tweets for hashtag " + hashtagToSearch + ": ");
	        List<Tweeter> tweetsWithHashtag = Tweets.stream().filter(tweet -> tweet.getHashtags().contains(hashtagToSearch)).collect(Collectors.toList());
	        System.out.println(tweetsWithHashtag);
	        System.out.println(" ");
	        
	     // Count tweets by subject
	        System.out.println("Counting Tweets by Subject: ");
	        Map<String, Long> tweetCountBySubject = Tweets.stream().collect(Collectors.groupingBy(Tweeter::getSubject, Collectors.counting()));
	        tweetCountBySubject.forEach((subject, count) -> System.out.println(subject + ": " + count));
	        System.out.println(" ");
	        
	     // List tweets with more than 10k views
	        System.out.println("Listing Tweets with more than 10,000 views: ");
	        List<Tweeter> highViewsTweets = Tweets.stream().filter(tweet -> tweet.getViews() > 10000).collect(Collectors.toList());
	        System.out.println(highViewsTweets);
	        System.out.println(" ");
	        
	        // Print the top 5 trending tweets based on views
	        System.out.println("Top 5 Trending Tweets: ");
	        List<Tweeter> topTrendingTweets = Tweets.stream().sorted((t1, t2) -> Long.compare(t2.getViews(), t1.getViews())).limit(5).collect(Collectors.toList());	        
	        System.out.println(topTrendingTweets);
	        System.out.println(" ");
		 
		 

		
		
	}
	
	
}
