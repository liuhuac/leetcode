package edu.clemson.ece.leetcode.DesignTwitter;

public class Twitter {

    

    private int timeStamp = 0;

    

    private Map<Integer,User> userMap;

    

    public class User {

        public int userId;

        public Set<Integer> followed = null;

        public Tweet tweetHead = null;

        public User (int id){

            userId = id;

            followed = new HashSet<>();

            followed.add(id);

        }

        public void follow(int followId){

            followed.add(followId);

        }

        public void unfollow(int unfollowId){

            followed.remove(unfollowId);

        }

        public void post(int tweetId){

            Tweet newTweet = new Tweet(tweetId);

            newTweet.next = tweetHead;

            tweetHead = newTweet;

        }

    }

    

    private class Tweet {

        public int tweetId;

        public int tweetTime;

        public Tweet next;

        public Tweet(int id){

            tweetId = id;

            tweetTime = timeStamp++;

        }

    }



    /** Initialize your data structure here. */

    public Twitter() {

        userMap = new HashMap<>();

    }

    

    /** Compose a new tweet. */

    public void postTweet(int userId, int tweetId) {

        if(!userMap.containsKey(userId)){

            userMap.put(userId, new User(userId));

        }

        User user = userMap.get(userId);

        user.post(tweetId);

    }

    

    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */

    public List<Integer> getNewsFeed(int userId) {

        List<Integer> res = new LinkedList<>();

        

        if(!userMap.containsKey(userId))   return res;

        

        //PriorityQueue<Tweet> pq = new PriorityQueue<>(userMap.size(), (a,b)->(b.tweetTime-a.tweetTime));   

        PriorityQueue<Tweet> pq = new PriorityQueue<>(userMap.size(), new Comparator<Tweet>(){

            @Override

            public int compare(Tweet a, Tweet b){

                return b.tweetTime - a.tweetTime;

            }

        });

        for(int user : userMap.get(userId).followed) {

            Tweet tweet = userMap.get(user).tweetHead;

            if(tweet!=null){

                pq.offer(tweet);

            }

        }

        for(int i=0; i<10; i++){

            Tweet tweet = pq.poll();

            if(tweet==null) break;

            if(tweet.next!=null){

                pq.offer(tweet.next);

            }

            res.add(tweet.tweetId);

        }

        return res;

    }

    

    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */

    public void follow(int followerId, int followeeId) {

        if(!userMap.containsKey(followerId)){

            User u = new User(followerId);

            userMap.put(followerId, u);

        }

        if(!userMap.containsKey(followeeId)){

            User u = new User(followeeId);

            userMap.put(followeeId, u);

        }

        User user = userMap.get(followerId);

        user.follow(followeeId);

    }

    

    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */

    public void unfollow(int followerId, int followeeId) {

        if(!userMap.containsKey(followerId) || followerId==followeeId)

            return;

        User user = userMap.get(followerId);

        user.unfollow(followeeId);

    }

}



/**
 *
 *  * Your Twitter object will be instantiated and called as such:
 *
 *   * Twitter obj = new Twitter();
 *
 *    * obj.postTweet(userId,tweetId);
 *
 *     * List<Integer> param_2 = obj.getNewsFeed(userId);
 *
 *      * obj.follow(followerId,followeeId);
 *
 *       * obj.unfollow(followerId,followeeId);
 *
 *        */
