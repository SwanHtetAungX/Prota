package com.ProtaMusicStreamApp;

public class PodcastCollection {
    private Podcast podcasts[]=new Podcast[6];//creating an array called podcasts to hold podcast objects
    public PodcastCollection(){
        Podcast procrastination = new Podcast("Podcast1",
                "Procrastination",
                "Mel Robbins",
                R.raw.procrastination,
                3.36,
                R.drawable.procrastinationcover,
                "#402009");
        Podcast steveJobs= new Podcast("Podcast2",
                "Steve Jobs",
                "Walter",
                R.raw.stevejobs,
                6,
                R.drawable.stevejobscover,
                "#22272D");
        Podcast ai= new Podcast("Podcast3",
                "AI",
                "Noah",
                R.raw.ai,
                8,
                R.drawable.aicover,
                "#22272D");
        Podcast richDad= new Podcast("Podcast4",
                "Rich Dad",
                "Robert T.Kiyosaki",
                R.raw.richdad,
                6.5,
                R.drawable.richdadcover,
                "#8B008B");
        Podcast cryptocurrency= new Podcast("Podcast5",
                "Cryptocurrency",
                "Digital Pratik",
                R.raw.cryptocurrecy,
                7,
                R.drawable.cryptocurrencycover,
                "#402009"
                );
        Podcast meditation= new Podcast("Podcast6",
                "Meditation",
                "Insight with Ben",
                R.raw.meditation,
                6.5,
                R.drawable.meditationcover,
                "#66330F");
        //Adding each song into the songs array
        podcasts[0]=procrastination;
        podcasts[1]=steveJobs;
        podcasts[2]=ai;
        podcasts[3]=richDad;
        podcasts[4]=cryptocurrency;
        podcasts[5]=meditation;
    }
    //To get the current podcast based on the index
    public Podcast getCurrentPodcast(int currentPodcastId){
        return podcasts[currentPodcastId];
    }
    public int searchPodcastById(String id){
        for(int i=0; i< podcasts.length; i++){
            Podcast tempPod= podcasts[i];
            if(tempPod.getId().equals(id)){ return i;}}
            return -1;}

    ////To increase the currentIndex value by 1 and if index is greater than  array length then start from the beginning
    public int skipPodcast(int currentIndex){
        if (currentIndex < podcasts.length- 1) {
            currentIndex++;
            return currentIndex;
        }
        else {return 0;}

    }
    //To decrease the currentIndex value by 1 and if index  greater than 0  array length then start from the end of the array
    public int prevPodcast(int currentIndex){
        if (currentIndex>0){
            currentIndex--;
            return currentIndex;

        }
        else{ return podcasts.length-1;}
    }



}