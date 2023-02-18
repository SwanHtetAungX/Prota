package com.ProtaMusicStreamApp;
//Creating SongCollection Object
public class SongCollection {
    private Song songs[]=new Song[6];//creating an array called songs to hold song objects

    //Create only a default constructor because we do not need to set any values to instances of SongCollection Object
    public SongCollection(){

        //adding song objects to add the SongCollection
        Song altantis = new Song("Song1",
                 "Atlantis",
                 "Seafret",
                 R.raw.atlantis,
                 3.28,
                 R.drawable.altantiscover,
               "#22272D",
                "The birds have left their trees\n" +
                        "The light pours onto me\n" +
                        "I can feel you lying there all on your own\n" +
                        "We got here the hard way\n" +
                        "All those words that we exchange\n" +
                        "Is it any wonder things get broke?\n" +
                        "'Cause in my heart and in my head\n" +
                        "I'll never take back the things I said\n" +
                        "So high above, I feel it coming down\n" +
                        "She said, in my heart and in my head\n" +
                        "Tell me why this has to end\n" +
                        "Oh, no, oh, no\n" +
                        "I can't save us, my Atlantis, we fall\n" +
                        "We built this town on shaky ground\n" +
                        "I can't save us, my Atlantis, oh, no\n" +
                        "We built it up to pull it down\n" +
                        "Now all the birds have fled\n" +
                        "The hurt just leaves me scared\n" +
                        "Losing everything I've ever known\n" +
                        "It's all become too much\n" +
                        "Maybe I'm not built for love\n" +
                        "If I knew that I could reach you, I would go\n" +
                        "It's in my heart and in my head\n" +
                        "You can't take back the things you said\n" +
                        "So high above, I feel it coming down\n" +
                        "She said, in my heart and in my head\n" +
                        "Tell me why this has to end\n" +
                        "Oh, no, oh, no\n" +
                        "I can't save us, my Atlantis, we fall\n" +
                        "We built this town on shaky ground\n" +
                        "I can't save us, my Atlantis, oh, no\n" +
                        "We built it up to pull it down\n" +
                        "And we build it up and we build it up\n" +
                        "And we build it up to pull it down\n" +
                        "And we build it up and we build it up\n" +
                        "And we build it up to pull it down\n" +
                        "I can't save us, my Atlantis, we fall\n" +
                        "We built this town on shaky ground\n" +
                        "I can't save us, my Atlantis, oh, no\n" +
                        "We built it up to pull it down (ooh)");
        Song afterDark= new Song("Song2",
                "After Dark",
                "Mr.Kitty",
                R.raw.afterdark,
                4.32,
                R.drawable.afterdarkcover,
                "#72080F","I see you\n" +
                "You see me\n" +
                "How pleasant\n" +
                "This feeling\n" +
                "The moment\n" +
                "You hold me\n" +
                "I missed you\n" +
                "I'm sorry\n" +
                "I've given\n" +
                "What I have\n" +
                "I showed you\n" +
                "I'm growing\n" +
                "The ashes\n" +
                "Fall slowly\n" +
                "As your voice\n" +
                "Consoles me\n" +
                "As the hours pass\n" +
                "I will let you know\n" +
                "That I need to ask\n" +
                "Before I'm alone\n" +
                "How it feels to rest\n" +
                "On your patient lips\n" +
                "To eternal bliss\n" +
                "I'm so glad to know\n" +
                "As the hours pass\n" +
                "I will let you know\n" +
                "That I need to ask\n" +
                "Before I'm alone\n" +
                "How it feels to rest\n" +
                "On your patient lips\n" +
                "To eternal bliss\n" +
                "I'm so glad to know\n" +
                "We're swaying\n" +
                "To drum beats\n" +
                "In motion\n" +
                "I'm feeling\n" +
                "My patience\n" +
                "Controlling\n" +
                "The question\n" +
                "I won't speak\n" +
                "We're telling\n" +
                "The stories\n" +
                "Our laughter\n" +
                "He knows me\n" +
                "We're leaving\n" +
                "We're talking\n" +
                "You're closer\n" +
                "It's calming\n" +
                "As the hours pass\n" +
                "I will let you know\n" +
                "That I need to ask\n" +
                "Before I'm alone\n" +
                "How it feels to rest\n" +
                "On your patient lips\n" +
                "To eternal bliss\n" +
                "I'm so glad to know\n" +
                "As the hours pass\n" +
                "I will let you know\n" +
                "That I need to ask\n" +
                "Before I'm alone\n" +
                "How it feels to rest\n" +
                "On your patient lips\n" +
                "To eternal bliss\n" +
                "I'm so glad to know\n" +
                "The night will hold us close\n" +
                "And the stars will guide us home\n" +
                "I've been waiting for this moment\n" +
                "We're finally alone\n" +
                "I turn to ask the question\n" +
                "So anxious, my thoughts\n" +
                "Your lips were soft like winter\n" +
                "In your passion, I was lost\n" +
                "As the hours pass\n" +
                "I will let you know\n" +
                "That I need to ask\n" +
                "Before I'm alone\n" +
                "How it feels to rest\n" +
                "On your patient lips\n" +
                "To eternal bliss\n" +
                "I'm so glad to know\n" +
                "As the hours pass\n" +
                "I will let you know\n" +
                "That I need to ask\n" +
                "Before I'm alone\n" +
                "How it feels to rest\n" +
                "On your patient lips\n" +
                "To eternal bliss\n" +
                "I'm so glad to know\n" +
                "As the hours pass\n" +
                "I will let you know\n" +
                "That I need to ask\n" +
                "Before I'm alone\n" +
                "How it feels to rest\n" +
                "On your patient lips\n" +
                "To eternal bliss\n" +
                "I'm so glad to know\n" +
                "As the hours pass\n" +
                "I will let you know\n" +
                "That I need to ask\n" +
                "Before I'm alone\n" +
                "How it feels to rest\n" +
                "On your patient lips\n" +
                "To eternal bliss\n" +
                "I'm so glad to know");
        Song theHills = new Song("Song3",
                "The Hills",
                "The Weekend",
                R.raw.thehills,
                3.55,
                R.drawable.thehillscover,
                "#272727","Your man on the road, he doing promo\n" +
                "You said keep our business on the low-low\n" +
                "I'm just tryna get you out the friend zone\n" +
                "'Cause you look even better than the photos\n" +
                "I can't find your house, send me the info\n" +
                "Driving through the gated residential\n" +
                "Found out I was coming, sent your friends home\n" +
                "Keep on tryna hide it but your friends know\n" +
                "\n" +
                "I only call you when it's half past five\n" +
                "The only time that I'll be by your side\n" +
                "I only love it when you touch me, not feel me\n" +
                "When I'm fucked up, that's the real me\n" +
                "When I'm fucked up, that's the real me, yeah\n" +
                "I only call you when it's half past five\n" +
                "The only time I'd ever call you mine\n" +
                "I only love it when you touch me, not feel me\n" +
                "When I'm fucked up, that's the real me\n" +
                "When I'm fucked up, that's the real me, babe\n" +
                "\n" +
                "I'ma let you know and keep it simple\n" +
                "Tryna keep it up, don't seem so simple\n" +
                "I just fucked two bitches 'fore I saw you\n" +
                "You gon' have to do it at my tempo\n" +
                "Always tryna send me off to rehab\n" +
                "Drugs started feeling like it's decaf\n" +
                "I'm just tryna live life for the moment\n" +
                "And all these motherfuckers want a relapse\n" +
                "\n" +
                "I only call you when it's half past five\n" +
                "The only time that I'll be by your side\n" +
                "I only love it when you touch me, not feel me\n" +
                "When I'm fucked up, that's the real me\n" +
                "When I'm fucked up, that's the real me, yeah\n" +
                "I only call you when it's half past five\n" +
                "The only time I'd ever call you mine\n" +
                "I only love it when you touch me, not feel me\n" +
                "When I'm fucked up, that's the real me\n" +
                "When I'm fucked up, that's the real me, babe\n" +
                "\n" +
                "Hills have eyes, the hills have eyes\n" +
                "Who are you to judge, who are you to judge?\n" +
                "Hide your lies, girl, hide your lies\n" +
                "Only you to trust, only you\n" +
                "\n" +
                "I only call you when it's half past five\n" +
                "The only time that I'll be by your side\n" +
                "I only love it when you touch me, not feel me\n" +
                "When I'm fucked up, that's the real me\n" +
                "When I'm fucked up, that's the real me, yeah\n" +
                "I only call you when it's half past five\n" +
                "The only time I'd ever call you mine\n" +
                "I only love it when you touch me, not feel me\n" +
                "When I'm fucked up, that's the real me\n" +
                "When I'm fucked up, that's the real me, babe\n");
        Song hateMe = new Song("Song4",
                "Hate Me",
                "Ellie Goulding",
                R.raw.hateme,
                3.25,
                R.drawable.hatemecover,
                "#350206","Hate me, hate me, still tryna replace me\n" +
                "Chase me, chase me, tell me how you hate me\n" +
                "Erase me, 'rase me, wish you never dated me\n" +
                "Lies, tell me lies, baby, tell me how you hate me\n" +
                "I bet you don't kiss her with your eyes closed\n" +
                "I bet you're still walkin' on a tightrope\n" +
                "Miss me so much, you've been goin' psycho\n" +
                "You ain't gotta say it, baby, I know (I know, I know, I know)\n" +
                "It's a thin line between all this love and hate (okay)\n" +
                "And if you switch sides, you're gon' have to claim your place (okay)\n" +
                "So baby, this time you're gon' have to seal your fate (okay)\n" +
                "Yeah, baby, this time you're gon' have to seal your fate\n" +
                "And tell me how you hate me, hate me, still tryna replace me\n" +
                "Chase me, chase me, tell me how you hate me\n" +
                "Erase me, 'rase me, wish you never dated me\n" +
                "Lies, tell me lies, baby, tell me how you hate me\n" +
                "Hate me, hate me, still tryna replace me\n" +
                "Chase me, chase me, tell me how you hate me\n" +
                "Erase me, 'rase me, wish you never dated me\n" +
                "Lies, tell me lies, baby, tell me how you hate me\n" +
                "Hate me, hate me, tell me how you hate me\n" +
                "Tell me how I'm trash and you could easily replace me\n" +
                "Tell me that I'm strung out, wasted on the daily\n" +
                "Prolly 'cause there's no one around me numbin' all my pain\n" +
                "Prolly 'cause there's no umbrella to shield me from all the rain\n" +
                "Probably because you're the one playin' the mind games\n" +
                "You hate me because I don't let you play no mind games\n" +
                "They give me migraines and damage my brain\n" +
                "Date me, break me, easily replace me\n" +
                "Hopefully you see it clear, hopefully it's HD\n" +
                "Bet you wonder why the last few months I've been spacey\n" +
                "In your head, I sing\n" +
                "And tell me how you hate me, hate me, still tryna replace me\n" +
                "Chase me, chase me, tell me how you hate me\n" +
                "Erase me, 'rase me, wish you never dated me\n" +
                "Lies, tell me lies, baby, tell me how you hate me\n" +
                "Hate me, hate me, still tryna replace me\n" +
                "Chase me, chase me, tell me how you hate me\n" +
                "Erase me, 'rase me, wish you never dated me\n" +
                "Lies, tell me lies, baby, tell me how you hate me\n" +
                "It's a thin line between all this love and hate (okay)\n" +
                "And if you switch sides, you're gon' have to claim your place (okay)\n" +
                "So baby, this time you're gon' have to seal your fate (okay)\n" +
                "Yeah, baby, this time you're gon' have to seal your fate\n" +
                "And tell me how you hate me, hate me, still tryna replace me\n" +
                "Chase me, chase me, tell me how you hate me\n" +
                "Erase me, 'rase me, wish you never dated me\n" +
                "Lies, tell me lies, baby, tell me how you hate me\n" +
                "Tell me how you hate me, hate me, still tryna replace me\n" +
                "Chase me, chase me, tell me how you hate me\n" +
                "Erase me, 'rase me, wish you never dated me\n" +
                "Lies, tell me lies, baby, tell me how you hate me\n" +
                "Tell me how you hate me (ooh, ooh)\n" +
                "Lies, tell me lies, tell me how you hate me\n" +
                "(Ooh, ooh)\n" +
                "Tell me how you hate me\n" +
                "Lies, tell me lies, baby, tell me how you hate me");
        Song idfc = new Song("Song5",
                "Idfc",
                "Black Bear",
                R.raw.idfc,
                3.59,
                R.drawable.idfccover,
                "#40091B","Tell me pretty lies\n" +
                "Look me in the face\n" +
                "Tell me that you love me\n" +
                "Even if it's fake\n" +
                "'Cause I don't fucking care at all\n" +
                "You've been out all night\n" +
                "I don't know where you've been\n" +
                "You're slurring all your words\n" +
                "Not making any sense\n" +
                "But I don't fucking care at all\n" +
                "'Cause I have hella feelings for you\n" +
                "I act like I don't fucking care\n" +
                "Like they ain't even there\n" +
                "'Cause I have hella feelings for you\n" +
                "I act like I don't fucking care\n" +
                "'Cause I'm so fucking scared\n" +
                "I'm only a fool for you\n" +
                "And maybe you're too good for me\n" +
                "I'm only a fool for you\n" +
                "But I don't fucking care at all, oh, oh-oh\n" +
                "Tell me pretty lies\n" +
                "Look me in the face\n" +
                "Tell me that you love me\n" +
                "Even if it's fake\n" +
                "'Cause I don't fucking care at all\n" +
                "You've been out all night\n" +
                "I don't know where you've been\n" +
                "You're slurring all your words\n" +
                "Not making any sense\n" +
                "But I don't fucking care, at all\n" +
                "'Cause I have hella feelings for you\n" +
                "I act like I don't fucking care\n" +
                "Like they ain't even there\n" +
                "'Cause I have hella feelings for you\n" +
                "I act like I don't fucking care\n" +
                "'Cause I'm so fucking scared\n" +
                "I'm only a fool for you\n" +
                "And maybe you're too good for me\n" +
                "I'm only a fool for you\n" +
                "But I don't fucking care at all, oh, oh-oh");
        Song moreThanYouKnow = new Song("Song6",
                "More Than You Know",
                "Axwell Λ Ingrosso", R.raw.morethanuknow,
                3.23,
                R.drawable.morethanuknowcover,
                "#66330F","I saw it coming, from miles away\n" +
                "I better speak up if I got something to say\n" +
                "'Cause it ain't over, until she sings\n" +
                "You had your reasons, you had a few\n" +
                "But you knew that I would go anywhere for you\n" +
                "'Cause it ain't over, until she sings\n" +
                "I just need to get it off my chest\n" +
                "Yeah, more than you know\n" +
                "Yeah, more than you know\n" +
                "You should know that baby you're the best\n" +
                "Yeah, more than you know\n" +
                "Yeah, more than you know\n" +
                "Your good intentions are sweet and pure\n" +
                "But they can never tame a fire like yours\n" +
                "No it ain't over, until she sings\n" +
                "Right where you wanted, down on my knees\n" +
                "You got me begging, pretty baby set me free\n" +
                "'Cause it ain't over, until she sings\n" +
                "Come a little closer, let me taste your smile\n" +
                "Until the morning lights\n" +
                "Ain't no going back the way you look tonight\n" +
                "I see it in your eyes\n" +
                "I just need to get it off my chest\n" +
                "Yeah, more than you know\n" +
                "Yeah, more than you know\n" +
                "You should know that baby you're the best\n" +
                "Yeah, more than you know\n" +
                "Yeah, more than you know\n" +
                "Yeah, more than you know\n" +
                "Yeah, more than you know\n" +
                "Yeah, more than you know\n" +
                "Yeah, more than you know\n" +
                "Yeah, more than you know\n" +
                "Yeah, more than you know\n" +
                "Yeah, more than you know\n" +
                "Yeah, more than you know\n" +
                "I just need to get it off my chest\n" +
                "Yeah, more than you know\n" +
                "Yeah, more than you know\n" +
                "You should know that baby you're the best\n" +
                "Yeah, more than you know\n" +
                "Yeah, more than you know\n" +
                "I just need to get it off my chest\n" +
                "Yeah, more than you know\n" +
                "Yeah, more than you know\n" +
                "You should know that baby you're the best\n" +
                "Yeah, more than you know\n" +
                "Yeah, more than you know"
                );
        //Adding each song into the songs array
        songs[0]=altantis;
        songs[1]=afterDark;
        songs[2]=theHills;
        songs[3]=hateMe;
        songs[4]=idfc;
        songs[5]=moreThanYouKnow;
    }
    //To get the current song using the index of the song
    public Song getCurrentSong(int currentSongId){
        return songs[currentSongId];}

    //To get the song by song id
    public int searchSongById(String id){
        for(int i=0; i<songs.length; i++){
            Song tempSong=songs[i];
            if(tempSong.getId().equals(id)){ return i;} }
            return -1;}

    //To increase the currentIndex value by 1 and if index is greater than  array length then start from the beginning
    public int skip(int currentIndex){
        if (currentIndex < songs.length - 1) {
            currentIndex++;
            return currentIndex;}
        else {return 0;}}

    //To get the song by Id
    public Song searchById(String id){
        Song tempSong = null;
        for (int i = 0; i < songs.length; i++) {
            tempSong = songs[i];
            String tempId = tempSong.getId();
            if (tempId.equals(id)){
                return tempSong;}
        }
        return tempSong;
    }
    //To decrease the currentIndex value by 1 and if index is greater than 0 then start from the end of the array
    public int prev(int currentIndex){
        if (currentIndex>0){
            currentIndex--;
            return currentIndex;}
        else{return songs.length-1;}}}




